package by.IntelSoft.HWSeventh;

public class Transmission {
	
	String transmissionType;
	int transmissionNumber;

	public Transmission(String transmissionType, int transmissionNumber){
		this.transmissionType = transmissionType;
		this.transmissionNumber = transmissionNumber;
	}
	
	public int getNewTransmission(){
		return newTransmission;
	}
	public int getTransmissionNumber(){
		return transmissionNumber;
	}
		private int newTransmission = 1;
	public int nextTransmission(){
		if(newTransmission < transmissionNumber){
			newTransmission++;
		}else{
			System.out.println("You have only " + transmissionNumber);
		}
		return newTransmission;
	}
	public int lowTransmission(){
		if(newTransmission > 0){
			newTransmission--;
		}else{
			System.out.println("We alredy  " + newTransmission);
		}
		return newTransmission;
	}
}
