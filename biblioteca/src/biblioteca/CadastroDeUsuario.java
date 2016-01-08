/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Leonardo
 */
public class CadastroDeUsuario extends JFrame{
    private final JPanel principal;
    private final JPanel[] linhas;
    private final String[] tipoDeUsuario;
    private final String[] tipoDeCurso;
    private final String[] areas;
    private final JComboBox comboUsuario;
    private JComboBox comboCurso;
    private JComboBox comboAreas;
    //private final JLabel cadastro;
    private final JLabel usuario;
    private final JLabel ganbi;
    private final JLabel matricula;
    private final JLabel nome;
    private final JLabel senha;
    private final JLabel curso;
    private final JLabel data;
    private final JTextField txtMatricula;
    private final JTextField txtNome;
    private final JTextField txtData;
    private final JPasswordField password;
    private final JButton buscar;
    private final JButton limpar;
    private final JButton incluir;
    private final JButton alterar;
    private final JButton excluir;
    private final JMenuBar jbar;
    private final JMenu jmenu;
    private final JMenuItem cadUsuario;
    private final JMenuItem cadLivro;
    private final JMenuItem pedLivro;
    private final JSeparator separador;
    private final JMenuItem sair;

    public CadastroDeUsuario(){
        
        super("Cadastro");
        setBounds(450, 200, 450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());
        
        tipoDeCurso = new String[]{
            "Zootecnia", "Cinema", "Fisilofia", "Gastronomia", 
            "Historia", "Sistemas de Informação", "Medicina", 
            "Enfermagem", "Direito", "Engenharia Elétrica", 
            "Farmacia", "Quimica", "Fisioterapia", 
            "Medicina Veterinária", "Biblioteconomia", 
            "Odontologia", "Psicologia", "Radiologia", 
            "Administração", "Jornalismo", 
            "Letras", "Música", "Análise de Sistemas"
        };
        areas = new String[]{"Humanas","Exatas","Biológicas"};
        tipoDeUsuario = new String[] {"Aluno","Professor","Técnico Auxiliar", "Bibliotecario"};
        
        cadUsuario = new JMenuItem("Cadrastro de usuario");
        cadLivro = new JMenuItem("Cadrastro de livro");
        pedLivro = new JMenuItem("Pedido de livro");
        separador = new JSeparator();
        sair = new JMenuItem("Sair");
        
        jmenu = new JMenu("Opções");
        jmenu.add(cadUsuario);
        jmenu.add(cadLivro);
        jmenu.add(pedLivro);
        jmenu.add(separador);
        jmenu.add(sair);
        
        jbar = new JMenuBar();
        jbar.add(jmenu);
        add(jbar,BorderLayout.NORTH);
        
        principal = new JPanel(new GridLayout(9, 0));
        linhas = new JPanel[7];
        for(int i = 0; i < linhas.length; i++){
            linhas[i] = new JPanel(new FlowLayout());
        }
        //Primeira linha da ficha
        //cadastro  = new JLabel ("Cadastro ");
                
        //cadastro.setForeground(Color.blue);
        //linhas[0].add(cadastro);
        //Segunda linha da ficha
        usuario = new JLabel("Tipo de Usuario: ");
        comboUsuario = new JComboBox(tipoDeUsuario);
        comboUsuario.setMaximumRowCount(4);
        comboUsuario.setSelectedItem(ListSelectionModel.SINGLE_SELECTION);
        
        comboUsuario.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent event) {
                if(event.getItem() == tipoDeUsuario[0]){
                    curso.setText("        Curso: ");
                    comboCurso.setVisible(true);
                    comboAreas.setVisible(false);
                    data.setText("Data de Matricula:");
                    incluir.setText("Incluir");
                    alterar.setText("Alterar");
                    excluir.setText("Excluir");           
                }
                    
                if((event.getItem() == tipoDeUsuario[1])){
                    curso.setText(" Área de especialização: ");
                    comboCurso.setVisible(false);
                    comboAreas.setVisible(true);
                    data.setText("Contratação: ");
                    incluir.setText(" Incluir ");
                    alterar.setText("  Alterar  ");
                    excluir.setText("  Excluir ");
                }
                
                if((event.getItem() == tipoDeUsuario[2])){ 
                    curso.setText("                                                                               ");
                    comboCurso.setVisible(false);
                    comboAreas.setVisible(false);
                    data.setText("Contratação: ");
                    incluir.setText(" Incluir ");
                    alterar.setText("  Alterar  ");
                    excluir.setText("  Excluir ");    
                }
                if((event.getItem() == tipoDeUsuario[3])){ 
                    curso.setText("                                                                               ");
                    comboCurso.setVisible(false);
                    comboAreas.setVisible(false);
                    data.setText("Contratação: ");
                   incluir.setText(" Incluir ");
                   alterar.setText("  Alterar  ");
                   excluir.setText("  Excluir ");
                    
                }
            }
        });
        ganbi = new JLabel("                                                       ");
        linhas[1].add(usuario);
        linhas[1].add(comboUsuario);
        linhas[1].add(ganbi);
        
        //Terceira linha da ficha
        matricula = new JLabel("Número de Matrícula: ");
        txtMatricula = new JTextField(9);
        txtMatricula.setText("000.000.000.000");
        buscar = new JButton("Buscar");
        limpar = new JButton("Limpar");
        
        linhas[2].add(matricula);
        linhas[2].add(txtMatricula);
        linhas[2].add(buscar);
        linhas[2].add(limpar);
        
        //Quarta linha da ficha
        nome = new JLabel("Nome Completo: ");
        txtNome = new JTextField(26);
        linhas[3].add(nome);
        linhas[3].add(txtNome);
        
        //Quinta linha da ficha.
        senha  = new JLabel("Senha: ");
        password = new JPasswordField(9);
        linhas[4].add(senha);
        linhas[4].add(password);
        //Sexta linha da ficha.
        curso = new JLabel("        Curso: ");
        
        
        String aux;
        for(int i = 0; i < tipoDeCurso.length; i++){
            for( int j = 0 ; j < tipoDeCurso.length; j++){
                if(tipoDeCurso[i].charAt(0) < tipoDeCurso[j].charAt(0)){
                    aux = tipoDeCurso[i];
                    tipoDeCurso[i] = tipoDeCurso[j];
                    tipoDeCurso[j] = aux;
                }
            }
        }
        
        comboCurso = new JComboBox(tipoDeCurso);
        comboAreas = new JComboBox(areas);
        comboCurso.setMaximumRowCount(10);
        
        linhas[4].add(curso);
        linhas[4].add(comboCurso);
        comboAreas.setVisible(false);
        linhas[4].add(comboAreas);
        
        data = new JLabel("Data de Matrícula:");
        txtData = new JTextField(5);
        txtData.setText("20/05/15");
        linhas[5].add(data);
        linhas[5].add(txtData);
        
        //Setima linha
        incluir = new JButton("Incluir");
        alterar = new JButton("Alterar");
        excluir = new JButton("Excluir");
        excluir.setForeground(Color.red);
        
        linhas[5].add(incluir);
        linhas[5].add(alterar);
        linhas[5].add(excluir);
        
        /*//Oitava linha
        mensagem = new JLabel();
        mensagem.setForeground(Color.red);
        mensagem.setText("Usuario não encontrado");
        linhas[6].add(mensagem);*/
        
        //Adcionando linhas a JPanel principal
        for(int i = 0; i < linhas.length; i++){
            principal.add(linhas[i]);
        }
        add(principal,BorderLayout.CENTER);
        
        limpar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                limpar();
                
            }
        });
        
        buscar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if(txtMatricula.getText().equals("12141500534")){
                    txtNome.setText("Leonardo Pereira Alves");
                    comboCurso.setActionCommand(tipoDeCurso[9]);
                    password.setText("050982");
                    txtData.setText("20/01/14");
                }else if(txtMatricula.getText().equals("12141100130")){
                    txtNome.setText("Camila Sampaio");
                    password.setText("050982");
                    txtData.setText("17/01/14");
                }else{
                    String mensagem = "Cadastro não encontrado";
                    JOptionPane.showMessageDialog(null,mensagem);
                    limpar();
                }
                
            }
        });
        
        incluir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String mensagem = "Cadastro Incluso";
                JOptionPane.showMessageDialog(null, mensagem, incluir.getText(), 1);
                limpar();   
            }
        });
        
        alterar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String mensagem = "Cadastro Alterado";
                JOptionPane.showMessageDialog(null, mensagem, alterar.getText(), 1);
                limpar();   
            }
        });
        
        excluir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String mensagem = "O Cadastro será Excluido";
                JOptionPane.showMessageDialog(null, mensagem, excluir.getText(), 2);
                limpar();   
            }
        });
        
        sair.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
    }//Fim do metodo construtor.
    
    public void limpar(){
        txtMatricula.setText(null);
        txtNome.setText(null);
        password.setText(null);
        txtData.setText(null);
    }
}//Fim da Classe
