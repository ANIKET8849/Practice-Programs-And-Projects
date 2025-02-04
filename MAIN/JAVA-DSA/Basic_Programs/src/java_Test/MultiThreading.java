package java_Test;

public class MultiThreading {

	public static void main(String[] args) {
	
		a ab=new a();
		ab.start();
		b cd =new b();
		cd.start();

	}


}
class a extends Thread{
	public void run() {
		for (int i = 2; i < 21; i=i+2) {
			System.out.println(i);
		}
		
	}
	
}
class b extends Thread{
	public void run() {
		for (int i = 0; i < 21; i++) {
			if (i%2!=0) {
				try {
					Thread.sleep(500);
					System.out.println(i);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
		}
	}
}
