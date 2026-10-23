package kadai_028;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	public String getMyChoice() {
	      
	   Scanner scanner = new Scanner(System.in);
	        
	   System.out.println("自分のじゃんけんの手を入力しましょう");
	        
	   System.out.println("グーはrockのrを入力しましょう");
	        
	   System.out.println("チョキはscissorsのsを入力しましょう");
	        
	   System.out.println("パーはpaperのpを入力しましょう");

	        while (true) {
	        	
	        	String choice = scanner.next();
	        	
	        	if (! (choice.equals ("r") || choice.equals ("s") || choice.equals ("p"))) {
	        		
	        		System.out.println("入力された文字が正しくありません。");
	        		System.out.println("r,s,pの中から選択してください。");
	        		
	        	}else{
	        		
	        		return choice;
	        		
	        	}

	        }
	        
	}
	       
	    public String getRandom() {
	    	
	    	Random random = new Random();
	    	
	    	String[] hands = { "r", "s", "p" };
	    	
	    	int num = (int) Math.floor(Math.random() * 3);
	    	
	    	return hands[num];
	    			

	    	
	}
	    public void playGame() {
	    	
	    	HashMap<String,String> janken = new HashMap<String,String>();
	    	
	    	janken.put("r","グー");
	    	janken.put("s","チョキ");
	    	janken.put("p","パー");
	    	
	    	String myHand = getMyChoice();
	    	String enemyHand = getRandom();
	    	
	    	System.out.println("自分の手は" + janken.get(myHand) + ",対戦相手の手は" + janken.get(enemyHand));

	    	if (myHand.equals(enemyHand)) {
	    		
	    		System.out.println("あいこです");
	    		
	    	}else if((myHand.equals("r") && enemyHand.equals("s")) ||
	    			 (myHand.equals("s") && enemyHand.equals("p")) ||
	                 (myHand.equals("p") && enemyHand.equals("r"))) {
	    		
	    		System.out.println("自分の勝ちです");
	    			
	    		}else {
	    		
	    		System.out.println("自分の負けです");
	    		
	    		}

	    		
	    		
	    	}
	    	
	    	
	    	
	    }
	    


