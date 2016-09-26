package test;

public class MyExceptionTest {

	public static void main(String[] args) {
		try{
			checkFood(args[0]);
		}
		catch(BadFoodException ex){
			ex.printStackTrace();
		}
	}
	public static void checkFood(String food) throws BadFoodException{
		String[] badFoodList = {"Tinda", "Tori", "Bhindi", "Karela"};
		for(String badFood : badFoodList){
			if(badFood.equals(food)){
				throw new BadFoodException();
			}else{
				System.out.println("Good food");
			}
		}
		
	} 
}
