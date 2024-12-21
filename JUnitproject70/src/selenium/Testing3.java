package selenium;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
  

public class Testing3 {

 @Rule
  public ErrorCollector err = new ErrorCollector();

  
	@Test
	public void test6() {
		String expected = "abc";
		String actual = "abc123";
		System.out.println("Before fst Assert");
		Assert.assertEquals(expected, actual); //Hard Assert or regular assert
		System.out.println("After fst Assert");
		Assert.assertTrue("Verifying 2>3", 2>3);
		System.out.println("After second Assert");
		
	}

	@Test
	public void test7() {
		String expected = "abc";
		String actual = "abc12";
		System.out.println("Before fst Assert");
		try {
		Assert.assertEquals(expected, actual);
		} catch(Throwable t) {
		err.addError(t);
		System.out.println("After fst catch");
		}
		System.out.println("After 1st Assert");
		try {
		Assert.assertTrue("Verifying 2>3", 2>3);
		}catch(Throwable t) {
			err.addError(t);
			System.out.println("I'm in 2nd catch");
		}
		System.out.println("After 2nd Assert");		
	}
	}

