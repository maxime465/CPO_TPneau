
public class fenetregraphiques extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(fenetregraphiques.class.getName());


    public fenetregraphiques() {
        initComponents();
       this.setSize(600, 600);
        this.setLocationRelativeTo(null);

    int nbLignes = 5;
    int nbColonnes = 5;
    this.grille = new GrilleDeJeu(nbLignes, nbColonnes);
this.nbCoups = 0;
initialiserPartie();
 PanneauGrille.setLayout(new java.awt.GridLayout(nbLignes, nbColonnes));

    for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            javax.swing.JButton bouton_cellule = new javax.swing.JButton();
            PanneauGrille.add(bouton_cellule);
        }
    }
        
    }
  private GrilleDeJeu grille;
private int nbCoups;

public void initialiserPartie() {
    nbCoups = 0;
    grille.eteindreToutesLesCellules();
    
}

    
    @SuppressWarnings("unchecked")
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

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(() -> new fenetregraphiques().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JPanel Panneaucolonne;
    private javax.swing.JPanel Panneauligne;
    // End of variables declaration//GEN-END:variables
}
