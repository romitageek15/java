package romita.javatool;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		HelloWorld HW = new HelloWorld();
		int output = HW.Add(2,3);
		assertEquals(5,output);
		
	}


}
