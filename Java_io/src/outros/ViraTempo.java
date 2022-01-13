package outros;

import java.util.Scanner;

public class ViraTempo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        while (leitor.hasNext()) {
            int graus = leitor.nextInt();
            if (graus >= 0 && graus <= 90)
                System.out.println("Bom Dia!!");
            else if(graus >= 270 && graus <= 360)
                System.out.println("Boa tarde!!");
            else if (graus >=180 && graus < 270)
                System.out.println("Boa noite!");
            else if(graus < 180 && graus > 90)
                System.out.println("Madrugada!");
            else
               break;
        }
    }
}


