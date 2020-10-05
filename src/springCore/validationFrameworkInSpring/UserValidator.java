package springCore.validationFrameworkInSpring;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class UserValidator implements Validator {

	
	private Resource location;

    @Required
    public void setLocation(Resource location) {
        this.location = location;
    }
    
	@Override
	public boolean supports(Class cls) {
		return User.class.equals(cls);
	}

	@Override
	public void validate(Object ob, Errors err) {
		Properties props=null;
		try {
			 props = PropertiesLoaderUtils.loadProperties(location);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String msg1 = props.getProperty("errormsg.name");
		ValidationUtils.rejectIfEmpty(err, "name", "errormsg.name",msg1);
		User user = (User)ob;
		if(user.getAge()<18){
			String msg2 = props.getProperty("errormsg.age");
			err.rejectValue("age","errormsg.age",msg2);
		}
			
	}
}
