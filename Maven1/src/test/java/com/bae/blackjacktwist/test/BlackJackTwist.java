package com.bae.blackjacktwist.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import com.bae.blackjack.app.BlackJackApp;

public class BlackJackTwist {
	static BlackJackApp blackJackApp;
	
	@BeforeClass
	public static void setup() {
		blackJackApp = new BlackJackApp();
		
	}
	
	@Test
	public void Test1() {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i<100; i++) {
			myList.add(blackJackApp.twist());
			blackJackApp.twist();
		}
		for (int a: myList) {
			if(a > 0 && a < 12) {
				continue;
			} else {
				fail("Expected Value Between 1 & 11 but got "+ a);
			}
		}
	}

}
