import java.util.Scanner;

public class  exe6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Insira seu Salário: ");
            double sal = sc.nextDouble();
           
            System.out.printf("\nSeu salário com 25%% a mais é: %.2f\n", sal*1.25);
            sc.close();
        }
    }
     