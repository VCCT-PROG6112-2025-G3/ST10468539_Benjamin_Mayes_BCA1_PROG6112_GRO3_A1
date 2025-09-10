
package prog6112_a1b;

/* Fetched code from W3 schools for importing scanner class 
https://www.w3schools.com/java/java_user_input.asp */

import java.util.Scanner;

/* 
ChatGPT
Question: what is the java function to produce a random integer
Answer: *Section Below* 
*/

import java.util.Random;

public class PROG6112_A1b {

    public static void main(String[] args) {
        boolean safe = true; // declare and initialise safe boolean 
        
        int rounds = 0; // declare and initialise Number of rounds played 
        int score = 0; // declare and initialise score 
        
        /* Fetched code from W3 schools for creating new scanner object 
        https://www.w3schools.com/java/java_user_input.asp */
        
        // declare new Scanner object, to read player input 
        Scanner scan = new Scanner(System.in); 
        
        //======================run-game=============================
        
        // while the user is safe (no ghost doors have been opened) 
        while (safe) { 
            
            int firstScore = score; // store players score at start of round 
            rounds += 1; // record one more round played 
            
            // display round information and question 
            System.out.println("Five doors ahead... "
                    + "\nA ghost behind one... "
                    + "\nWhich door do you open???" 
                    + "\nPlease choose one of the doors by number."    ); 
            
            // declare array of 5 safe doors 
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
            
            // declare Random object for reinitalising random doors 
            Random rand = new Random(); 
            
            int index = rand.nextInt(5); // generate random index in the range 0-4
            doors[index] = new bank(3); // change door at index to bank door 
            
            index = rand.nextInt(5); // generate new random index in the range 0-4
            doors[index] = new trap(0); // change door at index to trap door 
            
            /* Fetched code from W3 schools for reading user input 
            https://www.w3schools.com/java/java_user_input.asp */
            
            // prompt player's answer 
            System.out.print("door: "); 
            String ans = scan.nextLine(); // read player's answer 
            
            /* Fetched code from W3 schools for trimming whitespace 
            https://www.w3schools.com/java/ref_string_trim.asp */
            
            ans = ans.trim(); // trim whitespace from player's answer 
            
            /* Fetched code from W3 schools for implementing switch block 
            https://www.w3schools.com/java/java_switch.asp */
            
            boolean valid = true; // decare and initialise valid boolean 
            
            // chose which answer the user entered, and execute the correct functions 
            switch (ans) {
                case "1" : // door 1 choosen 
                    
                    // execite open function for door 1 
                    score = doors[0].open(score); 
                    
                    break; 
                case "2" : // door 2 choosen 

                    // execite open function for door 2 
                    score = doors[1].open(score); 
                    
                    break; 
                case "3" : // door 3 choosen 

                    // execite open function for door 3 
                    score = doors[2].open(score); 

                    break; 
                case "4" : // door 4 choosen 

                    // execite open function for door 4 
                    score = doors[3].open(score); 

                    break; 
                case "5" : // door 5 choosen 

                    // execite open function for door 5 
                    score = doors[4].open(score); 

                    break; 
                default : // if the answer is invalid 
                    
                    System.out.println("invalid asnwer: please try again");
                    valid = false; // change valid to false 
            }
            
            // validate if a trap door was opened 
            // the answer will be valid, but the score will not change 
            if (firstScore == score && valid) safe = false; // set safe boolean to false 
        }
        
        // display game report 
        System.out.println("GAME RESULTS : "
                + "\nScore: " + score 
                + "\nRounds played: " + rounds    ); 
    }
}

//=======================================================================
// END-OF-FILE 
//=======================================================================