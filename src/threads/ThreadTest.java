package threads;

public class ThreadTest {
	public static void main(String[] args){/*
		
		CustomerModifier c = new CustomerModifier();
		Thread t1 = new Thread(c);
		t1.start();
		Thread t2 = new Thread(c);
		
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/
		StringModifier2 t1 = new StringModifier2('A');
		StringModifier2 t2 = new StringModifier2('B');
		StringModifier2 t3 = new StringModifier2('C');
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
