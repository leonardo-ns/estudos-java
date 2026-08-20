import java.util.Scanner;

public class resultadoCompras {
    public static void main(String[] args) {
        
        /*Fazer um programa que leia o código de duas peças,
        a quantidade de cada peça e o valor unitário de cada peça,
        e calcule o valor total da compra.
        A seguir, mostre o valor total da compra, com duas casas decimais */
        
        Scanner sc = new Scanner(System.in);
        
        int peça1 = 0 , peça2 = 0 , quantidade1 = 0 , quantidade2 = 0;
        double valor1 = 0.0 , valor2 = 0.0 , total = 0.0;

        System.out.print("Digite o código da peça 1: ");
        peça1 = sc.nextInt();
        
        System.out.print("Digite o código da peça 2: ");
        peça2 = sc.nextInt();
        
        System.out.print("Digite a quantidade da peça 1: ");
        quantidade1 = sc.nextInt();
        
        System.out.print("Digite a quantidade da peça 2: ");
        quantidade2 = sc.nextInt();
        
        System.out.print("Digite o valor da peça 1: ");
        valor1 = sc.nextDouble();
        
        System.out.print("Digite o valor da peça 2: ");
        valor2 = sc.nextDouble();
        total = (quantidade1 * valor1) + (quantidade2 * valor2);
        
        System.out.printf("O total da compra é: R$ %.2f\n", total);
    }
}
