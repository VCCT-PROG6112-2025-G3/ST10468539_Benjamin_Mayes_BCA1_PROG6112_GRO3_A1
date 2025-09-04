
package prog6112_a1a;

import java.util.ArrayList;

class Series {
    /* Fetched code from W3 schools for implementing modifiers 
    https://www.w3schools.com/java/java_modifiers.asp */
    
    private String SeriesId; 
    private String SeriesName; 
    private String SeriesAge; 
    private String SeriesNumberOfEpisodes; 
    
    /*
    Fetched code from Geeks for Geeks for implementing constructors 
    https://www.geeksforgeeks.org/java/constructors-in-java/
    */
    
    Series (String SeriesId, 
            String SeriesName, 
            String SeriesAge, 
            String SeriesNumberOfEpisodes ) {
        this.SeriesId = SeriesId; 
        this.SeriesName = SeriesName; 
        this.SeriesAge = SeriesAge; 
        this.SeriesNumberOfEpisodes = SeriesNumberOfEpisodes; 
    }
    
    /* Fetched code from W3 schools for implementing modifiers 
    https://www.w3schools.com/java/java_modifiers.asp */
    private static String createId(ArrayList<String[]> Serieses) {
        String idCode = new String(); 
        String id = new String(); 
        int Id = 0; 
        
        /*
        Fetched code from Geeks for Geeks for reading the length of an ArrayList 
        https://www.geeksforgeeks.org/java/java-program-to-find-the-length-size-of-an-arraylist/ 
        */
                
        // if array too long --> print array to long. some must be deleted 
        if (Serieses.size() > 100000) System.out.println("Maximim arraylist length exceeded");
        
        /* Fetched code from Geeks for Geeks for validating if an arraylist is empty 
        https://www.geeksforgeeks.org/java/arraylist-isempty-java-example/  */
        
        // if array has no records --> initialise id to 00000 and return 
        else if (Serieses.isEmpty()) id = "00000";
        
        // else 
        else { 
            id = "00000"; 
            for (String[] series : Serieses) { 
                if (series[0].equals(id)) {
                    Id += 1; // increment by 1 
                    
                    /* Fetched code from Geeks for Geeks for converting an integer value to a String 
                    https://www.geeksforgeeks.org/java/different-ways-for-integer-to-string-conversions-in-java/  */

                    idCode = Integer.toString(Id); 

                    // add num 0s = 5 - len 
                    int filler = 5 - idCode.length(); 
                    id = "0".repeat(filler) + idCode; 
                } else { 
                    break; // stop cycling 
                } 
            } 
        } 
        
        return id; 
    }
    static ArrayList<String[]> CaptureSeries(ArrayList<String[]> Serieses, 
            String name, 
            String age, 
            String noEpisodes   ) {
        // generate seriesId 
        String id = createId(Serieses); // 12345678; 
        
        // create new series object 
        String[] x = {id, name, age, noEpisodes}; 
        
        // print details 
        System.out.println( "*".repeat(60) 
                + "\nSeries ID: " + x[0] 
                + "\nSeries Name: " + x[1] 
                + "\nAge Restriction: " + x[2] 
                + "\nNo. Episodes: " + x[3]     );
        
        // add series to arraylist 
        Serieses.add(x); 
        
        // return series object 
        return Serieses; 
    }
    static String[] SearchSeries(ArrayList<String[]> Serieses, String id) {
        // search for series 
        boolean found = false; 
        String[] series = {"None found"}; 
        for (String[] rec : Serieses){
            if (rec[0].equals(id)) {
                series = rec; 
                
                found = true; 
                break; 
            }
        }
        
        /* Fetched code from W3 schools for valitading a condition being false 
        https://www.w3schools.com/java/java_operators.asp  */ 
        
        if (!found) System.out.println("Series not found: Please enter a valid ID."); 
        
        return series; 
    }
    static ArrayList<String[]> UpdateSeries(ArrayList<String[]> Serieses, 
            String id, 
            String newName, 
            String newAge, 
            String newNoEpisodes    ) {
        // create new record 
        String[] newRec = {id, newName, newAge, newNoEpisodes}; 
        
        /*
        Fetched code from W3 schools for creating an index-based for loop 
        https://www.w3schools.com/java/java_arrays_loop.asp
        */
        
        // search for series 
        boolean found = false; 
        for (int i = 0; i < Serieses.size(); i++){
            String[] rec = Serieses.get(i); 
            if ( rec[0].equals(id) ) {
                /* Fetched code from W3 schools for updating an ArrayList element 
                https://www.w3schools.com/java/java_arraylist.asp */
                
                // insert into arraylist         
                Serieses.set(i, newRec); 
                
                found = true; 
                break; 
            }
        }
        
        /* Fetched code from W3 schools for valitading a condition being false 
        https://www.w3schools.com/java/java_operators.asp  */ 
        
        if (!found) System.out.println("Record not found: Please enter a valid ID."); 
        
        return Serieses; 
    }
    static ArrayList<String[]> DeleteSeries(ArrayList<String[]> Serieses, String id) {
        boolean found = false; 
        for (String[] rec : Serieses) {
            /*
            Fetched code from W3 schools for trimming whitespace 
            https://www.w3schools.com/java/ref_string_trim.asp
            */
            
            if ( rec[0].equals(id.trim()) ) {
                /*
                Fetched code from W3 schools for implementing System.out.printf()
                https://www.w3schools.com/java/ref_output_printf.asp
                */
                
                // display details 
                System.out.printf("SeriesID: %s;"
                        + "\nName: %s;"
                        + "\nAge Restriction: %s;"
                        + "\nNumber of Episodes: %s;\n" , 
                        rec[0] , 
                        rec[1] , 
                        rec[2] , 
                        rec[3]  );
                
                // delete the record 
                Serieses.remove(rec);
                System.out.println("Series Successfully deleted."); 
                
                found = true; 
                break; 
            }
        }
        
        /* Fetched code from W3 schools for valitading a condition being false 
        https://www.w3schools.com/java/java_operators.asp  */ 
        
        if (!found) System.out.println("Series not found: Please enter a valid ID."); 
        
        return Serieses; 
    }
    static void SeriesReport(ArrayList<String[]> Serieses) {
        int totalSerieses = 0; 
        int totalEpisodes = 0; 
        
        // cycle through list of serieses 
        for (String[] rec : Serieses){
            totalSerieses += 1; 
            totalEpisodes += Integer.parseInt(rec[3]); 
        }
        
        // print statistics of the serieses arraylist 
        System.out.println("SERIES REPORT\n"
                + "*".repeat(40)
                + "\nTotal number of serieses: " +totalSerieses
                + "\nTotal number of episodes: " +totalEpisodes ); 
    }
    static boolean ExitSeriesApplication () { 
        System.out.println("Closing application."); 
        return true; 
    }
} 
