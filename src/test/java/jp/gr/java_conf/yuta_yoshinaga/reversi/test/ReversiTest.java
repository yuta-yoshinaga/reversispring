////////////////////////////////////////////////////////////////////////////////
///	@file			ReversiTest.java
///	@brief			リバーシテストクラス実装ファイル
///	@author			Yuta Yoshinaga
///	@date			2018.04.01
///	$Version:		$
///	$Revision:		$
///
/// (c) 2018 Yuta Yoshinaga.
///
/// - 本ソフトウェアの一部又は全てを無断で複写複製（コピー）することは、
///   著作権侵害にあたりますので、これを禁止します。
/// - 本製品の使用に起因する侵害または特許権その他権利の侵害に関しては
///   当方は一切その責任を負いません。
///
////////////////////////////////////////////////////////////////////////////////

package jp.gr.java_conf.yuta_yoshinaga.reversi.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jp.gr.java_conf.yuta_yoshinaga.reversi.model.Reversi;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiAnz;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiConst;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiHistory;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiPoint;

////////////////////////////////////////////////////////////////////////////////
///	@class		ReversiTest
///	@brief		リバーシテストクラス
///
////////////////////////////////////////////////////////////////////////////////
class ReversiTest extends Reversi {

	@Test
	void testGetmMasuSts() {
		int[][] tgt = this.getMMasuSts();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmMasuSts() {
		this.setMMasuSts(new int[8][8]);
		int[][] tgt = this.getMMasuSts();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmMasuStsEnaB() {
		int[][] tgt = this.getMMasuStsEnaB();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmMasuStsEnaB() {
		this.setMMasuStsEnaB(new int[8][8]);
		int[][] tgt = this.getMMasuStsEnaB();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmMasuStsCntB() {
		int[][] tgt = this.getMMasuStsCntB();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmMasuStsCntB() {
		this.setMMasuStsCntB(new int[8][8]);
		int[][] tgt = this.getMMasuStsCntB();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmMasuStsPassB() {
		int[][] tgt = this.getMMasuStsPassB();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmMasuStsPassB() {
		this.setMMasuStsPassB(new int[8][8]);
		int[][] tgt = this.getMMasuStsPassB();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmMasuStsAnzB() {
		ReversiAnz[][] tgt = this.getMMasuStsAnzB();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmMasuStsAnzB() {
		this.setMMasuStsAnzB(new ReversiAnz[8][8]);
		ReversiAnz[][] tgt = this.getMMasuStsAnzB();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmMasuPointB() {
		ReversiPoint[] tgt = this.getMMasuPointB();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmMasuPointB() {
		this.setMMasuPointB(new ReversiPoint[8]);
		ReversiPoint[] tgt = this.getMMasuPointB();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmMasuPointCntB() {
		int tgt = this.getMMasuPointCntB();
		boolean flag = false;
		if (tgt == 4)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmMasuPointCntB() {
		this.setMMasuPointCntB(1);
		int tgt = this.getMMasuPointCntB();
		boolean flag = false;
		if (tgt == 1)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmMasuBetCntB() {
		int tgt = this.getMMasuBetCntB();
		boolean flag = false;
		if (tgt == 2)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmMasuBetCntB() {
		this.setMMasuBetCntB(1);
		int tgt = this.getMMasuBetCntB();
		boolean flag = false;
		if (tgt == 1)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmMasuStsEnaW() {
		int[][] tgt = this.getMMasuStsEnaW();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmMasuStsEnaW() {
		this.setMMasuStsEnaW(new int[8][8]);
		int[][] tgt = this.getMMasuStsEnaW();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmMasuStsCntW() {
		int[][] tgt = this.getMMasuStsCntW();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmMasuStsCntW() {
		this.setMMasuStsCntW(new int[8][8]);
		int[][] tgt = this.getMMasuStsCntW();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmMasuStsPassW() {
		int[][] tgt = this.getMMasuStsPassW();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmMasuStsPassW() {
		this.setMMasuStsPassW(new int[8][8]);
		int[][] tgt = this.getMMasuStsPassW();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmMasuStsAnzW() {
		ReversiAnz[][] tgt = this.getMMasuStsAnzW();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmMasuStsAnzW() {
		this.setMMasuStsAnzW(new ReversiAnz[8][8]);
		ReversiAnz[][] tgt = this.getMMasuStsAnzW();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmMasuPointW() {
		ReversiPoint[] tgt = this.getMMasuPointW();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmMasuPointW() {
		this.setMMasuPointW(new ReversiPoint[8]);
		ReversiPoint[] tgt = this.getMMasuPointW();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmMasuPointCntW() {
		int tgt = this.getMMasuPointCntW();
		boolean flag = false;
		if (tgt == 4)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmMasuPointCntW() {
		this.setMMasuPointCntW(1);
		int tgt = this.getMMasuPointCntW();
		boolean flag = false;
		if (tgt == 1)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmMasuBetCntW() {
		int tgt = this.getMMasuBetCntW();
		boolean flag = false;
		if (tgt == 2)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmMasuBetCntW() {
		this.setMMasuBetCntW(1);
		int tgt = this.getMMasuBetCntW();
		boolean flag = false;
		if (tgt == 1)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmMasuCnt() {
		int tgt = this.getMMasuCnt();
		boolean flag = false;
		if (tgt == 8)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmMasuCnt() {
		this.setMMasuCnt(10);
		int tgt = this.getMMasuCnt();
		boolean flag = false;
		if (tgt == 10)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmMasuCntMax() {
		int tgt = this.getMMasuCntMax();
		boolean flag = false;
		if (tgt == 8)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmMasuCntMax() {
		this.setMMasuCntMax(10);
		int tgt = this.getMMasuCntMax();
		boolean flag = false;
		if (tgt == 10)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmMasuHist() {
		ReversiHistory[] tgt = this.getMMasuHist();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmMasuHist() {
		this.setMMasuHist(new ReversiHistory[8]);
		ReversiHistory[] tgt = this.getMMasuHist();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmMasuHistCur() {
		int tgt = this.getMMasuHistCur();
		boolean flag = false;
		if (tgt == 0)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmMasuHistCur() {
		this.setMMasuHistCur(1);
		int tgt = this.getMMasuHistCur();
		boolean flag = false;
		if (tgt == 1)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testReversiIntInt() {
		Reversi tgt = new Reversi(8, 8);
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testReversi() {
		Reversi tgt = new Reversi();
		boolean flag = false;
		if (tgt != null)
			flag = true;
		assertTrue(flag);
	}

	@Test
	void testReset() {
		this.reset();
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testAnalysisReversi() {
		this.AnalysisReversi(1, 1);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetMasuSts() {
		this.getMasuSts(0, 0);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetMasuStsEna() {
		this.getMasuStsEna(ReversiConst.REVERSI_STS_BLACK, 0, 0);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetMasuStsCnt() {
		this.getMasuStsCnt(ReversiConst.REVERSI_STS_BLACK, 0, 0);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetColorEna() {
		this.getColorEna(ReversiConst.REVERSI_STS_BLACK);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetGameEndSts() {
		this.getGameEndSts();
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetMasuSts() {
		this.setMasuSts(ReversiConst.REVERSI_STS_BLACK, 0, 0);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetMasuStsForcibly() {
		this.setMasuStsForcibly(ReversiConst.REVERSI_STS_BLACK, 0, 0);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetMasuCnt() {
		this.setMasuCnt(10);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetPoint() {
		this.getPoint(ReversiConst.REVERSI_STS_BLACK, 0);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetPointCnt() {
		this.getPointCnt(ReversiConst.REVERSI_STS_BLACK);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetBetCnt() {
		this.getBetCnt(ReversiConst.REVERSI_STS_BLACK);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetPassEna() {
		this.getPassEna(ReversiConst.REVERSI_STS_BLACK, 0, 0);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetHistory() {
		this.getHistory(0);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetHistoryCnt() {
		this.getHistoryCnt();
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetPointAnz() {
		this.getPointAnz(ReversiConst.REVERSI_STS_BLACK, 0, 0);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testCheckEdge() {
		this.checkEdge(ReversiConst.REVERSI_STS_BLACK, 0, 0);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetEdgeSideZero() {
		this.getEdgeSideZero(0, 0);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetEdgeSideOne() {
		this.getEdgeSideOne(0, 0);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetEdgeSideTwo() {
		this.getEdgeSideTwo(0, 0);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetEdgeSideThree() {
		this.getEdgeSideThree(0, 0);
		boolean flag = true;
		assertTrue(flag);
	}

}
