package javaexmpls;

abstract class Bike2{
	Bike2(){
		System.out.println("bike is created");
	}
	abstract void run();
	
	void changeGear() {
		System.out.println("gear changed");
	}
}

class Honda extends Bike2{
	void run() {
		System.out.println("running safely...");
	}
}

public class AbstractionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike2 b =new Honda();
		b.run();
		b.changeGear();

	}

}
