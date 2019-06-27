package javaexmpls;

interface printable{}

class A implements printable{
	public void a() {
		System.out.println("a method");
	}
}

class B implements printable{
	public void b() {
		System.out.println("b method");
	}
}

class Call{
	void invoke(printable p) {
		 if(p instanceof A) {
			 A a =(A)p;
			 a.a();
		 }
		 if(p instanceof B ) {
				B b=(B)p;
				b.b();
			}
	}
	
}

public class Instanceofexmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printable p =new B();
		Call c=new Call();
		c.invoke(p);

	}

}
