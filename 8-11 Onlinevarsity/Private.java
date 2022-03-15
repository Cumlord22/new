import java.util.ArrayList;

public class Private {

    private String accountNumber;
    private String accountHolderName;
    private String accountType;
    private double balance;
    private Arraylist accDetails = new ArrayList();

    public Private(){
        System.out.println("Default Contructor Invoked..")
    }
}

public void displayDetails(){
    System.out.println("Account Details of Customer");
    System.out.println("A/c No. Name \t\t Type \t Balance");
    System.out.println("----------------------------------------");

    Iterator iAccount = accDetails.iterator();

    while(iAccount.hasNext()){
        System.out.println(iAccount.next() + "\t")
    }
    System.out.println("");
}
