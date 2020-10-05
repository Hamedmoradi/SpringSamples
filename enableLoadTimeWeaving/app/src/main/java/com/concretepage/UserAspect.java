package com.concretepage;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.util.StopWatch;
@Aspect
public class UserAspect {
	@Around("execution(* com.concretepage.UserService.doTask(..))")
	public void userAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
		StopWatch stwatch = new StopWatch(getClass().getSimpleName());
		try{
			stwatch.start(joinPoint.getSignature().getName());
			joinPoint.proceed();
		}finally{
			stwatch.stop();
			System.out.println(stwatch.prettyPrint());
		}
	}
}