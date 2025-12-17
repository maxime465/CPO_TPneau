import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class fenetregraphiques extends JFrame {

    private GrilleDeJeu grille;
    private int nbCoups;
    
    private JPanel PanneauDiagonales; 

    public fenetregraphiques() {
        initComponents();  
        this.setSize(800, 800);
        this.setLocationRelativeTo(null);

        int nbLignes = 5;
        int nbColonnes = 5;
        this.grille = new GrilleDeJeu(nbLignes, nbColonnes);
        this.nbCoups = 0;

        initialiserPartie();
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));

        
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                CelluleGraphique cg = new CelluleGraphique(grille.matriceCellules[i][j]);
                PanneauGrille.add(cg);
            }
        }

       
        Panneauligne.setLayout(new GridLayout(nbLignes, 1));
        for (int i = 0; i < nbLignes; i++) {
            JButton boutonLigne = new JButton("Ligne " + i);
            final int index = i;
            boutonLigne.addActionListener(e -> {
                grille.activerLigneDeCellules(index);
                rafraichirGrille();
            });
            Panneauligne.add(boutonLigne);
        }

       
        Panneaucolonne.setLayout(new GridLayout(1, nbColonnes));
        for (int j = 0; j < nbColonnes; j++) {
            JButton boutonCol = new JButton("Col " + j);
            final int index = j;
            boutonCol.addActionListener(e -> {
                grille.activerColonneDeCellules(index);
                rafraichirGrille();
            });
            Panneaucolonne.add(boutonCol);
        }

      
        PanneauDiagonales.setLayout(new GridLayout(1, 2));
        JButton diagDesc = new JButton("Diagonale Descendante");
        diagDesc.addActionListener(e -> {
            grille.activerDiagonaleDescendante();
            rafraichirGrille();
        });
        JButton diagMont = new JButton("Diagonale Montante");
        diagMont.addActionListener(e -> {
            grille.activerDiagonaleMontante();
            rafraichirGrille();
        });
        PanneauDiagonales.add(diagDesc);
        PanneauDiagonales.add(diagMont);

        
        remplirGrilleAleatoire();
        rafraichirGrille();
    }

    private void initialiserPartie() {
        nbCoups = 0;
        grille.eteindreToutesLesCellules();
    }

    private void remplirGrilleAleatoire() {
        Random rand = new Random();
        int nbLignes = grille.matriceCellules.length;
        int nbColonnes = grille.matriceCellules[0].length;

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (rand.nextBoolean()) {
                    grille.matriceCellules[i][j].activerCellule();
                }
            }
        }
    }

    private void rafraichirGrille() {
        for (Component c : PanneauGrille.getComponents()) {
            if (c instanceof CelluleGraphique cg) {
                cg.rafraichir();
            }
        }
        nbCoups++;
        if (grille.cellulesToutesEteintes()) {
            JOptionPane.showMessageDialog(this, "Bravo ! Tu as gagné en " + nbCoups + " coups !");
        }
    }

    


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        Panneaucolonne = new javax.swing.JPanel();
        Panneauligne = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 400, 400));

        Panneaucolonne.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout PanneaucolonneLayout = new javax.swing.GroupLayout(Panneaucolonne);
        Panneaucolonne.setLayout(PanneaucolonneLayout);
        PanneaucolonneLayout.setHorizontalGroup(
            PanneaucolonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        PanneaucolonneLayout.setVerticalGroup(
            PanneaucolonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(Panneaucolonne, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 500, 60));

        Panneauligne.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout PanneauligneLayout = new javax.swing.GroupLayout(Panneauligne);
        Panneauligne.setLayout(PanneauligneLayout);
        PanneauligneLayout.setHorizontalGroup(
            PanneauligneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        PanneauligneLayout.setVerticalGroup(
            PanneauligneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(Panneauligne, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 80, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void creerPanneaux() {

        PanneauGrille = new JPanel();
        Panneauligne = new JPanel();
        Panneaucolonne = new JPanel();
        PanneauDiagonales = new JPanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        PanneauGrille.setBounds(150, 80, 400, 400);
        PanneauGrille.setBackground(new Color(102, 255, 102));
        getContentPane().add(PanneauGrille);

        Panneauligne.setBounds(50, 80, 80, 400);
        Panneauligne.setBackground(new Color(0, 0, 255));
        getContentPane().add(Panneauligne);

        Panneaucolonne.setBounds(150, 10, 400, 60);
        Panneaucolonne.setBackground(new Color(255, 0, 51));
        getContentPane().add(Panneaucolonne);

        PanneauDiagonales.setBounds(560, 80, 200, 60);
        PanneauDiagonales.setBackground(new Color(255, 255, 0));
        getContentPane().add(PanneauDiagonales);

        pack();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JPanel Panneaucolonne;
    private javax.swing.JPanel Panneauligne;
    // End of variables declaration//GEN-END:variables
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new fenetregraphiques().setVisible(true));
    }

                  
}

