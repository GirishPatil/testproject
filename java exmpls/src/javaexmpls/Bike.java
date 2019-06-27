package javaexmpls;


public class Bike {
	int speed;
	
	Bike(){
		System.out.println("speed is "+speed);
	}
	
	{speed=100;} // instance initializer block used to initialize the instance variables
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b1= new Bike();
		Bike b2=new Bike();

	}

}
