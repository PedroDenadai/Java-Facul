import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha Celsius (C) ou Fahrenheit (F): ");
        char escolha = sc.next().charAt(0); 

        double temperatura;

        if(escolha == 'C' || escolha == 'c'){
            System.out.print("Digite a temperatura em Celsius(com ,): ");
            temperatura = sc.nextDouble();
            double fahrenheit = (temperatura * 9/5) + 32;
            System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        }else if (escolha == 'F' || escolha == 'f'){
            System.out.print("Digite a temperatura em Fahrenheit(com ,): ");
            temperatura = sc.nextDouble();
            double celsius = (temperatura - 32) * 5/9;
            System.out.println("A temperatura em Celsius é: " + celsius);
        }else{
            System.out.println("Escolha inválida. Por favor, escolha C ou F.");
        }

        sc.close();
    }
}
