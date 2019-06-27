package javaexmpls;

public class Student implements Cloneable  {
	int id;
	String name;
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Student s=new Student(101,"vinay");
			Student s1=(Student)s.clone();
			
			System.out.println(s.id+" "+s.name);
			System.out.println(s1.id+" "+s1.name);
		}catch(CloneNotSupportedException c) {
			
		}

	}

}
