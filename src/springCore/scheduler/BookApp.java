package springCore.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
public class BookApp {
	public void cleanDustOne() {
		System.out.println("Executing cleanDustOne method...");
	}
	public void cleanDustTwo() {
		System.out.println("Executing cleanDustTwo method...");
	}	
//	@Scheduled(fixedRate=1000)
	public void arrangeBook(){
	   System.out.println("Arranging Book...");
	}	
}