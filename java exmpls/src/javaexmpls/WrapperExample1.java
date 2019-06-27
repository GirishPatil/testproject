package javaexmpls;

public class WrapperExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// converting int into integer	
		int a=10;
		
		Integer i=Integer.valueOf(a);// converting int into integer	
		Integer j=a;//  autoboxing,now compiler will write Integer.valueOf(a) internally  
		
		System.out.println(a+" "+i+" "+j);

	}

}
