package addressbook.controller;

import addressbook.model.ClientDaoImpl;
import addressbook.view.client;
import com.mysql.cj.xdevapi.Client;

import java.util.ArrayList;
import java.sql.*;


public class ClientController {
    ClientDaoImpl ClientDaoImpl = new ClientDaoImpl();

    public void addNewClient(Client Client) throws SQLException, ClassNotFoundException {
        ClientDaoImpl.addNewClient(Client);
    }

    public ArrayList<Client> findClientByName(String name) throws ClassNotFoundException, SQLException {
        return ClientDaoImpl.findClientByName(name);
    }

    public ArrayList<Client> showAllClient() throws ClassNotFoundException, SQLException {
        return ClientDaoImpl.showAllClient();
    }

    public ArrayList<client> showAllclient() {
        return null;
    }
}
