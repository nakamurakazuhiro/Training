package example3;

public class Car {
	public String name;
	public String color;

	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public void showlnfo() {
		System.out.println(name + "の詳細情報");
		System.out.println("名前:" + name);
		System.out.println("色:" + color);
	}
}
