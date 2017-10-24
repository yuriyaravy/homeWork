package by.IntelSoft.HWEighth;

public class PenRefill {
		
		int ink;
	public int refill(){
		int add = -(ink - 100);
		ink = add;
		return ink;
	}
	public int setInk(){
		return ink;
	}
		
}
