import java.util.Scanner;

public class jogo {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int ns = 10;
    int chute = 0;
    System.out.println("Voce tem 16 chances para acertar o numero:");
    for(int i = 0;i <= 16; i++){
        System.out.println("Voce esta na tentativa: " + i);
        if(3 <= i && i <= 5){
            System.out.print("Coloque o seu chute[1000-1]:");
        } else if(8 <= i && i <=10){
            System.out.print("Coloque o seu chute[100-1]:"); 
        } else if(i >= 13){
            System.out.print("Coloque o seu chute[10-1]:");
        }
        
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
    
    
    
    
    
    sc.close();
    }
}
