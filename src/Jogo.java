import java.io.PrintStream; //substituir system.out
import java.util.Scanner; //para captar dados do usuário
import java.util.Random; //gerar número aleatório

public class Jogo{ //nome da classe
    public static void main(String [] args) { //método principal
        PrintStream show = System.out;
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        int opcao;
        int escolha_computador;
        int escolha_usuario;

        show.println("Olá! Qual o seu nome?");
        String nome = scan.nextLine(); //método que captura strings do usuário
        show.println("Prazer em conhecê-lo " + nome+"!");
        show.println(nome + ", você quer jogar comigo?");
        show.println("\nInforme o número da sua opção.\n1 -> Sim\n2 -> Não");
        opcao = scan.nextInt(); //método que captura números inteiros

        if (opcao == 2) {

            show.println("Que pena! Mas tudo bem, fica para a próxima.");

        } else if (opcao == 1) {

            show.println("Ok! O jogo é assim...");
            show.println("Eu vou escolher um número de 0 a 10");
            show.println("Mas não vou falar para você qual é.");
            show.println("Se você conseguir adivinhar...");
            show.println("Você será o vencedor!");

            escolha_computador = gerador.nextInt(11); //gerando número aleatório

            show.println("Ok, " +nome+". Eu já escolhi!");
            show.println("Agora tente adivinhar!");

            do {
                escolha_usuario = scan.nextInt();
                if (escolha_usuario != escolha_computador) {
                    show.println("Resposta errada!");
                } else {
                    show.println("Parabéns! Você acertou!");
                }
            } while (escolha_computador != escolha_usuario);

        }
    }
}