import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao chieu dai: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("nhap vao chieu rong: ");
        double chieuRong = scanner.nextDouble();
        double chuVi = (chieuDai + chieuRong)*2 ;
        System.out.println("chu vi hinh chu nhat: "+ chuVi);
        double dienTich = chieuDai * chieuRong;
        System.out.print("dien tich hinh chu nhat: " + dienTich);

    }
}
