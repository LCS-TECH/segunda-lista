package quintaQuestao;

import java.util.Scanner;

public class QuintaQuestao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double prod,desc;
        int pag;

        System.out.println("Informe o valor do produto: ");
        prod = sc.nextDouble();

        System.out.println("Informe a forma de pagamento\n [1] - à vista \n [2] - à prazo \n");
        pag = sc.nextInt();

        switch(pag){

            case 1:
            desc = prod - (prod * 0.15);
            System.out.println("O valor do produto com desconto é: " + desc);
            break;

            case 2 : 
            System.out.println("O valor do produto é: "+ prod);
            break;

            default:
            System.out.println("Opção Inválida!!!");
        }
        sc.close();
    }
}
