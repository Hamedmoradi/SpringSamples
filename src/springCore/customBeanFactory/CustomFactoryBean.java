package springCore.customBeanFactory;

import org.springframework.beans.factory.FactoryBean;

public class CustomFactoryBean implements FactoryBean<MyBean> {
private MyBean myBean=new MyBean();
@Override
public MyBean getObject() throws Exception {
	System.out.println("inside getObject");
	return myBean;
}
@Override
public Class<? extends MyBean> getObjectType() {
	System.out.println("inside getObjectType");
	return myBean.getClass();
}
@Override
public boolean isSingleton() {
	System.out.println("inside isSingleton");
	return false;
}
}
