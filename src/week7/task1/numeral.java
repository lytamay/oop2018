package week7.task1;

public class numeral extends Expression{
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public numeral() {
		value = 0;
	}
	public numeral(int value) {
		this.value= value;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value+" ";
	}

	@Override
	public int evaluate() {
		// TODO Auto-generated method stub
		return value;
	}
	
}
