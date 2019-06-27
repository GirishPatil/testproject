package javaexmpls;

public class Operation1 {
	
	int data=50;
	
	void change(int data) {
		data=data+100;//changes will be in the local variable only  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operation1 o=new Operation1();
		
		System.out.println("before change "+o.data);
		
		o.change(500);
		
		System.out.println("after chnage "+o.data);

	}

}
