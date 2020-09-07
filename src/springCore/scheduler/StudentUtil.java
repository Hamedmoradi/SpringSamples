package springCore.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
//@Service
public class StudentUtil {
//	@Scheduled(fixedRate=2000)
	public void countStudent(){
	   System.out.println("Count Student...");
	}	
}
