
package prog6112_a1b;

/*
Fetched code from Apache NetBeans for creating JUnit tests 
https://netbeans.apache.org/tutorial/main/kb/docs/java/junit-intro/#_writing_junit_4_tests
*/

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class doorTest {
    @Test
    public void TestOpen() {
        System.out.println("doorTest : TestOpen");

        door instance = new door(1);
        assertEquals(5, instance.open(4));
    }
    
}
