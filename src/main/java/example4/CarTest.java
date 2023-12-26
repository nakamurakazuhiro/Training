package example4;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car("プリウス", "白");
		ElectricCar electricalCar = new ElectricCar("プリウスPHV", "黒", 100);
		System.out.println("----------------");
		car.showInfo();
		System.out.println("----------------");
		electricalCar.showInfo();
		System.out.println("----------------");
		electricalCar.batteryCharger(50);
		System.out.println("----------------");
		electricalCar.showInfo();
		System.out.println("----------------");
	}
}
