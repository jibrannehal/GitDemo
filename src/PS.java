import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {

	public void doThis() {
		System.out.println("I am here");
	}
	
	public void doThis2() {
		System.out.println("I am here 2");
	}

	@BeforeMethod
	public void beforeRun() {
		System.out.println("Run me first");
	}

	@AfterMethod
	public void afterRun() {
		System.out.println("Run me last");
	}

}
