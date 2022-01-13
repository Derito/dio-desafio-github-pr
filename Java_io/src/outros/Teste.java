package outros;

import java.io.IOException;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

            Scanner leitor = new Scanner(System.in);
            while (leitor.hasNext()) {
                double graus = leitor.nextDouble();

                if (graus <= 360) {
                    if (graus >=0 && graus <= 90 || graus == 360) System.out.println("Bom Dia!!");
                    else if (graus >= 270 && graus < 360) System.out.println("Boa Tarde!!");
                    else if (graus >=180 && graus <270) System.out.println("Boa Noite!!");
                    else if (graus >90 && graus < 180) System.out.println("De Madrugada!!");
                    else System.out.println("Bom Dia!!");

                    Double horas;
                    if (graus >= 360) {
                        horas =  24.0;
                    } else {                                   //Complete o código nos espaços em branco
                        horas =  12.0;
                    }

                    Double minutos = (  1440.0 ) % 60.0;
                    Double segundos = (  86400.0 ) % 60.0;

                    if (segundos > 59) {
                        segundos = 60.0;
                        minutos += 1.0;
                    }

                    System.out.printf("%02d:%02d:%02d%n", horas.intValue(), minutos.intValue(), segundos.intValue());
                }
            }
        }

    }

