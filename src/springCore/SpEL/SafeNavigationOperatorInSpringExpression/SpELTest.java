package springCore.SpEL.SafeNavigationOperatorInSpringExpression;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
public class SpELTest {
public static void main(String[] args) {
	ExpressionParser parser = new SpelExpressionParser();
	Student std = new Student();
	std.setName("Ram");
	StandardEvaluationContext context = new StandardEvaluationContext(std);
	String name = parser.parseExpression("Name?.length()").getValue(context, String.class);
	System.out.println(name);
	std.setName(null);
	name = parser.parseExpression("Name?.length()").getValue(context, String.class);
	System.out.println(name);

}
}