import java.util.*;

// Dangdeveloper_FPT
public class oct_bin {
    public static void main(String[] args) {
        // int oct = 112;
        System.out.println("Nhap vao so thap phan: ");
        Scanner in = new Scanner(System.in);
        int oct = in.nextInt();
        int sodu = 0;
        int sochia = oct;
        String bin = "";

        while (oct > 0) {
            bin = String.valueOf(oct % 2) + bin;
            oct = oct / 2;
        }
        System.out.println("Sau khi chuyen thanh so nhi phan: " + bin);
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Nhap day thap phan: ");
        // oct = scanner.nextInt();

    }
}