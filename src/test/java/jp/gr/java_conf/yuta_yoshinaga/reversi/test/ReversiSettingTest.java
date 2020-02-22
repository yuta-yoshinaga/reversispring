////////////////////////////////////////////////////////////////////////////////
///	@file			ReversiSettingTest.java
///	@brief			アプリ設定テストクラス
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

package jp.gr.java_conf.yuta_yoshinaga.reversi.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiConst;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiSetting;

////////////////////////////////////////////////////////////////////////////////
///	@class		ReversiSettingTest
///	@brief		アプリ設定テストクラス
///
////////////////////////////////////////////////////////////////////////////////
class ReversiSettingTest extends ReversiSetting {

	@Test
	void testGetmMode() {
		int tgt = this.getMMode();
		boolean flag = false;
		if (tgt == ReversiConst.DEF_MODE_ONE)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmMode() {
		this.setMMode(ReversiConst.DEF_MODE_TWO);
		int tgt = this.getMMode();
		boolean flag = false;
		if (tgt == ReversiConst.DEF_MODE_TWO)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmType() {
		int tgt = this.getMMode();
		boolean flag = false;
		if (tgt == ReversiConst.DEF_TYPE_HARD)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmType() {
		this.setMMode(ReversiConst.DEF_TYPE_NOR);
		int tgt = this.getMMode();
		boolean flag = false;
		if (tgt == ReversiConst.DEF_TYPE_NOR)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmPlayer() {
		int tgt = this.getMPlayer();
		boolean flag = false;
		if (tgt == ReversiConst.REVERSI_STS_BLACK)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmPlayer() {
		this.setMPlayer(ReversiConst.REVERSI_STS_WHITE);
		int tgt = this.getMPlayer();
		boolean flag = false;
		if (tgt == ReversiConst.REVERSI_STS_WHITE)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmAssist() {
		int tgt = this.getMAssist();
		boolean flag = false;
		if (tgt == ReversiConst.DEF_ASSIST_ON)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmAssist() {
		this.setMAssist(ReversiConst.DEF_ASSIST_OFF);
		int tgt = this.getMAssist();
		boolean flag = false;
		if (tgt == ReversiConst.DEF_ASSIST_OFF)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmGameSpd() {
		int tgt = this.getMGameSpd();
		boolean flag = false;
		if (tgt == ReversiConst.DEF_GAME_SPD_MID)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmGameSpd() {
		this.setMGameSpd(ReversiConst.DEF_GAME_SPD_SLOW);
		int tgt = this.getMGameSpd();
		boolean flag = false;
		if (tgt == ReversiConst.DEF_GAME_SPD_SLOW)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmEndAnim() {
		int tgt = this.getMEndAnim();
		boolean flag = false;
		if (tgt == ReversiConst.DEF_END_ANIM_ON)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmEndAnim() {
		this.setMGameSpd(ReversiConst.DEF_END_ANIM_OFF);
		int tgt = this.getMGameSpd();
		boolean flag = false;
		if (tgt == ReversiConst.DEF_END_ANIM_OFF)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmMasuCntMenu() {
		int tgt = this.getMMasuCnt();
		boolean flag = false;
		if (tgt == ReversiConst.DEF_MASU_CNT_8)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmMasuCntMenu() {
		this.setMMasuCnt(ReversiConst.DEF_MASU_CNT_10);
		int tgt = this.getMMasuCnt();
		boolean flag = false;
		if (tgt == ReversiConst.DEF_MASU_CNT_10)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmMasuCnt() {
		int tgt = this.getMMasuCnt();
		boolean flag = false;
		if (tgt == ReversiConst.DEF_MASU_CNT_8_VAL)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmMasuCnt() {
		this.setMMasuCnt(ReversiConst.DEF_MASU_CNT_10_VAL);
		int tgt = this.getMMasuCnt();
		boolean flag = false;
		if (tgt == ReversiConst.DEF_MASU_CNT_10_VAL)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmPlayCpuInterVal() {
		int tgt = this.getMEndInterVal();
		boolean flag = false;
		if (tgt == ReversiConst.DEF_GAME_SPD_MID_VAL2)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmPlayCpuInterVal() {
		this.setMEndInterVal(ReversiConst.DEF_GAME_SPD_SLOW_VAL2);
		int tgt = this.getMEndInterVal();
		boolean flag = false;
		if (tgt == ReversiConst.DEF_GAME_SPD_SLOW_VAL2)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmPlayDrawInterVal() {
		int tgt = this.getMEndDrawInterVal();
		boolean flag = false;
		if (tgt == ReversiConst.DEF_GAME_SPD_MID_VAL)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmPlayDrawInterVal() {
		this.setMEndDrawInterVal(ReversiConst.DEF_GAME_SPD_SLOW_VAL);
		int tgt = this.getMEndDrawInterVal();
		boolean flag = false;
		if (tgt == ReversiConst.DEF_GAME_SPD_SLOW_VAL)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmEndDrawInterVal() {
		int tgt = this.getMEndDrawInterVal();
		boolean flag = false;
		if (tgt == 100)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmEndDrawInterVal() {
		this.setMEndDrawInterVal(1000);
		int tgt = this.getMEndDrawInterVal();
		boolean flag = false;
		if (tgt == 1000)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmEndInterVal() {
		int tgt = this.getMEndDrawInterVal();
		boolean flag = false;
		if (tgt == 500)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmEndInterVal() {
		this.setMEndDrawInterVal(5000);
		int tgt = this.getMEndDrawInterVal();
		boolean flag = false;
		if (tgt == 5000)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmPlayerColor1() {
		String tgt = this.getMPlayerColor1();
		boolean flag = false;
		if (tgt.equals("#000000"))
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmPlayerColor1() {
		this.setMPlayerColor1("#111111");
		String tgt = this.getMPlayerColor1();
		boolean flag = false;
		if (tgt.equals("#111111"))
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmPlayerColor2() {
		String tgt = this.getMPlayerColor2();
		boolean flag = false;
		if (tgt.equals("#FFFFFF"))
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmPlayerColor2() {
		this.setMPlayerColor2("#222222");
		String tgt = this.getMPlayerColor2();
		boolean flag = false;
		if (tgt.equals("#222222"))
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmBackGroundColor() {
		String tgt = this.getMBackGroundColor();
		boolean flag = false;
		if (tgt.equals("#00FF00"))
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmBackGroundColor() {
		this.setMBackGroundColor("#333333");
		String tgt = this.getMBackGroundColor();
		boolean flag = false;
		if (tgt.equals("#333333"))
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmBorderColor() {
		String tgt = this.getMBorderColor();
		boolean flag = false;
		if (tgt.equals("#000000"))
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmBorderColor() {
		this.setMBorderColor("#444444");
		String tgt = this.getMBorderColor();
		boolean flag = false;
		if (tgt.equals("#444444"))
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testReversiSetting() {
		ReversiSetting tgt = new ReversiSetting();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testReset() {
		this.reset();
		boolean flag = true;
		if (this.getMMode() != ReversiConst.DEF_MODE_ONE)
			flag = false;
		if (this.getMMode() != ReversiConst.DEF_TYPE_HARD)
			flag = false;
		if (this.getMPlayer() != ReversiConst.REVERSI_STS_BLACK)
			flag = false;
		if (this.getMAssist() != ReversiConst.DEF_ASSIST_ON)
			flag = false;
		if (this.getMGameSpd() != ReversiConst.DEF_GAME_SPD_MID)
			flag = false;
		if (this.getMEndAnim() != ReversiConst.DEF_END_ANIM_ON)
			flag = false;
		if (this.getMMasuCnt() != ReversiConst.DEF_MASU_CNT_8)
			flag = false;
		if (this.getMMasuCnt() != ReversiConst.DEF_MASU_CNT_8_VAL)
			flag = false;
		if (this.getMEndInterVal() != ReversiConst.DEF_GAME_SPD_MID_VAL2)
			flag = false;
		if (this.getMEndDrawInterVal() != ReversiConst.DEF_GAME_SPD_MID_VAL)
			flag = false;
		if (this.getMEndDrawInterVal() != 100)
			flag = false;
		if (this.getMEndDrawInterVal() != 500)
			flag = false;
		if (!this.getMPlayerColor1().equals("#000000"))
			flag = false;
		if (!this.getMPlayerColor2().equals("#FFFFFF"))
			flag = false;
		if (!this.getMBackGroundColor().equals("#00FF00"))
			flag = false;
		if (!this.getMBorderColor().equals("#000000"))
			flag = false;
		assertTrue(flag);
	}

}
