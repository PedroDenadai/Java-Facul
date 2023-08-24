import java.util.Scanner;

public class  exe5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Insira seu Salário: ");
            double sal = sc.nextDouble();
           
            System.out.print("Insira seu Salário Minímo: ");
            double min = sc.nextDouble();
            
            double fator = sal / min;
            System.out.printf("\nSeu salário é: R$%.2f%n", sal);
            System.out.printf("Seu Salário é %.2f maior que o Salário Minímo\n", fator);


            sc.close();
        }
    }
     
