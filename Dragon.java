import java.util.*;

class Dragon extends Mammal{
    int energyLevel = 300;

    public void displayEnergy(){
        System.out.println("My energy level is at:" + energyLevel);
    }

    public void fly(){
        energyLevel -= 50;
        System.out.println("Flew: -50 energy pts");
    }

    public void eatHumans(){
        energyLevel += 25;
        System.out.println("Ate a Human: +25 energy pts");
    }

    public void attackTown(){
        energyLevel -= 100;
        System.out.println("Set town on fire: -100 energy pts");
    }
}

