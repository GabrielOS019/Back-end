package aula3;

import java.util.Scanner;

public class aula3 {

    static void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("Digite as suas notas");

        IO.println("\nNota 1:");
        int n1 = sc.nextInt();

        IO.println("\nNota 2:");
        int n2 = sc.nextInt();

        IO.println("\nNota 3:");
        int n3 = sc.nextInt();

        int nota = (n1+n2+n3)/3;

        if (nota <= 4){
            IO.println("\nVocê foi reprovado devio a sua média ter sido menor que 4 \nMédia total:" + nota);
        } else if (nota <= 6) {
            IO.println("\nVocê está de recuperação, pois a sua nota é maior que 4, todavia menor que 7 \nMédia total:" + nota);
        }else if (nota <= 10){
            IO.println("\nVocê está aprovado! Sua nota é maior que 7! \nMédia total:" + nota);
        }
    }
}
