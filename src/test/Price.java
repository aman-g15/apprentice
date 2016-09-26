package test;

public class Price {
	int value;
	public Price(int val){
		value = val;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	public String toString(){
		return "Value: "+value;
	}
	
}
