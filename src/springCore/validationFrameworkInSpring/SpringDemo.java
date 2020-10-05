package springCore.validationFrameworkInSpring;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

/*
In Spring, Validator framework plays the role of validating data and displaying the error message from property file.
 There is an interface org.springframework.validation.Validator in spring that handles the validation framework.
 Validator contains two methods as below.
1. Supports
Supports object matching and returns Boolean value.
2. Validate
This is the core method in validation framework that performs validation.
*/
public class SpringDemo {
   public static void main(String... args) {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("springCore/validationFrameworkInSpring/spring-app.xml");
    	 
    	 User user = (User)context.getBean("user");
    	 UserValidator userValidator = (UserValidator)context.getBean("userValidator");
    	 Map<String,String> map = new HashMap<String,String>(); 
    	 MapBindingResult err = new MapBindingResult(map, User.class.getName());
    	 userValidator.validate(user, err);
    	 List<ObjectError> list = err.getAllErrors();
    	 for(ObjectError objErr : list){
    		 System.out.println(objErr.getDefaultMessage());
    	 }
    } 
}