import org.testng.annotations.Test;

public class PS1 extends PS {

	@Test
	public void testRun() {
		int a = 3;
		PS2 ps2 = new PS2(a); // Parameterized Constructor
		doThis();
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());		
		System.out.println(ps2.multiplyby2());
		System.out.println(ps2.multiplyby3());
	}

}
