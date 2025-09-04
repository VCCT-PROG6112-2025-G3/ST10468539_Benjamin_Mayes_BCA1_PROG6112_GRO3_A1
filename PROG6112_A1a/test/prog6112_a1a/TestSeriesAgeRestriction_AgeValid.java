
package prog6112_a1a;

/*
Fetched code from Apache NetBeans for creating JUnit tests 
https://netbeans.apache.org/tutorial/main/kb/docs/java/junit-intro/#_writing_junit_4_tests
*/

import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TestSeriesAgeRestriction_AgeValid {
    @Test
    public void TestSeriesAgeRestriction_AgeValid() {
        System.out.println("TestSeriesAgeRestriction_AgeValid()");
        
        // initialise Series records 
        String[] series1 = {"12300" , "game of thrones" , "R" , "20" }; 
        String[] series2 = {"12301" , "peaky blinders" , "16+" , "13" }; 
        String[] series3 = {"12302" , "cobra kai" , "16+" , "10" }; 
        String[] series4 = {"12303" , "outer banks" , "13+" , "10" }; 
        
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
        Serieses.add(series1) ; 
        Serieses.add(series2) ; 
        Serieses.add(series3) ; 
        Serieses.add(series4) ; 
        
        // declare and initialise test serieses 
        String[] testRec1 = {"12300", "game of thrones", "18", "20"}; 
        
        /*
        ChatGPT
        Question: why are these lines failing in my junit test method 
            Serieses.add({"00100200" , "Game of Thrones" , "R" , "20" }) ; 
            Serieses.add({"00100201" , "Peaky Blinders" , "16+" , "13" }) ; 
            Serieses.add({"00100203" , "Cobra Kai" , "16+" , "10" }) ; 
            Serieses.add({"00100204" , "Outer Banks" , "13+" , "10" }) ;
        Answer: *Section Below* 
        */
        
        // declare and initialise test arrayLists 
        ArrayList<String[]> test = new ArrayList<>(); 
        test.add(testRec1); 
        test.add(series2); 
        test.add(series3); 
        test.add(series4); 
        
        /*
        ChatGPT
        Question: how to do java assertequals on ArrayList<String[]>
        Answer: *Section Below* 
        */
        
        // assert outputs 
        ArrayList<String[]> actual1 = Series.UpdateSeries(Serieses, "12300", "game of thrones", "18", "20"); 
        assertEquals(test.size(), actual1.size()); // same size
        for (int i = 0; i < test.size(); i++) {
            assertArrayEquals(test.get(i), actual1.get(i));
        }
    }
}
