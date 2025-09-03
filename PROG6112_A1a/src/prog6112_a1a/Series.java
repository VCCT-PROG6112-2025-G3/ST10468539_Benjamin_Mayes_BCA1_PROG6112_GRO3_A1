
package prog6112_a1a;

import java.util.ArrayList;
import java.util.Scanner;

public class Series {
    public String SeriesId; 
    public String SeriesName; 
    public String SeriesAge; 
    public String SeriesNumberOfEpisodes; 
    
    public Series (String SeriesId, 
            String SeriesName, 
            String SeriesAge, 
            String SeriesNumberOfEpisodes ) {
        this.SeriesId = SeriesId; 
        this.SeriesName = SeriesName; 
        this.SeriesAge = SeriesAge; 
        this.SeriesNumberOfEpisodes = SeriesNumberOfEpisodes; 
    }
    
    public static String createId(ArrayList<String[]> Serieses) {
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
    public static ArrayList<String[]> CaptureSeries(ArrayList<String[]> Serieses) {
        // ===================prompt-info=====================
        Scanner seriesInfo = new Scanner(System.in); 
        
        // generate seriesId 
        String id = createId(Serieses); // 12345678; 
        
        // prompt series Name 
        System.out.print("Please enter the name of the series: ");
        String name = seriesInfo.nextLine(); 
        
        // prompt series age 
        System.out.print("Please enter the age restriction of the series: ");
        String age = seriesInfo.nextLine(); 
        
        // series number of episodes 
        System.out.print("Please enter the number of episodes in the series: ");
        String noEpisodes = seriesInfo.nextLine(); 
        
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
    public static String[] SearchSeries(ArrayList<String[]> Serieses, String id) {
        // search for series 
        String[] series = new String[4]; 
        for (String[] rec : Serieses){
            if (rec[0].equals(id)) {
                series = rec; 
                break; 
            }
        }
        
        return series; 
    }
    
    public static ArrayList<String[]> UpdateSeries(ArrayList<String[]> Serieses, 
            String id, 
            String newName, 
            String newAge, 
            String newNoEpisodes    ) {
        // create new record 
        String[] newRec = {id, newName, newAge, newNoEpisodes}; 
        
        // search for series 
        for (String[] rec : Serieses){
            if ( rec[0].equals(id) ) {
                rec = newRec; 
                break; 
            }
        }

        // insert into arraylist         
        
        return Serieses; 
    }
    
    public static ArrayList<String[]> DeleteSeries(ArrayList<String[]> Serieses, Scanner scan, String id) {
        boolean found = false; 
        for (String[] rec : Serieses) {
            if (rec[0].equals(id.trim())) {
                String ans = new String(); 
                
                // display details 
                System.out.printf("SeriesID: %s;"
                        + "\nName: %s;"
                        + "\nAge Restriction: %s;"
                        + "\nNumber of Episodes: %s;\n" , 
                        rec[0] , 
                        rec[1] , 
                        rec[2] , 
                        rec[3]  );
                
                // confirm deletion 
                boolean validAns = false; 
                while (!validAns) { 
                    System.out.print("are you sure you want to delete this series (enter yes/no) : ");
                    ans = scan.nextLine(); 
                    ans = ans.trim(); 
                    if (ans.equals("no") || ans.equals("yes")) validAns = true; 
                } 
                
                // delete the record 
                if (ans.equals("yes")) { 
                    Serieses.remove(rec);
                    System.out.println("Series Successfully deleted."); 
                } else System.out.println("Deletion aborted."); 
                
                found = true; 
                break; 
            }
        }
        
        if (!found) System.out.println("Series not found"); 
        
        return Serieses; 
    }
    public static void SeriesReport(ArrayList<String[]> Serieses) {
        int totalSerieses = 0; 
        int totalEpisodes = 0; 
        for (String[] rec : Serieses){
            totalSerieses += 1; 
            totalEpisodes += Integer.parseInt(rec[3]); 
        }
        
        // print all serieses and their detals 
            // age restrictions and numbers of each 
        
        System.out.println("SERIES REPORT\n"
                + "*".repeat(40)
                + "\nTotal number of serieses: " +totalSerieses
                + "\nTotal number of episodes: " +totalEpisodes ); 
    }
    public static boolean ExitSeriesApplication () { 
        System.out.println("Closing application."); 
        return true; 
    }
} 
