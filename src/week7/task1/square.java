package week7.task1;

public class square extends Expression{
	Expression expression;
	public square(Expression i) {
		this.expression = i;
	}
	
	@Override
	public String toString() {
		
		return  "(" + expression.toString() + ")^2";
	}

	@Override
	public int evaluate() {
		
		return expression.evaluate()*expression.evaluate();
	}
}
