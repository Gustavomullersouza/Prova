import java.util.Scanner;

public class Atividade03Prova {
    public static void main(String[] args) {

        //System.out.println("CLEITON > RODRIGO"); <--------------

        int opcao = 0;
        int quantidadeAlimentos;
        int notas1 = 0 ;
        int notas2 = 0;
        int alimentosAprovados = 0;
        int alimentosReprovados = 0;;
        int resultado;


        Scanner sc = new Scanner(System.in);

        System.out.println("digite o quantidade de Alimimentos: ");
        quantidadeAlimentos = sc.nextInt();

        System.out.println("Utilizar numeros de 0 até 10 voto");

           while( opcao != 99 ){
               System.out.println(" 1 - Para somar notas dos alimentos");
               System.out.println(" 99 - Para sair");
               opcao = sc.nextInt();

               if( opcao == 1 ) {
                   System.out.println("Digite a Primeira nota");
                   notas1 = sc.nextInt();
                   System.out.println("Digite a Segunda nota");
                   notas2 = sc.nextInt();
                   resultado = (notas1 + notas2) / 2;
                   System.out.println("O resultado é " + resultado);
                   if ( resultado >= 6){
                       alimentosAprovados++;
                   }
                   else {
                       alimentosReprovados++;
                   }

               }else{
               }

           }

        System.out.println("Quantidade de alimentos bons : " + alimentosAprovados);
        System.out.println("Quantidade de alimentos ruins : " + alimentosReprovados);



        }


    }




















