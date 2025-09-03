
package prog6112_a1b;

public class door {
    public int open (int score) {
        System.out.println("safe");
        return score + 1; 
    }
}

class trap extends door {
    @Override 
    public int open (int score) {
        System.out.println("GHOST!!! \nRun away!"); 
        return score; 
    }
}

class bank extends door {
    @Override 
    public int open (int score) {
        System.out.println("CONGRATULATIONS!!! \nYou found treasure! \nBonus score of +2"); 
        return score + 3; 
    }
}