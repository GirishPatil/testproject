package javaexmpls;

public class WrapperExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a=new Integer(3);
		
		int i=a.intValue();//converting integer into int
		int j=a;//unboxing, now compiler will write a.intValue() internally    
		
		System.out.println(a+" "+i+" "+j);

	}

}
