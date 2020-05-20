package com.atmpin.main;

import com.atmpin.Util.KeyboardUtil;

public class Main {
          static int accno,atmpin;
	public static void main(String[] args){
		// TODO Auto-generated method stub
        
		//Create Account
		accno = (int) (Math.random()*10000);
		atmpin = KeyboardUtil.getInt("Create PIN for this account number "+accno+":");		
		System.out.println("Your account has been successfully saved.");
		for(int a=0;a<50;a++){
			System.out.println();
		}
		System.out.println("Your account has been successfully saved.");
		validatePin();
	}
	public static void validatePin() {
		// TODO Auto-generated method stub
		int times = 2;		
		for(int i=1; i<=3;i++){
			int pincheck = KeyboardUtil.getInt("Enter your card PIN for the account created:");
		if(pincheck == atmpin){
			System.out.println("PIN validated. Entered into this account successfully");
			System.exit(1);
		}
		else{
			System.out.println("Left with "+times+" tries");
			times--;
		}		
		}
		System.out.println("Your ATM card has been blocked");
	}
}