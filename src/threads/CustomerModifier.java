package threads;

public class CustomerModifier implements Runnable{
	
	public void run(){
		Customer c = new Customer();
		c.setId(5);
		
		for(int i=0; i<10; i++){
		c.setName("Aman");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c.getId());
		System.out.println(c.getName());
	}

}
