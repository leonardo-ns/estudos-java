import java.util.Scanner;

public class diferençaProdutos {
    public static void main(String[] args) {

        /*Fazer um programa que leia quatro valores inteiros,
        e depois mostrar na tela a diferença dos produtos */

        Scanner sc = new Scanner(System.in);
        
        int a = 0 , b = 0 , c = 0 , d = 0 , diferença = 0;
        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();
        
        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        c = sc.nextInt();
        
        System.out.print("Digite o quarto número: ");
        d = sc.nextInt();
        diferença = (a * b) - (c * d);
        
        System.out.println("A diferença dos produtos é: " + diferença);
        
    }
}
