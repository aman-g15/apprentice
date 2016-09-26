package test;

import java.util.ArrayList;

public class Emu {
static String s = "-";
public static void main(String[] args){
	try{
		
		int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		for(int i: array){
			System.out.println(i);
		}
		throw new Exception();
	}
	catch(Exception e){
		try{
			try{
				throw new Exception();
			}catch(Exception ex){
				s+="ic ";
			}throw new Exception();
		}catch(Exception ex){
			s+="mc ";
		}finally{
			s+="mf ";
		}
	}finally{
		s+="of ";
		Emu e = null;
		e.test();
		Emu e2 = new Emu();
		e2.test();
		System.out.println(s);
	}
	
}
public static void test(){
	System.out.println("Possible");
}
}
