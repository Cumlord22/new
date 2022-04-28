package addressbook.view;

import addressbook.controller.ClientController;
import com.mysql.cj.xdevapi.Client;
import com.mysql.cj.xdevapi.Session;

import java.util.ArrayList;
import java.util.Scanner;
import java.sql.*;

public class ClientConsole {
    private final Scanner sc;
    ClientController clientController = new ClientController();
    Client client = new Client() {
        @Override
        public Session getSession() {
            return null;
        }

        @Override
        public void close() {

        }
    };

    public ClientConsole() {
        sc = new Scanner(System.in);
    }

    public int menu() {
        int choice;
        System.out.println("---Login Screen---");
        System.out.println("1. Add new customer");
        System.out.println("2. Find customers by name");
        System.out.println("3. Show all customers");
        System.out.println("4. Exit program");
        choice = readInt(1, 4);
        return choice;
    }

    public int readInt(int min, int max) {
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice >= 1 && choice <= 4) {
                    return choice;
                } else {
                    throw new NumberFormatException("Please enter a valid number");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void start() throws ClassNotFoundException, SQLException {
        while (true) {
            int choice;
            choice = menu();
            switch (choice) {
                case 1:
                    addNewClient();
                    break;
                case 2:
                    findClientByName();
                    break;
                case 3:
                    showAllClient();
                    break;
                case 4:
                    System.exit(0);
                default:
                    break;
            }
        }

    }

    public void addNewClient() throws ClassNotFoundException, SQLException {
        System.out.print("Enter customer's name: ");
        String clientName = sc.nextLine();
        client.setClientName(clientName);
        System.out.print("Enter customer's email: ");
        String clientEmail = sc.nextLine();
        client.setClientEmail(clientEmail);
        System.out.print("Enter customer's phone number: ");
        String clientPhone = sc.nextLine();
        client.setClientPhone(clientPhone);
        clientController.addNewClient(client);
        System.out.println("Added successfully");
    }

    public void findClientByName() throws ClassNotFoundException, SQLException {
        ArrayList<client> client = new ArrayList<>();
        System.out.print("Enter customer's name to find: ");
        String clientName = sc.nextLine();
        client = clientController.findClientByName(clientName);
        System.out.println(client);
    }

    public void showAllClient() throws ClassNotFoundException, SQLException {
        ArrayList<client> client = new ArrayList<>();
        client = clientController.showAllclient();
        System.out.println(client);
    }

}