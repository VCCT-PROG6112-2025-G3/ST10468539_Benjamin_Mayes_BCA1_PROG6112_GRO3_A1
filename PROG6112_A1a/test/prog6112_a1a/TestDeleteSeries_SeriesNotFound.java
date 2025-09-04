
package prog6112_a1a;

/*
Fetched code from Apache NetBeans for creating JUnit tests 
https://netbeans.apache.org/tutorial/main/kb/docs/java/junit-intro/#_writing_junit_4_tests
*/

import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TestDeleteSeries_SeriesNotFound {
    @Test
    public void TestDeleteSeries_SeriesNotFound() {
        System.out.println("TestDeleteSeries_SeriesNotFound()");
        
        // initialise Series records 
        String[] ser1 = {"12300" , "Game of Thrones" , "R" , "20" }; 
        String[] ser2 = {"12301" , "Peaky Blinders" , "16+" , "13" }; 
        String[] ser3 = {"12302" , "Cobra Kai" , "16+" , "10" }; 
        String[] ser4 = {"12303" , "Outer Banks" , "13+" , "10" }; 
        
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
        Serieses.add(ser1) ; 
        Serieses.add(ser2) ; 
        Serieses.add(ser3) ; 
        Serieses.add(ser4) ; 
        
        /*
        ChatGPT
        Question: how to do java assertequals on ArrayList<String[]>
        Answer: *Section Below* 
        */
        
        // assert outputs 
        ArrayList<String[]> actual1 = Series.DeleteSeries(Serieses, "123000"); 
        assertEquals(Serieses.size(), actual1.size()); // same size
        for (int i = 0; i < Serieses.size(); i++) {
            assertArrayEquals(Serieses.get(i), actual1.get(i));
        } 
    }
}
