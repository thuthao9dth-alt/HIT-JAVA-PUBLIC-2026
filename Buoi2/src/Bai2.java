import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao nam bat ky: ");
        int Nam = scanner.nextInt();
        if((Nam % 4 == 0 && Nam % 100 !=0) ||(Nam % 400 == 0)){
            System.out.println(Nam +"la nam nhuan");
        }
        else {
            System.out.println(Nam +" khong la nam nhuan");
        }
    }
}