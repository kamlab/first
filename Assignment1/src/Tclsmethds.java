import org.testng.Assert;
import org.testng.annotations.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;
public class Tclsmethds {

	
	
	@Test(invocationCount=4)
	public void methdA()
	{
	System.out.println("Method A...");
	}
	
	@Test ()
	public void methdB()
	{
	System.out.println("Method B");
	//Assert.fail();
	}
	
	@Test(priority=1, dependsOnMethods="methdA", invocationCount=2)
	public void methdC()
	{
	System.out.println("Method C");
	}
	
	//@Ignore 
	@Test
	public void methdD()
	{
	System.out.println("Method D");
	}
	
	@Test
	public void methdE()
	{
	System.out.println("Method E");
	}
	
}
