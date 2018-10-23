package creational.singleton;

public class DBConnector {
    private static DBConnector dbc;
    private String dbUrl;

    // Create a blank constructor just so we can make it private
    private DBConnector() {}

    public static DBConnector getInstance() {
        if (dbc == null) {
            dbc = new DBConnector();
        }
        return dbc;
    }

    public void setDbUrl(String url) {
        this.dbUrl = url;
    }

    public String getDbUrl() {
        return this.dbUrl;
    }
}
