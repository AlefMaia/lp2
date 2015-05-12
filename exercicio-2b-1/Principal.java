
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alunos
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        inputData = new javax.swing.JTextField();
        inputTel = new javax.swing.JTextField();
        inputEnd = new javax.swing.JTextField();
        buttonAdicionar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        buttonRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("Data Nascimento:");

        jLabel3.setText("Telefone:");

        jLabel4.setText("Endereço:");

        buttonAdicionar.setText("Adicionar");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonRemover.setText("Remover");
        buttonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverActionPerformed(evt);
            }
        });

        tableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
            },
            new String [] {
                "Nome", "Data Nascimento", "Telefone", "Endereço"
            }
        ));
        tableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inputEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                                .addComponent(inputTel)
                                .addComponent(inputData)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonAdicionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonRemover)))
                        .addGap(195, 195, 195))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdicionar)
                    .addComponent(buttonSalvar)
                    .addComponent(buttonRemover))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void tableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {                                           
        DefaultTableModel dtm = (DefaultTableModel) tableUsuarios.getModel();
        tableUsuarios.getModel();
        int RowSelected;
        RowSelected = tableUsuarios.getSelectedRow();
        
        if(RowSelected == 0){
            String value1 = dtm.getValueAt(RowSelected, 0).toString();
            String value2 = dtm.getValueAt(RowSelected, 1).toString();
            String value3 = dtm.getValueAt(RowSelected, 2).toString();
            String value4 = dtm.getValueAt(RowSelected, 3).toString();
            inputNome.setText(value1);
            inputData.setText(value2);
            inputTel.setText(value3);
            inputEnd.setText(value4);
            
        }
        else if(RowSelected == 1){
            String value1 = dtm.getValueAt(RowSelected, 0).toString();
            String value2 = dtm.getValueAt(RowSelected, 1).toString();
            String value3 = dtm.getValueAt(RowSelected, 2).toString();
            String value4 = dtm.getValueAt(RowSelected, 3).toString();
            inputNome.setText(value1);
            inputData.setText(value2);
            inputTel.setText(value3);
            inputEnd.setText(value4);
        }
        else if(RowSelected == 2){
            String value1 = dtm.getValueAt(RowSelected, 0).toString();
            String value2 = dtm.getValueAt(RowSelected, 1).toString();
            String value3 = dtm.getValueAt(RowSelected, 2).toString();
            String value4 = dtm.getValueAt(RowSelected, 3).toString();
            inputNome.setText(value1);
            inputData.setText(value2);
            inputTel.setText(value3);
            inputEnd.setText(value4);
        }
        else{
            String value1 = dtm.getValueAt(RowSelected, 0).toString();
            String value2 = dtm.getValueAt(RowSelected, 1).toString();
            String value3 = dtm.getValueAt(RowSelected, 2).toString();
            String value4 = dtm.getValueAt(RowSelected, 3).toString();
            inputNome.setText(value1);
            inputData.setText(value2);
            inputTel.setText(value3);
            inputEnd.setText(value4);
        }
    }                                          

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {                                              
        DefaultTableModel dtm = (DefaultTableModel) tableUsuarios.getModel();
        tableUsuarios.getModel();
        int rowSelected = tableUsuarios.getSelectedRow();
        
        if(rowSelected == -1){
            JOptionPane.showMessageDialog(this, "Selecione uma linha antes de remover");
        }
        else{
            int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover a linha?", "Confirme sua operação: ", JOptionPane.YES_NO_OPTION);
            if(opcao == JOptionPane.YES_OPTION){
                dtm.removeRow(rowSelected);
            }
        }
    }                                             

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {                                                
        DefaultTableModel dtm = (DefaultTableModel) tableUsuarios.getModel();
        tableUsuarios.getModel();
        
        String Nome = inputNome.getText();
        String Data = inputData.getText();
        String Tel = inputTel.getText();
        String End = inputEnd.getText();
        if(Nome.equals("")||(Data.equals(""))||(Tel.equals(""))||(End.equals(""))){
            JOptionPane.showMessageDialog(this, "Todas as informações devem ser preenchidas! seu lixo");
        }
        else{
            String a [] = new String [] {Nome, Data, Tel, End};
            dtm.addRow( a );
        }
    }                                               

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        DefaultTableModel dtm = (DefaultTableModel) tableUsuarios.getModel();
        tableUsuarios.getModel();
        
        int RowSelected = tableUsuarios.getSelectedRow();
        if(RowSelected == -1){
            String Nome = inputNome.getText();
            String Data = inputData.getText();
            String Tel = inputTel.getText();
            String End = inputEnd.getText();
            if(Nome.equals("")||(Data.equals(""))||(Tel.equals(""))||(End.equals(""))){
                JOptionPane.showMessageDialog(this, "Todas as informações devem ser preenchidas! seu lixo");
            }
            else{
                String a [] = new String [] {Nome, Data, Tel, End};
                dtm.addRow( a );
            }
        }
        else{
            dtm.setValueAt(inputNome.getText(), RowSelected, 0);
            dtm.setValueAt(inputData.getText(), RowSelected, 1);
            dtm.setValueAt(inputTel.getText(), RowSelected, 2);
            dtm.setValueAt(inputEnd.getText(), RowSelected, 3);
        
        }
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JTextField inputData;
    private javax.swing.JTextField inputEnd;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableUsuarios;
    // End of variables declaration                   

    private JTextField setText(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
