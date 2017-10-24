package by.IntelSoft.HWSeventh;

public class Main {

	public static void main(String[] args) {
		
		Car car2 = new Car();
		Engine eng2 = new Engine(1.6,1543,100,"petrol");
		Transmission tra2 = new Transmission("avtomat", 5);
		Tank t2 = new Tank(13, 50);
		eng2.starter();
		
		
		int transmissionNumber = tra2.getTransmissionNumber();
		car2.setTransmissionNumber(transmissionNumber);
		
		boolean actEngine = eng2.getActEngine();
		car2.setActEngine(actEngine);
		
		int powerEngine = eng2.getPowerEngine();
		car2.setPowerEngine(powerEngine);
		
		tra2.nextTransmission();
		tra2.lowTransmission();
		
		int newTransmission = tra2.getNewTransmission();
		car2.setNewTransmissione(newTransmission);
		
		t2.refillTank(5);
		
		int allPetrol = t2.getAllPetrol();
		car2.setAllPetrol(allPetrol);
		
		
		car2.goMoveCar(15);
	}
}
