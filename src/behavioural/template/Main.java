package behavioural.template;

public class Main {
    public static void main(String[] args) {
        CaffeineBeverage c = new Coffee();
        CaffeineBeverage t = new Tea();
        c.prepare();
        System.out.println("---");
        t.prepare();
    }
}
