import java.util.Scanner;

public class salarioFuncionario {
    public static void main(String[] args) {
        
        /*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
        o valor que recebe por hora e calcula o salário desse funcionário.
        A seguir, mostre o número e o salário do funcionário, com duas casas decimais */
        
        Scanner sc = new Scanner(System.in);
       
        int codigoFuncionario = 0;
        double horasTrabalhadas = 0.0 , valorHora = 0.0 , salario = 0.0;
       
        System.out.print("Digite o código do funcionário: ");
        codigoFuncionario = sc.nextInt();
       
        System.out.print("Digite o número de horas trabalhadas: ");
        horasTrabalhadas = sc.nextDouble();
       
        System.out.print("Digite o valor da hora: ");
        valorHora = sc.nextDouble();
        salario = horasTrabalhadas * valorHora;
       
        System.out.printf("O código do funcionário é: %d\n", codigoFuncionario);
        System.out.printf("O salário do funcionário é: R$ %.2f\n", salario);
    }
}
