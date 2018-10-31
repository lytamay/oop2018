package cau1;

public class Subtraction extends BynaryExpression{
	Expression left;
	Expression right;
	
	public Subtraction(Expression left, Expression right) {
		this.left= left;
		this.right = right;
		
	}

	@Override
	Expression left() {
		
		return this.left;
	}

	@Override
	Expression right() {
		
		return this.right;
	}

	@Override
	public String toString() {
		
		return left.toString()+ " -" + right.toString();
	}

	@Override
	public int evaluate() {
		
		return left.evaluate() - right.evaluate();
	}

}
