package HN_KS24_CNTT4_VuHongAnh;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class QuanLyMSSV {
    static String[] mssvList = new String[100];
    static int count = 0;
    static final String MSSV_REGEX = "^B\\d{7}$";
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            showMenu();
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    hienThi();
                    break;
                case 2:
                    themMoi(sc);
                    break;
                // case 3:
                //     capNhat(sc);
                //     break;
                // case 4:
                //     xoa(sc);
                //     break;
                // case 5:
                //     timKiem(sc);
                //     break;
                case 6:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
        while (choice != 6);
        sc.close();
    }
    static void showMenu() {
        System.out.println("\n===== MENU QUAN LY MSSV =====");
        System.out.println("1. Hiển thị danh sách MSSV");
        System.out.println("2. Thêm mới MSSV");
        System.out.println("3. Cập nhật MSSV theo index");
        System.out.println("4. Xóa MSSV");
        System.out.println("5. Tìm kiếm MSSV");
        System.out.println("6. Thoát");
    }
    static void hienThi(){
        if(count == 0){
            System.out.println("Danh sách sinh viên rỗng!");
            return;
        }
        System.out.println("Danh sách mã sinh viên: ");
        for(int i = 0; i < count; i++){
            System.out.println((i + 1) + ". " + mssvList[i]);
        }
    }
    static void themMoi(Scanner sc){
        if(count == mssvList.length){
            System.out.println("Danh sách đã đầy, không thể thêm mới!");
            return;
        }
        String mssv;
        while (true) {
            System.out.print("Nhập MSSV mới: ");
            mssv = sc.nextLine();

            if (Pattern.matches(MSSV_REGEX, mssv)) {
                break;
            } else {
                System.out.println("Sai định dạng! MSSV phải có dạng Bxxxxxxx (ví dụ: B2101234)");
            }
        }

        mssvList[count] = mssv;
        count++;
        System.out.println("Thêm MSSV thành công!");
    }
}