package springCore.enableAsync;
import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class AppTest {
	public static void main(String[] args) throws SQLException {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();
		AsyncTask task= ctx.getBean(AsyncTask.class);
		task.doAsyncTask();
	}
}