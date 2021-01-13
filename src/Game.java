import java.security.SecureRandom;

public class Game {
    public boolean play(int nameLength){
        SecureRandom random = new SecureRandom();
        int dice1,dice2;
        dice1 = random.nextInt(7);
        dice2 = random.nextInt(7);
        System.out.println("Dice 1 : "+dice1);
        System.out.println("Dice 2 : "+dice2);
        int diceSum = dice1+dice2;
        System.out.println("DiceSum = "+diceSum);
        int difference = nameLength-diceSum;
        System.out.println("Difference = "+difference);

        int randomCondition = random.nextInt(100);
        System.out.println("Random Number = "+randomCondition);
        if(randomCondition%2==0 && difference%2==0)
            return true;
        return false;
    }

}
