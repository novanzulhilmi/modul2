import java.util.Scanner;
//Novan Nur Zulhilmi Yardana (265150701111013) - TI A

public class modul2_2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        double bb=0;
        double tb=0;
        double imt;

        System.out.print("Berat badan (kg) : ");
        bb=in.nextDouble();

        System.out.print("Tinggi badan (m) : ");
        tb=in.nextDouble();

        imt=bb/(tb*tb);

        if (imt<=18.5) {
            System.out.printf("IMT = %.2f termasuk kurus",imt);
        } else if (imt<=25) {
            System.out.printf("IMT = %.2f termasuk normal",imt);
        } else if (imt<=30) {
            System.out.printf("IMT = %.2f termasuk gemuk",imt);
        } else if (imt>30) {
            System.out.printf("IMT = %.2f termasuk kegemukan",imt);
        }
        
        in.close();
    //Novan Nur Zulhilmi Yardana (265150701111013) - TI A
    }
}

