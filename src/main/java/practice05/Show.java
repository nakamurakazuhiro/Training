package practice05;

public class Show {

	private Animal animal;

	public Show(Animal animal) {
		this.animal = animal;
	}

	public void showInfo() {
		animal.showInfo();
		animal.othtr();
		animal.cry();
	}

}
