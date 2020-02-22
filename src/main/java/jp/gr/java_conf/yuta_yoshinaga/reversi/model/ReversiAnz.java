////////////////////////////////////////////////////////////////////////////////
///	@file			ReversiAnz.java
///	@brief			リバーシ解析クラス実装ファイル
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

package jp.gr.java_conf.yuta_yoshinaga.reversi.model;

import java.io.Serializable;

import lombok.Data;

@Data
////////////////////////////////////////////////////////////////////////////////
///	@class		ReversiAnz
///	@brief		リバーシ解析クラス
///
////////////////////////////////////////////////////////////////////////////////
public class ReversiAnz implements Serializable {
	private int min; //!< 最小値
	private int max; //!< 最大値
	private double avg; //!< 平均
	private int pointCnt; //!< 置けるポイント数
	private int edgeCnt; //!< 角を取れるポイント数
	private int edgeSideOneCnt; //!< 角一つ前を取れるポイント数
	private int edgeSideTwoCnt; //!< 角二つ前を取れるポイント数
	private int edgeSideThreeCnt; //!< 角三つ前を取れるポイント数
	private int edgeSideOtherCnt; //!< それ以外を取れるポイント数
	private int ownMin; //!< 最小値
	private int ownMax; //!< 最大値
	private double ownAvg; //!< 平均
	private int ownPointCnt; //!< 置けるポイント数
	private int ownEdgeCnt; //!< 角を取れるポイント数
	private int ownEdgeSideOneCnt; //!< 角一つ前を取れるポイント数
	private int ownEdgeSideTwoCnt; //!< 角二つ前を取れるポイント数
	private int ownEdgeSideThreeCnt; //!< 角三つ前を取れるポイント数
	private int ownEdgeSideOtherCnt; //!< それ以外を取れるポイント数
	private int badPoint; //!< 悪手ポイント
	private int goodPoint; //!< 良手ポイント

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			コンストラクタ
	///	@fn				public ReversiAnz()
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2014.07.23
	///
	////////////////////////////////////////////////////////////////////////////////
	public ReversiAnz() {
		this.reset();
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			リセット
	///	@fn				public void reset()
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2014.07.23
	///
	////////////////////////////////////////////////////////////////////////////////
	public void reset() {
		this.min = 0;
		this.max = 0;
		this.avg = 0.0f;
		this.pointCnt = 0;
		this.edgeCnt = 0;
		this.edgeSideOneCnt = 0;
		this.edgeSideTwoCnt = 0;
		this.edgeSideThreeCnt = 0;
		this.edgeSideOtherCnt = 0;
		this.ownMin = 0;
		this.ownMax = 0;
		this.ownAvg = 0.0f;
		this.ownPointCnt = 0;
		this.ownEdgeCnt = 0;
		this.ownEdgeSideOneCnt = 0;
		this.ownEdgeSideTwoCnt = 0;
		this.ownEdgeSideThreeCnt = 0;
		this.ownEdgeSideOtherCnt = 0;
		this.badPoint = 0;
		this.goodPoint = 0;
	}
}
