package practice04;

public class Sparrow extends Animal {

	private boolean canFly;

	public Sparrow(String mname, int age, boolean canFly) {
		super(mname, age);
		setCanFry(canFly);
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFry(boolean canFly) {
		this.canFly = canFly;
	}

	public void showInfo() {
		super.showInfo();
		if (isCanFly()) {
			System.out.println("飛べます");
		} else {
			System.out.println("飛べません");
		}
	}

	public void cry() {
		System.out.println("鳴き声 : チュンチュン");
	}
}
