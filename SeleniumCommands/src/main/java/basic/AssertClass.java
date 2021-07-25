package basic;

//import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertClass {

	@Test
	void methodOne()
	{
		String Actual ="swapnil";
		String Expected = "Akash";
		
		
		//For pass . It satsfy condition.
		//Assert.assertTrue(Actual == "swapnil");
		//System.out.println("pass1");
		
		Assert.fail("fail");
		
		//System.out.println("fail");
		
		//Assert.assertTrue(Actual == "nil");
		Assert.assertEquals(Actual,Expected);
		
		System.out.println("pass2");
		
		
	}
}
