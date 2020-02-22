package jp.gr.java_conf.yuta_yoshinaga.reversi.service;

import org.springframework.stereotype.Service;

import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ResJson;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiPlay;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiSetting;

@Service
public class ReversiService {

	public ResJson setSetting(ReversiPlay rvPlay, ReversiSetting setting) {
		ResJson resJson = new ResJson();
		rvPlay.setmSetting(setting);
		rvPlay.reset();
		resJson.setAuth("[SUCCESS]");
		return resJson;
	}

	public ResJson reset(ReversiPlay rvPlay) {
		ResJson resJson = new ResJson();
		rvPlay.reset();
		resJson.setAuth("[SUCCESS]");
		return resJson;
	}

	public ResJson reversiPlay(ReversiPlay rvPlay, int y, int x) {
		ResJson resJson = new ResJson();
		rvPlay.reversiPlay(y, x);
		resJson.setAuth("[SUCCESS]");
		return resJson;
	}
}
