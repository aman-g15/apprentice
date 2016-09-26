package test;

public class Test {
	
	public static void main(String[] args){
		System.out.println("Welcome!!");
		String s = "Hello";
		System.out.println(s.toString());
		String[] horses = new String[5];
		horses[4]=null;
		for(int i=0; i<horses.length; i++){
			if(i<args.length){
				horses[i]=args[i];
				System.out.println(horses[i].toUpperCase()+" ");
			}
		}
	}
}
