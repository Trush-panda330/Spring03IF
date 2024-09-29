package uetak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import uetak.controller.ShainController;

@SpringBootApplication
public class Spring03IfApplication {

	public static void main(String[] args) {
		//DIコンテナを作成
		ConfigurableApplicationContext context = SpringApplication.run(Spring03IfApplication.class, args);

		//社員コントローラーのインスタンスを呼ぶ
		ShainController shainController = context.getBean(ShainController.class);

		//インスタンスからメソッドを実行
		shainController.findAll();
	}

}
