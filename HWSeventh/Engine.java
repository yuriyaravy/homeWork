package by.IntelSoft.HWSeventh;

public class Engine {
		
	double volumeEngine;
	int numberEngine; 
	int powerEngine; 
	String petrolType;
	boolean actEngine;
	
	
	public Engine(double volumeEngine,int numberEngine, int powerEngine,String petrolType){
		this.volumeEngine = volumeEngine;
		this.numberEngine = numberEngine;
		this.powerEngine = powerEngine;
		this.petrolType = petrolType;
	}
	
	public int getPowerEngine(){
		return powerEngine;
	}
	public boolean getActEngine(){
		return actEngine;
	}
	public boolean starter(){
		this.actEngine = true;
		return actEngine;
}
	public boolean stoper(){
		this.actEngine = false;
		return actEngine;
}
}