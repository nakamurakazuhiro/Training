package example4;

public class Car {

	private String name;
	private String color;

	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void showInfo() {
		System.out.println(name + "の詳細情報");
		System.out.println("名前" + name);
		System.out.println("色" + color);
	}
}
