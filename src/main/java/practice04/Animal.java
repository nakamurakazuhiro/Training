package practice04;

public class Animal {

	private String name;
	private int age;

	public Animal(String name, int age) {
		setName(name);
		setAge(age);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}

	public void showInfo() {
		System.out.println("名前 : " + getName());
		System.out.println("年齢 : " + getAge());
	}
}
