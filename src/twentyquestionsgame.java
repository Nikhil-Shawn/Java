import java.util.ArrayList;
import java.util.Scanner;

public class twentyquestionsgame {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an animal");
        System.out.println("Answer few questions for me to guess");

        String question1 = "is it a pet";
        System.out.println(question1);
        String response1 = scanner.nextLine().toLowerCase();
        if(response1.equals("yes")){
            String question2 = "is it a cat";
            System.out.println(question2);
            String response2 = scanner.nextLine().toLowerCase();
            if (response2.equals("yes")){
                System.out.println(" yaa guessed it");
            }else {
                System.out.println("is it a dog");
            }
        }else {
            System.out.println("not cool");
        }

        ArrayList<String> question = new ArrayList<>();

        question.add("Is it pet");
        question.add("Is it agile");
        question.add("Is it loyal");
        question.add("Is it small");
    }

}
