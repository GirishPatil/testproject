package javaexmpls;

 class Person{
	int id;
	String name;
	
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
}
 
 class Emp extends Person{
	 float salary;
	 
	 Emp(int id,String name,float salary){
		 super(id,name);
		 this.salary=salary;
	 }
	 
	 void display() {
		 System.out.println(id+" "+name+" "+salary);
	 }
 }

public class Superexmple {	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e =new Emp(1,"manju",20000f);
		e.display();

	}

}
