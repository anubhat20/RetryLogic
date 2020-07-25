package mytests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTests {
	
	@Test //(retryAnalyzer = Analyzer.RetryAnalyzer.class) only for test level retry logic
	public void test1() {
		Assert.assertEquals(false, true);
	}
	
	@Test //(retryAnalyzer = Analyzer.RetryAnalyzer.class) only for test level retry logic
	public void test2() {
		Assert.assertEquals(false, true);
	}
	
	@Test //(retryAnalyzer = Analyzer.RetryAnalyzer.class) only for test level retry logic
	public void test3() {
		Assert.assertEquals(true, true);
	}

	
}
