package org.fkjava.maven_test.message.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @RestController相当于springmvc中的@Controller和@ResponseBody
 * @author tony
 *
 */
@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello(){
		System.out.println("hotfix finish");
		return "hello my frist spring boot mysecond3333" +"hello my frist spring boot myfirst";
	}
	
}
