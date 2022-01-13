package outros;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int A = leitor.nextInt() + leitor.nextInt();
        //TODO: Complete o If com a condição que soluciona o problema.
        //if ( N >= 2 && N == A && N <=100 || A <=100)
           if(A > N && N <= 100)
            System.out.println("Deixa para amanha!");
        else
            System.out.println("Farei hoje!");
    }

}
