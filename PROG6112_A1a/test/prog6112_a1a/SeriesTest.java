
package prog6112_a1a;

/*
Fetched code from DataCamp for referencing object attributes 
https://netbeans.apache.org/tutorial/main/kb/docs/java/junit-intro/ 
*/

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SeriesTest {
    
    @Test
    public void TestSearchSeries() {
        
        System.out.println("SeriesModelTest : TestSearchSeries()");
        
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
        ArrayList<String[]> Serieses = new ArrayList<String[]>() ; 
        Serieses.add(rec1) ; 
        Serieses.add(rec2) ; 
        Serieses.add(rec3) ; 
        Serieses.add(rec4) ; 
        
        // assert outputs 
        assertEquals(rec1, 
                Series.SearchSeries(Serieses, "12300")    );
        assertEquals(rec2, 
                Series.SearchSeries(Serieses, "12301")    );
        assertEquals(rec3, 
                Series.SearchSeries(Serieses, "12302")    );
        assertEquals(rec4, 
                Series.SearchSeries(Serieses, "12303")    ); 
    } 
    
    @Test
    public void TestSearchSeries_SeriesNotFound() {
        System.out.println("SeriesModelTest : TestUpdateSeries()");
        
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
        ArrayList<String[]> Serieses = new ArrayList<String[]>() ; 
        Serieses.add(rec1) ; 
        Serieses.add(rec2) ; 
        Serieses.add(rec3) ; 
        Serieses.add(rec4) ; 
        
        // initialise and declare expected result 
        String[] res = {"None found"}; 
        
        // assert outputs 
        assertEquals(res, 
                Series.SearchSeries(Serieses, "123000")    );
        assertEquals(res, 
                Series.SearchSeries(Serieses, "1231")    );
        assertEquals(res, 
                Series.SearchSeries(Serieses, "123O2")    );
        assertEquals(res, 
                Series.SearchSeries(Serieses, "12304")    ); 
    }
    
    @Test 
    public void TestUpdateSeries () {
        System.out.println("SeriesModelTest : TestUpdateSeries()");
        
        // initialise Series records 
        String[] rec1 = {"12300" , "Game of Thrones" , "R" , "20" }; 
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
        ArrayList<String[]> Serieses = new ArrayList<String[]>() ; 
        Serieses.add(rec1) ; 
        Serieses.add(rec2) ; 
        Serieses.add(rec3) ; 
        Serieses.add(rec4) ; 
        
        // assert outputs 
        assertEquals(rec1, 
                Series.UpdateSeries(Serieses, "12300", "game of thrones", "18", "20")   );
        assertEquals(rec2, 
                Series.UpdateSeries(Serieses, "12301", "blinder", "16", "8")    );
        assertEquals(rec3, 
                Series.UpdateSeries(Serieses, "12302", "cobra kai: season 6", "16", "15")   );
        assertEquals(rec4, 
                Series.UpdateSeries(Serieses, "12303", "outer banks", "16", "10")   ); 
    }
    
    @Test 
    public void TestDeleteSeries() {
        System.out.println("SeriesModelTest : TestDeleteSeries");
        
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
        ArrayList<String[]> Serieses = new ArrayList<String[]>() ; 
        Serieses.add(rec1) ; 
        Serieses.add(rec2) ; 
        Serieses.add(rec3) ; 
        Serieses.add(rec4) ; 
        
        // declare and initialise test arrayLists 
        ArrayList<String[]> test1 = new ArrayList<>(); 
        test1.add(rec2); 
        test1.add(rec3); 
        test1.add(rec4); 
        
        ArrayList<String[]> test2 = new ArrayList<>(); 
        test2.add(rec1); 
        test2.add(rec3); 
        test2.add(rec4); 
        
        ArrayList<String[]> test3 = new ArrayList<>(); 
        test3.add(rec1); 
        test3.add(rec2); 
        test3.add(rec4); 
        
        ArrayList<String[]> test4 = new ArrayList<>(); 
        test4.add(rec1); 
        test4.add(rec2); 
        test4.add(rec3); 
        
        // declare Scanner object 
        Scanner scan = new Scanner(System.in); 
        
        // assert outputs 
        assertEquals(test1, 
                Series.DeleteSeries(Serieses, scan, "12300")   );
        assertEquals(test2, 
                Series.DeleteSeries(Serieses, scan, "12301")    );
        assertEquals(test3, 
                Series.DeleteSeries(Serieses, scan, "12302")    );
        assertEquals(test4, 
                Series.DeleteSeries(Serieses, scan, "12303")    ); 
    }
    
    @Test
    public void TestDeleteSeries_SeriesNotFound() {
        System.out.println("SeriesModelTest : TestDeleteSeries_SeriesNotFound()");
        
        // initialise Series records 
        String[] rec1 = {"00200" , "Game of Thrones" , "R" , "20" }; 
        String[] rec2 = {"00100201" , "Peaky Blinders" , "16+" , "13" }; 
        String[] rec3 = {"00100202" , "Cobra Kai" , "16+" , "10" }; 
        String[] rec4 = {"00100203" , "Outer Banks" , "13+" , "10" }; 
        
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
        ArrayList<String[]> Serieses = new ArrayList<String[]>() ; 
        Serieses.add(rec1) ; 
        Serieses.add(rec2) ; 
        Serieses.add(rec3) ; 
        Serieses.add(rec4) ; 
        
        // declare Scanner object 
        Scanner scan = new Scanner(System.in); 
        
        // assert outputs 
        assertEquals(Serieses, 
                Series.DeleteSeries(Serieses, scan, "123000")   );
        assertEquals(Serieses, 
                Series.DeleteSeries(Serieses, scan, "1231")    );
        assertEquals(Serieses, 
                Series.DeleteSeries(Serieses, scan, "123O2")    );
        assertEquals(Serieses, 
                Series.DeleteSeries(Serieses, scan, "12304")    ); 
    }
    
    @Test
    public void TestSeriesAgeRestriction_AgeValid() {
        System.out.println("SeriesModelTest : TestSeriesAgeRestriction_AgeValid()");
        
        // initialise Series records 
        String[] rec1 = {"00200" , "Game of Thrones" , "R" , "20" }; 
        String[] rec2 = {"00100201" , "Peaky Blinders" , "16+" , "13" }; 
        String[] rec3 = {"00100202" , "Cobra Kai" , "16+" , "10" }; 
        String[] rec4 = {"00100203" , "Outer Banks" , "13+" , "10" }; 
        
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
        ArrayList<String[]> Serieses = new ArrayList<String[]>() ; 
        Serieses.add(rec1) ; 
        Serieses.add(rec2) ; 
        Serieses.add(rec3) ; 
        Serieses.add(rec4) ; 
        
        // declare and initialise test serieses 
        String[] testRec1 = {"12300", "game of thrones", "18", "20"}; 
        String[] testRec2 = {"12301", "blinders", "16", "10"}; 
        String[] testRec3 = {"12302", "cobra kai: season 6", "16", "15"}; 
        String[] testRec4 = {"12303", "outer banks", "16", "10"};         
        
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
        test1.add(testRec1); 
        test1.add(rec2); 
        test1.add(rec3); 
        test1.add(rec4); 
        
        ArrayList<String[]> test2 = new ArrayList<>(); 
        test2.add(rec1); 
        test2.add(testRec2); 
        test2.add(rec3); 
        test2.add(rec4); 
        
        ArrayList<String[]> test3 = new ArrayList<>(); 
        test3.add(rec1); 
        test3.add(rec2); 
        test3.add(testRec3); 
        test3.add(rec4); 
        
        ArrayList<String[]> test4 = new ArrayList<>(); 
        test4.add(rec1); 
        test4.add(rec2); 
        test4.add(rec3); 
        test4.add(testRec4); 
        
        // assert outputs 
        assertEquals(test1, 
                Series.UpdateSeries(Serieses, "12300", "game of thrones", "18", "20")   );
        assertEquals(test2, 
                Series.UpdateSeries(Serieses, "12301", "blinders", "16", "10")    );
        assertEquals(test3, 
                Series.UpdateSeries(Serieses, "12302", "cobra kai: season 6", "16", "15")    );
        assertEquals(test4, 
                Series.UpdateSeries(Serieses, "12303", "outer banks", "16", "10")    ); 
    }
    
    @Test
    public void TestSeriesAgeRestriction_SeriesAgeInValid() {
        System.out.println("SeriesModelTest : TestSeriesAgeRestriction_AgeValid()");
        
        // initialise Series records 
        String[] rec1 = {"00200" , "Game of Thrones" , "R" , "20" }; 
        String[] rec2 = {"00100201" , "Peaky Blinders" , "16+" , "13" }; 
        String[] rec3 = {"00100202" , "Cobra Kai" , "16+" , "10" }; 
        String[] rec4 = {"00100203" , "Outer Banks" , "13+" , "10" }; 
        
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
        ArrayList<String[]> Serieses = new ArrayList<String[]>() ; 
        Serieses.add(rec1) ; 
        Serieses.add(rec2) ; 
        Serieses.add(rec3) ; 
        Serieses.add(rec4) ; 
        
        // declare and initialise test serieses 
        String[] testRec1 = {"12300", "game of thrones", "18", "20"}; 
        String[] testRec2 = {"12301", "blinders", "R", "10"}; 
        String[] testRec3 = {"12302", "cobra kai: season 6", "16", "15"}; 
        String[] testRec4 = {"12303", "outer banks", "16", "10"};         
        
        // assert outputs 
        assertEquals(Serieses, 
                Series.UpdateSeries(Serieses, "12300", "game of thrones", "-1", "20")   );
        assertEquals(Serieses, 
                Series.UpdateSeries(Serieses, "12301", "blinders", "160", "10")    );
        assertEquals(Serieses, 
                Series.UpdateSeries(Serieses, "12302", "cobra kai: season 6", "!6", "15")    );
        assertEquals(Serieses, 
                Series.UpdateSeries(Serieses, "12303", "outer banks", "PG", "10")    ); 
    }
    
}

/* 
sect B : unit tests + results 
- TestSearchSeries (4m) 
- TestSearchSeriesNotFound (3m) 
- TestUpdateSeries (4m) 
- TestDeleteSeries (4m) 
- TestDeleteSeriesNotFound (3m) 
- TestSeriesAgeRestriction : AgeValid (4m) 
- TestSeriesAgeRestriction : AgeInvalid (3m) 
*/