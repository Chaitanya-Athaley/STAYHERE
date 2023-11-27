package com.stayhere.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.stayhere.common.SuccessCodes;

@SpringBootApplication
public class ShUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShUserApplication.class, args);
//		String codeMessage = SuccessCodes.getCodeMessage("202");
		System.out.println("----codeMessage");
	}

}
