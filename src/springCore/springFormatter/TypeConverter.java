//package springCore.springFormatter;
//
//import org.springframework.core.convert.support.ConversionServiceFactory;
//import org.springframework.core.convert.support.GenericConversionService;
//
//import java.util.List;
//
//public class TypeConverter {
//public static void main(String[] args) {
//	GenericConversionService conversionService = ConversionServiceFactory.createDefaultConversionService();
//	//converting string to list
//	List<String> list = conversionService.convert("A,B,C,D",List.class);
//	for(String s: list){
//		System.out.println(s);
//	}
//	//converting string to integer
//	Integer i = conversionService.convert("10",Integer.class);
//	System.out.println(i);
//	//converting string to float
//	Float f = conversionService.convert("15f",Float.class);
//	System.out.println(f);
//}
//}