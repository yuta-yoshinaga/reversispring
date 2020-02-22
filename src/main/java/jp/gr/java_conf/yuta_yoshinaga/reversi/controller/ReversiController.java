////////////////////////////////////////////////////////////////////////////////
///	@file			ReversiController.java
///	@brief			リバーシコントローラークラス実装ファイル
///	@author			Yuta Yoshinaga
///	@date			2020.02.22
///	$Version:		$
///	$Revision:		$
///
/// (c) 2020 Yuta Yoshinaga.
///
/// - 本ソフトウェアの一部又は全てを無断で複写複製（コピー）することは、
///   著作権侵害にあたりますので、これを禁止します。
/// - 本製品の使用に起因する侵害または特許権その他権利の侵害に関しては
///   当方は一切その責任を負いません。
///
////////////////////////////////////////////////////////////////////////////////

package jp.gr.java_conf.yuta_yoshinaga.reversi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.gr.java_conf.yuta_yoshinaga.reversi.model.CallbacksJson;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.FuncsJson;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ResJson;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiPlay;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiPlayDelegate;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiPlayInterface;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiSetting;
import jp.gr.java_conf.yuta_yoshinaga.reversi.service.ReversiService;
import net.arnx.jsonic.JSON;

////////////////////////////////////////////////////////////////////////////////
///	@class		ReversiController
///	@brief		リバーシコントローラークラス
///
////////////////////////////////////////////////////////////////////////////////
@RestController
public class ReversiController implements ReversiPlayInterface {

	@Autowired
	ReversiService service;//!< リバーシサービスクラス

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			リバーシ設定反映
	///	@fn				ResJson setSetting(HttpServletRequest request)
	///	@param[in]		HttpServletRequest request
	///	@return			ResJson
	///	@author			Yuta Yoshinaga
	///	@date			2020.02.22
	///
	////////////////////////////////////////////////////////////////////////////////
	@PostMapping("/set-setting")
	public ResJson setSetting(HttpServletRequest request) {
		// ユーザー全件取得
		String para = request.getParameter("para");
		ReversiSetting setting = JSON.decode(para, ReversiSetting.class);
		ReversiPlay rvPlay = getRvPlay(request);
		ResJson resJson = service.setSetting(getRvPlay(request), setting);
		setRvPlay(request, rvPlay);
		resJson.setCallbacks(rvPlay.getmCallbacks());
		return resJson;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			リバーシリセット
	///	@fn				ResJson reset(HttpServletRequest request)
	///	@param[in]		HttpServletRequest request
	///	@return			ResJson
	///	@author			Yuta Yoshinaga
	///	@date			2020.02.22
	///
	////////////////////////////////////////////////////////////////////////////////
	@PostMapping("/reset")
	public ResJson reset(HttpServletRequest request) {
		ReversiPlay rvPlay = getRvPlay(request);
		ResJson resJson = service.reset(getRvPlay(request));
		setRvPlay(request, rvPlay);
		resJson.setCallbacks(rvPlay.getmCallbacks());
		return resJson;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			リバーシプレイ
	///	@fn				ResJson reversiPlay(HttpServletRequest request)
	///	@param[in]		HttpServletRequest request
	///	@return			ResJson
	///	@author			Yuta Yoshinaga
	///	@date			2020.02.22
	///
	////////////////////////////////////////////////////////////////////////////////
	@PostMapping("/reversi-play")
	public ResJson reversiPlay(HttpServletRequest request) {
		String y = request.getParameter("y");
		String x = request.getParameter("x");
		ReversiPlay rvPlay = getRvPlay(request);
		ResJson resJson = service.reversiPlay(getRvPlay(request), Integer.parseInt(y), Integer.parseInt(x));
		setRvPlay(request, rvPlay);
		resJson.setCallbacks(rvPlay.getmCallbacks());
		return resJson;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			リバーシプレイインスタンス取得
	///	@fn				ReversiPlay getRvPlay(HttpServletRequest request)
	///	@param[in]		HttpServletRequest request
	///	@return			ReversiPlay
	///	@author			Yuta Yoshinaga
	///	@date			2020.02.22
	///
	////////////////////////////////////////////////////////////////////////////////
	private ReversiPlay getRvPlay(HttpServletRequest request) {
		HttpSession session = request.getSession(true);
		ReversiPlay rvPlay = null;
		if (session.isNew()) {
			// *** 初めてのアクセス *** //
			rvPlay = new ReversiPlay();
			rvPlay.setmDelegate(new ReversiPlayDelegate((ReversiPlayInterface) this));
			session.setAttribute("rvPlay", rvPlay);
		} else {
			rvPlay = (ReversiPlay) session.getAttribute("rvPlay");
		}
		if (rvPlay == null) {
			rvPlay = new ReversiPlay();
			rvPlay.setmDelegate(new ReversiPlayDelegate((ReversiPlayInterface) this));
			session.setAttribute("rvPlay", rvPlay);
		}
		rvPlay.setmCallbacks(new CallbacksJson());
		return rvPlay;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			リバーシプレイインスタンスセッション保存
	///	@fn				void setRvPlay(HttpServletRequest request, ReversiPlay rvPlay)
	///	@param[in]		HttpServletRequest request
	///	@param[in]		ReversiPlay rvPlay
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2020.02.22
	///
	////////////////////////////////////////////////////////////////////////////////
	private void setRvPlay(HttpServletRequest request, ReversiPlay rvPlay) {
		HttpSession session = request.getSession(true);
		session.setAttribute("rvPlay", rvPlay);
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			メッセージダイアログ
	///	@fn				FuncsJson ViewMsgDlg(String title , String msg)
	///	@param[in]		String title	タイトル
	///	@param[in]		String msg		メッセージ
	///	@return			FuncsJson
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public FuncsJson ViewMsgDlg(String title, String msg) {
		FuncsJson funcs = new FuncsJson();
		funcs.setFunc("ViewMsgDlg");
		funcs.setParam1(title);
		funcs.setParam2(msg);
		System.out.println("ViewMsgDlg title = " + title + " msg = " + msg);
		return funcs;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			1マス描画
	///	@fn				CallbacksJson DrawSingle(int y, int x, int sts, int bk, String text)
	///	@param[in]		int y		Y座標
	///	@param[in]		int x		X座標
	///	@param[in]		int sts		ステータス
	///	@param[in]		int bk		背景
	///	@param[in]		String text	テキスト
	///	@return			FuncsJson
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public FuncsJson DrawSingle(int y, int x, int sts, int bk, String text) {
		FuncsJson funcs = new FuncsJson();
		funcs.setFunc("DrawSingle");
		funcs.setParam1(String.valueOf(y));
		funcs.setParam2(String.valueOf(x));
		funcs.setParam3(String.valueOf(sts));
		funcs.setParam4(String.valueOf(bk));
		funcs.setParam5(text);
		System.out.println("DrawSingle y = " + y + " x = " + x + " sts = " + sts + " bk = " + bk + " text = " + text);
		return funcs;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			現在の色メッセージ
	///	@fn				FuncsJson CurColMsg(String text)
	///	@param[in]		String text	テキスト
	///	@return			FuncsJson
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public FuncsJson CurColMsg(String text) {
		FuncsJson funcs = new FuncsJson();
		funcs.setFunc("CurColMsg");
		funcs.setParam1(text);
		System.out.println("CurColMsg text = " + text);
		return funcs;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			現在のステータスメッセージ
	///	@fn				FuncsJson CurStsMsg(String text)
	///	@param[in]		String text	テキスト
	///	@return			FuncsJson
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public FuncsJson CurStsMsg(String text) {
		FuncsJson funcs = new FuncsJson();
		funcs.setFunc("CurStsMsg");
		funcs.setParam1(text);
		System.out.println("CurStsMsg text = " + text);
		return funcs;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ウェイト
	///	@fn				FuncsJson Wait(int time)
	///	@param[in]		int time	ウェイト時間(msec)
	///	@return			FuncsJson
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public FuncsJson Wait(int time) {
		FuncsJson funcs = new FuncsJson();
		funcs.setFunc("Wait");
		funcs.setParam1(String.valueOf(time));
		System.out.println("Wait time = " + time);
		return funcs;
	}

}
