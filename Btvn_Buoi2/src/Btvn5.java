import java.util.Scanner;
public class Btvn5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập thông tin nhân viên: ");
        String Thongtin  = scanner.nextLine();
        Thongtin =Thongtin .trim();

        String[] CHitiet = Thongtin.split("-");
        if(CHitiet.length < 4) {
            System.out.println("Thông tin nhập vào không đúng định dạng!");
            return;
        }
        String maNV = CHitiet[0].trim();
        String hoTen = CHitiet[1].trim();
        int namSinh = Integer.parseInt(CHitiet[2].trim());
        String phongBan = CHitiet[3].trim();
        hoTen = hoTen.toLowerCase();
        String[] Kytu = hoTen.split("\\s+");
        String tenChuan = "";

        for (String word : Kytu) {
            tenChuan = tenChuan+ (word.substring(0, 1).toUpperCase()
                    + word.substring(1) + " ");
        }
        tenChuan = tenChuan.trim();

        String Pb = phongBan.toLowerCase();

        if (Pb.contains("kỹ thuật") || Pb.contains("ky thuat")) {
            System.out.println("Phân loại: Nhân viên kỹ thuật");
        } else {
            System.out.println("Phân loại: Nhân viên nghiệp vụ");
        }

        int Tuoi = 2026 - namSinh;

        System.out.println("Mã nhân viên: " + maNV + " | Họ và tên: " + tenChuan + " | Tuổi: " + Tuoi + " | Bộ phận: " + phongBan);

        scanner.close();
    }
}

