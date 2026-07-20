import java.util.Scanner;
public class Btvn4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so lương hoc sinh: ");
        int n =Integer.parseInt(scanner.nextLine());
        double[] Diem = new double[n];
        for(int i=0;i<n;i++){
            System.out.print("Nhập điểm học sinh thứ " + (i + 1) + ": ");
            Diem[i] = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Điểm cao nhất: " + findMax(Diem));
        System.out.printf("Điểm trung bình lớp: %.2f%n", calculateAverage(Diem));
        System.out.println("Số học sinh dưới trung bình: " + countFailedStudents(Diem));
    }
    public static double findMax(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static double calculateAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum =sum + arr[i];
        }
        return sum / arr.length;
    }

    public static int countFailedStudents(double[] arr) {
        int count = 0;
        for (double Diem : arr) {
            if (Diem < 5.0) {
                count++;
            }
        }
        return count;

    }
}
