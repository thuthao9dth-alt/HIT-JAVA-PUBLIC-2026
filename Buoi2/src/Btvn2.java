import java.util.Scanner;
import java.lang.Math;
public class Btvn2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào cạnh a: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập vào cạnh b: ");
        int b  = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập vào cạnh c: ");
        int c  = Integer.parseInt(scanner.nextLine());
         if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
             if (a == b && b == c) {
                 System.out.println("Tam giác đều");
             } else if (a == b || b == c || a == c) {
                 System.out.println("Tam giác cân");
             } else {
                 System.out.println("Tam giác thường");
             }
             double p = (a+b+c)/2.0;
             double Dientich = Math.sqrt(p*(p-a)*(p-b)*(p-c));
             System.out.print("Diẹn tich: ");
             System.out.printf("%.2f",Dientich);
             double Chuvi =a+b+c;
             System.out.println("Chu vi: "+Chuvi);
         }

         else {
             System.out.print("Ba cạnh đã nhập không tạo thành một tam giác hợp lệ.");
         }
    }
}
