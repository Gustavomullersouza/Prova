import java.util.Scanner;

public class Atividade04Prova {
    public static void main(String[] args) {
        int taffismoClub = 80;
        int vototaff = 0;
        int patinhoBranquinho = 70;
        int votopato = 0;
        int lucasFc = 60;
        int votolucas = 0;
        int sportRedesFC = 50;
        int votosport = 0;
        int quantidadePessoas;
        int voto = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de Participantes : ");
        quantidadePessoas = sc.nextInt();


        for (int i = 0; i < quantidadePessoas; i++) {
            while ( i < quantidadePessoas - 1) {

                if(voto == 80){
                    vototaff++;
                } else if (voto == 70) {
                    votopato++;
                } else if (voto == 60) {
                    votolucas++;
                }else if (voto == 50){
                    votosport++;
                }


            }
        }
    }
}
