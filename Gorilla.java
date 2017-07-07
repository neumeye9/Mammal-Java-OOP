import java.util.*;

class Gorilla extends Mammal{
    public void tossItem(){
        energyLevel -= 5;
        System.out.println("Threw an item: -5 energy pts.");
    }

    public void eatBananas(){
        energyLevel += 10;
        System.out.println("Ate a banana: +10 energy pts");
    
    }

    public void climb(){
        energyLevel -= 10;
        System.out.println("Climbed: -10 energy pts");
    }

}