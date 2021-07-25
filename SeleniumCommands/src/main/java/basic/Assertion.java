package basic;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	String Actual ="swapnil";
	
	//Actual  = "true";
	int num1 =102;
	String Expected = "Akash";
	
	boolean nil= true;
	
	@Test
	void method1() // login : always passed in soft assert
	{
		//Creastion of object of SoftAssert
		SoftAssert obj = new SoftAssert();
		//laucnh browser
		//Assertion 
		obj.fail("methodOne is failed");
		//Assert.fail("fail");  // hard assert
		
		System.out.println("login is failed in first attempt"); // according to you requirement you have to put msg to console.
		
		//launch browser : configuration error 
	}
	
	@Test(dependsOnMethods = "method1")
	void method2()
	{
		try {
			//Assert.assertTrue(num1 ,nil); // expected [true] but found [false] .. it will only give output in terms boolean values 
			//Assert.assertEquals(num1,nil); // expected [Akash] but found [swapnil]..it will give output in terms of value of datatype used..
			
			int num2 =0;
			int result = num1/num2;
			
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Exception Occured");
		}
	}
	
	@Test
	void method3()
	{
		try {
			//Assert.assertTrue(num1 ,nil); // expected [true] but found [false] .. it will only give output in terms boolean values 
			Assert.assertEquals(num1,nil); // expected [Akash] but found [swapnil]..it will give output in terms of value of datatype used..
		
		} catch (AssertionError e) {
			System.out.println("Assertion Exception Occured");
		}
		
	}
}
