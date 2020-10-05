package com.concretepage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.EnableLoadTimeWeaving.AspectJWeaving;

@Configuration
@EnableAspectJAutoProxy
@EnableLoadTimeWeaving(aspectjWeaving=AspectJWeaving.ENABLED)
public class AspectConfig {
  @Bean
  public UserService userService(){
	 return new UserService();
  }
  @Bean	
  public UserAspect userAspect(){
	 return new UserAspect();
  }
}