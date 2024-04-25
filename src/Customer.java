public class Customer {
    private Boolean served;
    private final String name;

    public Customer(String name){
        served = false;
        this.name = name;
    }

    public void serve(){
        served = true;
        System.out.println(name + " has been served");
    }

    @Override
    public String toString(){
        return name;
    }
}
