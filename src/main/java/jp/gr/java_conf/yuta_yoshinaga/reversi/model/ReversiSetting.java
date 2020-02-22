////////////////////////////////////////////////////////////////////////////////
///	@file			ReversiSetting.java
///	@brief			アプリ設定クラス
///	@author			Yuta Yoshinaga
///	@date			2018.04.01
///	$Version:		$
///	$Revision:		$
///
/// Copyright (c) 2018 Yuta Yoshinaga. All Rights reserved.
///
/// - 本ソフトウェアの一部又は全てを無断で複写複製（コピー）することは、
///   著作権侵害にあたりますので、これを禁止します。
/// - 本製品の使用に起因する侵害または特許権その他権利の侵害に関しては
///   当社は一切その責任を負いません。
///
////////////////////////////////////////////////////////////////////////////////

package jp.gr.java_conf.yuta_yoshinaga.reversi.model;

import java.io.Serializable;

import lombok.Data;

@Data
////////////////////////////////////////////////////////////////////////////////
///	@class		ReversiSetting
///	@brief		アプリ設定クラス
///
////////////////////////////////////////////////////////////////////////////////
public class ReversiSetting implements Serializable {
	private int mMode; //!< 現在のモード
	private int mType; //!< 現在のタイプ
	private int mPlayer; //!< プレイヤーの色
	private int mAssist; //!< アシスト
	private int mGameSpd; //!< ゲームスピード
	private int mEndAnim; //!< ゲーム終了アニメーション
	private int mMasuCntMenu; //!< マスの数
	private int mMasuCnt; //!< マスの数
	private int mPlayCpuInterVal; //!< CPU対戦時のインターバル(msec)
	private int mPlayDrawInterVal; //!< 描画のインターバル(msec)
	private int mEndDrawInterVal; //!< 終了アニメーション描画のインターバル(msec)
	private int mEndInterVal; //!< 終了アニメーションのインターバル(msec)
	private String mPlayerColor1; //!< プレイヤー1の色
	private String mPlayerColor2; //!< プレイヤー2の色
	private String mBackGroundColor; //!< 背景の色
	private String mBorderColor; //!< 枠線の色

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			コンストラクタ
	///	@fn				ReversiSetting()
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2017.10.20
	///
	////////////////////////////////////////////////////////////////////////////////
	public ReversiSetting() {
		this.reset();
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			リセット
	///	@fn				void reset()
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2017.10.20
	///
	////////////////////////////////////////////////////////////////////////////////
	public void reset() {
		this.mMode = ReversiConst.DEF_MODE_ONE; // 現在のモード
		this.mType = ReversiConst.DEF_TYPE_HARD; // 現在のタイプ
		this.mPlayer = ReversiConst.REVERSI_STS_BLACK; // プレイヤーの色
		this.mAssist = ReversiConst.DEF_ASSIST_ON; // アシスト
		this.mGameSpd = ReversiConst.DEF_GAME_SPD_MID; // ゲームスピード
		this.mEndAnim = ReversiConst.DEF_END_ANIM_ON; // ゲーム終了アニメーション
		this.mMasuCntMenu = ReversiConst.DEF_MASU_CNT_8; // マスの数
		this.mMasuCnt = ReversiConst.DEF_MASU_CNT_8_VAL; // マスの数
		this.mPlayCpuInterVal = ReversiConst.DEF_GAME_SPD_MID_VAL2; // CPU対戦時のインターバル(msec)
		this.mPlayDrawInterVal = ReversiConst.DEF_GAME_SPD_MID_VAL; // 描画のインターバル(msec)
		this.mEndDrawInterVal = 100; // 終了アニメーション描画のインターバル(msec)
		this.mEndInterVal = 500; // 終了アニメーションのインターバル(msec)
		this.mPlayerColor1 = "#000000"; // プレイヤー1の色
		this.mPlayerColor2 = "#FFFFFF"; // プレイヤー2の色
		this.mBackGroundColor = "#00FF00"; // 背景の色
		this.mBorderColor = "#000000"; // 枠線の色
	}
}
