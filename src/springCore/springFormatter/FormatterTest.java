//package springCore.springFormatter;
//
//import org.springframework.format.Formatter;
//
//import javax.swing.text.DateFormatter;
//import javax.swing.text.NumberFormatter;
//import java.util.Date;
//import java.util.Locale;
//
//public class FormatterTest {
//public static void main(String[] args) {
//	//date formatter
//	Formatter dtform = (Formatter) new DateFormatter();
//	System.out.println(dtform.print(new Date(), Locale.ITALY));
//
//	System.out.println(dtform.print(new Date(), Locale.JAPANESE));
//
//	//number formatter
//	Formatter numform = (Formatter) new NumberFormatter();
//	System.out.println(numform.print(10, Locale.ITALY));
//	System.out.println(numform.print(10.5, Locale.GERMAN));
//
//}
//}