
package prog6112_a1a;

/*
Fetched code from Apache NetBeans for creating JUnit tests 
https://netbeans.apache.org/tutorial/main/kb/docs/java/junit-intro/#_writing_junit_4_tests
*/

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class TestSeriesAgeRestriction_SeriesAgeInValid {
    @Test
    public void TestSeriesAgeRestriction_SeriesAgeInValid() {
        System.out.println("TestSeriesAgeRestriction_SeriesAgeInValid()");
        
        // retrieve methods actual output 
        boolean actual = Series.SeriesAgeRestriction("R+"); 
        
        // assert outputs 
        assertEquals(false, actual); 
    }
}

//=======================================================================
// END-OF-FILE 
//=======================================================================