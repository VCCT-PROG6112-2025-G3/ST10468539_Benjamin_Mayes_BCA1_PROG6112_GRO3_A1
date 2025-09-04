
package prog6112_a1a;

/*
Fetched code from Apache NetBeans for creating JUnit tests 
https://netbeans.apache.org/tutorial/main/kb/docs/java/junit-intro/#_writing_junit_4_tests
*/

import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TestUpdateSeries {
    
    @Test 
    public void TestUpdateSeries () {
        System.out.println("TestUpdateSeries()");
        
        // initialise Series records 
        String[] rec1 = {"12300" , "game of thrones" , "R" , "20" }; 
        String[] rec2 = {"12301" , "Peaky Blinders" , "16" , "13" }; 
        String[] rec3 = {"12302" , "Cobra Kai" , "16" , "10" }; 
        String[] rec4 = {"12303" , "Outer Banks" , "13" , "10" }; 
        
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
        
        // declare and initialise test-updated records
        String[] newRec1 = {"12300", "game of thrones", "18", "20"}; 
        
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
        ArrayList<String[]> test1 = new ArrayList<>(); 
        test1.add(newRec1); 
        test1.add(rec2); 
        test1.add(rec3); 
        test1.add(rec4); 
        
        /*
        ChatGPT
        Question: how to do java assertequals on ArrayList<String[]>
        Answer: *Section Below* 
        */
        
        // assert outputs 
        ArrayList<String[]> actual1 = Series.UpdateSeries(Serieses, "12300", "game of thrones", "18", "20"); 
        assertEquals(test1.size(), actual1.size()); // same size
        for (int i = 0; i < test1.size(); i++) {
            assertArrayEquals(test1.get(i), actual1.get(i));
        }
    }
    
}
