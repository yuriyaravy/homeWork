package by.home.view;

import by.home.view.interfeses.*;

public class Builder {
	
//	private String visible = MenuState.VISIBLE.toString();
//	private String invisible = MenuState.INVISIBLE.toString();
	
	private Menu mainMenu = new Menu();
	private Menu one = new Menu();
	private Menu two = new Menu();
	
	
public Menu buildMenu(){
	
		one.addMenu(new MenuItem("2 + 2" , new OneOne()));
		one.addMenu(new MenuItem("5 + 5" , new OneTwo()));
		one.addMenu(new MenuItem("3 + 3" , new OneThree()));
		
		two.addMenu(new MenuItem("10 - 3", new TwoOne()));
		two.addMenu(new MenuItem("10 - 5", new TwoTwo()));
		
		mainMenu.addMenu(new MenuItem("Customer", one));
		mainMenu.addMenu(new MenuItem("Manager", two));
		mainMenu.addMenu(new MenuItem("Manager2534", two));
		
		return mainMenu;
	}
	
	public Menu getRootMenu(){
		return this.buildMenu();
	}

}
