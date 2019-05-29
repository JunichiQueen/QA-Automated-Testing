package com.bae.blackjack.app;

public class BlackJackApp {
	
	public static void main(String[] args) {
		
	}
	
	public int twist() {
		int card = ((int)(Math.random()* 11)+1);
		return card;
	}
	
	public int play(int player, int dealer) {
		if (player < 31 || player > 3 || dealer < 31 || dealer > 3) {
			if (dealer < 16){
				dealer += twist();
			}			
			if (player <= 21 && dealer <= 21){
				if (player == dealer) {
					return 0;
				} else if (player == 21) {
					return player;
				} else if (dealer == 21) {
					return dealer;
				} else if (player > dealer) {
					return player;
				} else if (dealer > player) {
					return dealer;
					}
				else return 1;
			} else {				
		} return -1; 
	
}
	
}
}
