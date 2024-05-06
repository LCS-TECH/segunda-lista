package terceiraQuestao;

import java.util.Scanner;

public class TerceiraQuestao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Digite um número maior que 50: ");
        num = sc.nextInt();

        while(num < 50){
            System.out.println("Digite novamente: ");
            num = sc.nextInt();
        }
        sc.close();
    }
}
