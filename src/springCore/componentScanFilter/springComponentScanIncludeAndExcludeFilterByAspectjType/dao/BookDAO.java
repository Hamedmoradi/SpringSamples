package springCore.componentScanFilter.springComponentScanIncludeAndExcludeFilterByAspectjType.dao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAO {
	public String getWriterByBookId(int bookId) {
		if (bookId == 1) {
			return "Mohan";
		}
		return "Sohan";
	}
}
