import java.util.Scanner;

public class Atividade04Prova {
    public static void main(String[] args) {

        // System.out.println("CLEITON > RODRIGO"); <-------------------

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
        String vencedor = "vencedor";
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de Participantes : ");
        quantidadePessoas = sc.nextInt();


        for (int i = 0; i < quantidadePessoas; i++) {
            voto = 0;
            do {
                System.out.println("Digite 80 para votar no Taffismo Club");
                System.out.println("Digite 70 para votar no Patinho Branquinho");
                System.out.println("Digite 60 para votar no Lucas FC");
                System.out.println("Digite 50 para votar no Sports Redes FC ");
                voto = sc.nextInt();
                if (voto == 80) {
                    vototaff++;
                } else if (voto == 70) {
                    votopato++;
                } else if (voto == 60) {
                    votolucas++;
                } else if (voto == 50) {
                    votosport++;
                }
            }while (voto != 50 && voto != 70 && voto != 80 && voto != 60);


        }

        if (vototaff > votolucas && vototaff > votopato && vototaff > votosport){
            vencedor = "Taffismo Club";
        } else if (votopato > vototaff && votopato > votolucas && votopato> votosport){
            vencedor = "Patinho Branquinho";
        } else if (votolucas > vototaff && votolucas > votopato && votolucas > votosport){
            vencedor = "Lucas FC";
        } else if (votosport > vototaff && votosport > votopato && votosport > votolucas){
            vencedor = "Sports Redes FC";
        }

        System.out.println("O Taffismo club fez : " + vototaff + " votos");
        System.out.println("O Patinho Branquinho fez : " + votopato + " votos" );
        System.out.println("O Lucas FC fez : " + votolucas + " votos" );
        System.out.println("O Sport Redes Fc : " + votosport + " votos" );
        System.out.println("O vencedor foi " + vencedor );


    }
}
