package practice05;

abstract class Animal {

	private String name;
	private int age;
	private String cry;

	public Animal(String name, int age, String cry) {
		this.name = name;
		this.age = age;
		this.cry = cry;
	}

	public void showInfo() {
		System.out.println("名前 : " + name);
		System.out.println("年齢 : " + age);
	}

	public void cry() {
		System.out.println("鳴き声 : " + cry);
	}

	abstract void othtr();
}
