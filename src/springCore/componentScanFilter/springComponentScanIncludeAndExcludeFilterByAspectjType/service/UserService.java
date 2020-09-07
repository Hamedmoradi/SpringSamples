package springCore.componentScanFilter.springComponentScanIncludeAndExcludeFilterByAspectjType.service;

public class UserService implements IUserService {
@Override
public String getUserRole() {
	return "admin";
}
}
