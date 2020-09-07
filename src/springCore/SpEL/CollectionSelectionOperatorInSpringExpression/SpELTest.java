package springCore.SpEL.CollectionSelectionOperatorInSpringExpression;

import java.util.ArrayList;
import java.util.List;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
/*
* Spring expression language provides Collection Selection Operator feature.
*  It is a very powerful feature to filter a list on the basis of any criteria.
*  It returns a new collection that will contain only those data which will follow the selection criteria.
* SpEL supports map and list both.
* */
public class SpELTest {
public static void main(String[] args) {
	ExpressionParser parser = new SpelExpressionParser();
	List<Student> list = new ArrayList<Student>();
	list.add(new Student("Ram",21));
	list.add(new Student("Shyam",20));
	list.add(new Student("Mahesh",21));
	list.add(new Student("Dinesh",23));
	
	StdList stdList = new StdList();
	stdList.setStdList(list);
	StandardEvaluationContext context = new StandardEvaluationContext(stdList);
	List<Student> subList = (List<Student>)
			                        parser.parseExpression("StdList.?[Age == 21]").getValue(context);
	
	for(Student s: subList){
		System.out.println(s.getName() +"  "+s.getAge());
	}
}
}