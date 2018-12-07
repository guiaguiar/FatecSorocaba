/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoCurso;
import fatec.poo.model.Curso;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author CHRISTIANRODRIGOCORR
 */
public class GuiCurso extends javax.swing.JFrame {

    /**
     * Creates new form GuiCurso
     */
    public GuiCurso() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        TfSiglaCurso = new javax.swing.JTextField();
        TfNomeCurso = new javax.swing.JTextField();
        TfCargaHor = new javax.swing.JTextField();
        TfValCurso = new javax.swing.JTextField();
        TfProgramCurso = new javax.swing.JTextField();
        BtConsultar = new javax.swing.JButton();
        BtAlterar = new javax.swing.JButton();
        BtExcluir = new javax.swing.JButton();
        BtInserir = new javax.swing.JButton();
        BtSair = new javax.swing.JButton();
        LbSiglaCurso = new javax.swing.JLabel();
        LbNomeCurso = new javax.swing.JLabel();
        LbCargaHoraria = new javax.swing.JLabel();
        LbValorCurso = new javax.swing.JLabel();
        LbProgramaCurso = new javax.swing.JLabel();
        TfValorHor = new javax.swing.JTextField();
        LbDataVigencia = new javax.swing.JLabel();
        LbValorHorInstrutor = new javax.swing.JLabel();
        FtfDataVig = new javax.swing.JFormattedTextField();

        jTextField1.setText("jTextField1");

        setTitle("Cadastrar Curso");
        setName("FrameCadastroCurso"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TfSiglaCurso.setName(""); // NOI18N
        TfSiglaCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfSiglaCursoActionPerformed(evt);
            }
        });

        TfNomeCurso.setEnabled(false);

        TfCargaHor.setEnabled(false);

        TfValCurso.setEnabled(false);

        TfProgramCurso.setEnabled(false);

        BtConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        BtConsultar.setText("Consultar");
        BtConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConsultarActionPerformed(evt);
            }
        });

        BtAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        BtAlterar.setText("Alterar");
        BtAlterar.setEnabled(false);
        BtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAlterarActionPerformed(evt);
            }
        });

        BtExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        BtExcluir.setText("Excluir");
        BtExcluir.setEnabled(false);
        BtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtExcluirActionPerformed(evt);
            }
        });

        BtInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        BtInserir.setText("Inserir");
        BtInserir.setEnabled(false);
        BtInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtInserirActionPerformed(evt);
            }
        });

        BtSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        BtSair.setText("Sair");
        BtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairActionPerformed(evt);
            }
        });

        LbSiglaCurso.setText("Sigla Curso");

        LbNomeCurso.setText("Nome Curso");

        LbCargaHoraria.setText("Carga Horária");

        LbValorCurso.setText("Valor Curso");

        LbProgramaCurso.setText("Programa do Curso");

        TfValorHor.setEnabled(false);

        LbDataVigencia.setText("Data de Vigência");

        LbValorHorInstrutor.setText("Valor hora Instrutor");

        try {
            FtfDataVig.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FtfDataVig.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbValorCurso, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LbProgramaCurso, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LbCargaHoraria, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LbNomeCurso, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LbSiglaCurso, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TfCargaHor, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(TfProgramCurso)
                            .addComponent(TfValCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TfSiglaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TfNomeCurso))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LbDataVigencia)
                            .addComponent(LbValorHorInstrutor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FtfDataVig, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(TfValorHor)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TfSiglaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbSiglaCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TfNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbNomeCurso)
                    .addComponent(LbDataVigencia)
                    .addComponent(FtfDataVig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TfCargaHor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbCargaHoraria)
                    .addComponent(TfValorHor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbValorHorInstrutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TfValCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbValorCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TfProgramCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbProgramaCurso))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtInserir)
                    .addComponent(BtConsultar)
                    .addComponent(BtAlterar)
                    .addComponent(BtExcluir)
                    .addComponent(BtSair))
                .addGap(30, 30, 30))
        );

        TfSiglaCurso.getAccessibleContext().setAccessibleName("Sigla do Curso");
        TfNomeCurso.getAccessibleContext().setAccessibleName("Nome do Curso");
        TfCargaHor.getAccessibleContext().setAccessibleName("Carga Horária");
        TfValCurso.getAccessibleContext().setAccessibleName("Valor do Curso");
        TfProgramCurso.getAccessibleContext().setAccessibleName("Programa do Curso");
        BtConsultar.getAccessibleContext().setAccessibleName("Botão Consultar");
        BtAlterar.getAccessibleContext().setAccessibleName("Botão Alterar");
        BtExcluir.getAccessibleContext().setAccessibleName("Botão Excluir");
        BtInserir.getAccessibleContext().setAccessibleName("Botão Inserir");
        BtSair.getAccessibleContext().setAccessibleName("Botão Sair");
        TfValorHor.getAccessibleContext().setAccessibleName("Valor da Hora do Instrutor");
        FtfDataVig.getAccessibleContext().setAccessibleName("Data de Vigêmcia");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConsultarActionPerformed
        curso = null;
        curso = daoCurso.consultar(TfSiglaCurso.getText());
        
        if(curso == null){
            BtConsultar.setEnabled(false);
            BtAlterar.setEnabled(false);
            BtExcluir.setEnabled(false);
            BtInserir.setEnabled(true);
            
            TfSiglaCurso.setEnabled(false);
            TfCargaHor.setEnabled(true);
            TfNomeCurso.setEnabled(true);
            TfProgramCurso.setEnabled(true);
            TfValCurso.setEnabled(true);
            TfValorHor.setEnabled(true);
            FtfDataVig.setEnabled(true);
            
            TfNomeCurso.requestFocus();
        }else{
            TfNomeCurso.setText(curso.getNome());
            TfCargaHor.setText(Integer.toString(curso.getCargaHoraria()));
            TfProgramCurso.setText(curso.getPrograma());
            TfValCurso.setText(Double.toString(curso.getValor()));
            TfValorHor.setText(Double.toString(curso.getValorHoraInstrutor()));
            FtfDataVig.setText(curso.getDataVigencia());
        
            BtConsultar.setEnabled(false);
            BtInserir.setEnabled(false);
            BtAlterar.setEnabled(true);
            BtExcluir.setEnabled(true);
            
            TfSiglaCurso.setEnabled(false);
            TfCargaHor.setEnabled(true);
            TfNomeCurso.setEnabled(true);
            TfProgramCurso.setEnabled(true);
            TfValCurso.setEnabled(true);
            TfValorHor.setEnabled(true);
            FtfDataVig.setEnabled(true);
            TfNomeCurso.requestFocus();
        }
        
        
    }//GEN-LAST:event_BtConsultarActionPerformed

    private void TfSiglaCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfSiglaCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfSiglaCursoActionPerformed

    private void BtInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtInserirActionPerformed
        curso = new Curso(TfSiglaCurso.getText(), TfNomeCurso.getText());
        curso.setCargaHoraria(Integer.parseInt(TfCargaHor.getText()));
        curso.setValor(Double.parseDouble(TfValCurso.getText()));
        curso.setDataVigencia(FtfDataVig.getText());
        curso.setPrograma(TfProgramCurso.getText());
        curso.setValorHoraInstrutor(Double.parseDouble(TfValorHor.getText()));
        daoCurso.inserir(curso);
        
        TfSiglaCurso.setText("");
        TfNomeCurso.setText("");
        TfProgramCurso.setText("");
        TfValCurso.setText("");
        TfValorHor.setText("");
        TfCargaHor.setText("");
        FtfDataVig.setText("");
        
        BtInserir.setEnabled(false);
        BtConsultar.setEnabled(true);
        
        TfSiglaCurso.setEnabled(true);
        TfNomeCurso.setEnabled(false);
        TfProgramCurso.setEnabled(false);
        TfValCurso.setEnabled(false);
        TfValorHor.setEnabled(false);
        FtfDataVig.setEnabled(false);
        TfCargaHor.setEnabled(false);
        
    }//GEN-LAST:event_BtInserirActionPerformed

    private void BtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?")== 0){//Sim
           curso.setNome(TfNomeCurso.getText());
           curso.setCargaHoraria(Integer.parseInt(TfCargaHor.getText()));
           curso.setValor(Double.parseDouble(TfValCurso.getText()));
           curso.setDataVigencia(FtfDataVig.getText());
           curso.setValorHoraInstrutor(Double.parseDouble(TfValorHor.getText()));
           curso.setPrograma(TfProgramCurso.getText());
           
           daoCurso.alterar(curso);
        } 
        
        TfSiglaCurso.setText("");
        TfNomeCurso.setText("");
        TfProgramCurso.setText("");
        TfValCurso.setText("");
        TfValorHor.setText("");
        TfCargaHor.setText("");
        FtfDataVig.setText("");
        
        TfSiglaCurso.setEnabled(true);
        TfNomeCurso.setEnabled(false);
        TfProgramCurso.setEnabled(false);
        TfValCurso.setEnabled(false);
        TfValorHor.setEnabled(false);
        FtfDataVig.setEnabled(false);
        TfCargaHor.setEnabled(false);
        
        TfSiglaCurso.requestFocus();
        
        BtConsultar.setEnabled(true);
        BtInserir.setEnabled(false);
        BtAlterar.setEnabled(false);
        BtExcluir.setEnabled(false);
    }//GEN-LAST:event_BtAlterarActionPerformed

    private void BtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0){
            daoCurso.excluir(curso); 

            TfSiglaCurso.setText("");
            TfNomeCurso.setText("");
            TfProgramCurso.setText("");
            TfValCurso.setText("");
            TfValorHor.setText("");
            TfCargaHor.setText("");
            FtfDataVig.setText("");

            TfSiglaCurso.setEnabled(true);
            TfNomeCurso.setEnabled(false);
            TfProgramCurso.setEnabled(false);
            TfValCurso.setEnabled(false);
            TfValorHor.setEnabled(false);
            FtfDataVig.setEnabled(false);
            TfCargaHor.setEnabled(false);

            TfSiglaCurso.requestFocus();

            BtConsultar.setEnabled(true);
            BtInserir.setEnabled(false);
            BtAlterar.setEnabled(false);
            BtExcluir.setEnabled(false);
        } 
    }//GEN-LAST:event_BtExcluirActionPerformed

    private void BtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairActionPerformed
        dispose();
    }//GEN-LAST:event_BtSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("chris","goku");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoCurso = new DaoCurso(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(GuiCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAlterar;
    private javax.swing.JButton BtConsultar;
    private javax.swing.JButton BtExcluir;
    private javax.swing.JButton BtInserir;
    private javax.swing.JButton BtSair;
    private javax.swing.JFormattedTextField FtfDataVig;
    private javax.swing.JLabel LbCargaHoraria;
    private javax.swing.JLabel LbDataVigencia;
    private javax.swing.JLabel LbNomeCurso;
    private javax.swing.JLabel LbProgramaCurso;
    private javax.swing.JLabel LbSiglaCurso;
    private javax.swing.JLabel LbValorCurso;
    private javax.swing.JLabel LbValorHorInstrutor;
    private javax.swing.JTextField TfCargaHor;
    private javax.swing.JTextField TfNomeCurso;
    private javax.swing.JTextField TfProgramCurso;
    private javax.swing.JTextField TfSiglaCurso;
    private javax.swing.JTextField TfValCurso;
    private javax.swing.JTextField TfValorHor;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    private DaoCurso daoCurso=null;
    private Curso curso=null;
    private Conexao conexao = null;
}