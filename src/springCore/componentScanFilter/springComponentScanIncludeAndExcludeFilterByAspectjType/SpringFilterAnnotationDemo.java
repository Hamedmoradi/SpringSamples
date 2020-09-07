package springCore.componentScanFilter.springComponentScanIncludeAndExcludeFilterByAspectjType;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springCore.componentScanFilter.springComponentScanIncludeAndExcludeFilterByAspectjType.dao.BookDAO;
import springCore.componentScanFilter.springComponentScanIncludeAndExcludeFilterByAspectjType.service.UserService;
import springCore.componentScanFilter.springComponentScanIncludeAndExcludeFilterByAspectjType.util.CalcUtil;

public class SpringFilterAnnotationDemo {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	ctx.register(AppConfig.class);
	ctx.refresh();
	try {
		CalcUtil calc = ctx.getBean(CalcUtil.class);
		System.out.println("Addition:" + calc.addNumbers(15, 30));
	} catch (BeansException be) {
		System.out.println(be.getMessage());
	}
	try {
		BookDAO book = ctx.getBean(BookDAO.class);
		System.out.println("Writer:" + book.getWriterByBookId(1));
	} catch (BeansException be) {
		System.out.println(be.getMessage());
	}
	try {
		UserService user = ctx.getBean(UserService.class);
		System.out.println("User Role:" + user.getUserRole());
	} catch (BeansException be) {
		System.out.println(be.getMessage());
	}
	ctx.close();
}
} 