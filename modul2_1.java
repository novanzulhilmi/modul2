import java.util.Scanner;
//Novan Nur Zulhilmi Yardana (265150701111013) - TI A

public class modul2_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int a=0;
        int b=0;
        int r=0;
        int pilihan=0;
        double kelilingSegitiga, luasSegitiga, kelilingPP, luasPP;
        double kelilingLingkaran, luasLingkaran;

        System.out.println("Menu :");
        System.out.println("1. Menghitung luas dan keliling persegi panjang");
        System.out.println("2. Menghitung luas dan keliling lingkaran");
        System.out.println("3. Menghitung luas dan keliling segitiga");
        
        System.out.print("Pilih yang ingin kamu hitung : ");
        pilihan=in.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("==============================================");
                System.out.println("Program penghitung luas dan keliling persegi panjang");
                System.out.print("Masukkan sisi panjang : ");
                a=in.nextInt();
                System.out.print("Masukkan sisi lebar : ");
                b=in.nextInt();
                kelilingPP=2*(a+b);
                luasPP=a*b;
                
                System.out.println("Keliling persegi panjang : "+kelilingPP+" cm");
                System.out.println("Luas persegi panjang     : "+luasPP+" cm2");
                break;

            case 2:
                System.out.println("==============================================");
                System.out.println("Program penghitung luas dan keliling lingkaran");
                System.out.print("Masukkan jari-jari : ");
                r=in.nextInt();
                kelilingLingkaran=2*3.14*r;
                luasLingkaran=3.14*r*r;
                
                System.out.println("Keliling lingkaran : "+kelilingLingkaran+" cm");
                System.out.println("Luas lingkaran     : "+luasLingkaran+" cm2");
                break;
            
            case 3:
                System.out.println("==============================================");
                System.out.println("Program penghitung luas dan keliling segitiga");
                System.out.print("Masukkan a : ");
                a=in.nextInt();
                System.out.print("Masukkan b : ");
                b=in.nextInt();
                System.out.print("Masukkan r : ");
                r=in.nextInt();
                kelilingSegitiga=a+b+r;
                luasSegitiga=(a*b)/2;
                
                System.out.println("Keliling segitiga : "+kelilingSegitiga+" cm");
                System.out.println("Luas segitiga     : "+luasSegitiga+" cm2");
                break;
        
            default:
                System.out.println("Pilihan anda : "+pilihan);
                System.out.println("Data tak ditemukan, program dihentinkan ...");
                break;
        }

        in.close();
    }
    //Novan Nur Zulhilmi Yardana (265150701111013) - TI A
}
