package springCore.importAnnotation;
import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class SpringDemo {
	public static void main(String[] args) throws SQLException {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(CompConf.class);
		ctx.refresh();
		Company comp = ctx.getBean(Company.class);
		System.out.println(comp.getCeo().getAddress().getCity());
		ctx.registerShutdownHook();
	}
}