
package prog6112_a1b;

/* Fetched code from W3 schools for implementing modifiers 
https://www.w3schools.com/java/java_modifiers.asp */
public class door {
    protected int change; 
    
    /*
    Fetched code from Geeks for Geeks for implementing constructors 
    https://www.geeksforgeeks.org/java/constructors-in-java/
    */
    door (int change) {
        this.change = change; 
    }
    
    protected int open (int score) {
        System.out.println("safe");
        return score + 1; 
    }
}

/* 
Fetched code from W3 schools for implementing modifiers 
https://www.w3schools.com/java/java_modifiers.asp 

Fetched code from W3 schools for creating a subclass 
https://www.w3schools.com/java/java_inheritance.asp 
*/
class trap extends door {
    
    /* Fetched code from Geeks for Geeks for implementing constructors in subclasses 
    https://www.geeksforgeeks.org/java/inheritance-and-constructors-in-java/ */
    trap (int change) {
        super(change); 
    }
    
    /* Fetched code from Geeks for Geeks for overriding inherrited methods 
    https://www.geeksforgeeks.org/java/overriding-in-java/ */
    @Override 
    protected int open (int score) {
        System.out.println("GHOST!!! \nRun away!"); 
        return score; 
    }
}

/* 
Fetched code from W3 schools for implementing modifiers 
https://www.w3schools.com/java/java_modifiers.asp 

Fetched code from W3 schools for creating a subclass 
https://www.w3schools.com/java/java_inheritance.asp 
*/
class bank extends door {
    
    /* Fetched code from Geeks for Geeks for implementing constructors in subclasses 
    https://www.geeksforgeeks.org/java/inheritance-and-constructors-in-java/ */
    bank (int change) {
        super(change); 
    }
    
    /* Fetched code from Geeks for Geeks for overriding inherrited methods 
    https://www.geeksforgeeks.org/java/overriding-in-java/ */
    @Override 
    protected int open (int score) {
        System.out.println("CONGRATULATIONS!!! \nYou found treasure! \nBonus score of +2"); 
        return score + change; 
    }
}