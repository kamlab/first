import org.testng.annotations.Test;

public class SampleGroups {
  @Test (groups= {"odd", "regression"})
  public void first() 
  {
	  System.out.println("First");
  }
  @Test (groups ="even")
  public void second() 
  {
	  System.out.println("second");
	  
  }
  @Test (groups = "odd")
  public void third() 
  {
	  System.out.println("third");
  }
  @Test (groups ="even")
  public void four() 
  {
	  System.out.println("four");
  }
}
