package test;

public class Propagation {

	public static void main(String[] args){
		try{
		String result = reverse(null);
		System.out.println(result);
		}
		catch(Exception e){
			System.out.println("Exception caught");
		}
		finally{
			System.out.println("main() finished");
		}
	}
	public static String reverse(String input){
		String revStr = "";
		try{
			for(int i=input.length();i>=0;i--){
				revStr+=input.charAt(i);
			}
		}
		finally{
			System.out.println("Reverse method was called");
		}
		return revStr;
	}
	
}
