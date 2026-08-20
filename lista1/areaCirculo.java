import java.util.Scanner;

public class areaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        double pi = 3.14159 , b = 0 , area = 0;
       
        System.out.print("Digite o raio do círculo: ");
        b = sc.nextDouble();
        area = pi * Math.pow(b, 2);
       
        System.out.println("A área do círculo é: " + area);
    }
}
