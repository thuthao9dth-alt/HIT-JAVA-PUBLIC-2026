import java.util.Scanner;


public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("nhap vao so nguyen: ");
        int numBer = scanner.nextInt();
        double a= 1;
    for(int i=1;i<=numBer;i++){
        a=a*i;
    }
    System.out.print("giai thua cua n la: "+a);
    }
}
