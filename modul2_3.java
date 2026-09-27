import java.util.Scanner;
//Novan Nur Zulhilmi Yardana (265150701111013) - TI A

public class modul2_3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int jamKerja=0;
        int upah;
        int lembur=0;
        int denda=0;

        System.out.print("Jam kerja : ");
        jamKerja=in.nextInt();

        //Novan Nur Zulhilmi Yardana (265150701111013) - TI A
        if (jamKerja>60) {
            upah=60*5000;
            lembur=(jamKerja-60)*6000;
        } else if (jamKerja<50) {
            upah=5000*jamKerja;
            denda=(50-jamKerja)*1000;
        } else {
            upah=5000*jamKerja;
        }

        System.out.println("Upah   : Rp. "+upah);
        System.out.println("Lembur : Rp. "+lembur);
        System.out.println("Denda  : Rp. "+denda);
        System.out.println("-------------------");
        System.out.println("Total = Rp. "+(upah+lembur-denda));
        
        in.close();
    //Novan Nur Zulhilmi Yardana (265150701111013) - TI A
    }
}
