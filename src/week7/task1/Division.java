package week7.task1;

public class Division  extends BynaryExpression {
	Expression left;
	Expression right;
	
	public Division(Expression left, Expression right) {
		this.left = left;
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
		return left.evaluate() + "/ "+ right.evaluate();
	}

	@Override
	public int evaluate() {
		return left.evaluate()/right.evaluate();
	}
}
