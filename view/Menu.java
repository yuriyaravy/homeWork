package by.home.view;

import java.util.ArrayList;


public class Menu {
	
	public String name;
	public ArrayList<MenuItem> menuItems = new ArrayList<>();
	
	public Menu() {}
	
	
	public Menu(String name) {
		this.name = name;
	}

	public void addMenu(MenuItem mI){
		menuItems.add(mI);
	}

	@Override
	public String toString() {
		return "Menu [name=" + name + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
