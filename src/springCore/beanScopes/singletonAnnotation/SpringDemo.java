package springCore.beanScopes.singletonAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	ctx.register(AppConfig.class);
	ctx.refresh();
}
}