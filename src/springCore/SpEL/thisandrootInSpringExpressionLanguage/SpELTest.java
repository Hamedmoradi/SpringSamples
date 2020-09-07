package springCore.SpEL.thisandrootInSpringExpressionLanguage;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.ArrayList;
import java.util.List;

public class SpELTest {
public static void main(String[] args) {
	ExpressionParser parser = new SpelExpressionParser();
	List<Integer> even = new ArrayList<Integer>();
	even.add(2);
	even.add(4);
	even.add(6);
	even.add(8);
	even.add(10);
	
	StandardEvaluationContext seContext = new StandardEvaluationContext();
	seContext.setVariable("even",even);
	
	List<Integer> evenGtfour =
			(List<Integer>) parser.parseExpression("#even.?[#this>4]").getValue(seContext);
	
	for(Integer i: evenGtfour){
		System.out.println(i);
	}
}
}