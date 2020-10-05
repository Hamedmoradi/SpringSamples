package springCore.importResource;

import java.sql.SQLException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class AppTest {
public static void main(String[] args) throws SQLException {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	ctx.register(AppConfig.class);
	ctx.refresh();
	Entitlement ent= (Entitlement)ctx.getBean("entitlement");
	System.out.println(ent.getName());
	System.out.println(ent.getTime());
	Subscription sub= (Subscription)ctx.getBean("subscription");
	System.out.println(sub.getName());
	System.out.println(sub.getType());
}
}
