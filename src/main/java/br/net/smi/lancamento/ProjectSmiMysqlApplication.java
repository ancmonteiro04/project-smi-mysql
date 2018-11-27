package br.net.smi.lancamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class ProjectSmiMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSmiMysqlApplication.class, args);
	}
}
