package springCore.inheritance;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*
* Attribute. Child bean can override parent bean properties and add new one too.
* In XML configuration, a bean inheritance is accomplished by using parent attribute of bean tag. We need to
* assign parent bean id to parent attribute in child bean. We can also create template in XML which will be
*  inherited by child bean. To create template bean, we have to create a bean using abstract attribute of bean tag
* without assigning class. We need to assign abstract attribute value as true. We cannot directly use this bean in
* application. We can only inherit its property in our child bean. This type of bean is a pure template bean.
* In case of annotation, java inheritance is enough. We accomplish spring bean definition inheritance
* with java inheritance only.
*/
public class SpringDemo {
	public static void main(String[] args) {
	    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	    ctx.register(AppConfig.class);
	    ctx.refresh();
		Elephant elephant = ctx.getBean(Elephant.class);
		System.out.println(elephant.getName());
		System.out.println(elephant.getLocation());
		System.out.println(elephant.getAge());
    	ctx.registerShutdownHook();
	}
} 