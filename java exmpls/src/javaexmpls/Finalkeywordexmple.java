package javaexmpls;

class Bike1{
	final int speed;
	
	Bike1(){  // final keyword should be initialized only through the constructor()
		speed=100;
		System.out.println(speed);
	}
}

public class Finalkeywordexmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Bike1();

	}

}
