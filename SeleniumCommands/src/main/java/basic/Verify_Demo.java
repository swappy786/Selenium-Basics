package basic;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Verify_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creastion of object of SoftAssert
		SoftAssert obj = new SoftAssert();
		
		//Assertion 
		obj.fail("Login is failed");
		
		System.out.println("login is failed in first attempt");
		
		String Actual ="swapnil";
		int num1 =102;
		Actual  = "true";
		String Expected = "Akash";
		
		boolean nil= true;
		
		try {
			//Assert.assertTrue(num1 ,nil); // expected [true] but found [false] .. it will only give output in terms boolean values 
			//Assert.assertEquals(num1,nil); // expected [Akash] but found [swapnil]..it will give output in terms of value of datatype used..
			
			int num2 =0;
			int result = num1/num2;
			
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Exception Occured");
		}
		
		
		try {
			//Assert.assertTrue(num1 ,nil); // expected [true] but found [false] .. it will only give output in terms boolean values 
			Assert.assertEquals(num1,nil); // expected [Akash] but found [swapnil]..it will give output in terms of value of datatype used..
		
		} catch (AssertionError e) {
			System.out.println("Assertion Exception Occured");
		}
		
		
	}

}
