package week7.task1;

public class Multiplication extends BynaryExpression {
	Expression left;
	Expression right;
	public Multiplication(Expression left, Expression right) {
		this.left= left;
		this.right = right;
		
	}

	@Override
	Expression left() {
		return left;
	}

	@Override
	Expression right() {
		return right;
	}

	@Override
	public String toString() {
		return left.evaluate() + "* "+ right.evaluate();
	}

	@Override
	public int evaluate() {
		return left.evaluate()*right.evaluate();
	}
}
