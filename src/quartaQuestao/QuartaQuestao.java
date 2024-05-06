package quartaQuestao;

import java.util.Scanner;

public class QuartaQuestao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String resposta;

        do {
            System.out.println("Qual é a capital do estado do Tocantins?");
            resposta = sc.nextLine();
        } while (!resposta.equalsIgnoreCase("Palmas"));
        
        System.out.println("Correto! A capital do estado do Tocantins é Palmas.");
        sc.close();
    }
       
    }

