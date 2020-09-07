package springCore.SpEL.TernaryOperator;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class SpELTest {
//public static void main(String[] args) {
//	ExpressionParser parser = new SpelExpressionParser();
////	String str = parser.parseExpression("2<5?'Ram':'Shyam' ").getValue(String.class);
////	System.out.println(str);
////}
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		Student std = new Student();
		StandardEvaluationContext context = new StandardEvaluationContext(std);
		parser.parseExpression("name").setValue(context, "Ram");
		context.setVariable("tallGroup", "Tall Group");
		String expression = "isTall(#queryName)?  Name + ' belongs to '+ #tallGroup :  Name + ' does not belong to '+ #tallGroup";
		String queryResultString = parser.parseExpression(expression).getValue(context, String.class);
		System.out.println(queryResultString);
	}
}

