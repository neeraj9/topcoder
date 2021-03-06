import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NotTwoTest {

	protected NotTwo solution;

	@Before
	public void setUp() {
		solution = new NotTwo();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int width = 3;
		int height = 2;

		int expected = 4;
		int actual = solution.maxStones(width, height);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int width = 3;
		int height = 3;

		int expected = 5;
		int actual = solution.maxStones(width, height);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int width = 8;
		int height = 5;

		int expected = 20;
		int actual = solution.maxStones(width, height);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int width = 11;
		int height = 11;

		int expected = 61;
		int actual = solution.maxStones(width, height);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int width = 6;
		int height = 6;

		int expected = 20;
		int actual = solution.maxStones(width, height);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		int width = 998;
		int height = 998;

		int expected = 498004;
		int actual = solution.maxStones(width, height);

		Assert.assertEquals(expected, actual);
	}
}
