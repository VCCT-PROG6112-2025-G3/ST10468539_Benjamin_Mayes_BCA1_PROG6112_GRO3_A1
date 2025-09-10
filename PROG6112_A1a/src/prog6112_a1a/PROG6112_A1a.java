
package prog6112_a1a;

/*
Fetched code from W3 schools for importing scanner class 
https://www.w3schools.com/java/java_user_input.asp
*/

import java.util.ArrayList;
import java.util.Scanner;

public class PROG6112_A1a {

    public static void main(String[] args) {
        boolean exit; // declare exit boolean 
        
        // create Arraylist for all Series objects 
        ArrayList<Series> Serieses = new ArrayList<>(); 
  
        /* Fetched code from W3 schools for reading user input 
        https://www.w3schools.com/java/java_user_input.asp */
        
        //==============welcome============================================
        Scanner Scan1 = new Scanner(System.in); // declare and initialise new Scanner object 
        
        // display welcome menu 
        System.out.println("LATEST SERIES - 2025\n"
                + "*".repeat(38)
                + "\nEnter (1) to launch menu or any other key to exit");
        
        String ans = Scan1.nextLine(); // read user input 
        
        /* Fetched code from W3 schools for trimming whitespace 
        https://www.w3schools.com/java/ref_string_trim.asp */
        
        ans = ans.trim(); // trim whitespace from user's answer 
        
        // validate if user wants to either continue or exit application 
        // continue to main menu if the user entered 1 
        // exit if any other answer entered
        exit = !ans.equals("1"); 
        
        //==================main-menu======================================
        
        while (!exit) { // if/while the user does not wish to exit the application 
            
            /* Fetched code from W3 schools for creating new scanner object 
            https://www.w3schools.com/java/java_user_input.asp */
            
            Scanner Scan = new Scanner(System.in); // create scanner object 
            
            /* Fetched code from W3 schools for reading user input 
            https://www.w3schools.com/java/java_user_input.asp */
            
            // display main menu and options 
            System.out.print("Please select one of the following menu items:\n"
                    + "(1) Capture a new series.\n"
                    + "(2) Search for a series.\n"
                    + "(3) Update series age restriction.\n"
                    + "(4) Delete a series.\n"
                    + "(5) Print series report - 2025.\n"
                    + "(6) Exit Application.\n"
                    + "Answer: ");
            
            String opt = Scan.nextLine(); // read user input 
            
            /* Fetched code from W3 schools for trimming whitespace 
            https://www.w3schools.com/java/ref_string_trim.asp */
            
            opt = opt.trim(); // trim whitespace from answer 
            
            /* Fetched code from W3 schools for implementing switch block 
            https://www.w3schools.com/java/java_switch.asp */
            
            //============assess-which-answer-the-user-entered=================
            
            // switch to read opt, and execute the correct functions 
            switch (opt) { 
                case "1" : // if the user chose "Capture a new series" 
                    
                    //===============read-and-validate-user-inputs=============
                    
                    String name = ""; // declare and initialise String name 
                    String age = ""; // declare and initialise String age 
                    String noEpisodes = ""; // declare and initialise String noEpisodes 
                    boolean valid = false; // declare and initialise valid boolean to false (unvalidated) 
                    while (!valid) {// repeat until inputs are valid 
                        
                        /* Fetched code from W3 schools for reading user input 
                        https://www.w3schools.com/java/java_user_input.asp */

                        // prompt series Name 
                        System.out.print("Please enter the name of the series: ");
                        name = Scan.nextLine(); // read and store entered name 
                        
                        // prompt series age 
                        System.out.print("Please enter the age restriction of the series: ");
                        age = Scan.nextLine(); // read and store series age restriction 

                        // series number of episodes 
                        System.out.print("Please enter the number of episodes in the series: ");
                        noEpisodes = Scan.nextLine(); // read ans store series number of episodes 

                        // validate age restriction and number of episodes 
                        // they must both contain number characters only 
                        // age must be between 0 and 25 
                        valid = Series.SeriesAgeRestriction(age) 
                                && Series.SeriesNumberOfEpisodes(noEpisodes); 
                    } 
                    
                    // create new series object, and add to Serieses arraylist 
                    Serieses = Series.CaptureSeries(Serieses, name, age, noEpisodes); 
                    
                    break;
                case "2" : // if the user chose "Search for a series" 
                    
                    /* Fetched code from W3 schools for reading user input 
                    https://www.w3schools.com/java/java_user_input.asp */
                    
                    // prompt series ID 
                    System.out.print("Enter the ID number of the series: ");
                    String id = Scan.nextLine(); // read and store the entered ID 
                    
                    /* Fetched code from W3 schools for trimming whitespace 
                    https://www.w3schools.com/java/ref_string_trim.asp */
                    
                    id = id.trim(); // trim whitespace from entered ID 
                    
                    // search for Series with corresponding ID 
                    // returns empty object if ID does not exist 
                    Series series = Series.SearchSeries(Serieses, id); 
                    
                    // validate if the Series was found 
                    if (series.SeriesId.equals("None found")) { // if entered ID was invalid 
                        System.out.println(series.SeriesId); // inform user - no Series was found 
                    } else { // if a series was returned 
                        
                        /* Fetched code from W3 schools for implementing System.out.printf()
                        https://www.w3schools.com/java/ref_output_printf.asp */
                        
                        // display Series details 
                        System.out.printf("SeriesID: %s;" 
                                + "\nName: %s;" 
                                + "\nAge Restriction: %s;" 
                                + "\nNumber of Episodes: %s;\n" , 
                                series.SeriesId , 
                                series.SeriesName , 
                                series.SeriesAge , 
                                series.SeriesNumberOfEpisodes  );
                    } 
                    
                    break; 
                case "3" : // if the user chose "Update series age restriction" 
                    String newName = ""; // declare and initialise the new Series name 
                    String newAge = ""; // declare and initialise the new Series age restriction 
                    String newNoEpisodes = ""; // declare and initialise the new number of episodes 
                    
                    /* Fetched code from W3 schools for reading user input 
                    https://www.w3schools.com/java/java_user_input.asp */
                    
                    // prompt series ID 
                    System.out.print("Enter the ID number of the series: ");
                    id = Scan.nextLine(); // read and store entered ID 
                    
                    /* Fetched code from W3 schools for trimming whitespace 
                    https://www.w3schools.com/java/ref_string_trim.asp */
                    
                    id = id.trim(); // trim whitespace from entered ID 
                    
                    // retrieve series with matching ID 
                    // returns empty object if entered ID does not exist 
                    series = Series.SearchSeries(Serieses, id); 
                    
                    // validate if the Series was found 
                    if (series.SeriesId.equals("None found")) { // if entered ID does not exist 
                        System.out.println(series.SeriesId); // inform user - no Series was found 
                    } else { // if a series was returned 
                        
                        /* Fetched code from W3 schools for implementing System.out.printf()
                        https://www.w3schools.com/java/ref_output_printf.asp */
                        
                        // display Series details 
                        System.out.printf("SeriesID: %s;" 
                                + "\nName: %s;" 
                                + "\nAge Restriction: %s;" 
                                + "\nNumber of Episodes: %s;\n" , 
                                series.SeriesId , 
                                series.SeriesName , 
                                series.SeriesAge , 
                                series.SeriesNumberOfEpisodes  );
                    } 
                    
                    //=========prompt-and-validate-new-inputed-values==========
                    
                    valid = false; // declare and initialise valid boolean to false (unvalidated) 
                    while (!valid) { // loop until valid details are given 
                        
                        /* Fetched code from W3 schools for reading user input 
                        https://www.w3schools.com/java/java_user_input.asp */

                        // prompt new name 
                        System.out.print("Please enter the new series name: ");
                        newName = Scan.nextLine(); // read and store the new name 

                        // prompt new age 
                        System.out.print("Please enter the new age restriction: ");
                        newAge = Scan.nextLine(); // read and store the new age restriction 

                        // prompt new number of episodes 
                        System.out.print("Please enter the new number of episodes: ");
                        newNoEpisodes = Scan.nextLine(); // read and store the new number of episodes 

                        // validate new age restriction and new number of episodes 
                        // they must both contain number characters only 
                        // newAge must be between 0 and 25 
                        valid = Series.SeriesAgeRestriction(newAge) 
                                && Series.SeriesNumberOfEpisodes(newNoEpisodes); 
                    } 
                    
                    // update Series object in Serieses  
                    // returns original arraylist if Series ID not found 
                    Serieses = Series.UpdateSeries(Serieses, id, newName, newAge, newNoEpisodes); 
                    
                    break; 
                case "4" : // if the user chose "Delete a series" 
                    
                    /* Fetched code from W3 schools for reading user input 
                    https://www.w3schools.com/java/java_user_input.asp */
                    
                    // search series ID 
                    System.out.print("Please enter the ID number of the series: ");
                    String Id = Scan.nextLine(); // read and Store entered ID 
                    
                    /* Fetched code from W3 schools for trimming whitespace 
                    https://www.w3schools.com/java/ref_string_trim.asp */
                    
                    Id = Id.trim(); // trim whitespace from entered ID 
                    
                    // delete the specified series object 
                    // will return original arraylist if ID does not exist 
                    Series.DeleteSeries(Serieses, Id); 
                    
                    break; 
                case "5" : // if the user chose "Print series report - 2025" 
                    
                    // generate report for all Serieses in Serieses arraylist 
                    Series.SeriesReport(Serieses); 
                    
                    break; 
                case "6" : // if the user chose "Exit Application" 
                    
                    // application will terminate when exit is true 
                    exit = Series.ExitSeriesApplication(); 
                    
                    break; 
                default : // if the user's answer is not a number between 1 and 6
                    System.out.println("Invalid anser. Please try again."); 
            }
        } 
    }
}

//=======================================================================
// END-OF-FILE 
//=======================================================================