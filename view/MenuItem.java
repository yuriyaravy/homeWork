package by.home.view;


public class MenuItem {
	
	public String title;
	private Inter action;
	public Menu nextMenu;
	
	public void doAction() {
		action.resual();
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Inter getAction() {
		return action;
	}

	public void setAction(Inter action) {
		this.action = action;
	}

	public Menu getNextMenu() {
		return nextMenu;
	}

	public void setNextMenu(Menu nextMenu) {
		this.nextMenu = nextMenu;
	}

	public MenuItem(String title, Inter action) {
		this.title = title;
		this.action = action;
	}

	public MenuItem(String title, Menu nextMenu) {
		this.title = title;
		this.nextMenu = nextMenu;
	}

	@Override
	public String toString() {
		return "MenuItem [title=" + title + ", nextMenu=" + nextMenu + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
