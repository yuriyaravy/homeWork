package by.IntelSoft.HWSeventh;

public class Tank {
		
		int petrolContainsTank;
		int maxVolumeTank;
		int allPetrol;
	
	public Tank(int petrolContainsTank,int maxVolumeTank){
		this.petrolContainsTank = petrolContainsTank;
		this.maxVolumeTank = maxVolumeTank;
	}
	public int getAllPetrol(){
		return allPetrol;
	}
	public void refillTank(int petrol){
		this.allPetrol = petrolContainsTank + petrol;
		if(allPetrol > maxVolumeTank){
			System.out.println("You cant contain not more then " + maxVolumeTank);
		}else{
			System.out.println("Your tank contain  " + allPetrol);
		}
		//return allPetrol;
	}			
}


