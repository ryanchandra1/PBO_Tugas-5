import java.util.Scanner;

class Lingkaran{
    private int jari;

    public double hitungLuas(){
        double luas;
        luas = 3.14*jari*jari;
        return luas;
    }
    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jari-jari lingkaran :");
        this.jari = input.nextInt();
    }
}
public class LuasLingkaran {
    public static void main(String[] args) {
        Lingkaran lingkaran_2 = new Lingkaran();
        lingkaran_2.inputData();
        System.out.println("Luas Lingkaran = "+lingkaran_2.hitungLuas());
    }
}


