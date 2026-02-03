package aula3;

import java.util.Scanner;

public class ImcCalculo {
    void main(){
        Scanner sc = new Scanner(System.in);

        float peso;
        float altura;
        float imc;

        IO.println("Digite o seu peso:");
        peso = sc.nextFloat();

        IO.println("\nDigite a sua alutra:");
        altura = sc.nextFloat();

        imc = peso / (altura * altura);

        // --- IMC ---
        if (imc < 18.5){
            IO.println("Você está abaixo do peso.\nIMC: " + imc);
        }else if (imc < 24.9){
            IO.println("Você está com peso normal.\nIMC: " + imc);
        }else if (imc < 29.9){
            IO.println("Você está com sobrepeso.\nIMC: " + imc);
        }else if (imc < 34.9){
            IO.println("Você está com Obesidade grau I.\nIMC: " + imc);
        }else if (imc < 39.9){
            IO.println("Você está com Obesidade grau II.\nIMC: " + imc);
        }else if (imc > 39.9){
            IO.println("Você está com Obesidade grau III.\nIMC: " + imc);
        }
    }
}
