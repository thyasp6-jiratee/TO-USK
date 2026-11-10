import java.util.Scanner;

public class diskon2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int harga, diskon;

        System.out.print("Harga Barang : Rp. ");
        harga = input.nextInt();

        System.out.print("Diskon (%) : ");
        diskon = input.nextInt();
 
        System.out.println("Diskon (Rp.) : Rp. " + (harga * diskon / 100));
        System.out.println("Total Harga : Rp. " + (harga - (harga * diskon / 100)));

    }
}
