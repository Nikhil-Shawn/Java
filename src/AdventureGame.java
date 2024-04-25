import java.util.Scanner;

public class AdventureGame {

    public static void main(String[] args) {

        String adventurer;

        System.out.println("Please enter you name");
        Scanner scanner = new Scanner(System.in);
        adventurer = scanner.nextLine();
        System.out.println("Welcome to the game " + adventurer);
        System.out.println("Please select a few choices and remember there are consequences");
        System.out.println("Go left or right");
        String choice1 = scanner.nextLine().toLowerCase();
        if (choice1.equals("left")){
            System.out.println("you live");
        }else if(choice1.equals("right")){
            System.out.println("you are dead");
        }else {
            System.out.println(" select left or right");
        }
    }

}
