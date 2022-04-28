package addressbook.model;

import com.mysql.cj.xdevapi.Client;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ClientDao {
    public void addNewClient(Client client) throws SQLException, ClassNotFoundException;

    public ArrayList<Client> findClientByName(String name) throws ClassNotFoundException, SQLException;

    public ArrayList<Client> showAllClient() throws ClassNotFoundException, SQLException;
}