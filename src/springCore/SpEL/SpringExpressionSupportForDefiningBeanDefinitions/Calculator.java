package springCore.SpEL.SpringExpressionSupportForDefiningBeanDefinitions;

import org.springframework.beans.factory.annotation.Value;

public class Calculator {
    private int randomNum = 0;
	public int getRandomNum() {
		return randomNum;
	}
	@Value("#{ T(java.lang.Math).random() * 50.0 }")
	public void setRandomNum(int randomNum) {
		this.randomNum = randomNum;
	}
}
