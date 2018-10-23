package creational.singleton;

public class Main {
    public static void main(String[] args) {
        DBConnector db1 = DBConnector.getInstance();
        DBConnector db2 = DBConnector.getInstance();
        db1.setDbUrl("lel");
        System.out.println(db2.getDbUrl());
    }
}
