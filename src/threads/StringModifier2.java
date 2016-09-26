package threads;

public class StringModifier2 extends Thread {

	StringBuilder sb = new StringBuilder();

	public StringModifier2(char c) {
		sb.append(c);
	}

	public void run() {
		synchronized (sb) {
			for (int i = 1; i <= 10; i++) {
				System.out.print(sb);
			}
		
			System.out.println();
		}
	}

}
