
package prog6112_a1b;

/*
Fetched code from W3 schools for importing scanner class 
https://www.w3schools.com/java/java_user_input.asp
*/
import java.util.Scanner;

/* 
ChatGPT
Question: what is the java function to produce a random integer
Answer: *Section Below* 
*/
import java.util.Random;

public class PROG6112_A1b {

    public static void main(String[] args) {
        boolean safe = true; 
        
        int rounds = 0; 
        int score = 0; 
        
        /*
        Fetched code from W3 schools for creating new scanner object 
        https://www.w3schools.com/java/java_user_input.asp
        */
        
        Scanner scan = new Scanner(System.in); 
        
        while (safe) {            
            rounds += 1; 
            
            // three doors ahead, a ghost behind one, which door do you open 
            System.out.println("Five doors ahead... "
                    + "\nA ghost behind one... "
                    + "\nWhich door do you open???" );
            System.out.println("\nPlease choose one of the doors by number."); 
            
            // declare door objects 
            door[] doors = { 
                new door(1), 
                new door(1), 
                new door(1), 
                new door(1), 
                new door(1)
            }; 
            
            /* 
            ChatGPT
            Question: what is the java function to produce a random integer
            Answer: *Section Below* 
            */
            Random rand = new Random();
            int index = rand.nextInt(5); // gives 0 to 9
            doors[index] = new bank(3); 
            index = rand.nextInt(5); // gives 0 to 9
            doors[index] = new trap(0); 
            
            /*
            Fetched code from W3 schools for reading user input 
            https://www.w3schools.com/java/java_user_input.asp
            */
            
            // prompt answer 
            System.out.print("door: "); 
            String ans = scan.nextLine(); 
            
            /*
            Fetched code from W3 schools for trimming whitespace 
            https://www.w3schools.com/java/ref_string_trim.asp
            */
            
            ans = ans.trim(); 
            
            /*
            Fetched code from W3 schools for implementing switch block 
            https://www.w3schools.com/java/java_switch.asp
            */
            
            int firstScore = score; 
            boolean valid = true; 
            switch (ans) {
                case "1" : 
                    score = doors[0].open(score); 
                    break; 
                case "2" : 
                    score = doors[1].open(score); 
                    break; 
                case "3" : 
                    score = doors[2].open(score); 
                    break; 
                case "4" : 
                    score = doors[3].open(score); 
                    break; 
                case "5" : 
                    score = doors[4].open(score); 
                    break; 
                default : 
                    System.out.println("invalid asnwer: please try again");
                    valid = false; 
            }
            
            if (firstScore == score && valid) safe = false; 
        }
        
        // - display score, duration, average decision duration, No. rounds 
        System.out.println("GAME RESULTS : "
                + "\nScore: " + score 
                + "\nRounds played: " + rounds    ); 
    }
}
