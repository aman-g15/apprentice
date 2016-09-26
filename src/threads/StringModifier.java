package threads;

public class StringModifier extends Thread{
	private StringBuffer buffer = new StringBuffer();
	public void run(){
		StringModifier sm = new StringModifier();
		char c = 'A';
		buffer.insert(0, c);
		for(int j =0; j<3; j++){
		try {
			sm.modifyString(buffer);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		System.out.println();
		buffer.insert(0, c++);
		}
	}
	public synchronized void modifyString(StringBuffer buffer) throws InterruptedException{
		
			for(int i=0; i< 100; i++){
				Thread.sleep(10);
			System.out.print(buffer);
		}
		
	
	}
	public static void main(String[] args){
		StringModifier s1 = new StringModifier();
		StringModifier s2 = new StringModifier();
		StringModifier s3 = new StringModifier();
		s1.start();
		s2.start();
		s3.start();
		
	}
}
