package practice05;

public class AnimalTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog("ポチ",2,"ワン");
		Sparrow sparrow = new Sparrow("チュン",1,"チュンチュン");
		
		
		Show show1 =new Show(dog);
		show1.showInfo();
		
		System.out.println("---------------");
		
		Show show2 =new Show(sparrow);
		show2.showInfo();
	}
}
