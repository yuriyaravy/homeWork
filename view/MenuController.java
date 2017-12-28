package by.home.view;



public class MenuController {
	
	private Builder builder;
	private Navigator navigator;
	
	public void run(){
		builder = new Builder();
		builder.buildMenu();
		navigator = new Navigator(builder.getRootMenu());
		while(true) {
			navigator.printMenu();
			int where = Choice.getInput();
			navigator.navigate(where-1);
		}
	}

}
