package calcularimc;

import java.util.Scanner;


public class CalcularImc {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe seu peso: ");
        double peso = leia.nextDouble();
        System.out.println("Informe sua Altura: ");
        double altura = leia.nextDouble();    
        double imc = peso / (altura * altura);
        if(imc >= 18.5){
            System.out.println("Abaixo do Peso");
        }
        else if(imc >= 18.5 & imc <= 24.9){
        System.out.println("Peso Normal");        
        }
        else if(imc >=25  & imc <= 29.9){
            System.out.println("Sobrepeso");
        }
        else if(imc >= 30 & imc <= 34.9){
            System.out.println("Obesidade grau 1");
    }
        else if(imc >=35  & imc <=39.9 ){
            System.out.println("Obesidade grau 2");
    } else if(imc <=40 ){
            System.out.println("Obesidade grau 3");
  }
}
}