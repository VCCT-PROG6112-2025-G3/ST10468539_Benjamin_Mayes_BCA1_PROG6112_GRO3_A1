
package prog6112_a1a;

import java.util.ArrayList;
import java.util.Scanner;

public class PROG6112_A1a {

    public static void main(String[] args) {
        // create table 
        ArrayList<String[]> Serieses = new ArrayList<>(); 
        
        // welcome 
        boolean opened = false; 
        while (!opened) {
            Scanner Scan1 = new Scanner(System.in); 
            
            System.out.println("LATEST SERIES - 2025\n"
                    + "*".repeat(38)
                    + "\nEnter (1) to launch menu or any other key to exit");
            String ans = Scan1.nextLine(); 

            opened = ans.trim().equals("1"); 
        }
        
        // main menu 
        boolean exit = false; 
        while (!exit) { 
            // create scanner object 
            Scanner Scan = new Scanner(System.in); 
            
            // display main menu 
            System.out.print("Please select one of the following menu items:\n"
                    + "(1) Capture a new series.\n"
                    + "(2) Search for a series.\n"
                    + "(3) Update series age restriction.\n"
                    + "(4) Delete a series.\n"
                    + "(5) Print series report - 2025.\n"
                    + "(6) Exit Application.\n"
                    + "Answer: ");
            String opt = Scan.nextLine(); 
            opt = opt.trim(); // trim and check answer 
            
            switch (opt) { 
                case "1" : 
                    Serieses = Series.CaptureSeries(Serieses); 
                    break;
                case "2" : 
                    // prompt series ID 
                    System.out.print("Enter the ID number of the series: ");
                    String id = Scan.nextLine(); 
                    
                    String[] series = Series.SearchSeries(Serieses, id); 
                    
                    // show details 
                    System.out.printf("SeriesID: %s;" 
                            + "\nName: %s;" 
                            + "\nAge Restriction: %s;" 
                            + "\nNumber of Episodes: %s;\n" , 
                            series[0] , 
                            series[1] , 
                            series[2] , 
                            series[3]  );
                    break; 
                case "3" : 
                    // prompt series ID 
                    System.out.print("Enter the ID number of the series: ");
                    id = Scan.nextLine(); 
                    
                    // search for series 
                    series = Series.SearchSeries(Serieses, id); 
                    
                    // display current series details 
                    System.out.printf("Current series name: %s"
                            + "\nCurrent Age restriction: %s"
                            + "\nCurrent Number of episodes: %s\n", 
                            series[1], 
                            series[2], 
                            series[3]   ); 
                    
                    // prompt new name 
                    System.out.print("Please enter the new series name: ");
                    String newName = Scan.nextLine(); 
                    
                    // prompt new age 
                    System.out.print("Please enter the new age restriction: ");
                    String newAge = Scan.nextLine(); 
                    
                    // prompt new number of episodes 
                    System.out.print("Please enter the new number of episodes: ");
                    String newNoEpisodes = Scan.nextLine(); 
                    
                    // update record 
                    Serieses = Series.UpdateSeries(Serieses, id, newName, newAge, newNoEpisodes); 
                    break; 
                case "4" : 
                    // search series ID 
                    System.out.print("Please enter the ID number of the series: ");
                    String Id = Scan.nextLine(); 
                    
                    Series.DeleteSeries(Serieses, Scan, Id); 
                    break; 
                case "5" : 
                    Series.SeriesReport(Serieses); 
                    break; 
                case "6" : 
                    exit = Series.ExitSeriesApplication(); 
                    break; // exit application loop 
                default : 
                    System.out.println("Invalid anser. Please try again. "); 
            }
        } 
    }
}

/*
sect A : 
- variables declared and assigned (5m) 
- menue and layout created (5m) 
- saving and capturing values to memory (5m) 
- searching for series + correct result (5m) 
- delete a series + remove item from memory (5m) 
- update a series - required memory item (5m) 
- series report generated (3m) 
- series class created with working methods (3m) 
- good programming practice and comments (4m) 
*/
