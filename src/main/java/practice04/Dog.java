package practice04;

public class Dog extends Animal {

	private String furColor;

	//コンストは継承しない
	//ポリモフィずむでコンソールに
	public Dog(String mname, int age, String furColor) {
		super(mname, age);
		setFurColor(furColor);
	}

	private String getFurColor() {
		return furColor;
	}

	private void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("毛の色 : " + getFurColor());
	}

	public void cry() {
		System.out.println("鳴き声 : ワン");
	}
}
