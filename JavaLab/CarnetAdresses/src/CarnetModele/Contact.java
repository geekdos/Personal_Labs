/*
#	Java Les fondamentaux
#	A. Tasso
#	Carnet d'adresses
#	Fichier  : Contact.java
*/

package CarnetModele;

import java.awt.Color;
import javax.swing.ImageIcon;

// La classe Saisie hérite des comportements du composant JPanel
public class Contact extends javax.swing.JPanel {


    // Propriétés
    private String [] listeInfos;
    private int id;

    // Constructeur, les infos relatives à un contact sont passées en paramètre du constructeur
    // sous la forme d'un tableau (nom, prénom, ... et d'un identifiant
    public Contact(String [] liste, int ni) {
        setVisible(true);
         // Afficher les composants créés en mode Design
        initComponents();
        // Initialiser les données
        setListeInfos(liste);
        setId(ni);
        // Colorier un contact sur deux en gris
        colorierIdPair();
        // Afficher les infos (la photo, le prénom et le nom)
        afficheInfos();

    }
    // Méthodes d'accès en écriture
    public void  setListeInfos(String [] tmp){
        listeInfos = new String[tmp.length];
        listeInfos = tmp;
    }
      public void  setId(int tmp){
        id = tmp;
    }
    // Méthodes d'accès en lecture
      public String   [] getListeInfos(){
       return listeInfos;
    }
      public int  getId(){
       return id;
    }
    // Placer les nom, prénom et photo dans les labels respectifs
    private void afficheInfos(){
        prenomLbl.setText(listeInfos[0]);
        nomLbl.setText(listeInfos[1]);
        affichePhoto();
    }
    // Afficher la photo réduite du contact
    private void affichePhoto(){
        // Créer un icone
        ImageIcon iconPhoto = new ImageIcon(listeInfos[2]);
        // Transformer l'icone en Image
        java.awt.Image uneImage = iconPhoto.getImage();
        // Réduire la taille de l'image de 50 %
        uneImage = uneImage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        // Transformer l'image en Icon
        iconPhoto.setImage(uneImage);
        photoLbl.setIcon(iconPhoto);
        
    }
    // Colorier en Blanc un label passé en paramètre
    private void setCouleur(javax.swing.JLabel tmp ){
                  tmp.setBackground(Color.white);
                  tmp.setOpaque(true);
     }

    private void colorierIdPair(){
        // Si l'id du contact est pair
        if(id % 2 == 0){
            setCouleur(nomLbl);
            setCouleur(prenomLbl);
            setCouleur(photoLbl);
        }
    }





    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        photoLbl = new javax.swing.JLabel();
        prenomLbl = new javax.swing.JLabel();
        nomLbl = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(390, 50));
        setMinimumSize(new java.awt.Dimension(390, 50));
        setPreferredSize(new java.awt.Dimension(380, 50));
        setRequestFocusEnabled(false);
        setLayout(new java.awt.GridLayout(1, 3));
        add(photoLbl);

        prenomLbl.setText("prénom");
        add(prenomLbl);

        nomLbl.setText("nom");
        add(nomLbl);
    }// </editor-fold>//GEN-END:initComponents
    // Déclaration de variables créées par NetBeans par l'intermédiaire du mode Design
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel nomLbl;
    private javax.swing.JLabel photoLbl;
    private javax.swing.JLabel prenomLbl;
    // End of variables declaration//GEN-END:variables

}
