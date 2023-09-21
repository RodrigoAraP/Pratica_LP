package lotofacil;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class LotofacilGUI extends JFrame {
    // Atributos
    private JPanel painel = new JPanel();
    private JButton jButtonAposta1 = new JButton("Apostar de 0 a 100");
    private JButton jButtonAposta2 = new JButton("Apostar de A a Z");
    private JButton jButtonAposta3 = new JButton("Apostar par ou ímpar");
    private JLabel jLabelMensagem = new JLabel("Exemplo de Simples Janela");
    // Construtor
    public LotofacilGUI(){
        this.setTitle("Lotofácil - Interface Gráfica");
        this.setSize(400,200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255,255,255));

        painel.add(jButtonAposta1);
        jButtonAposta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String aposta = JOptionPane.showInputDialog(null,"Digite um número de 0 a 100");
                int numeroApostado = Integer.parseInt(aposta);
                if (numeroApostado < 0 || numeroApostado > 100)
                    JOptionPane.showMessageDialog(null,"Número invalido.");
                else {
                    Random rnd = new Random();
                    int sorteio = rnd.nextInt(101);
                    if (numeroApostado == sorteio)
                        JOptionPane.showMessageDialog(null, "Você ganhou R$ 1000,00");
                    else
                        JOptionPane.showMessageDialog(null, "Você perdeu, o numero sorteado foi " + sorteio);
                }
            }
        });

        painel.add(jButtonAposta2);
        jButtonAposta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String aposta = JOptionPane.showInputDialog(null,"Digite uma Letra de A a Z");
                char letraApostado = aposta.charAt(0);
                letraApostado = Character.toUpperCase(letraApostado);
                if(letraApostado == 'R')
                    JOptionPane.showMessageDialog(null, "Você ganhou R$ 500,00");
                else
                    JOptionPane.showMessageDialog(null, "Você perdeu, o numero sorteado foi R" );
            }
        });

        painel.add(jButtonAposta3);
        jButtonAposta3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String aposta = JOptionPane.showInputDialog(null,"Par ou Impar");
                int numeroApostado = Integer.parseInt(aposta);
                if (numeroApostado % 2 == 0)
                    JOptionPane.showMessageDialog(null, "Você ganhou R$ 100,00");
                else
                    JOptionPane.showMessageDialog(null, "Você perdeu, o numero sorteado foi par");
            }
        });

        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null); // Centralizar janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true); // Exibir janela
    }


    public static void main(String[] args) {
        new LotofacilGUI();
    }

}

