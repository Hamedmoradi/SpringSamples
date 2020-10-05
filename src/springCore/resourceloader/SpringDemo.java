package springCore.resourceloader;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class SpringDemo {
    public static void main(String... args) throws IOException {
    	ApplicationContext context = new ClassPathXmlApplicationContext("springCore/resourceloader/spring-app.xml");
    	Entitlement ent = (Entitlement)context.getBean("entitlement");
    	System.out.println(ent.getName());
    	//using Resource
    	Resource res  =  context.getResource("classpath:concretepage.txt");
    	System.out.println(res.getFilename());
    	InputStream is =  res.getInputStream();
    	
    	try{
    		int i=0;
            while((i=is.read())!=-1)
            {
               char c=(char)i;
               System.out.print(c);
            }
        }catch(IOException e){
        	 e.printStackTrace();
         }finally{
            
           if(is!=null)
            is.close();
         }
    } 
}