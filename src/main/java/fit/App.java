package fit;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Digite a sua altura: ");
        double altura = scanner.nextDouble();
        double imc = peso / Math.pow(altura, 2);
        String resultado = null;
        if(imc < 18.50){
            resultado = "Magreza";
        } else if (imc >= 18.5 & imc < 24.90){
            resultado = "Normal";
        } else if (imc >= 24.9 & imc < 30){
            resultado = "Sobrepeso";
        } else if (imc >= 30){
            resultado = "Obesidade";
        }
        System.out.printf("O cálculo do seu IMC resultou em  %.2f \nIndicando que o seu corpo está em  %s", imc, resultado );
    }
}
