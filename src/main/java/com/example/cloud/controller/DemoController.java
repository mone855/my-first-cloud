/**
 * 
 */
package com.example.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author p319524
 *
 */
@RestController
public class DemoController {

	@RequestMapping("/")
	public String sampleRequest(){
		return "welcome sample demo";
	}
	
	@GetMapping("/{value}")
	public String sampleRequest(@PathVariable("value") String variable){
		return "welcome sample demo " + variable + "...!";
	}
}
