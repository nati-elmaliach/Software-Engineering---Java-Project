import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;

public class Main {

    final static String DB_URI = "jdbc:sqlite" + ":data.db";

    public static void main(String[] args) {

        DB dataBase = new DB();
        if(!dataBase.open()){
            System.out.println("Could not open DB");
            return;
        }
        // initialize the dataBase + create tables
        dataBase.initialize();

        // this is how we can query tables
        dataBase.query_table();

        dataBase.close();
    }

}
