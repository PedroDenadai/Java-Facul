import java.util.Scanner;

public class exe4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            final double PI = 3.14159;
            System.out.print("Insira o valor do Raio(cm): ");
            double r = sc.nextDouble();
            double vol = 4/3 * PI * r * r * r;
            System.out.println("\nRaio = "+ r + "\nO volume = " + vol );
            
            sc.close();
        }
    }
     

