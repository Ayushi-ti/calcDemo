package test;




import org.junit.Assert;
import org.junit.Test;

import com.demo.basicCalc;

public class CalcDemoTest {

	@Test
	public void testBasicCalc() {
	 int sum= basicCalc.Add(9, 7);
	 Assert.assertEquals(16,sum);
 }
	
	
}
