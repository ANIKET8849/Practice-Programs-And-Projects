package MultiTreading;

public class Runnable2 extends Thread {

	public static void main(String[] args) {
		Run5 run3=new Run5();
		Run6 run4=new Run6();
		Run7 run5=new Run7();
		Thread t1 =new Thread(run3);
		Thread t2 =new Thread(run4);
		Thread t3 =new Thread(run5);
		t1.start();
		t2.start();
		t3.start();	
	}

}
class Run5 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			
		
		System.out.println("Aniket1 ");
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		}
	}
}

class Run6 implements Runnable {
	public void run() {
		System.out.println("Aniket2 ");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
}
class Run7 implements Runnable {
	public void run() {
		System.out.println("Aniket3 ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
}