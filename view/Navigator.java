package by.home.view;

import java.util.ArrayList;


public class Navigator {
	
	private Menu currentMenu;

	public Navigator(Menu currentMenu) {
		super();
		this.currentMenu = currentMenu;
	}
	
	public void printMenu(){
		int counter = 0;
		ArrayList<MenuItem> items = currentMenu.menuItems;
		for(MenuItem temp : items){
			counter++;
			String title = temp.getTitle();
			System.out.println(counter + " - " +title);
		}
	}
	
	public void navigate(int index){
		ArrayList<MenuItem> listItems = currentMenu.menuItems;
		MenuItem item = listItems.get(index);
		if (item.getAction() != null){
			item.doAction();
		} else {
			currentMenu = item.getNextMenu();
		}
	}

}
