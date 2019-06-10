package com.example.springboot.controllAndView;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Con l'annotazione @SpringBootApplication di speing boot automaticamente 
 *  si includono quelle che dcon spring solitamente si inseriescono
 *  
 *  @Configuration
 *  @ContextComponentScan
 *  @EnableAutoConfiguration
 *  
 *  
 * @author CG05914
 *
 */
@SpringBootApplication
public class ControllAndViewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControllAndViewApplication.class, args);
	}

}
