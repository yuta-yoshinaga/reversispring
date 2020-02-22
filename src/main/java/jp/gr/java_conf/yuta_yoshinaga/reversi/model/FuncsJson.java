////////////////////////////////////////////////////////////////////////////////
///	@file			FuncsJson.java
///	@brief			ファンクションJSONクラス実装ファイル
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
///	@class		FuncsJson
///	@brief		ファンクションJSONクラス
///
////////////////////////////////////////////////////////////////////////////////
public class FuncsJson implements Serializable {
	private String func; //!< ファンクション
	private String param1; //!< パラメーター1
	private String param2; //!< パラメーター2
	private String param3; //!< パラメーター3
	private String param4; //!< パラメーター4
	private String param5; //!< パラメーター5
}
