package springCore.componentScanFilter.springComponentScanIncludeAndExcludeFilterByAnnotation.service;

public class UserService implements IUserService {
@Override
public String getUserRole() {
	return "admin";
}
}
