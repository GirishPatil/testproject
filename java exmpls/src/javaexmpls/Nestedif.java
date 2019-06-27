package javaexmpls;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 25;
		int weight = 60;
		
		if(age>18) {
			if(weight>50) {
				System.out.println("you are elligible to donate blood");
			}else {
				System.out.println("you are not elligible to donate blood");
			}
		}
			else {
				System.out.println("your age must be greater than 18");
			}
		}

	}


