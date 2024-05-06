package segundaQuestao;

import java.util.Scanner;

public class SegundaQuestao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,maiorIdade=0;
        int idade[] = new int[10];

        for(i=0;i<10;i++){
            System.out.println("Digite sua idade: ");
            idade[i] = sc.nextInt();

            if(idade[i] >= 18){
                maiorIdade += 1;
            }
        }
        System.out.println("A quantidade de pessoas maiores de idade são "+maiorIdade+" pessoas");
        sc.close();
    }
}
