package javaexmpls;

public class Multi extends Thread {
	
	public void run() {
		System.out.println("thread is running....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multi m =new Multi();
		m.start();

	}

}
