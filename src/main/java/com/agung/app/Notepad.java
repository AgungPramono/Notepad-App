/*
 * Silahkan digunakan dengan bebas / dimodifikasi
 * Dengan tetap mencantumkan nama @author dan Referensi / Source
 * Terima Kasih atas Kerjasamanya.
 */
package com.agung.app;

import java.awt.Color;
import java.awt.Font;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

/**
 *
 * @author Personal
 */
public class Notepad extends javax.swing.JFrame {

    private final String default_title = "Notepad App v0.1b";
    private String title = default_title;
    private Boolean is_saved = false;
    private String file_path = "";
    protected UndoManager undo = new UndoManager();
    public Notepad() {
        initComponents();
        setTitle(default_title);
        txtArea.setFont(new Font("Ubuntu Mono", Font.PLAIN, 15));
        setLocationRelativeTo(null);
        txtArea.setAutoscrolls(true);
        txtArea.setCaretPosition(0);
        txtArea.getDocument().addUndoableEditListener(undo);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuNew = new javax.swing.JMenuItem();
        menuOpen = new javax.swing.JMenuItem();
        menuSave = new javax.swing.JMenuItem();
        menuSaveAs = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuPageSetup = new javax.swing.JMenuItem();
        menuPrint = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuClose = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuUndo = new javax.swing.JMenuItem();
        sparator = new javax.swing.JPopupMenu.Separator();
        menuCut = new javax.swing.JMenuItem();
        menuCopy = new javax.swing.JMenuItem();
        menuPaste = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuSelectAll = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuFontColor = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtArea.setColumns(20);
        txtArea.setRows(5);
        txtArea.setToolTipText("");
        txtArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(txtArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        menuNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuNew.setText("New");
        menuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNewActionPerformed(evt);
            }
        });
        jMenu1.add(menuNew);

        menuOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuOpen.setText("Open. . . . . ");
        menuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpenActionPerformed(evt);
            }
        });
        jMenu1.add(menuOpen);

        menuSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuSave.setText("Save");
        menuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveActionPerformed(evt);
            }
        });
        jMenu1.add(menuSave);

        menuSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuSaveAs.setText("Save As. . . . ");
        menuSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveAsActionPerformed(evt);
            }
        });
        jMenu1.add(menuSaveAs);
        jMenu1.add(jSeparator1);

        menuPageSetup.setText("Page Setup . . . ");
        menuPageSetup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPageSetupActionPerformed(evt);
            }
        });
        jMenu1.add(menuPageSetup);

        menuPrint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuPrint.setText("Print . . . ");
        menuPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrintActionPerformed(evt);
            }
        });
        jMenu1.add(menuPrint);
        jMenu1.add(jSeparator2);

        menuClose.setText("Exit");
        menuClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCloseActionPerformed(evt);
            }
        });
        jMenu1.add(menuClose);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        menuUndo.setText("Undo");
        menuUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUndoActionPerformed(evt);
            }
        });
        jMenu2.add(menuUndo);
        jMenu2.add(sparator);

        menuCut.setText("Cut");
        menuCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCutActionPerformed(evt);
            }
        });
        jMenu2.add(menuCut);

        menuCopy.setText("Copy");
        menuCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCopyActionPerformed(evt);
            }
        });
        jMenu2.add(menuCopy);

        menuPaste.setText("Paste");
        menuPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPasteActionPerformed(evt);
            }
        });
        jMenu2.add(menuPaste);
        jMenu2.add(jSeparator4);

        menuSelectAll.setText("Select All");
        menuSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSelectAllActionPerformed(evt);
            }
        });
        jMenu2.add(menuSelectAll);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Format");

        menuFontColor.setText("Font Color");
        menuFontColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFontColorActionPerformed(evt);
            }
        });
        jMenu3.add(menuFontColor);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("About");

        jMenuItem1.setText("About");
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNewActionPerformed
       title = default_title;
       this.setTitle(title);
       is_saved = false;
       txtArea.setText("");
    }//GEN-LAST:event_menuNewActionPerformed

    private void menuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpenActionPerformed
       JFileChooser open = new JFileChooser();
        if(open == null){
           //lakukan filter pada format file
           open = new JFileChooser(System.getProperty("user.home"));
           open.setFileSelectionMode(JFileChooser.FILES_ONLY);
           open.setFileFilter(new FileNameExtensionFilter("txt","txt"));
       }
       int option = open.showOpenDialog(open);
        if(option == JFileChooser.APPROVE_OPTION){
            txtArea.setText("");
            try{
                //ambil file dari direktori file
                Scanner scan = new Scanner(new FileReader(open.getSelectedFile().getPath()));
                //tampilkan isi file kedalam textfile
                while(scan.hasNext()){
                    txtArea.append(scan.nextLine()+"\n");
                    title = open.getSelectedFile().getName()+" - "+default_title;
                    this.setTitle(title);
                    is_saved = true;
                    file_path = open.getSelectedFile().getPath();
                }
            }catch(FileNotFoundException ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_menuOpenActionPerformed

    private void menuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaveActionPerformed
       if(is_saved == true){
           try(BufferedWriter out = new BufferedWriter(new FileWriter(file_path)))
           {
               out.write(txtArea.getText());
               title = title.substring(0);
               this.setTitle(title);
           } catch (IOException ex) {
               ex.printStackTrace();
           }
       }
       else{
           JFileChooser save = new JFileChooser();
        int option = save.showSaveDialog(save);
        if(option == JFileChooser.APPROVE_OPTION){
            try{
                try(BufferedWriter out = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()))){
                    out.write(txtArea.getText());
                }
                title = save.getSelectedFile().getName()+" - "+default_title;
                this.setTitle(title);
                is_saved = true;
                file_path = save.getSelectedFile().getPath();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
       }
    }//GEN-LAST:event_menuSaveActionPerformed

    private void menuSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaveAsActionPerformed
        JFileChooser saveAs = new JFileChooser();
        int option = saveAs.showSaveDialog(saveAs);
        if(option == JFileChooser.APPROVE_OPTION){
            try{
                try(BufferedWriter out = new BufferedWriter(new FileWriter(saveAs.getSelectedFile().getPath()))){
                    out.write(txtArea.getText());
                }
                title = saveAs.getSelectedFile().getName()+" - "+default_title;
                this.setTitle(title);
                is_saved = true;
                file_path = saveAs.getSelectedFile().getPath();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_menuSaveAsActionPerformed

    private void menuCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCloseActionPerformed
       System.exit(0);
    }//GEN-LAST:event_menuCloseActionPerformed

    private void menuPageSetupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPageSetupActionPerformed
        PrinterJob pj = PrinterJob.getPrinterJob();
        PageFormat pf = pj.pageDialog(pj.defaultPage());
    }//GEN-LAST:event_menuPageSetupActionPerformed

    private void menuPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrintActionPerformed
        try {
            txtArea.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Notepad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuPrintActionPerformed

    
    private void menuUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUndoActionPerformed
        try{
            undo.undo();
        }catch(CannotUndoException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_menuUndoActionPerformed

    private void menuCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCutActionPerformed
        txtArea.cut();
    }//GEN-LAST:event_menuCutActionPerformed

    private void menuCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCopyActionPerformed
       txtArea.copy();
    }//GEN-LAST:event_menuCopyActionPerformed

    private void menuPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPasteActionPerformed
        txtArea.paste();
    }//GEN-LAST:event_menuPasteActionPerformed

    private void menuSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSelectAllActionPerformed
        txtArea.selectAll();
    }//GEN-LAST:event_menuSelectAllActionPerformed

    private void menuFontColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFontColorActionPerformed
        Color newColor = JColorChooser.showDialog(null, "Color Chooser", Color.BLACK);
        if(newColor != null){
            txtArea.setBackground(newColor);
        }
    }//GEN-LAST:event_menuFontColorActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenuItem menuClose;
    private javax.swing.JMenuItem menuCopy;
    private javax.swing.JMenuItem menuCut;
    private javax.swing.JMenuItem menuFontColor;
    private javax.swing.JMenuItem menuNew;
    private javax.swing.JMenuItem menuOpen;
    private javax.swing.JMenuItem menuPageSetup;
    private javax.swing.JMenuItem menuPaste;
    private javax.swing.JMenuItem menuPrint;
    private javax.swing.JMenuItem menuSave;
    private javax.swing.JMenuItem menuSaveAs;
    private javax.swing.JMenuItem menuSelectAll;
    private javax.swing.JMenuItem menuUndo;
    private javax.swing.JPopupMenu.Separator sparator;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
