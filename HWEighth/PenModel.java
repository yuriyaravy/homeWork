package by.IntelSoft.HWEighth;

import java.util.Scanner;

public class PenModel {
	
	SpringPen SpringPen;
	PenRefill PenRefill;
	BodyPen BodyPen;
	
	
		int ink;
	public void setInk(int ink){
		this.ink = ink;
	}
	
	public void writeText(){
		if(CheckSpring || ink > 0){
			Scanner sc = new Scanner(System.in);
			System.out.print("Write somethink: ");
			String text =sc.nextLine();
			System.out.println("Yuor message: " + text);
			int numbLetters = text.length();
				for(int i = 0; i < numbLetters; i++){
					ink--;
					}
				System.out.println("Ink left : " + ink);
		}else{
			System.out.println("Its not ready to work ");
		}
	}
		boolean CheckSpring;
	public boolean turnOn(){
		this.CheckSpring = true;
		System.out.println("Pen ready to work ");
		return CheckSpring;
		}
	public boolean turnOff(){
		this.CheckSpring = false;
		System.out.println("Pen ready to keep ");
		return CheckSpring;
		}
}