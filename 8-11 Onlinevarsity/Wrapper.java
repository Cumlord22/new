public class Wrapper {
    public static void main(String[] args){
        if (args.length == 4){
            Account objAccount1 = new Account();

            objAccount1.setAccountNumber(args[0]);
            objAccount1.setAccountHolderName(args[1]);
            objAccount1.setAccountType(args[2]);

            objAccount1.setBalance(Double.parseDouble(args[3]));
            objAccount1.displayDetails();
        } else {
            System.out.println("Usage: java TestAccount <A/c no> <Name> <Type>"
            +" <Balance");
        }
    }
}
