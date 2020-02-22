////////////////////////////////////////////////////////////////////////////////
///	@file			ReversiService.java
///	@brief			リバーシサービスクラス実装ファイル
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

package jp.gr.java_conf.yuta_yoshinaga.reversi.service;

import org.springframework.stereotype.Service;

import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ResJson;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiPlay;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiSetting;

////////////////////////////////////////////////////////////////////////////////
///	@class		ReversiService
///	@brief		リバーシサービスクラス
///
////////////////////////////////////////////////////////////////////////////////
@Service
public class ReversiService {

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			リバーシ設定反映
	///	@fn				ResJson setSetting(ReversiPlay rvPlay, ReversiSetting setting)
	///	@param[in]		ReversiPlay rvPlay
	///	@param[in]		ReversiSetting setting
	///	@return			ResJson
	///	@author			Yuta Yoshinaga
	///	@date			2020.02.22
	///
	////////////////////////////////////////////////////////////////////////////////
	public ResJson setSetting(ReversiPlay rvPlay, ReversiSetting setting) {
		ResJson resJson = new ResJson();
		rvPlay.setmSetting(setting);
		rvPlay.reset();
		resJson.setAuth("[SUCCESS]");
		return resJson;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			リバーシリセット
	///	@fn				ResJson reset(ReversiPlay rvPlay)
	///	@param[in]		ReversiPlay rvPlay
	///	@return			ResJson
	///	@author			Yuta Yoshinaga
	///	@date			2020.02.22
	///
	////////////////////////////////////////////////////////////////////////////////
	public ResJson reset(ReversiPlay rvPlay) {
		ResJson resJson = new ResJson();
		rvPlay.reset();
		resJson.setAuth("[SUCCESS]");
		return resJson;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			リバーシプレイ
	///	@fn				reversiPlay(ReversiPlay rvPlay, int y, int x)
	///	@param[in]		ReversiPlay rvPlay
	///	@param[in]		int y
	///	@param[in]		int x
	///	@return			ResJson
	///	@author			Yuta Yoshinaga
	///	@date			2020.02.22
	///
	////////////////////////////////////////////////////////////////////////////////
	public ResJson reversiPlay(ReversiPlay rvPlay, int y, int x) {
		ResJson resJson = new ResJson();
		rvPlay.reversiPlay(y, x);
		resJson.setAuth("[SUCCESS]");
		return resJson;
	}
}
