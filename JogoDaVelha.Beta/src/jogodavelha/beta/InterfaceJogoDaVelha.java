package jogodavelha.beta;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;

/**
 * Projeto jogo da velha.
 * @author Leonardo Pereira Alves.
 * @version Beta 28/04/2015 - 
 */
public class InterfaceJogoDaVelha extends JFrame {
    
    private JMenuBar menu;
    private final JMenu opcoes;
    private final JMenuItem novoJogo;
    private final JSeparator separador;
    private final JMenuItem sair;
    private final JButton[] lacuna;
    private final JLabel placar;
    private final JLabel status;
    private final JPanel barraDeStatus;
    private final JPanel tabela;
    private final JButton novaPartida;
    private int pontHomem;
    private int pontMaquina;
    private String nome;
    private JogoDaVelha v;
    private final Icon x1; 
    private final Icon o1;
    private final Icon x2;
    private final Icon o2;
    private final Icon x3;
    private final Icon o3;
    private final int O; //Maquina.
    private final int X; //Homem.
    public InterfaceJogoDaVelha(){
        super("Jogo Da Velha - Beta");
        
        setBounds(500,150,400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        O = 0;
        X = 1;
        nome = "Você";
        v = new JogoDaVelha();
        v.inicializaTabuleiro();
        v.mostrar();
        
        //Defindo icones.
        x1 = new ImageIcon(getClass().getResource("x1.png"));
        o1 = new ImageIcon(getClass().getResource("o1.png"));
        x2 = new ImageIcon(getClass().getResource("x2.png"));
        o2 = new ImageIcon(getClass().getResource("o2.png"));
        x3 = new ImageIcon(getClass().getResource("x3.png"));
        o3 = new ImageIcon(getClass().getResource("o3.png"));
        
        //Definindo menus.
        menu = new JMenuBar();
        novoJogo = new JMenuItem("Novo Jogo");
        separador = new JSeparator();
        sair = new JMenuItem("Sair");
        opcoes = new JMenu("Opções");
        opcoes.add(novoJogo);
        opcoes.add(separador);
        opcoes.add(sair);
        menu = new JMenuBar();
        menu.add(opcoes);
        add(menu,BorderLayout.NORTH);
        
        //Definindo Lacunas
        lacuna = new JButton[9];
        tabela = new JPanel(new GridLayout(3,3));
        for(int i = 0; i < lacuna.length; i++){
            lacuna[i] = new JButton();
            tabela.add(lacuna[i]);
        }
        preencheLacunas();
        add(tabela,BorderLayout.CENTER);
        
        //Definindo barra de status.
        pontHomem = 0;
        pontMaquina = 0;
        status = new JLabel();
        novaPartida = new JButton("Nova Partida");
        barraDeStatus = new JPanel(new FlowLayout(FlowLayout.LEFT));
        placar = new JLabel(nome+" "+pontHomem+" X "+pontMaquina+" maquina");
        barraDeStatus.add(placar);
        add(barraDeStatus,BorderLayout.SOUTH);
        
        //Botões de interação com o usuario.
        lacuna[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if((v.getLacuna(0,0) > 1) && (!v.jogoAcabou())){
                    v.jogadorJoga(0,0);
                    if(!v.jogadorGanhou()){v.maquinaAnalisarEjogar();}
                    preencheLacunas();
                    v.mostrar();
                    if(v.jogoAcabou()){mostraResultado();}
                }   
            }
        } ); 
        
        lacuna[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if((v.getLacuna(0,1) > 1) && (!v.jogoAcabou())){
                    v.jogadorJoga(0,1);
                    if(!v.jogadorGanhou()){v.maquinaAnalisarEjogar();}
                    preencheLacunas();
                    v.mostrar();
                    if(v.jogoAcabou()){mostraResultado();}
                }   
            }
        } );
        
        lacuna[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if((v.getLacuna(0,2) > 1) && (!v.jogoAcabou())){
                    v.jogadorJoga(0,2);
                    if(!v.jogadorGanhou()){v.maquinaAnalisarEjogar();}
                    preencheLacunas();
                    v.mostrar();
                    if(v.jogoAcabou()){mostraResultado();}
                }   
            }
        } );
        
        lacuna[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if((v.getLacuna(1,0) > 1) && (!v.jogoAcabou())){
                    v.jogadorJoga(1,0);
                    if(!v.jogadorGanhou()){v.maquinaAnalisarEjogar();}
                    preencheLacunas();
                    v.mostrar();
                    if(v.jogoAcabou()){mostraResultado();}
                }   
            }
        } );
        
        lacuna[4].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if((v.getLacuna(1,1) > 1) && (!v.jogoAcabou())){
                    v.jogadorJoga(1,1);
                    if(!v.jogadorGanhou()){v.maquinaAnalisarEjogar();}
                    preencheLacunas();
                    v.mostrar();
                    if(v.jogoAcabou()){mostraResultado();}
                }   
            }
        } );
        
        lacuna[5].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if((v.getLacuna(1,2) > 1) && (!v.jogoAcabou())){
                    v.jogadorJoga(1,2);
                    if(!v.jogadorGanhou()){v.maquinaAnalisarEjogar();}
                    preencheLacunas();
                    v.mostrar();
                    if(v.jogoAcabou()){mostraResultado();}
                }   
            }
        } );
        
        lacuna[6].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if((v.getLacuna(2,0) > 1) && (!v.jogoAcabou())){
                    v.jogadorJoga(2,0);
                    if(!v.jogadorGanhou()){v.maquinaAnalisarEjogar();}
                    preencheLacunas();
                    v.mostrar();
                    if(v.jogoAcabou()){mostraResultado();}
                }   
            }
        } );
        
        lacuna[7].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if((v.getLacuna(2,1) > 1) && (!v.jogoAcabou())){
                    v.jogadorJoga(2,1);
                    if(!v.jogadorGanhou()){v.maquinaAnalisarEjogar();}
                    preencheLacunas();
                    v.mostrar();
                    if(v.jogoAcabou()){mostraResultado();}
                }   
            }
        } );
        
        lacuna[8].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if((v.getLacuna(2,2) > 1) && (!v.jogoAcabou())){
                    v.jogadorJoga(2,2);
                    if(!v.jogadorGanhou()){v.maquinaAnalisarEjogar();}
                    preencheLacunas();
                    v.mostrar();
                    if(v.jogoAcabou()){mostraResultado();}
                }   
            }
        } );
        
        novoJogo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                v.inicializaTabuleiro();
                preencheLacunas();
                pontHomem = 0;
                pontMaquina = 0;
                placar.setForeground(Color.black);
                placar.setText(nome+" "+pontHomem+" X "+pontMaquina+" Maquina"); 
                barraDeStatus.setBackground(null);
                barraDeStatus.remove(novaPartida);
                barraDeStatus.remove(status);         
            }
        });
        
        novaPartida.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                v.inicializaTabuleiro();
                preencheLacunas();
                placar.setText(nome+" "+pontHomem+" X "+pontMaquina+" Maquina");
                barraDeStatus.remove(novaPartida);
                barraDeStatus.remove(status);
                barraDeStatus.setBackground(null);
                placar.setForeground(Color.black);        
            }
        });
        
        sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });  
    }// Fim do metodo construtor InterfaceJogoDaVelha
    
    private void preencheLacunas(){
        int[][] a;
        int i = 0;
        a = v.getTabuleiro();
        for(int l = 0; l < a.length; l++){
            for(int c = 0; c < a.length; c++){
                if(v.getLacuna(l,c) == 0){
                    lacuna[i].setIcon(o1);
                }else if (v.getLacuna(l,c) == 1){
                    lacuna[i].setIcon(x1);
                }else{
                    lacuna[i].setBackground(Color.white);
                    lacuna[i].setIcon(null);
                }
                i++;
            }
        }
    }
    
    private void preecherVitoriaJogador(){
        int[][] tab = v.getTabuleiro();
        
        //Horizontais
        if((tab[0][0] == X)&&(tab[0][1] == X)&&(tab[0][2] == X)){
            for(int i = 0; i < 3; i++){
                lacuna[i].setBackground(Color.green);
                lacuna[i].setIcon(x2);
            }
        }
        
        if((tab[1][0] == X)&&(tab[1][1] == X)&&(tab[1][2] == X)){
            for(int i = 3; i < 6; i++){
                lacuna[i].setBackground(Color.green);
                lacuna[i].setIcon(x2);
            }
        }
        
        if((tab[2][0] == X)&&(tab[2][1] == X)&&(tab[2][2] == X)){
            for(int i = 6; i < 9; i++){
                lacuna[i].setBackground(Color.green);
                lacuna[i].setIcon(x2);
            }
        }
        
        //Verticais
        if((tab[0][0] == X)&&(tab[1][0] == X)&&(tab[2][0] == X)){
            for(int i = 0; i < 7; i += 3){
                lacuna[i].setBackground(Color.green);
                lacuna[i].setIcon(x2);
            } 
        }
        
        if((tab[0][1] == X)&&(tab[1][1] == X)&&(tab[2][1] == X)){
            for(int i = 1; i < 8; i += 3){
                lacuna[i].setBackground(Color.green);
                lacuna[i].setIcon(x2);
            }
        }
        if((tab[0][2] == X)&&(tab[1][2] == X)&&(tab[2][2] == X)){
            for(int i = 2; i < 9; i += 3){
                lacuna[i].setBackground(Color.green);
                lacuna[i].setIcon(x2);
            }
        }
        
        //Diaginais
        if((tab[0][0] == X)&&(tab[1][1] == X)&&(tab[2][2] == X)){
            for(int i = 0; i < 9; i += 4){
                lacuna[i].setBackground(Color.green);
                lacuna[i].setIcon(x2);
            }
        }
        
        if((tab[2][0] == X)&&(tab[1][1] == X)&&(tab[0][2] == X)){
            for(int i = 6; i > 0; i =- 2){
                lacuna[i].setBackground(Color.green);
                lacuna[i].setIcon(x2);
                System.out.println(i);
            }
        }
    }//Fim do metodo preencheVitoriaJogador
    
    private void preecherVitoriaMaquina(){
        int[][] tab = v.getTabuleiro();
        
        //Horizontais
        if((tab[0][0] == O)&&(tab[0][1] == O)&&(tab[0][2] == O)){
            for(int i = 0; i < 3; i++){
                lacuna[i].setBackground(Color.red);
                lacuna[i].setIcon(o2);
            }
        }
        
        if((tab[1][0] == O)&&(tab[1][1] == O)&&(tab[1][2] == O)){
            for(int i = 3; i < 6; i++){
                lacuna[i].setBackground(Color.red);
                lacuna[i].setIcon(o2);
            }
        }
        
        if((tab[2][0] == O)&&(tab[2][1] == O)&&(tab[2][2] == O)){
            for(int i = 6; i < 9; i++){
                lacuna[i].setBackground(Color.red);
                lacuna[i].setIcon(o2);
            }
        }
        
        //Verticais
        if((tab[0][0] == O)&&(tab[1][0] == O)&&(tab[2][0] == O)){
            for(int i = 0; i < 7; i += 3){
                lacuna[i].setBackground(Color.red);
                lacuna[i].setIcon(o2);
            } 
        }
        
        if((tab[0][1] == O)&&(tab[1][1] == O)&&(tab[2][1] == O)){
            for(int i = 1; i < 8; i += 3){
                lacuna[i].setBackground(Color.red);
                lacuna[i].setIcon(o2);
            }
        }
        
        if((tab[0][2] == O)&&(tab[1][2] == O)&&(tab[2][2] == O)){
            for(int i = 2; i < 9; i += 3){
                lacuna[i].setBackground(Color.red);
                lacuna[i].setIcon(o2);
            }
        }
        
        //Diaginais
        if((tab[0][0] == O)&&(tab[1][1] == O)&&(tab[2][2] == O)){
            for(int i = 0; i < 9; i += 4){
                lacuna[i].setBackground(Color.red);
                lacuna[i].setIcon(o2);
            }
        }
        if((tab[2][0] == O)&&(tab[1][1] == O)&&(tab[0][2] == O)){
            for(int i = 6; i > 0; i -= 2){
                lacuna[i].setBackground(Color.red);
                lacuna[i].setIcon(o2);
            }
        }
    }//Fim do metodo preencheVitoriaMaquina.
    
    private void preencheEmpate(){
        int[][] a;
        int i = 0;
        a = v.getTabuleiro();
        for(int l = 0; l < a.length; l++){
            for(int c = 0; c < a.length; c++){
                if(v.getLacuna(l,c) == 0){
                    lacuna[i].setIcon(o3);
                    lacuna[i].setBackground(new Color(255,250,25));
                }else if (v.getLacuna(l,c) == 1){
                    lacuna[i].setIcon(x3);
                    lacuna[i].setBackground(new Color(255,250,25));
                }else{
                    lacuna[i].setBackground(new Color(255,250,25));
                    lacuna[i].setIcon(null);
                }
                i++;
            }
        }
    }
    
    private void mostraResultado(){
        if(v.jogadorGanhou()){
            preecherVitoriaJogador();
            pontHomem += 1;
            placar.setText(nome+" "+pontHomem+" X "+pontMaquina+" Maquina");
            status.setText(nome+" VENCEU! ");
            placar.setForeground(Color.white);
            status.setForeground(Color.white);
            barraDeStatus.add(novaPartida);
            barraDeStatus.add(status);
            barraDeStatus.setBackground(Color.green);
        }else if(v.maquinaGanhou()){
            preecherVitoriaMaquina();
            pontMaquina +=1;
            placar.setText(nome+" "+pontHomem+" X "+pontMaquina+" Maquina");
            status.setText("A MAQUINA VENCEU! ");
            placar.setForeground(Color.white);
            status.setForeground(Color.white);
            barraDeStatus.add(novaPartida);
            barraDeStatus.add(status);
            barraDeStatus.setBackground(Color.red);
        }else if(v.verificaFimDoJogo()){
            preencheEmpate();
            placar.setText("EMPATE!");
            barraDeStatus.setBackground(Color.yellow);
            barraDeStatus.add(novaPartida);
        }
    }
}//Fim da classe
