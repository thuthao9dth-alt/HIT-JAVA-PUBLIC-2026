import java.util.Scanner;
public class Btvn3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mat khẩu: ");
        String password = scanner.nextLine();
        String cleanedPassword = password.trim();
        int length = cleanedPassword.length();
        boolean Digit = false;
        boolean Upper = false;
        for (int i = 0; i < length; i++) {
            char c = cleanedPassword.charAt(i);
            if (c >= '0' && c <= '9') {
                Digit = true;
            }
            if (c >= 'A' && c <= 'Z') {
                Upper = true;
            }
        }
        if(!Digit){
            System.out.println("Mật khẩu phải có tối thiểu nhất 1 chữ số");
        }
        if(!Upper){
            System.out.println("Mật khẩu phải chứa tối thiểu 1 chữ cái viết hoa");
        }
        if (length < 8) {
            System.out.println("Mật khẩu phải có độ da tối thiểu là 8 ký tự");
        }
        if(length >= 8 && Digit && Upper) {
            System.out.println("Mật khẩu hợp lệ");
        }
        else{
            System.out.println("Mật khẩu không hợp lệ!");
        }
    }

}
