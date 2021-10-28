package facade.pagemaker;

public class Database {

    private Database(){}

    public static String getProperties(String dbName){
        return dbName.substring(0, dbName.indexOf('@'));
    }

}
