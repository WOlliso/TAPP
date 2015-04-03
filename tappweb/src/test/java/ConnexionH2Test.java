

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ConnexionH2Test {

	@Test
	public void test() {
		ConnexionH2 connexionH2 = new ConnexionH2();
		assertNotNull(connexionH2.connexion());
	}

}
