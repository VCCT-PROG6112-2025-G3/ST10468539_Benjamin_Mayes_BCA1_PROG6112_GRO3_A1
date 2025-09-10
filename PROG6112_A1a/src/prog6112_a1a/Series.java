
package prog6112_a1a;

import java.util.ArrayList;

class Series { // create series class 
    
    /* Fetched code from W3 schools for implementing modifiers 
    https://www.w3schools.com/java/java_modifiers.asp */
    
    // Series attributes 
    String SeriesId; 
    String SeriesName; 
    String SeriesAge; 
    String SeriesNumberOfEpisodes; 
    
    /* Fetched code from Geeks for Geeks for implementing constructors 
    https://www.geeksforgeeks.org/java/constructors-in-java/ */
    
    // Series main constructor 
    Series (String SeriesId, 
            String SeriesName, 
            String SeriesAge, 
            String SeriesNumberOfEpisodes ) {
        this.SeriesId = SeriesId; 
        this.SeriesName = SeriesName; 
        this.SeriesAge = SeriesAge; 
        this.SeriesNumberOfEpisodes = SeriesNumberOfEpisodes; 
    }
    
    // Series constructor for unfound Series objects 
    Series (String SeriesId) {
        this.SeriesId = SeriesId; 
    }
    
    /* Fetched code from W3 schools for implementing modifiers 
    https://www.w3schools.com/java/java_modifiers.asp */
    
    // method to generate unique SeriesID
    private static String createId(ArrayList<Series> Serieses) { 
        String idCode = ""; // declare idCode, for conversion if Id Integer to id String 
        String id = ""; // declare ID as a String 
        int Id = 0; // declare Integer to increment the ID 
        
        /*
        Fetched code from Geeks for Geeks for reading the length of an ArrayList 
        https://www.geeksforgeeks.org/java/java-program-to-find-the-length-size-of-an-arraylist/ 
        */
                
        // determines if array is too long 
        if (Serieses.size() > 100000) System.out.println("Maximim arraylist length exceeded");
        
        /* Fetched code from Geeks for Geeks for validating if an arraylist is empty 
        https://www.geeksforgeeks.org/java/arraylist-isempty-java-example/  */
        
        // initialises ID to starting value (00000) if arraylist is empty 
        else if (Serieses.isEmpty()) id = "00000";
        
        // normal ID generation function 
        else { 
            id = "00000"; // initialise id String 
            for (Series series : Serieses) { // loop through Serieses 
                if (series.SeriesId.equals(id)) { // the id numbers match - the current id number is already taken 
                    Id += 1; // increment by 1 
                    
                    /* Fetched code from Geeks for Geeks for converting an integer value to a String 
                    https://www.geeksforgeeks.org/java/different-ways-for-integer-to-string-conversions-in-java/  */

                    idCode = Integer.toString(Id); // convert ID integer to String 

                    // add 0s to ID, so there are exactly 5 characters in the ID
                    int filler = 5 - idCode.length(); // calculate number of missing characters in idCode 
                    id = "0".repeat(filler) + idCode; // concatenate idCode with missing 0s, and set id String 
                } else { // ID doesnt match - current id number does not exist 
                    break; // stop looping - unique id number has been found 
                } 
            } 
        } 
        
        return id; // return final, unique ID number 
    }
    
    // method to capture, create and add new Series object to Serieses arraylist 
    static ArrayList<Series> CaptureSeries(ArrayList<Series> Serieses, 
            String name, 
            String age, 
            String noEpisodes   ) {
        String id = createId(Serieses); // generate seriesId 
        
        //Series x = {id, name, age, noEpisodes}; // create new series object 
        
        Series x = new Series(id, name, age, noEpisodes); 
        
        // print details of new Series Object 
        System.out.println( "*".repeat(60) 
                + "\nSeries ID: " + x.SeriesId 
                + "\nSeries Name: " + x.SeriesName
                + "\nAge Restriction: " + x.SeriesAge 
                + "\nNo. Episodes: " + x.SeriesNumberOfEpisodes);
        
        Serieses.add(x); // add Series object to Serieses arraylist 
        
        return Serieses; // return newly edited Serieses Arraylist 
    }
    
    // method to search for a Series object, and display its details 
    static Series SearchSeries(ArrayList<Series> Serieses, String id) {
        boolean found = false; // declare and initialise found boolean to false 
        Series foundSeries = new Series("None found"); // declare and initialise foundSeries Array, in case none are found 
        for (Series rec : Serieses){ // loop through Series objects in Serieses 
            if ( rec.SeriesId.equals(id) ) { // if the Series object's ID matches the entered ID 
                foundSeries = rec; // store Series object in foundSeries 
                
                found = true; // the correct series has been found 
                break; 
            }
        }
        
        // validate if the series has not been found 
        if (!found) System.out.println("Series not found: Please enter a valid ID."); 
        
        return foundSeries; // return the Series object 
    }
    
    // method to validate the series age restriction 
    static boolean SeriesAgeRestriction(String Age) {
        boolean valid = false; // declare and initialise valid boolean 
        
        try { // validate if String Age is a whole number 
            int ageNum = Integer.parseInt(Age); // try converting Age to int 
            
            /* Fetched code from W3 schools for using try-catch-finally block 
            https://www.w3schools.com/java/java_try_catch.asp */ 
            
            // validate if integer ageNum is between 0 and 25 
            valid = ageNum>=0 
                    && ageNum<=25 ; 
        } catch (Exception e) { // catch exception if Age is invalid (not a whole number) 
            System.out.println("ERROR: age string could not be converted to int. must contain numbers only"); 
        } finally { // always return the valid boolean 
            return valid; 
        }
    }
    
    // method to validate the number of episodes 
    static boolean SeriesNumberOfEpisodes(String NoEpisodes) {
        boolean valid = false; // declare and initialise valid boolean 
        
        /* Fetched code from W3 schools for using try-catch-finally block 
        https://www.w3schools.com/java/java_try_catch.asp */ 
        
        try { // validate if String NoEpisodes is a whole number 
            int ageNum = Integer.parseInt(NoEpisodes); // try converting NoEpisodes to int 
            
            valid = true; // the Number of episodes is valid 
        } catch (Exception e) { // catch exception if NoEpisodes is invalid (not a whole number) 
            System.out.println("ERROR: no string could not be converted to int. must contain numbers only"); 
        } finally { // always return the valid boolean 
            return valid; 
        }
    }
    
    // update a series object from Serieses arraylist 
    static ArrayList<Series> UpdateSeries(ArrayList<Series> Serieses, 
            String id, 
            String newName, 
            String newAge, 
            String newNoEpisodes    ) {
        
        /* Fetched code from W3 schools for trimming whitespace 
        https://www.w3schools.com/java/ref_string_trim.asp */ 
        
        newAge = newAge.trim(); // trim whitespace in age restriction 
        newNoEpisodes = newNoEpisodes.trim(); // trim whitespace in number of episodes 
        
        Series newRec = new Series (id, newName, newAge, newNoEpisodes); // create new Series object 
        
        /* Fetched code from W3 schools for creating an index-based for loop 
        https://www.w3schools.com/java/java_arrays_loop.asp */
                
        boolean found = false; // declare and initialise found boolean 
        for (int i = 0; i < Serieses.size(); i++){ // loop through Serieses index 
            
            Series rec = Serieses.get(i); // read corresponding Series object in Serieses 
            if ( rec.SeriesId.equals(id) ) { // validate that ID numbers match (both objects are the same Series) 
                
                /* Fetched code from W3 schools for updating an ArrayList element 
                https://www.w3schools.com/java/java_arraylist.asp */
                
                Serieses.set(i, newRec); // replace old object with new one 
                
                found = true; // Series has been found and updated 
                break; 
            }
        }
        
        // validate if series has been found and updated 
        if (!found) System.out.println("Record not found: Please enter a valid ID."); 
        
        return Serieses; // return updated Serieses arrayList 
    }
    
    // method to delete a Series object from Serieses arrayList 
    static ArrayList<Series> DeleteSeries(ArrayList<Series> Serieses, String id) {
        
        boolean found = false; // declare and initialise found boolean 
        for (Series rec : Serieses) { // loop through Series Objects in Serieses 
            
            /* Fetched code from W3 schools for trimming whitespace 
            https://www.w3schools.com/java/ref_string_trim.asp */
            
            if ( rec.SeriesId.equals(id.trim()) ) { // validate that object ID matches the entered ID 
                
                /* Fetched code from W3 schools for implementing System.out.printf()
                https://www.w3schools.com/java/ref_output_printf.asp */
                
                // display Series details 
                System.out.printf("SeriesID: %s;"
                        + "\nName: %s;"
                        + "\nAge Restriction: %s;"
                        + "\nNumber of Episodes: %s;\n" , 
                        rec.SeriesId , 
                        rec.SeriesName , 
                        rec.SeriesAge , 
                        rec.SeriesNumberOfEpisodes  );
                
                // delete the Series from Serieses 
                Serieses.remove(rec);
                System.out.println("Series Successfully deleted."); 
                
                found = true; // Series succsessfully found and deleted 
                break; 
            }
        }
        
        // validates that series has been found and deleted 
        if (!found) System.out.println("Series not found: Please enter a valid ID."); 
        
        return Serieses; // return newly edited Serieses arrayList 
    }
    
    // method to generate a report of all Serieses 
    static void SeriesReport(ArrayList<Series> Serieses) {
        int totalSerieses = 0; // declare and initialise the total number of serieses 
        int totalEpisodes = 0; // declare and initialise the total number of episodes 
        
        // loop through list of serieses 
        for (Series rec : Serieses){
            totalSerieses += 1; // increment number of serieses 
            totalEpisodes += Integer.parseInt(rec.SeriesNumberOfEpisodes); // increment number of episodes 
        }
        
        // calculate average number of episodes per Series 
        int averageEpisodes = totalEpisodes / totalSerieses; 
        
        // print statistics of the serieses arraylist 
        System.out.println("SERIES REPORT\n"
                + "*".repeat(40)
                + "\nTotal number of serieses: " +totalSerieses
                + "\nTotal number of episodes: " +totalEpisodes 
                + "\nAverage number of episodes per Series: " +averageEpisodes); 
    }
    
    // method to terminate the program 
    static boolean ExitSeriesApplication () { 
        System.out.println("Closing application."); // notify user of application termination 
        return true; // return true for boolean exit 
    }
} 

//=======================================================================
// END-OF-FILE 
//=======================================================================