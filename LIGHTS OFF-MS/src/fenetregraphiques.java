import javax.swing.*;
import java.awt.*;

public class fenetregraphiques extends JFrame {

    // Déclarations des variables
    private GrilleDeJeu grille;
    private int nbCoups;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    // </editor-fold>
    


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
    
    public fenetregraphiques() {
        initComponents();  // initialise les panneaux
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);

        int nbLignes = 5;
        int nbColonnes = 5;
        this.grille = new GrilleDeJeu(nbLignes, nbColonnes);
        this.nbCoups = 0;

        initialiserPartie();

        // Grille principale
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                CelluleGraphique cg = new CelluleGraphique(grille.matriceCellules[i][j]);
                PanneauGrille.add(cg);
            }
        }

        // Boutons lignes
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

        // Boutons colonnes
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
    }

    private void creerPanneaux() {
        PanneauGrille = new JPanel();
        Panneauligne = new JPanel();
        Panneaucolonne = new JPanel();

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
    }

    private void initialiserPartie() {
        nbCoups = 0;
        grille.eteindreToutesLesCellules();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JPanel Panneaucolonne;
    private javax.swing.JPanel Panneauligne;
    // End of variables declaration//GEN-END:variables
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new fenetregraphiques().setVisible(true));
    }
}
