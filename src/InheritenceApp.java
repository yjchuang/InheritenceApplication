public class InheritenceApp {

	public static void main(String[] args) {

		Animal a = new Animal();
		a.eat();
		a.sleep();

		Cat c = new Cat();
		c.eat();
		c.sleep();
		c.purr();

		Bird b = new Bird();
		b.eat();
		b.sleep();
		b.fly();

	}
}

