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
        this.iniciarTabuleiro();
        this.placarJogador1 = 0;
        this.placarJogador2 = 0;
        this.jogadorDaVez = true;
    }

    public JogoDaVelha(int[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    /**
     *
     * @return 0 quando ninguém ganha, 3 quando jogador 1 ganha, -3 quando jogador 2
     */
    public int ganhou(){
        return 0;
    }

    public int ganhouHorizontal(){
        return 0;
    }

    public int ganhouVertical(){
        return 0;
    }

    public int ganhouDiagonal(){
        return 0;
    }

    public boolean jogar(int linha, int coluna){
       return false;
    }

    public boolean tabuleiroCheio(){
        return false;
    }

    public void iniciarTabuleiro(){
        for (int i = 1; i <=3; i++) {
            for (int j = 1; j <= 3; j++) {
                this.tabuleiro[i][j] = 0;
            }
        }
    }

    public int[][] getTabuleiro() {
        return tabuleiro;
    }

    public int getPlacarJogador1() {
        return placarJogador1;
    }

    public int getPlacarJogador2() {
        return placarJogador2;
    }

    public void setTabuleiro(int[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
}
