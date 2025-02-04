package Threads;

public class One extends Thread {
	
//	public void run() {
//		for(int i=0; i<5; i++) {
//			try {
//				System.out.println(i);
//				Thread.sleep(500);
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
//		}
//	}
	
	public void run(int n) {
		for(int i=0; i<n; i++) {
			try {
				System.out.println(i);
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
//		one1 two = new one1();
//		two.start();
//		One o =new One();
//		o.run(10);
		Run r =new Run();
		r.run();

	}
}
	
	class one1 extends Thread{
		public void run() {
			for (int i = 0; i <5; i++) {
				try {
					System.out.println(i);
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
			}
		}
	}
	
	class Run implements Runnable{
		public void run() {
			for (int i = 0; i <5; i++) {
				try {
					System.out.println(i);
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
			}
		}
	}


