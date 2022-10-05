import java.util.Scanner;
class Segitiga {
    private int alas;
    private int tinggi;
    public double hitungLuas() {
        double luas;
        luas =  alas * tinggi/2;
        return luas;
    }
    public void inputData() {
        Scanner input = new Scanner(System.in);
            System.out.println("Masukkan alas = ");
            this.alas = input.nextInt();
            System.out.println("Masukkan tinggi = ");
            this.tinggi = input.nextInt();
    }
}
    public class LuasSegitiga{
        public static void main(String[] args) {
            Segitiga segitiga_2 = new Segitiga();
            segitiga_2.inputData();
            System.out.println("Luas Segitiga = "+segitiga_2.hitungLuas());

        }
    }


