package org.exercicio.dio;

public class Operadores {
    public static void main(String[] args) {

        int a = 4;
        int soma = 3;
        int subtracao = 3;
        float divisao = 3.2f;

        soma += a;
        //soma--;
        soma++;//Resultado 8 seria soma = soma(3) - a(4)  e soma(7)+ (1)
       // ++soma;// Resultado 8 seria soma = soma(3) - a(4)  e soma(7)+ (1)
        subtracao -= a;// Resultado -1 subtracao = subtracao - a
        //subtracao--;// Resultado -2 seria subtração = subtracao(3) - a(4)  e subtracao(-1)+ (-1)
        --subtracao;// Resultado -2 seria  subtracao(3)+ (-1) =  subtracao(2) - a(4)
        //subtracao++;// Resultado 0 seria subtração = subtracao(3) - a(4)  e subtracao(-1)+ (1)
       //++subtracao;// Resultado 0 seria subtração = subtracao(3) - a(4)  e subtracao(-1)+ (1)
        divisao /= a;
        //divisao++;// Resultado 1.8 seria divisao = divisao(3.2f) / a(4)  e divisao(0.8)+ (1)
        ++divisao;// Resultado 1.8 seria  divisao(3.2f)+ (1) / a(4)

        System.out.println("A soma é: " + soma);
        System.out.println("A subtração é: " + subtracao);
        System.out.println("A divisão é: " + divisao);
    }
}
