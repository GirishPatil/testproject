package javaexmpls;

public class Operationo {
	
	int data=50;
	
	void change(Operationo op) {
		op.data=op.data+100;//changes will be in the instance variable 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operationo op =new Operationo();
		System.out.println("before change "+op.data);
		
		op.change(op);//passing object
		System.out.println("after change "+op.data);

	}

}
