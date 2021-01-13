import java.security.SecureRandom;
import java.util.Scanner;

public class DiceRollAssignment {

    public static void main(String args[]){
        String namePlayer1;
        String namePlayer2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("-: WELCOME TO DICE ROLL GAME :-");
        System.out.println("Enter player 1 name :");
        namePlayer1 = scanner.nextLine();
        System.out.println("Enter player 2 name :");
        namePlayer2 = scanner.nextLine();
        Game game = new Game();

        for(int i = 0;i<6;i++){

            if(i%2==0){
                System.out.println("Hey! "+namePlayer1+" Please Enter roll to roll the dice:");
                String roll = scanner.next();
                if(game.play(namePlayer1.length())){
                    System.out.println("CONGRATS! "+namePlayer1 + " You WON");
                    break;
                }
            }
            else{
                System.out.println("Hey! "+namePlayer2+" Please Enter roll to roll the dice:");
                String roll = scanner.next();
                if(game.play(namePlayer2.length())){
                    System.out.println("CONGRATS! "+namePlayer2 + " You WON");
                    break;
                }
            }
        }
    }
}
