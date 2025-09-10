
package prog6112_a1b;

/* Fetched code from W3 schools for implementing modifiers 
https://www.w3schools.com/java/java_modifiers.asp */

public class door { // create parent class door 
    
    protected int scoreChange; // declare scoreChange attribute 
    
    /* Fetched code from Geeks for Geeks for implementing constructors 
    https://www.geeksforgeeks.org/java/constructors-in-java/ */
    
    door (int scoreChange) { // create constructor for door 
        this.scoreChange = scoreChange; 
    }
    
    protected int open (int score) { // declare and initialise open method 
        System.out.println("safe"); // normal doors are safe 
        
        return score + 1; // increment score by 1 
    }
}

/* Fetched code from W3 schools for implementing modifiers 
https://www.w3schools.com/java/java_modifiers.asp 

Fetched code from W3 schools for creating a subclass 
https://www.w3schools.com/java/java_inheritance.asp */

class trap extends door { // create child class trap - from parent class door 
    
    /* Fetched code from Geeks for Geeks for implementing constructors in subclasses 
    https://www.geeksforgeeks.org/java/inheritance-and-constructors-in-java/ */
    
    trap (int scoreChange) { // create constructor for trap 
        super(scoreChange); // use door constructor 
    }
    
    /* Fetched code from Geeks for Geeks for overriding inherrited methods 
    https://www.geeksforgeeks.org/java/overriding-in-java/ */
    
    @Override 
    protected int open (int score) { // override door.open() method for trap 
        // trap doors have ghosts 
        System.out.println("GHOST!!! "
                + "\nRun away!"    ); 
        
        return score; // score remains unchanged to indicate an opened trap door 
    }
}

/* Fetched code from W3 schools for implementing modifiers 
https://www.w3schools.com/java/java_modifiers.asp 

Fetched code from W3 schools for creating a subclass 
https://www.w3schools.com/java/java_inheritance.asp */

class bank extends door { // create child class bank - from parent class door 
    
    /* Fetched code from Geeks for Geeks for implementing constructors in subclasses 
    https://www.geeksforgeeks.org/java/inheritance-and-constructors-in-java/ */
    
    bank (int scoreChange) { // create constructor for bank 
        super(scoreChange); // use door constructor 
    }
    
    /* Fetched code from Geeks for Geeks for overriding inherrited methods 
    https://www.geeksforgeeks.org/java/overriding-in-java/ */
    
    @Override 
    protected int open (int score) { // override door.open() method for bank 
        // bank doors have treasure 
        System.out.println("CONGRATULATIONS!!! "
                + "\nYou found treasure! "
                + "\nBonus score of +2"    ); 
        
        return score + scoreChange; // increment score with extra points, specified in scoreChange attribute 
    }
}

//=======================================================================
// END-OF-FILE 
//=======================================================================