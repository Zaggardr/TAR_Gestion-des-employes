
package ma.projet.fenetre;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.tree.DefaultMutableTreeNode;
import ma.projet.beans.Developpeur;
import ma.projet.beans.DirecteurGeneral;
import ma.projet.beans.Manager;
import ma.projet.service.DeveloppeurService;
import ma.projet.service.ManagerService;


public class CouchePresentation extends javax.swing.JFrame {

    private ArrayList<String> devs = new ArrayList<String>();
    private DefaultListModel liste = new DefaultListModel();

    public CouchePresentation() {
        initComponents();

    }

  
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Entreprise");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("RAMI (Directeur Général)");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("AMALI (Développeur)");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("SADDIK (Manager)");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("SEBIHI (Développeur)");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("NOUARI (Développeur)");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        jScrollPane3.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addComponent(jScrollPane3)
        );

        pack();
    }                        

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        liste.clear();
        DeveloppeurService ds = new DeveloppeurService();
        ManagerService ms = new ManagerService();
        DefaultMutableTreeNode node = null;
        if (jTree1.getSelectionPath() != null) {
            node = (DefaultMutableTreeNode) jTree1.getSelectionPath().getLastPathComponent();
            if (node.getParent().toString().equals("RAMI (Directeur Général)")) {
                if (node.toString().equals("AMALI (Développeur)")) {
                    Developpeur dev = ds.getById(3);

                    if (dev != null) {
                        devs.add(dev.toString());
                        liste.addElement(dev.toString()); 
                        jList1.setModel(liste);
                    } else {
                        System.out.println("Le développeur avec ID 1 n'existe pas."); 
                    }
                } else { 
                    Manager manag = ms.getById(1);

                    
                    if (manag != null) {
                        devs.add(manag.toString());
                        liste.addElement(manag.toString());
                        jList1.setModel(liste);
                    } else {
                        System.out.println("Le développeur avec ID 1 n'existe pas."); 
                    }
                }
            } else if (node.getParent().toString().equals("SADDIK (Manager)")) {
                if (node.toString().equals("NOUARI (Développeur)")) {
                   
                    Developpeur dev = ds.getById(2);

                    
                    if (dev != null) {
                        devs.add(dev.toString());
                        liste.addElement(dev.toString()); 
                        jList1.setModel(liste);
                    } else {
                        System.out.println("Le développeur avec ID 1 n'existe pas."); 
                    }
                } else {
      
                    Developpeur dev = ds.getById(1);

                   
                    if (dev != null) {
                        devs.add(dev.toString());
                        liste.addElement(dev.toString()); 
                        jList1.setModel(liste);
                    } else {
                        System.out.println("Le développeur avec ID 1 n'existe pas."); 
                    }
                }
            }
            if (node.getParent().toString().equals("Entreprise")) {
                if (node.toString().equals("RAMI (Directeur Général)")) {
                    
                    Manager dg =  ms.getById(2);

                    
                    if (dg != null) {
                        devs.add(dg.toString());
                        liste.addElement(dg.toString()); 
                        jList1.setModel(liste);
                    } else {
                        System.out.println("Le développeur avec ID 1 n'existe pas."); 
                    }
                }
            }
    }//GEN-LAST:event_jTree1MouseClicked
    }

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CouchePresentation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CouchePresentation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CouchePresentation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CouchePresentation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CouchePresentation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
