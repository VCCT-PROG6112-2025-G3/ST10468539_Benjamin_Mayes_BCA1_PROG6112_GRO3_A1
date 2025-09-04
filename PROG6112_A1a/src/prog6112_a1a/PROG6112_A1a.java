
package prog6112_a1a;

/*
Fetched code from W3 schools for importing scanner class 
https://www.w3schools.com/java/java_user_input.asp
*/

import java.util.ArrayList;
import java.util.Scanner;

public class PROG6112_A1a {

    public static void main(String[] args) {
        boolean exit; 
        
        // create table 
        ArrayList<String[]> Serieses = new ArrayList<>(); 
  
        // welcome 

        /*
        Fetched code from W3 schools for reading user input 
        https://www.w3schools.com/java/java_user_input.asp
        */
        
        Scanner Scan1 = new Scanner(System.in); 
        
        System.out.println("LATEST SERIES - 2025\n"
                + "*".repeat(38)
                + "\nEnter (1) to launch menu or any other key to exit");
        String ans = Scan1.nextLine(); 
        
        /*
        Fetched code from W3 schools for trimming whitespace 
        https://www.w3schools.com/java/ref_string_trim.asp
        */
        
        ans = ans.trim(); 
        
        exit = !ans.equals("1");         
        // main menu 
        while (!exit) { 
            /*
            Fetched code from W3 schools for creating new scanner object 
            https://www.w3schools.com/java/java_user_input.asp
            */
            
            // create scanner object 
            Scanner Scan = new Scanner(System.in); 
            
            /*
            Fetched code from W3 schools for reading user input 
            https://www.w3schools.com/java/java_user_input.asp
            */
            
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
            
            /*
            Fetched code from W3 schools for trimming whitespace 
            https://www.w3schools.com/java/ref_string_trim.asp
            */
            
            opt = opt.trim(); // trim and check answer 
            
            /*
            Fetched code from W3 schools for implementing switch block 
            https://www.w3schools.com/java/java_switch.asp
            */
            
            switch (opt) { 
                case "1" : 
                    /*
                    Fetched code from W3 schools for reading user input 
                    https://www.w3schools.com/java/java_user_input.asp
                    */
                    
                    // prompt series Name 
                    System.out.print("Please enter the name of the series: ");
                    String name = Scan.nextLine(); 

                    // prompt series age 
                    System.out.print("Please enter the age restriction of the series: ");
                    String age = Scan.nextLine(); 

                    // series number of episodes 
                    System.out.print("Please enter the number of episodes in the series: ");
                    String noEpisodes = Scan.nextLine(); 
                    
                    // create new series 
                    Serieses = Series.CaptureSeries(Serieses, name, age, noEpisodes); 
                    break;
                case "2" : 
                    /*
                    Fetched code from W3 schools for reading user input 
                    https://www.w3schools.com/java/java_user_input.asp
                    */
                    
                    // prompt series ID 
                    System.out.print("Enter the ID number of the series: ");
                    String id = Scan.nextLine(); 
                    
                    /*
                    Fetched code from W3 schools for trimming whitespace 
                    https://www.w3schools.com/java/ref_string_trim.asp
                    */
                    
                    id = id.trim(); 
                    
                    String[] series = Series.SearchSeries(Serieses, id); 
                    
                    if (series[0].equals("None found")) {
                        System.out.println(series[0]);
                    } else { 
                        /*
                        Fetched code from W3 schools for implementing System.out.printf()
                        https://www.w3schools.com/java/ref_output_printf.asp
                        */
                        
                        // show details 
                        System.out.printf("SeriesID: %s;" 
                                + "\nName: %s;" 
                                + "\nAge Restriction: %s;" 
                                + "\nNumber of Episodes: %s;\n" , 
                                series[0] , 
                                series[1] , 
                                series[2] , 
                                series[3]  );
                    } 
                    break; 
                case "3" : 
                    /*
                    Fetched code from W3 schools for reading user input 
                    https://www.w3schools.com/java/java_user_input.asp
                    */
                    
                    // prompt series ID 
                    System.out.print("Enter the ID number of the series: ");
                    id = Scan.nextLine(); 
                    
                    /*
                    Fetched code from W3 schools for trimming whitespace 
                    https://www.w3schools.com/java/ref_string_trim.asp
                    */
                    
                    id = id.trim(); 
                    
                    // search for series 
                    series = Series.SearchSeries(Serieses, id); 
                    
                    /*
                    Fetched code from W3 schools for implementing System.out.printf()
                    https://www.w3schools.com/java/ref_output_printf.asp
                    */
                    
                    // display current series details 
                    System.out.printf("Current series name: %s"
                            + "\nCurrent Age restriction: %s"
                            + "\nCurrent Number of episodes: %s\n", 
                            series[1], 
                            series[2], 
                            series[3]   ); 
                    
                    /*
                    Fetched code from W3 schools for reading user input 
                    https://www.w3schools.com/java/java_user_input.asp
                    */
                    
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
                    /*
                    Fetched code from W3 schools for reading user input 
                    https://www.w3schools.com/java/java_user_input.asp
                    */
                    
                    // search series ID 
                    System.out.print("Please enter the ID number of the series: ");
                    String Id = Scan.nextLine(); 
                    
                    /*
                    Fetched code from W3 schools for trimming whitespace 
                    https://www.w3schools.com/java/ref_string_trim.asp
                    */
                    
                    Id = Id.trim(); 
                    
                    Series.DeleteSeries(Serieses, Id); 
                    break; 
                case "5" : 
                    Series.SeriesReport(Serieses); 
                    break; 
                case "6" : 
                    exit = Series.ExitSeriesApplication(); 
                    break; // exit application loop 
                default : 
                    System.out.println("Invalid anser. Please try again."); 
            }
        } 
    }
}
