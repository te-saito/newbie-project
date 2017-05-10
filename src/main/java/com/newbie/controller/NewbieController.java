package com.newbie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.newbie.service.NewbieService;

@RestController
public class NewbieController {

	/* NewbieService */
	@Autowired
	private NewbieService NewbieService;

	/* Hello Worldを返すだけ */
	@RequestMapping(value="/message", method=RequestMethod.GET)
	public String getHelloMessage(){
		return "Hello World";
	}

	@GetMapping(value="/exception")
	public String getErrorMessage(){
		return "Error? Really?";
	}

	/* パラメータを３つつなげるよ */
	@RequestMapping(value="/echo", method=RequestMethod.GET)
	public String getEchoMessage(@RequestParam(name="mes",required=true)String message){
		return message + message + message;
	}

	@RequestMapping(value="/echo1", method=RequestMethod.GET)
	public String getEchoMessage1(@RequestParam(name="mes",required=true)String message){
		return NewbieService.getMessage(message);
	}

	@RequestMapping(value="/echo2", method=RequestMethod.GET)
	public String getEchoMessage2(@RequestParam(name="mes",required=true)String message){
		return NewbieService.getBlackOut(message);
	}
}
