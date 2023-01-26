import static org.junit.Assert.*;

import org.junit.Test;

public class AddNumbersTest {

	@Test
	public void test() {
		 int number = 10;
	        int sum = addNumbers(number);
	        System.out.println("Sum = " + sum);
	}

	private int addNumbers(int num) {
		   if (num != 0)
	            return num + addNumbers(num - 1);
	        else
	            return num;    
	}
}
