package springCore.SpEL;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpELTest {
public static void main(String[] args) {
	ExpressionParser parser = new SpelExpressionParser();
	String randomNum = parser.parseExpression("random number : #{T(java.lang.Math).random()}",
			new TemplateParserContext()).getValue(String.class);
	
	System.out.println(randomNum);
	Expression exp1 = parser.parseExpression("'You are reading concretepage.com'");
	String msg1 = (String) exp1.getValue();
	System.out.println(msg1);
	
	Expression exp2 = parser.parseExpression("'You are reading concretepage.com'.concat('!')");
	String msg2 = (String) exp2.getValue();
	System.out.println(msg2);
	
	Expression exp3 = parser.parseExpression("'You are reading concretepage.com'.toUpperCase()");
	String msg3 = (String) exp3.getValue();
	System.out.println(msg3);
	
	Expression exp4 = parser.parseExpression("'You are reading concretepage.com'.bytes");
	byte[] bytes = (byte[]) exp4.getValue();
	System.out.println(bytes.length);
	
}
}