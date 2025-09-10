
package prog6112_a1b;

/* Fetched code from Apache NetBeans for creating JUnit tests 
https://netbeans.apache.org/tutorial/main/kb/docs/java/junit-intro/#_writing_junit_4_tests */

import org.junit.Test;
import static org.junit.Assert.*;

public class bankTest {
    @Test
    public void TestOpen() {
        System.out.println("bankTest : TestOpen()");        
        
        bank instance = new bank(3);
        assertEquals(7, instance.open(4));
    } 
}

//=======================================================================
// END-OF-FILE 
//=======================================================================