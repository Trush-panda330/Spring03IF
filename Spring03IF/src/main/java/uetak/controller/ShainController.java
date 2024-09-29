package uetak.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import uetak.Service.ShainService;
import uetak.entity.Shain;
/** 
 * ブラウザからリクエストを受け取り
 * レスポンスを返すコントローラー*/
@Controller
public class ShainController {
	
	@Autowired
	ShainService shainService;
	
	public void findAll() {
		//社員サービスのインスタンスを作成
//		ShainService shainService = new ShainService();
		//社員リストを取得
		ArrayList<Shain> shainList = shainService.findAll();

		//社員リストの中を表示
		for (Shain shain : shainList) {
			System.out.println(shain.getId() + ":" + shain.getName() +
					":" + shain.getGender() + ":" + shain.getNen()
					+ ":" + shain.getAddress());
		}
	}

}
