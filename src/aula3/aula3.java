package aula3;

import java.util.Scanner;

public class aula3 {

    static void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("Digite a sua nota");
        int nota = sc.nextInt();

        if (nota <= 4){
            IO.println("Você foi reprovado devio a sua média ter sido menor que 4 \nNota total:" + nota);
        } else if (nota <= 6) {
            IO.println("Você está de recuperação, pois a sua nota é maior que 4, todavia menor que 7 \nNota total:" + nota);
        }else if (nota <= 10){
            IO.println("Você está aprovado! Sua nota é maior que 7! \nNota total:" + nota);
        }
    }
}
