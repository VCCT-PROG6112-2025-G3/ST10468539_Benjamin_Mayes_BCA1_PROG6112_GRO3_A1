
package prog6112_a1a;

/*
Fetched code from Apache NetBeans for creating JUnit tests 
https://netbeans.apache.org/tutorial/main/kb/docs/java/junit-intro/#_writing_junit_4_tests
*/

import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class TestSearchSeries_SeriesNotFound {
    @Test
    public void TestSearchSeries_SeriesNotFound() {
        System.out.println("TestUpdateSeries()");
        
        // initialise Series records 
        String[] rec1 = {"12300" , "Game of Thrones" , "R" , "20" }; 
        String[] rec2 = {"12301" , "Peaky Blinders" , "16+" , "13" }; 
        String[] rec3 = {"12302" , "Cobra Kai" , "16+" , "10" }; 
        String[] rec4 = {"12303" , "Outer Banks" , "13+" , "10" }; 
        
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
        Serieses.add(rec1) ; 
        Serieses.add(rec2) ; 
        Serieses.add(rec3) ; 
        Serieses.add(rec4) ; 
        
        /*
        ChatGPT
        Question: how to do java assertequals on ArrayList<String[]>
        Answer: *Section Below* 
        */
        
        // assert outputs 
        String[] actual = Series.SearchSeries(Serieses, "123000"); 
        assertEquals("None found", actual[0]);
    }
}
