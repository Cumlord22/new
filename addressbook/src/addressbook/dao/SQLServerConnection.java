package addressbook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnection {
    public static Connection getSQLServerConnection() throws  SQLException , ClassNotFoundException{
        String hostName = "localhost";
        String databaseName = "abc";
        String userName = "root";
        String password = "";
        return getSQLServerConnection(hostName , databaseName , userName , password);
    }

    public static Connection getSQLServerConnection(String hostname , String databaName , String username , String password) throws SQLException , ClassNotFoundException {
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//
//        String connectionString = "jdbc:sqlserver://"+hostname+":1433;instance="+instaceName+"databaseName="+databaName;
//
//        Connection connection = DriverManager.getConnection(connectionString,username,password);
//        return connection;
//    }

        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionString = "jdbc:mysql://"+hostname+":3306/"+databaName;
        Connection connection = DriverManager.getConnection(connectionString,username,password);
        return connection;
    }


}
