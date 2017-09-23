package client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class VentanaPrincipal extends JFrame {
    private ImageIcon IconoLimpiar = new ImageIcon(getClass().getResource("limpiar.png"));
    private ImageIcon IconoRaton = new ImageIcon(getClass().getResource("raton.png"));
    private ImageIcon IconoRaton64 =new ImageIcon(getClass().getResource("raton64.png"));
    private ImageIcon IconoRaton32 = new ImageIcon(getClass().getResource("raton32.png"));
    private ImageIcon IconoAyuda = new ImageIcon(getClass().getResource("ayuda.png"));
    private JPanel jPanel1 = new JPanel(){
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2 =(Graphics2D) g;
            g2.drawImage(IconoRaton.getImage(), (getWidth()/2)-(IconoRaton.getIconWidth()/2), 
                         1, IconoRaton.getIconWidth(), IconoRaton.getIconHeight(), null);
        }
    };
    private BorderLayout borderLayout1 = new BorderLayout();
    private JToolBar jToolBar1 = new JToolBar();
    private JLabel jLabel1 = new JLabel();
    private Segundos segundos = new Segundos();
    private JButton jButton1 = new JButton();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JLabel jLabel6 = new JLabel();
    private JLabel jLabel7 = new JLabel();
    private JLabel jLabel8 = new JLabel();
    private JLabel jLabel9 = new JLabel();
    private JLabel jLabel10 = new JLabel();
    private JLabel jLabel11 = new JLabel();
    private JLabel jLabel12 = new JLabel();
    private JLabel jLabel13 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JMenuBar jMenuBar1 = new JMenuBar();
    private JMenu jMenu1 = new JMenu();
    private JMenuItem jMenuItem1 = new JMenuItem();
    private JLabel jLabel14 = new JLabel();
    private JMenu jMenu2 = new JMenu();
    private JMenuItem jMenuItem2 = new JMenuItem();

    public VentanaPrincipal() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {

        this.getContentPane().setLayout(borderLayout1);
        this.setSize(new Dimension(407, 437));
        this.setTitle("Click x Segundos - Jitter Click");
        jPanel1.setLayout(null);
        jPanel1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    jPanel1_mouseClicked(e);
                }

                public void mouseEntered(MouseEvent e) {
                    jPanel1_mouseEntered(e);
                }

                public void mouseExited(MouseEvent e) {
                    jPanel1_mouseExited(e);
                }
            });
        jToolBar1.setOrientation(1);
        jToolBar1.setFloatable(false);
        jToolBar1.setBackground(new Color(214, 214, 214));
        jLabel1.setText("jLabel1");
        jLabel1.setFont(new Font("Tahoma", 0, 16));
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton1_actionPerformed(e);
                }
            });
        this.getContentPane().add(jPanel1, BorderLayout.CENTER);
        jToolBar1.add(jButton1, null);
        jToolBar1.add(jLabel2, null);
        jToolBar1.add(jLabel1, null);
        jToolBar1.add(jLabel3, null);
        jToolBar1.add(jLabel4, null);
        jToolBar1.add(jLabel5, null);
        jToolBar1.add(jLabel6, null);
        jToolBar1.add(jLabel7, null);
        jToolBar1.add(jLabel8, null);
        jToolBar1.add(jLabel9, null);
        jToolBar1.add(jLabel10, null);
        jToolBar1.add(jLabel11, null);
        jToolBar1.add(jLabel12, null);
        jToolBar1.add(jLabel13, null);
        this.getContentPane().add(jToolBar1, BorderLayout.WEST);
        this.getContentPane().add(jLabel14, BorderLayout.SOUTH);
        jMenu1.add(jMenuItem1);
        jMenuBar1.add(jMenu1);
        jMenu2.add(jMenuItem2);
        jMenuBar1.add(jMenu2);
        this.setIconImage(IconoRaton64.getImage());
        this.setJMenuBar(jMenuBar1);
        this.jButton1.setIcon(IconoLimpiar);
        jButton1.setFont(new Font("Tahoma", 0, 16));
        jButton1.setMaximumSize(new Dimension(160, 100));
        jButton1.setPreferredSize(new Dimension(160, 100));
        this.jLabel1.setText("Segundos sin fallas");
        jLabel1.setBackground(new Color(255, 156, 49));
        jLabel1.setOpaque(true);
        jLabel1.setMaximumSize(new Dimension(160, 20));
        jLabel1.setPreferredSize(new Dimension(160, 20));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setSize(new Dimension(160, 20));
        jLabel1.setToolTipText("Contador de segundos, se usa para calcular: clickXSegundos=clickSinFallas/segundosSinFallas");
        jLabel1.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    jLabel1_mouseEntered(e);
                }

                public void mouseExited(MouseEvent e) {
                    jLabel1_mouseExited(e);
                }
            });
        jLabel3.setText("0");
        jLabel3.setFont(new Font("Tahoma", 0, 16));
        jLabel3.setMaximumSize(new Dimension(160, 20));
        jLabel3.setPreferredSize(new Dimension(160, 20));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setOpaque(true);
        jLabel3.setBackground(new Color(255, 156, 49));
        jLabel3.setSize(new Dimension(160, 20));
        jLabel4.setText("N° Botón");
        jLabel4.setFont(new Font("Tahoma", 0, 16));
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setMaximumSize(new Dimension(160, 20));
        jLabel4.setSize(new Dimension(160, 20));
        jLabel4.setPreferredSize(new Dimension(160, 20));
        jLabel4.setToolTipText("Número de botón con el que está practicando");
        jLabel4.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    jLabel4_mouseEntered(e);
                }

                public void mouseExited(MouseEvent e) {
                    jLabel4_mouseExited(e);
                }
            });
        jLabel5.setText("0");
        jLabel5.setFont(new Font("Tahoma", 0, 16));
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel5.setMaximumSize(new Dimension(160, 20));
        jLabel6.setText("Total de click");
        jLabel6.setFont(new Font("Tahoma", 0, 16));
        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel6.setMaximumSize(new Dimension(160, 20));
        jLabel6.setOpaque(true);
        jLabel6.setBackground(new Color(99, 255, 99));
        jLabel6.setSize(new Dimension(160, 20));
        jLabel6.setPreferredSize(new Dimension(160, 20));
        jLabel6.setToolTipText("Total de click realizados, usar el botón Limpiar para reiniciar la cuenta");
        jLabel6.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    jLabel6_mouseEntered(e);
                }

                public void mouseExited(MouseEvent e) {
                    jLabel6_mouseExited(e);
                }
            });
        jLabel7.setText("0");
        jLabel7.setFont(new Font("Tahoma", 0, 16));
        jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel7.setMaximumSize(new Dimension(160, 20));
        jLabel7.setOpaque(true);
        jLabel7.setBackground(new Color(99, 255, 99));
        jLabel7.setSize(new Dimension(160, 20));
        jLabel7.setPreferredSize(new Dimension(160, 20));
        jLabel8.setText("Fallas");
        jLabel8.setFont(new Font("Tahoma", 0, 16));
        jLabel8.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel8.setMaximumSize(new Dimension(160, 20));
        jLabel8.setSize(new Dimension(160, 20));
        jLabel8.setPreferredSize(new Dimension(160, 20));
        jLabel8.setToolTipText("Número de fallas, las fallas se producen por hacer click muy lento o muy rápido");
        jLabel8.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    jLabel8_mouseEntered(e);
                }

                public void mouseExited(MouseEvent e) {
                    jLabel8_mouseExited(e);
                }
            });
        jLabel9.setText("0");
        jLabel9.setFont(new Font("Tahoma", 0, 16));
        jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel9.setMaximumSize(new Dimension(160, 20));
        jLabel9.setSize(new Dimension(160, 20));
        jLabel9.setPreferredSize(new Dimension(160, 20));
        jLabel10.setText("Click sin fallas");
        jLabel10.setFont(new Font("Tahoma", 0, 16));
        jLabel10.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel10.setMaximumSize(new Dimension(160, 20));
        jLabel10.setOpaque(true);
        jLabel10.setBackground(new Color(115, 165, 255));
        jLabel10.setSize(new Dimension(160, 20));
        jLabel10.setPreferredSize(new Dimension(160, 20));
        jLabel10.setToolTipText("Número de click sin fallas, intentar obtener el mayor número de click sin fallas a un ritmo estable de click");
        jLabel10.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    jLabel10_mouseEntered(e);
                }

                public void mouseExited(MouseEvent e) {
                    jLabel10_mouseExited(e);
                }
            });
        jLabel11.setText("0");
        jLabel11.setFont(new Font("Tahoma", 0, 16));
        jLabel11.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel11.setMaximumSize(new Dimension(160, 20));
        jLabel11.setOpaque(true);
        jLabel11.setBackground(new Color(115, 165, 255));
        jLabel11.setSize(new Dimension(160, 20));
        jLabel11.setPreferredSize(new Dimension(160, 20));
        jLabel12.setText("Click x segundos");
        jLabel12.setFont(new Font("Tahoma", 0, 16));
        jLabel12.setSize(new Dimension(160, 20));
        jLabel12.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel12.setMaximumSize(new Dimension(160, 20));
        jLabel12.setPreferredSize(new Dimension(160, 20));
        jLabel12.setToolTipText("Click por segundos, intentar aumentar los click por segundos sin producir fallas");
        jLabel12.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    jLabel12_mouseEntered(e);
                }

                public void mouseExited(MouseEvent e) {
                    jLabel12_mouseExited(e);
                }
            });
        jLabel13.setText("0");
        jLabel13.setFont(new Font("Tahoma", 0, 16));
        jLabel13.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel13.setMaximumSize(new Dimension(160, 20));
        jLabel13.setSize(new Dimension(160, 20));
        jLabel13.setPreferredSize(new Dimension(160, 20));
        jLabel2.setMaximumSize(new Dimension(160, 20));
        jLabel2.setSize(new Dimension(160, 20));
        jMenu1.setText("Archivo");
        jMenuItem1.setText("Salir");
        jMenuItem1.setIcon(IconoRaton32);
        jMenuItem1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jMenuItem1_actionPerformed(e);
                }
            });
        jLabel14.setText("Ayuda");
        jLabel14.setFont(new Font("Tahoma", 0, 14));
        jLabel14.setOpaque(true);
        jLabel14.setBackground(Color.white);
        jMenu2.setText("Ayuda");
        jMenuItem2.setText("Click x Segundos - Jitter Click");
        jMenuItem2.setIcon(IconoAyuda);
        jMenuItem2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jMenuItem2_actionPerformed(e);
                }
            });
        segundos.start();
    }
    private int totalDeClick = 0;
    private int clickSinFallas = 0;
    private float clickXSegundos = 0;
    private int fallas = -1;
    private int nBoton = 0;
    private int segundosSinFallas = 1;
    private void jPanel1_mouseClicked(MouseEvent e) {
        totalDeClick=totalDeClick+1;
        clickSinFallas=e.getClickCount();
        nBoton=e.getButton();
        if(clickSinFallas<=1){
            segundos.segundos=1;
            fallas=fallas+1;
        }else{
            segundosSinFallas = segundos.segundos; 
            clickXSegundos = (float)clickSinFallas/(float)segundosSinFallas;
        }
        this.jLabel3.setText(""+segundosSinFallas);
        this.jLabel5.setText(""+nBoton);
        this.jLabel7.setText(""+totalDeClick);
        this.jLabel9.setText(""+fallas);
        this.jLabel11.setText(""+clickSinFallas);
        this.jLabel13.setText(String.format("%.1f", clickXSegundos));
    }
    private static VentanaPrincipal vp = new VentanaPrincipal();
    public static void main(String[] args) {
        vp.setDefaultCloseOperation(vp.EXIT_ON_CLOSE);
        vp.setExtendedState(vp.MAXIMIZED_BOTH);
        vp.setVisible(true);
    }

    private void jButton1_actionPerformed(ActionEvent e) {
        this.jLabel3.setText("0");
        this.jLabel5.setText("0");
        this.jLabel7.setText("0");
        this.jLabel9.setText("0");
        this.jLabel11.setText("0");
        this.jLabel13.setText("0");        
        totalDeClick = 0; clickSinFallas = 0; clickXSegundos = 0; fallas = -1; nBoton = 0; segundosSinFallas=1;
        segundos.segundosTotal=1;
        
    }

    
    private void jMenuItem1_actionPerformed(ActionEvent e) {
        System.exit(0);
    }

    private void jLabel1_mouseEntered(MouseEvent e) {
        jLabel14.setText(jLabel1.getText() + " -> " + jLabel1.getToolTipText() );
    }

    private void jLabel1_mouseExited(MouseEvent e) {
        jLabel14.setText("");
    }

    private void jLabel4_mouseEntered(MouseEvent e) {
        jLabel14.setText(jLabel4.getText() + " -> " + jLabel4.getToolTipText() );
    }

    private void jLabel6_mouseEntered(MouseEvent e) {
        jLabel14.setText(jLabel6.getText() + " -> " + jLabel6.getToolTipText() );
    }

    private void jLabel8_mouseEntered(MouseEvent e) {
        jLabel14.setText(jLabel8.getText() + " -> " + jLabel8.getToolTipText() );
    }

    private void jLabel10_mouseEntered(MouseEvent e) {
        jLabel14.setText(jLabel10.getText() + " -> " + jLabel10.getToolTipText() );
    }

    private void jLabel12_mouseEntered(MouseEvent e) {
        jLabel14.setText(jLabel12.getText() + " -> " + jLabel12.getToolTipText() );
    }

    private void jLabel4_mouseExited(MouseEvent e) {
        jLabel14.setText("");
    }

    private void jLabel6_mouseExited(MouseEvent e) {
        jLabel14.setText("");
    }

    private void jLabel8_mouseExited(MouseEvent e) {
        jLabel14.setText("");
    }

    private void jLabel10_mouseExited(MouseEvent e) {
        jLabel14.setText("");
    }

    private void jLabel12_mouseExited(MouseEvent e) {
        jLabel14.setText("");
    }

    private void jPanel1_mouseEntered(MouseEvent e) {
        jLabel14.setText("Hacer click a un ritmo estable sobre la imagen del ratón" );
    }

    private void jPanel1_mouseExited(MouseEvent e) {
        jLabel14.setText("Ayuda");
    }

    Ayuda ayuda = new Ayuda();
    private void jMenuItem2_actionPerformed(ActionEvent e) {
        ayuda.setLocationRelativeTo(null);
        ayuda.setVisible(true);
    }
}
