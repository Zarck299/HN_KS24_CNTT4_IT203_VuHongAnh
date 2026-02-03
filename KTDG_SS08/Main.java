package KTDG_SS08;

import java.util.Scanner;

public class Main {
    public static Student[] student;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("===== QUAN LY DIEM SINH VIEN =====");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Tim sinh vien theo hoc luc");
            System.out.println("4. Sap xep theo hoc luc giam dan");
            System.out.println("5. Thoat");
            System.out.println("==================================");
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // inputStudents(sc);
                    // break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchByRank(sc);
                    break;
                case 4:
                    sortByScoreDesc();
                    System.out.println("Da sap xep xong!");
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 5);
    }
    // public static inputStudents(Scanner sc){}
    public static void displayStudents() {
    }
    public static void searchByRank(Scanner sc){}
    public static void sortByScoreDesc(){}
}
