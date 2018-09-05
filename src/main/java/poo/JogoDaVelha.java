package poo;

public class JogoDaVelha {

    private int[][] tabuleiro;
    private int placarJogador1;
    private int placarJogador2;
    /**
     * Quando true, representa jogador 1, que possui o marcador X
     */
    private boolean jogadorDaVez;

    public JogoDaVelha() {
        this.tabuleiro = new int[3][3];
        this.placarJogador1 = 0;
        this.placarJogador2 = 0;
        this.jogadorDaVez = true;
    }




}
