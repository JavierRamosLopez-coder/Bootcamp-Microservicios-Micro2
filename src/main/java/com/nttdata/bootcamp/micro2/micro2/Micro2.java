package com.nttdata.bootcamp.micro2.micro2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/**
 * Clase Micro2
 * @author jramlope
 *
 */
public class Micro2 {

	@GetMapping(path = "/micro2")
	/**
	 * Método que devuelve un String
	 * @return
	 */
	public String helloMicro2() {
		return "Micro2";
	}

}
