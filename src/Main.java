//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var palavra = new Palavra();
        var jogador = new Jogador("Oswaldo");
        var jogo = new Jogo(palavra, jogador);

        jogo.iniciarJogo();
    }
}