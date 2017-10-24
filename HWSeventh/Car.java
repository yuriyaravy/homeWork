package by.IntelSoft.HWSeventh;
import by.IntelSoft.HWSeventh.*;

public class Car {
		
		Engine engine;
		boolean startEngine;
		Transmission transmission;
		Tank tank ;
		BodyCar bodyCar;
		String brand;
		String color;
		
		int allPetrol;
	public void setAllPetrol(int allPetrol){
		this.allPetrol = allPetrol;
	}
		private boolean actEngine;
	public void setActEngine(boolean actEngine){
		this.actEngine = actEngine;
	}
		int newTransmission;
	public void setNewTransmissione(int newTransmission){
		this.newTransmission = newTransmission;
	}
		int transmissionNumber;
	public void setTransmissionNumber(int transmissionNumber){
		this.transmissionNumber = transmissionNumber;
	}
		int powerEngine;
	public void setPowerEngine (int powerEngine){
		this.powerEngine = powerEngine;
	}	
	
		int transmissionStep = newTransmission;
	public void turnOnCar(){
		if(actEngine && transmissionStep==0){
			System.out.println("Brrr dum dum dum --- dum da da da da dum"  );
		}else{
			System.out.println("Trrrr");
		}
	}	
		int speed;
	public void goMoveCar(int speed){
		this.speed = speed;
				if(actEngine && newTransmission > 0 && allPetrol > 0){
					System.out.println("It's alive, our speed " + speed);
				}else{
					System.out.println("Doesn't work ");
				}
			}
	public void stopMoveCar(int speed){
		if(actEngine==true && speed > 0){
			System.out.println("We are moving " + speed);
		}else{
			System.out.println("We are stop");
		}
	}
		public void turnOffCar(){
			if(actEngine){
				System.out.println("The engine switch off ");
			}else{
				System.out.println("The engine didnt work ");
		}
	}
	
		public void SpeedTest(int StepTransm){
			int resault = powerEngine / transmissionNumber;
			int minstep = resault*StepTransm;
			
		switch(StepTransm){
			
		case 1:
			System.out.println("Max speed " + minstep*StepTransm);
				break;
		case 2:
			System.out.println("Max speed " + minstep*StepTransm);
				break;
		case 3:
			System.out.println("Max speed " + minstep*StepTransm);
				break;
		case 4:
			System.out.println("Max speed " + minstep*StepTransm);
				break;
		case 5:
			System.out.println("Max speed " + minstep*StepTransm);
				break;
		default:
			System.out.println("We have problem ");
			}
		}
	}
