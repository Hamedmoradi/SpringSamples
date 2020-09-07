package springCore.SpEL.LanguageReferenceInSpringExpression;


import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.List;

public class SpELTest {
public static void main(String[] args) {
	ExpressionParser parser = new SpelExpressionParser();
	boolean falseVal = (Boolean) parser.parseExpression("false").getValue();
	System.out.println(falseVal);
	Object nullVal = parser.parseExpression("null").getValue();
	System.out.println(nullVal);
	List<Integer> list =  (List<Integer>) parser.parseExpression("{1,2,3,4}").getValue();
	for(Integer i: list){
		System.out.println(i);
	}
	String str = (String)parser.parseExpression("'Hello World!'.substring(1, 3)").getValue();
	System.out.println(str);
}
}