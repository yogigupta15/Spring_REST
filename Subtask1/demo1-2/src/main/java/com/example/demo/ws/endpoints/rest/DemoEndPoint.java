package com.example.demo.ws.endpoints.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.QuoteService;
import com.example.demo.ws.obj.Quote;

@RestController
public class DemoEndPoint {
	private QuoteService quoteService;
	
	public DemoEndPoint(QuoteService quoteservice) {
		this.quoteService = quoteService;
	}
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello spring";
	}
	
	@RequestMapping("/quote")
	public Quote getquote() {
		return this.quoteService.getQuote();
	}
	
	@RequestMapping(value="/quote", method=RequestMethod.POST)
	public void addQuote(@RequestBody Quote quote) {
		this.quoteService.addQuote(quote);
	}
}
