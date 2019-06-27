package javaexmpls;

public class TestSleep extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println(e);
				
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TestSleep ts=new TestSleep();
			TestSleep ts1=new TestSleep();
			
			ts.start();
			ts1.start();

	}

}
