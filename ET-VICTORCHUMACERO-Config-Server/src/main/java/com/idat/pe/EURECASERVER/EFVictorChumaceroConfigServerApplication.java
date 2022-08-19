package com.idat.pe.EURECASERVER;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EFVictorChumaceroConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EFVictorChumaceroConfigServerApplication.class, args);
	}

}
