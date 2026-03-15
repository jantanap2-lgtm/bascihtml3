import java.util.Scanner;

public class AlternateChar {
    String alterMerge(String s1, String s2, int order) {
        // Base Case: ถ้าสตริงว่าง ให้หยุดการเรียกซ้ำ
        if (s1.length() == 0) {
            return "";
        }

        // ตรวจสอบว่ารอบนี้ต้องหยิบจากสตริงไหน
        // สมมติ: order 1 = s1, order 2 = s2 (หรือตามเงื่อนไขโจทย์ที่ระบุ)
        if (order == 1) {
            // หยิบตัวแรกจาก s1 + เรียกซ้ำโดยสลับ order เป็น 2
            return s1.charAt(0) + alterMerge(s1.substring(1), s2.substring(1), 2);
        } else {
            // หยิบตัวแรกจาก s2 + เรียกซ้ำโดยสลับ order เป็น 1
            return s2.charAt(0) + alterMerge(s1.substring(1), s2.substring(1), 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        int order = scan.nextInt();
        AlternateChar ac = new AlternateChar();
        String ans = ac.alterMerge(s1, s2, order);
        System.out.println(ans);
    }
}