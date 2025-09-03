
/*
ghost game : 

loop :
three doors ahead, a ghost behind one, which door do you open 
three booleans for each door 
- one is assigned true 
- rest are false 
if false : repeat loop 
else end game 
- display score, duration, average decision duration, No. rounds 
*/
package prog6112_a1b;

import java.util.Scanner;

public class PROG6112_A1b {

    public static void main(String[] args) {
        boolean safe = true; 
        boolean ghost1; 
        boolean ghost2; 
        boolean ghost3; 
        
        int rounds = 0; 
        int score = 0; 
        
        Scanner scan = new Scanner(System.in); 
        
        while (safe) {            
            rounds += 1; 
            
            // three doors ahead, a ghost behind one, which door do you open 
            System.out.println("Four doors ahead... "
                    + "\nA ghost behind one... "
                    + "\nWhich door do you open???" );
            System.out.println("\nPlease choose one of the doors by number."); 
            
            // declare door objects 
            door door1 = new door(); 
            door door2 = new door(); 
            door door3 = new trap(); 
            door door4 = new bank(); 
            
            // prompt answer 
            System.out.print("door: "); 
            String ans = scan.nextLine(); 
            ans = ans.trim(); 
            
            switch (ans) {
                case "1" : 
                    door1.open(score); 
                case "2" : 
                    door2.open(score); 
                case "3" : 
                    door3.open(score); 
                case "4" : 
                    door4.open(score); 
                default : 
                    System.out.println("invalid asnwer: please try again");
            }
        }
        
        // - display score, duration, average decision duration, No. rounds 
        System.out.print("GAME RESULTS : "
                + "Score: " + score 
                + "Duration: " //+ time 
                + "Average decision duration: " //+ decisionTime
                + "Rounds played: " + rounds    ); 
    }
}

/*
there must be entities 
- elimination powerup 
- skip powerup 
    - lower score when powerup used 
- increase doors and ghosts by level 
- 
- inheritance constructors and hiding 
- arrays = doors for each level 

arrays, loops (while & for ), inheritance, constructors, information hiding 
output must be shown as report using console 
unit tests - ensure desired results are achieved 
IMPORTANT CONTENT 
- LU1 : advanced arrays 
- LU2 : intro to inheritance 

marks 
- 3 marks : variables declared 
- console application created with acceptable layout (4m) 
- uses 
    - arrays, 
    - loops, 
    - inheritance, $$$
    - constructors, 
    - information hiding (5m) 
- good coding practice + comments (4m) 
- creative, more than baisic functionality and effort (4m) 
    - creativity with extra effort 
- unit tests : prove code functions as intended (15m) 
*/
