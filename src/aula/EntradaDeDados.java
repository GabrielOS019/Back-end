package aula;

import java.util.Scanner;

public class EntradaDeDados {
    static void main(){

        Scanner sc = new Scanner(System.in);

        IO.println("Qual o seu nome?");
        String nome = sc.next();

        IO.println("Qual a sua idade?");
        int idade = sc.nextInt();

        IO.println("Qual a sua altura?");
        float altura = sc.nextFloat();

        IO.println("Qual o seu peso?");
        float peso = sc.nextFloat();

        System.out.println("Olá,"+nome+"!\n Você tem "+idade+"anos, e o seu IMC é:"+(peso/(altura * altura)));
    }

}
