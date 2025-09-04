
package prog6112_a1a;

/*
Fetched code from Apache NetBeans for creating JUnit tests 
https://netbeans.apache.org/tutorial/main/kb/docs/java/junit-intro/#_writing_junit_4_tests
*/

import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TestSeriesAgeRestriction_SeriesAgeInValid {
    @Test
    public void TestSeriesAgeRestriction_SeriesAgeInValid() {
        System.out.println("TestSeriesAgeRestriction_SeriesAgeInValid()");
        
        // initialise Series records 
        String[] record1 = {"12300" , "Game of Thrones" , "R" , "20" }; 
        String[] record2 = {"12301" , "Peaky Blinders" , "16+" , "13" }; 
        String[] record3 = {"12302" , "Cobra Kai" , "16+" , "10" }; 
        String[] record4 = {"12303" , "Outer Banks" , "13+" , "10" }; 
        
        /*
        ChatGPT
        Question: why are these lines failing in my junit test method 
            Serieses.add({"00100200" , "Game of Thrones" , "R" , "20" }) ; 
            Serieses.add({"00100201" , "Peaky Blinders" , "16+" , "13" }) ; 
            Serieses.add({"00100203" , "Cobra Kai" , "16+" , "10" }) ; 
            Serieses.add({"00100204" , "Outer Banks" , "13+" , "10" }) ;
        Answer: *Section Below* 
        */
        
        // initialise ArrayList Serieses
        ArrayList<String[]> Serieses = new ArrayList<>() ; 
        Serieses.add(record1) ; 
        Serieses.add(record2) ; 
        Serieses.add(record3) ; 
        Serieses.add(record4) ; 
        
        /*
        ChatGPT
        Question: how to do java assertequals on ArrayList<String[]>
        Answer: *Section Below* 
        */
        
        // assert outputs 
        ArrayList<String[]> actual1 = Series.UpdateSeries(Serieses, "12300", "game of thrones", "-1", "20"); 
        assertEquals(Serieses.size(), actual1.size()); // same size
        for  (int i = 0; i < Serieses.size(); i++) {
            assertArrayEquals(Serieses.get(i), actual1.get(i));
        }
        
        ArrayList<String[]> actual2 = Series.UpdateSeries(Serieses, "12301", "blinders", "160", "10"); 
        assertEquals(Serieses.size(), actual2.size()); // same size
        for  (int i = 0; i < Serieses.size(); i++) {
            assertArrayEquals(Serieses.get(i), actual2.get(i));
        }
        
        ArrayList<String[]> actual3 = Series.UpdateSeries(Serieses, "12302", "cobra kai: season 6", "!6", "15"); 
        assertEquals(Serieses.size(), actual3.size()); // same size
        for  (int i = 0; i < Serieses.size(); i++) {
            assertArrayEquals(Serieses.get(i), actual3.get(i));
        }
        
        ArrayList<String[]> actual4 = Series.UpdateSeries(Serieses, "12303", "outer banks", "PG", "10"); 
        assertEquals(Serieses.size(), actual4.size()); // same size
        for  (int i = 0; i < Serieses.size(); i++) {
            assertArrayEquals(Serieses.get(i), actual4.get(i));
        }
    }
}
