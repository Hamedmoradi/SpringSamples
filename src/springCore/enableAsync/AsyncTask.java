package springCore.enableAsync;
import org.springframework.scheduling.annotation.Async;
public class AsyncTask {
	@Async
	public void doAsyncTask(){
		try {
			System.out.println("do some async task");
		} catch (Exception e) {
		}

	}
}