package example4;

public class ElectricCar extends Car {

	private int battery;

	public ElectricCar(String name, String color, int battery) {
		super(name, color);
		this.battery = battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("残りバッテリー" + battery);
	}

	public void batteryCharger(int batteryVolum) {
		battery += batteryVolum;
		System.out.println("バッテリーを" + batteryVolum + "充電しました。");
	}
}
