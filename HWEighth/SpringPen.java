package by.IntelSoft.HWEighth;

public class SpringPen {
	
	boolean spring;
	
	public SpringPen(boolean spring){
		if(spring){
			this.spring = spring;
		}else{
			System.out.println("Your pen not include spring");
		}
	}
}
