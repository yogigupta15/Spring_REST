package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.demo.ws.obj.Quote;

public class QuoteService {
	private List<Quote> quotes = new ArrayList<Quote>();
	
	public QuoteService() {
		this.quotes.add(new Quote("Success is not final; failure is not fatal: It is the courage to continue that counts.","Winston S. Churchill"));
		this.quotes.add(new Quote("It is better to fail in originality than to succeed in imitation.","Herman Melville"));
		this.quotes.add(new Quote("The road to success and the road to failure are almost exactly the same.","Colin R. Davis"));
		this.quotes.add(new Quote("Success usually comes to those who are too busy to be looking for it.","Henry David Thoreau"));
		this.quotes.add(new Quote("Opportunities don't happen. You create them.","Chris Grosser"));
		this.quotes.add(new Quote("I find that the harder I work, the more luck I seem to have.","Thomas Jefferson"));
	}
	
	public Quote getQuote() {
		Random rn = new Random();
		int select = rn.nextInt(this.quotes.size());
		return this.quotes.get(select);
	}
	

}
