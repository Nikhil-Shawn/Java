import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class BasicsJava17 {

    public static void totalMealPrice(int mealPrice, double taxRate,
                                      double tipRate){
        taxRate = taxRate * mealPrice;
        tipRate = tipRate * mealPrice;
        double result = taxRate + tipRate + mealPrice;
        System.out.println("total price is " + result);

    }

    public static void main(String[] args) {
        BasicsJava17 addingnos = new BasicsJava17();
        int result = addingnos.addNos(2, 4);
        System.out.println(result);

        Getter person = new Getter();
        person.setName("nikhil");
        System.out.println(person.getName());

        Triangle triangleA = new Triangle(1, 3, 4,5,7);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // Student data
        int studAge = 15;
        double studGPA = 3.4;
        boolean perfectAtt = true;
        Scanner input = new Scanner(System.in);
        System.out.println("What GPA you got");
        studGPA = input.nextDouble();
        System.out.println("new gpa is" + studGPA);

        // Fortune telling prog
        System.out.println("Pick a no between 1 to 10 for fortune");
        int fortuneNo = input.nextInt();
        if(fortuneNo < 5){
            System.out.println("good luck");
        }else if(fortuneNo > 5 && fortuneNo < 10){
            System.out.println("bad luck");
        }else{
            System.out.println("pick a no 1-10");
        }

        // Song repeat while loop
        boolean isSongOnRepeat = true;
        while(isSongOnRepeat){
            System.out.println("song on repeat, do you want to remove if so input yes");
            String inputSong = input.next();
            if("yes".equals(inputSong)){
                isSongOnRepeat = false;
            }
        }
        System.out.println("playing next song");

        //Dynamic fn "LOL"
        totalMealPrice(15, 0.20, 0.1);

        // For loop for no reason
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i +" gpa is"+ studGPA +"age is "+ studAge);
        }
    }
    int addNos (int no1, int no2){
        return no1 + no2;
    }
}