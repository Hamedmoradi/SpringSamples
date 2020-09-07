package springCore.SpEL.LogicalOperatorsInSpringExpression;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
public class SpELTest {
public static void main(String[] args) {
	ExpressionParser parser = new SpelExpressionParser();
	boolean bol = parser.parseExpression("true == true").getValue(Boolean.class);
	System.out.println(bol);
	
	bol = parser.parseExpression("true == false").getValue(Boolean.class);
	System.out.println(bol);
}
}
