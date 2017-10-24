package by.IntelSoft.HWEighth;

public class MainPen {

	public static void main(String[] args) {
		
		PenModel pen1 = new PenModel();
		SpringPen p1 = new SpringPen(true);
		PenRefill ref1 = new PenRefill();
		ref1.refill();
		
		int ink = ref1.setInk();
		pen1.setInk(ink);
		pen1.turnOn();
		pen1.writeText();
	
		
		
		
		

	}

}
