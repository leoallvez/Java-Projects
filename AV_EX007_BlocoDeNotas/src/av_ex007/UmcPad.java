/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av_ex007;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author marcoaurelio
 */
public class UmcPad extends JFrame {
    private JTextArea txtConteudo;
    private JPanel pnlStatus;
    private JLabel lblStatus;
    
    private JMenuBar brMenus;
    private JMenu mnuArquivo;
    private JMenuItem mnuNovo, mnuAbrir, mnuSalvarComo, mnuSair;
    private JSeparator spDivisao;
    
    private JScrollPane areaRolagem;
    
    public UmcPad() {
        setTitle("UMC Pad - Sem título.txt");
        setBounds(100,100,640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());
        
        txtConteudo = new JTextArea();
        areaRolagem = new JScrollPane(txtConteudo);
        getContentPane().add(areaRolagem, BorderLayout.CENTER);
        
        pnlStatus = new JPanel();
        lblStatus = new JLabel("Ocioso");
        
        pnlStatus.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnlStatus.add(lblStatus);
                
        getContentPane().add(pnlStatus, BorderLayout.SOUTH);
        
        mnuNovo = new JMenuItem("Novo");
        mnuAbrir = new JMenuItem("Abrir...");
        mnuSalvarComo = new JMenuItem("Salvar Como...");
        spDivisao = new JSeparator();
        mnuSair = new JMenuItem("Sair");
        
        mnuArquivo = new JMenu("Arquivo");
        mnuArquivo.add(mnuNovo);
        mnuArquivo.add(mnuAbrir);
        mnuArquivo.add(mnuSalvarComo);
        mnuArquivo.add(spDivisao);
        mnuArquivo.add(mnuSair);
        
        brMenus = new JMenuBar();
        brMenus.add(mnuArquivo);
        
        getContentPane().add(brMenus, BorderLayout.NORTH);
        
        mnuSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        mnuNovo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setTitle("UMC Pad - Sem título.txt");
                txtConteudo.setText("");
            }
        });
        
        mnuSalvarComo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser dlgSalvar = new JFileChooser();
                
                if (dlgSalvar.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                    BufferedWriter writer = null;
                    try {                    
                        writer = new BufferedWriter( new FileWriter(dlgSalvar.getSelectedFile().getAbsolutePath()));
                        writer.write(txtConteudo.getText());
                        setTitle("UMC Pad - " + dlgSalvar.getSelectedFile().getAbsolutePath());
                    } catch (IOException ex) {
                        Logger.getLogger(UmcPad.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        try {
                            writer.close();
                        } catch (IOException ex) {
                            Logger.getLogger(UmcPad.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        });
        
        mnuAbrir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser dlgAbrir = new JFileChooser();
                
                if (dlgAbrir.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    BufferedReader br = null;
                    try {
                        br = new BufferedReader(new FileReader(dlgAbrir.getSelectedFile().getAbsolutePath()));
                        StringBuilder sb = new StringBuilder();
                        String line = br.readLine();
                        while (line != null) {
                            sb.append(line);
                            sb.append(System.lineSeparator());
                            line = br.readLine();
                        }               
                        txtConteudo.setText(sb.toString());
                        
                        setTitle("UMC Pad - " + dlgAbrir.getSelectedFile().getAbsolutePath());
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(UmcPad.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(UmcPad.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        try {
                            br.close();
                        } catch (IOException ex) {
                            Logger.getLogger(UmcPad.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
        
                }
            }
        });
        
        setVisible(true);
    }
}
