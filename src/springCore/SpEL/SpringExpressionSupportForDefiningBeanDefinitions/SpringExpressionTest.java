package springCore.SpEL.SpringExpressionSupportForDefiningBeanDefinitions;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*A Bean needs input and that input can be provided by spring expression also.
 We will show spring expression support by XML based configuration. In XML based Configuration,
  we will define a bean and the value will be injected by Spring Expression.
  */
public class SpringExpressionTest {
    public static void main(String... args) {
    	
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    	ctx.register(AppConf.class);
        ctx.refresh();
        Calculator calc = ctx.getBean(Calculator.class);
    	int rnum = calc.getRandomNum();
        System.out.println(rnum);
    } 
}
