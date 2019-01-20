package parametersConcept;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersConcept {
	@Parameters({ "url", "uname", "pwd" })
	@Test
	public void testParameters(String url, String username, String password) {
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}
}
