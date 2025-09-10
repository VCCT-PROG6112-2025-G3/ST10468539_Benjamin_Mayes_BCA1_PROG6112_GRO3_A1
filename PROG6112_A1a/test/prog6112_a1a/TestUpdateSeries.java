
package prog6112_a1a;

/*
Fetched code from Apache NetBeans for creating JUnit tests 
https://netbeans.apache.org/tutorial/main/kb/docs/java/junit-intro/#_writing_junit_4_tests
*/

import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class TestUpdateSeries {
    
    @Test 
    public void TestUpdateSeries () {
        System.out.println("TestUpdateSeries()");
        
        // initialise Series records 
        Series series1 = new Series("12300" , "game of thrones" , "18" , "20"); 
        Series series2 = new Series("12301" , "peaky blinders" , "16" , "13"); 
        Series series3 = new Series("12302" , "cobra kai" , "16" , "10"); 
        Series series4 = new Series("12303" , "outer banks" , "13" , "10"); 
        
        // initialise ArrayList Serieses
        ArrayList<Series> Serieses = new ArrayList<>() ; 
        Serieses.add(series1) ; 
        Serieses.add(series2) ; 
        Serieses.add(series3) ; 
        Serieses.add(series4) ; 
        
        // retrieve methods actual output 
        ArrayList<Series> actual = Series.UpdateSeries(Serieses, "12301" , "blinder" , "18" , "10"); 
        
        // assert output 
        assertEquals("12301", actual.get(1).SeriesId);
        assertEquals("blinder", actual.get(1).SeriesName);
        assertEquals("18", actual.get(1).SeriesAge);
        assertEquals("10", actual.get(1).SeriesNumberOfEpisodes);
    }
    
}

//=======================================================================
// END-OF-FILE 
//=======================================================================