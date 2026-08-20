import java.util.Scanner;

public class somaDeValores {
    public static void main(String[] args) {
        
        /*Faça um programa para ler dois valores inteiros,
         e depois mostrar na tela a soma desses números com uma mensagem explicativa */
        
        Scanner sc = new Scanner(System.in);
        
        int a = 0 , b = 0 , soma = 0;
        
        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();
        
        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();
        soma = a + b;
        
        System.out.println("A soma dos produtos é: " + soma);
        
    }
}
