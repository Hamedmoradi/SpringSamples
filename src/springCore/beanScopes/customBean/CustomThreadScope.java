package springCore.beanScopes.customBean;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

/*
 * In spring there are scopes like singleton, prototype etc. According to the requirement, spring allows to create custom
 *  scope. To understand we will create a Thread scope. Thread scope means a bean creation and destruction will be limited
 * to a thread life cycle.
 **/
public class CustomThreadScope implements Scope {
CustomThreadLocal customThreadLocal = new CustomThreadLocal();

@SuppressWarnings("rawtypes")
@Override
public Object get(String str, ObjectFactory objectFactory) {
	System.out.println("getting object from scope.");
	@SuppressWarnings("unchecked")
	Map<String, Object> scope = (Map<String, Object>) customThreadLocal.get();
	Object object = scope.get(str);
	if (object == null) {
		object = objectFactory.getObject();
		scope.put(str, object);
	}
	return object;
}

@Override
public String getConversationId() {
	return null;
}

@Override
public void registerDestructionCallback(String arg0, Runnable arg1) {
}

@Override
public Object remove(String str) {
	Map<String, Object> scope = (Map<String, Object>) customThreadLocal.get();
	return scope.remove(str);
}

@Override
public Object resolveContextualObject(String arg0) {
	return null;
}

class CustomThreadLocal extends ThreadLocal {
	protected Map<String, Object> initialValue() {
		System.out.println("initialize ThreadLocal");
		return new HashMap<String, Object>();
	}
}
}

