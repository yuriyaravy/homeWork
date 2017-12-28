package by.home.view;

public enum MenuState {
	
	VISIBLE, INVISIBLE;
	
	private String value;
	
	private MenuState(){}
	
	private MenuState(String value){
		this.value = value;
	}
	
	public String toString() {
	       return this.value;
	    }
}
