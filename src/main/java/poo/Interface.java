package poo;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Interface {
    private JPanel painelPrincipal;
    private JLabel Q11;
    private JLabel Q32;
    private JLabel Q22;
    private JLabel Q23;
    private JLabel Q13;
    private JLabel Q33;
    private JLabel Q21;
    private JLabel Q31;
    private JLabel Q12;
    private JLabel jogador;

    public Interface() {
        Q11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);// aqui
                 if(Q11.getText().equals("X")) {
                     jogador.setText("Jogador 1");
                     Q11.setText("O");
                 }else {
                     Q11.setText("X");
                     jogador.setText("Jogador 2");

                 }
            }
        });


        Q12.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(Q12.getText().equals("X")){
                    jogador.setText("Jogador 1");
                    Q12.setText("O");
                }else {
                    Q12.setText("X");
                    jogador.setText("Jogador 2");
                }
            }
        });
        Q13.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                super.mouseClicked(e);
                if(Q13.getText().equals("X")){
                    jogador.setText("Jogador 1");
                    Q13.setText("O");
                }else {
                    Q13.setText("X");
                    jogador.setText("Jogador 2");

                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Interface");
        frame.setContentPane(new Interface().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        frame.setLocationRelativeTo(null);
    }
}
