import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class CalculatorTest {
     /*
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	} */

	/* --------------------------------------  add and mul -----------------------------------------
    Calculator calc = new Calculator();
	@Test (dependsOnMethods="testMul1")
	public void testAdd1() {
		//fail("Not yet implemented");
		AssertJUnit.assertEquals(10,calc.add1(5, 5));
	}

	@Test
	public void testMul1() {
		//fail("Not yet implemented");
		AssertJUnit.assertEquals(25,calc.mul1(5, 5));
	}
  */
	
	
	 Calculator calc = new Calculator();
	 
	 
		@Test(dataProvider="dpaddition")
		public void add1Test(int expvalue, int a, int b) {
			//fail("Not yet implemented");
			Assert.assertEquals(calc.add1(a, b), expvalue);
			System.out.println("Addition");
		}
		
/*
		@Test
		public void testMul1() {
			//fail("Not yet implemented");
			AssertJUnit.assertEquals(25,calc.mul1(5, 5));
		}
		*/
		
		@DataProvider(name="dpaddition")
		public Object[][] getdata()
		{
		return new Object[][] {{10,5,5},{20,10,5},{50,25,25},{50,25,6}}; //import dataprovider 
		}
}
