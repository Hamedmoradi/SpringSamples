package springCore.SpEL.OperatorsInSpringExpression;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpELTest {
public static void main(String[] args) {
	ExpressionParser parser = new SpelExpressionParser();
	boolean bol = parser.parseExpression("20 == 20").getValue(Boolean.class);
	System.out.println(bol);
	
	bol = parser.parseExpression("20 == 50").getValue(Boolean.class);
	System.out.println(bol);
}
}