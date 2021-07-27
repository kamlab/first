//import com.com.pkg.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
//

public class DataProviderExample
{
	Calculator calc = new Calculator();
	@Test(dataProvider="dpaddition") 
	public void add1Test(int exp_value, int a , int b)
	{
		Assert.assertEquals(calc.add1(a, b), exp_value);
		System.out.println("addition");
	}
	
    @DataProvider(name="dpaddition")
       public Object[][] getdata()
       {

	return new Object[][] 
			{
				{10,5,5},
				{20,10,5},
				{50,25,25},
				{50,25,6}
			}; 

        }
}