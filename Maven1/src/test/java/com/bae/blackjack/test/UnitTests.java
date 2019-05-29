package com.bae.blackjack.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.bae.blackjack.app.BlackJackApp;

public class UnitTests {
	static BlackJackApp blackjack;
	
	@BeforeClass
	public static void setup() {
		blackjack = new BlackJackApp();
	}
	
	@Test
	public void Test1(){
		assertEquals(0, blackjack.play(0, 0));
	}
	
	@Test
	public void Test2(){
		assertEquals(21, blackjack.play(0, 21));
	}
	
	@Test
	public void Test3(){
		assertEquals(21, blackjack.play(21, 0));
	}
	
	@Test
	public void Test4(){
		assertEquals(-1, blackjack.play(1, 10));
	}
	
	@Test
	public void Test5(){
		assertEquals(21, blackjack.play(30, 21));
	}
	
	@Test
	public void Test6(){
		assertEquals(-1, blackjack.play(31, 22));
	}
	
	@Test
	public void Test7(){
		assertEquals(0, blackjack.play(25, 25));
	}
	
	@Test
	public void Test8(){
		assertEquals(-1, blackjack.play(31, 31));
	}
	
	@Test
	public void Test9(){
		assertEquals(10, blackjack.play(30, 10));
	}
	
	@Test
	public void Test10(){
		assertEquals(10, blackjack.play(4, 10));
	}
}
