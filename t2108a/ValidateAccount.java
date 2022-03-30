package bank.t2108a;

public class ValidateAccount {

    public final String MOBILE = "0974150150";
    public final String PASSWORD = "hiepdepzai";
    public boolean checkAcount(String mobile, String passworld){
        if(mobile.equals(MOBILE)){
            if(passworld.equals(PASSWORD)){
                System.out.println("Đăng nhập thành công!");
                return true;
            }else{
                System.out.println("Mật khấu sai, vui lòng nhập lại");
            return false;
            }
        }else{
            System.out.println("Kiểm tra lại số điện thoại hoặc password");
            return false;
        }
    }
}
