import java.util.Scanner;

public class Getter {
    private String name;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an animal");
        System.out.println("Answer few questions for me to guess");

        String question1 = "is it a pet";
        System.out.println(question1);
        String response1 = scanner.nextLine().toLowerCase();
        if(response1.equals("yes")){
            System.out.println("cool");
        }else {
            System.out.println("not cool");
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String value){
        this.name = value;
    }
}
