package week7.task1;

public class addTion extends BynaryExpression {
	Expression left;
	Expression right;
	public addTion (Expression left, Expression right) {
		this.left =left;
		this.right = right;
	}
	
	@Override
	Expression left() {
		// TODO Auto-generated method stub
		return this.left;
	}

	@Override
	Expression right() {
		// TODO Auto-generated method stub
		return this.right();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return left.toString()+ "+"  + right.toString();
	}

	@Override
	public int evaluate() {
		// TODO Auto-generated method stub
		return left.evaluate()+ right.evaluate();
	}
	

}
