package springCore.componentScanFilter.springComponentScanIncludeAndExcludeFilterByAnnotation.util;


import springCore.componentScanFilter.springComponentScanIncludeAndExcludeFilterByAnnotation.MyAnnotation;

@MyAnnotation
public class CalcUtil implements ICalcUtil {
@Override
public int addNumbers(int num1, int num2) {
	return num1 + num2;
}
}

