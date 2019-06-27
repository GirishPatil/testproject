package javaexmpls;

public class Multi1 implements Runnable {
	
	public void run() {
		System.out.println("system is running...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multi1 m1=new Multi1();
		Thread t = new Thread(m1);
		t.start();

	}

}
