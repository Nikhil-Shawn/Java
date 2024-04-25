import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Queue;

public class Main {

    public static void randomNo(ArrayList<Integer> list){
        int originalSize = list.size();
        while (originalSize +1 != list.size()){
            Random random = new Random();
            Integer i = random.nextInt(100);
            list.add(i);
        }
    }

    public static void main(String[] args)  {


        LinkedList<Customer> newQueue = new LinkedList<>();
        Customer aja = new Customer("akon");
        newQueue.add(new Customer("nik"));
        newQueue.add(aja);
        newQueue.add(new Customer("sae"));
        System.out.println(newQueue);
        serveCustomer(newQueue);
        System.out.println(newQueue);

        OddArrayList oddArrayList = new OddArrayList();
        oddArrayList.add(0, 1);
        oddArrayList.add(1, 2);
        oddArrayList.add(3);
        oddArrayList.add(6);
        oddArrayList.add(9);
        randomNo(oddArrayList);
        System.out.println(oddArrayList);

        ModArray liss = new ModArray();
        randomNo(liss);
        liss.add(1);
        liss.add(2);
        liss.add(3);
        liss.add(4);
        System.out.println(liss);

        Stack<Character> nes = new Stack<>();

        nes.push('s');
        nes.push('e');
        nes.push('n');

        System.out.println(nes.pop());
        System.out.println(nes.pop());
        System.out.println(nes.pop());

        // Bank Obj
        Bank niks = new Bank("niks", 2000);
        Bank mayuri = new Bank("mayuri", 3000);
        niks.deposit(20);
        niks.withdraw(0);
        mayuri.deposit(400);
        System.out.println("You have a balance of "+ mayuri.getBalance());
        System.out.println(niks.getBalance());


// Employee Obj
//         Employee niks = new Employee("nikhil",(short) 25, 30000,"mumbai");
//                niks.raiseSalary();
//                Employee.annouceCompany();
//        Employee.annouceCompany();
//        Employee joe = new Employee("joe", (short) 22, 20000,"pune");
//        System.out.println(joe.getSalary());
//
//        System.out.println(niks.getSalary());

        // Car Obj
//            Car ferrari = new Car("red", "ferrari", 4);
//            Car BMW = new Car("black","BMW",4);
//            System.out.println(ferrari);
//        System.out.println(BMW);

            // Read file
//        try {
//
////            File file = new File("assests/fle.txt");
////            Scanner scanner = new Scanner(file);
////            while (scanner.hasNext()){
////                System.out.println(scanner.nextLine());
////            }
////
////        }catch (Exception err){
////            System.out.println(err.getMessage());
////        }

    }

    static void serveCustomer(LinkedList<Customer> c){
        Customer d = c.poll();
        d.serve();
    }


}
