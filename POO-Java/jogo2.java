import java.util.Scanner;
import java.util.Random;

public class jogo2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int ns = random.nextInt(1000);
        int chute = 0;
        System.out.println("Voce tem 16 chances para acertar o numero[1000-1]:");
        for(int i = 0;i <= 16; i++){
            System.out.println("Voce esta na tentativa: " + i);
            chute = sc.nextInt();
            System.out.println(""); 
            if(chute == ns){
                System.out.println("Voce acertou!!!!");
                break;
            }else{
                if(chute > ns){
                    System.out.println("O numero certo é menor que o seu!");
                }else{
                    System.out.println("O numero certo é maior que o seu!"); 
                }
                System.out.println("Voce errou!!!!"); 
            }
        }
        System.out.println("Acabou suas tentativas!!!!");
        
        
        
        
        
        sc.close();
        }
    } 

