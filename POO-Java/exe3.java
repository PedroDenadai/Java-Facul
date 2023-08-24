import java.util.Scanner;

public class exe3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Insira seu Salário: ");
            double sal = sc.nextDouble();
            double imp = sal * 0.05;
            System.out.printf("\nSeu salário é: R$%.2f%n", sal);
            System.out.printf("Imposto de Renda: R$%.2f%n", imp);


            sc.close();
        }
    }
     
