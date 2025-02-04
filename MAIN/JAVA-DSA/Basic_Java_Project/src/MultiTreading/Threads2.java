package MultiTreading;

public class Threads2 extends Thread {

	public static void main(String[] args) {
		Run1 a =new Run1();
		a.start();
		
		Run2 b =new Run2();
		b.start();
		
		
		Run3 c =new Run3();
		c.start();
		
		Threads2 t = new Threads2();
		t.start();
}
	
public void run() {
	try {
		for (int i = 0; i <5; i++) {
			sleep(2000);
			
			System.out.println(i);
		}
	} catch (Exception e) {
		e.getMessage();
		
	}
	
}

}
class Run1 extends Thread{
	public void run() {
		 for(int  i =1 ; i<=5 ;i++) {
			 try {
				 System.out.println(i);
				Thread.sleep(1000);
			} catch (Exception e) {
				
				e.getMessage();
			}
		 }
	}
}
class Run2 extends Thread{
	public void run() {
		 for(int  i =6 ; i<=10 ;i++) {
			 try {
				 System.out.println(i);
				Thread.sleep(1000);
			} catch (Exception e) {
				
				e.getMessage();
			}
		 }
	}
}
class Run3 extends Thread{
	public void run() {
		 for(int  i =11 ; i<=15 ;i++) {
			 try {
				 System.out.println(i);
				Thread.sleep(100);
			} catch (Exception e) {
				
				e.getMessage();
			}
		 }
	}
}