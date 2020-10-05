package springCore.dependsOnAttribute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*In spring application XML, if we need to initialize any bean before any other bean, depends-on do this job.
While creating bean we need to define depends-on attribute in bean.
In the below example I have tried to show the working of depends-on.
I have taken three bean A,B and C.
@DependsOn in spring is used with @Configuration. @DependsOn sets bean that container will initialize one bean after given bean.
IoC guarantees that depending bean will be created before the bean which depends on this bean.
*/

public class MainApp {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("springCore/dependsOnAttribute/dependsOnAttributeBeans.xml");
}
}
