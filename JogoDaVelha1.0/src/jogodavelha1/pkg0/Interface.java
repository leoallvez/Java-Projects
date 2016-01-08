package jogodavelha1.pkg0;

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
 * @version 1.0 15/06/2015 - 16/06/2015
 */

public class Interface extends JFrame {
    
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
    private final Icon x1; 
    private final Icon o1;
    private final Icon x2;
    private final Icon o2;
    private final Icon x3;
    private final Icon o3;
    JogadorVirtual r2d2;
    Jogador player;
    Tabela game;
    public Interface(){
        super("Jogo Da Velha - 1.0 ");
        
        r2d2 = new JogadorVirtual("Maquina", 0);
        player = new Jogador ("Você", 1);
        game = new Tabela(r2d2,player);
        
        setBounds(500,150,400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        game.mostrar();
        
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
    
        status = new JLabel();
        novaPartida = new JButton("Nova Partida");
        barraDeStatus = new JPanel(new FlowLayout(FlowLayout.LEFT));
        placar = new JLabel(player.getNome()+" "+player.getPontos()+" X "+r2d2.getPontos()+" "+r2d2.getNome());
        barraDeStatus.add(placar);
        add(barraDeStatus,BorderLayout.SOUTH);
        
        //Botões de interação com o usuario.
        lacuna[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) { 
                jogada(0,0);
            }
        } ); 
        
        lacuna[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jogada(0,1);
            }
        } );
        
        lacuna[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jogada(0,2);
            }
        } );
        
        lacuna[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jogada(1,0);
            }
        } );
        
        lacuna[4].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) { 
                jogada(1,1);
            }
        } );
        
        lacuna[5].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) { 
                jogada(1,2);
            }
        } );
        
        lacuna[6].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            
                jogada(2,0);
            }
        } );
        
        lacuna[7].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {  
                jogada(2,1);
            }
        } );
        
        lacuna[8].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jogada(2,2);
            }
        } );
        
        novoJogo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                game.inicializaTabela();
                preencheLacunas();
                player.zeraPonto();
                r2d2.zeraPonto();
                placar.setForeground(Color.black);
                placar.setText(setPlacar()); 
                barraDeStatus.setBackground(null);
                barraDeStatus.remove(novaPartida);
                barraDeStatus.remove(status);         
            }
        });
        
        novaPartida.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                game.inicializaTabela();
                preencheLacunas();
                placar.setText(setPlacar());
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
        a = Tabela.posicoes;
        for(int l = 0; l < a.length; l++){
            for(int c = 0; c < a.length; c++){
                if(game.mostraPosicao(l,c) == r2d2.getId()){
                    lacuna[i].setIcon(o1);
                }else if (game.mostraPosicao(l,c) == player.getId()){
                    lacuna[i].setIcon(x1);
                }else{
                    lacuna[i].setBackground(Color.white);
                    lacuna[i].setIcon(null);
                }
                i++;
            }
        }
    }
    
    private void preecherVitoria(int id, Color cor, Icon c){
        int[][] t = Tabela.posicoes;
        
        //Horizontais
        if((t[0][0] == id)&&(t[0][1] == id)&&(t[0][2] == id)){
            for(int i = 0; i < 3; i++){
                lacuna[i].setBackground(cor);
                lacuna[i].setIcon(c);
            }
        }
        
        if((t[1][0] == id)&&(t[1][1] == id)&&(t[1][2] == id)){
            for(int i = 3; i < 6; i++){
                lacuna[i].setBackground(cor);
                lacuna[i].setIcon(c);
            }
        }
        
        if((t[2][0] == id)&&(t[2][1] == id)&&(t[2][2] == id)){
            for(int i = 6; i < 9; i++){
                lacuna[i].setBackground(cor);
                lacuna[i].setIcon(c);
            }
        }
        
        //Verticais
        if((t[0][0] == id)&&(t[1][0] == id)&&(t[2][0] == id)){
            for(int i = 0; i < 7; i += 3){
                lacuna[i].setBackground(cor);
                lacuna[i].setIcon(c);
            } 
        }
        
        if((t[0][1] == id)&&(t[1][1] == id)&&(t[2][1] == id)){
            for(int i = 1; i < 8; i += 3){
                lacuna[i].setBackground(cor);
                lacuna[i].setIcon(c);
            }
        }
        if((t[0][2] == id)&&(t[1][2] == id)&&(t[2][2] == id)){
            for(int i = 2; i < 9; i += 3){
                lacuna[i].setBackground(cor);
                lacuna[i].setIcon(c);
            }
        }
        
        //Diaginais
        if((t[0][0] == id)&&(t[1][1] == id)&&(t[2][2] == id)){
            for(int i = 0; i < 9; i += 4){
                lacuna[i].setBackground(cor);
                lacuna[i].setIcon(c);
            }
        }
        
        if((t[2][0] == id)&&(t[1][1] == id)&&(t[0][2] == id)){
            for(int i = 6; i > 0; i -= 2){
                lacuna[i].setBackground(cor);
                lacuna[i].setIcon(c);
            }
        }
    }//Fim do metodo preencheVitoria.
    
    
    private void preencheEmpate(){
        int[][] a;
        int i = 0;
        a = Tabela.posicoes;
        for(int l = 0; l < a.length; l++){
            for(int c = 0; c < a.length; c++){
                if(game.mostraPosicao(l, c) == r2d2.getId()){
                    lacuna[i].setIcon(o3);
                    lacuna[i].setBackground(new Color(255,250,25));
                }else if (game.mostraPosicao(l,c) == player.getId()){
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
        if(player.ganhou()){
            preecherVitoria(player.getId(),Color.green,x2);
            player.marcaPonto();
            System.out.print(player.pontos);
            placar.setText(setPlacar());
            status.setText(player.getNome()+" VENCEU! ");
            placar.setForeground(Color.white);
            status.setForeground(Color.white);
            barraDeStatus.add(novaPartida);
            barraDeStatus.add(status);
            barraDeStatus.setBackground(Color.green);
        }else if(r2d2.ganhou()){
            preecherVitoria(r2d2.getId(),Color.red,o2);
            r2d2.marcaPonto();
            placar.setText(setPlacar());
            status.setText(r2d2.getNome()+" VENCEU! ");
            placar.setForeground(Color.white);
            status.setForeground(Color.white);
            barraDeStatus.add(novaPartida);
            barraDeStatus.add(status);
            barraDeStatus.setBackground(Color.red);
        }else if(game.tabelaTotalmentePreenchida()){
            preencheEmpate();
            placar.setText("EMPATE!");
            barraDeStatus.setBackground(Color.yellow);
            barraDeStatus.add(novaPartida);
        }
    }
    
    public void jogada(int l, int c){
        if((Tabela.vazio(l,c)) && (!game.fimDeJogo())){
            player.joga(l,c);
            if(!player.ganhou()){r2d2.analisarEjogar(player.getId());}
            preencheLacunas();
            game.mostrar();
            if(game.fimDeJogo()){mostraResultado();}
        } 
    }
    
    public String setPlacar(){
        return (player.getNome()+" "+player.getPontos()+" X "+r2d2.getPontos()+" "+r2d2.getNome());
    }   
}//Fim da classe Interface.
