package poo;

import com.sun.org.apache.xpath.internal.operations.String;

public abstract class Jogador {

    private String jogador;
    private int placar = 0;
    private String tipo;

    public Jogador(String jogador,String tipo) {
        this.jogador = jogador;
        this.placar = placar;
        this.tipo = tipo;
    }

    public String getJogador() {
        return jogador;
    }

    public int getPlacar() {
        return placar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setJogador(String jogador) {
        this.jogador = jogador;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean Jogar(){
        // Associar com tabuleiro
        return true;
    }
}
