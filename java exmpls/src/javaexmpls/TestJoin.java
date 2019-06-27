package javaexmpls;

public class TestJoin extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
				
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestJoin tj=new TestJoin();
		TestJoin tj1=new TestJoin();
		TestJoin tj2=new TestJoin();
		
		tj.start();
		try {
			tj.join();
		}catch(Exception e) {
			System.out.println(e);
			
		}
		tj1.start();
		tj2.start();

	}

}
