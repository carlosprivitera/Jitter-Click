package client;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;

import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Ayuda extends JDialog {
    private ImageIcon IconoRaton64 = new ImageIcon(getClass().getResource("raton64.png"));
    private JTextArea jTextArea1 = new JTextArea();
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JTextArea jTextArea2 = new JTextArea();

    public Ayuda() {
        this(null, "", false);
    }

    public Ayuda(Frame parent, String title, boolean modal) {
        super(parent, title, modal);
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setSize(new Dimension(430, 300));
        this.getContentPane().setLayout( null );
        this.setModal(true);
        this.setResizable(false);
        this.setTitle("Descripción");
        jTextArea1.setBounds(new Rectangle(5, 5, 405, 125));
        jTextArea1.setText("Cuando se está jugando en un juego de computadoras es importante mantener un ritmo de click estable y a la mayor rapidez posible. Click x Segundos – Jitter Click permite practicar y encontrar el máximo ritmo posible para un ratón gamer. Si el ritmo es muy lento o muy rápido se producen fallos en los click para una computadora y ratón particular, es necesario encontrar el ritmo justo de click para ganar en juegos de computadoras. ");
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setEditable(false);
        jLabel1.setBounds(new Rectangle(5, 140, 105, 120));
        jLabel1.setMaximumSize(new Dimension(64, 64));
        jLabel1.setPreferredSize(new Dimension(64, 64));
        jLabel1.setIcon(IconoRaton64);
        jLabel2.setText("https://carlosprivitera.blogspot.com.ar/");
        jLabel2.setBounds(new Rectangle(115, 140, 295, 25));
        jLabel2.setFont(new Font("Tahoma", 0, 14));
        jTextArea2.setBounds(new Rectangle(115, 175, 295, 95));
        jTextArea2.setText("Créditos\n\nAnalista programador: Carlos Alberto Privitera\n\nDiseño gráfico: Carlos Gabriel Privitera");
        jTextArea2.setEditable(false);
        jTextArea2.setLineWrap(true);
        jTextArea2.setWrapStyleWord(true);
        this.getContentPane().add(jTextArea2, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(jTextArea1, null);
    }
}
