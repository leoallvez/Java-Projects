package calculadora;

import java.awt.Color;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Leonardo Pereira Alves
 * @version 19.05.2015
 */
public class InterFaceCalculadora extends JFrame {
    
    private final ArrayList<Numero> lista; // Lista que guarda os operadores digitados
    private String operador; //Esse atributo guarda o operador ultilizado.
    private boolean pressN;   //Esse atributo checa se uma tecla númerica foi precionada
    private boolean pressO;  //Esse atributo checa se foi impresso um resultado na tela
    
    
    
    public InterFaceCalculadora() {
        super("Calculadora");
        initComponents();
        lista = new ArrayList<>();
        pressN = false;
        pressO = false;
        operador = "";
        tela.setText("0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        tela.setEditable(false);
        tela.setBackground(Color.white);
    }
    
    public double calcula(double x, String op, double y){
        
        if(op.equals("+")){ return x + y;}
        if(op.equals("-")){ return x - y;}
        if(op.equals("*")){ return x * y;}
        if(op.equals("/")){ return x / y;}
        
        return 0;
    }
    
    
    public void adicionaElemento(){
        double a = Double.parseDouble(tela.getText());
        Numero num = new Numero(a);
        lista.add(num);
    }
    
    public double fazCalculo(String op){
        double a = lista.get(0).getDouble();
        double b = lista.get(1).getDouble();
        lista.clear();
        return calcula(a,op,b);
    }


    
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jButton17 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        tela = new javax.swing.JTextField();
        jButtonSete = new javax.swing.JButton();
        jButtonOito = new javax.swing.JButton();
        jButtonNove = new javax.swing.JButton();
        jButtonDivisao = new javax.swing.JButton();
        jButtonQuatro = new javax.swing.JButton();
        jButtonCinco = new javax.swing.JButton();
        jButtonSeis = new javax.swing.JButton();
        jButtonMultiplicacao = new javax.swing.JButton();
        jButtonDois = new javax.swing.JButton();
        jButtonUm = new javax.swing.JButton();
        jButtonTres = new javax.swing.JButton();
        jButtonMenos = new javax.swing.JButton();
        jButtonPonto = new javax.swing.JButton();
        jButtonZero = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButtonMais = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jButton3.setText("jButton3");

        jToggleButton1.setText("jToggleButton1");

        jToggleButton2.setText("jToggleButton2");

        jToggleButton3.setText("jToggleButton3");

        jToggleButton4.setText("jToggleButton4");

        jButton17.setText("jButton17");

        jButton20.setText("jButton20");

        jButton19.setText("jButton19");

        jButton18.setText("jButton18");

        jButton21.setText("-");

        jButtonClear.setText("C");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaActionPerformed(evt);
            }
        });

        jButtonSete.setBackground(new Color(22,185,233));
        jButtonSete.setText("7");
        jButtonSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeteActionPerformed(evt);
            }
        });

        jButtonOito.setBackground(new Color(22,185,233));
        jButtonOito.setText("8");
        jButtonOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOitoActionPerformed(evt);
            }
        });

        jButtonNove.setBackground(new Color(22,185,233));
        jButtonNove.setText("9");
        jButtonNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNoveActionPerformed(evt);
            }
        });

        jButtonDivisao.setText("/");
        jButtonDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisaoActionPerformed(evt);
            }
        });

        jButtonQuatro.setBackground(new Color(22,185,233));
        jButtonQuatro.setText("4");
        jButtonQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuatroActionPerformed(evt);
            }
        });

        jButtonCinco.setBackground(new Color(22,185,233));
        jButtonCinco.setText("5");
        jButtonCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCincoActionPerformed(evt);
            }
        });

        jButtonSeis.setBackground(new Color(22,185,233));
        jButtonSeis.setText("6");
        jButtonSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeisActionPerformed(evt);
            }
        });

        jButtonMultiplicacao.setText("*");
        jButtonMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicacaoActionPerformed(evt);
            }
        });

        jButtonDois.setBackground(new Color(22,185,233));
        jButtonDois.setText("2");
        jButtonDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoisActionPerformed(evt);
            }
        });

        jButtonUm.setBackground(new Color(22,185,233));
        jButtonUm.setText("1");
        jButtonUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUmActionPerformed(evt);
            }
        });

        jButtonTres.setBackground(new Color(22,185,233));
        jButtonTres.setText("3");
        jButtonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTresActionPerformed(evt);
            }
        });

        jButtonMenos.setText("-");
        jButtonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenosActionPerformed(evt);
            }
        });

        jButtonPonto.setText(".");
        jButtonPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPontoActionPerformed(evt);
            }
        });

        jButtonZero.setBackground(new Color(22,185,233));
        jButtonZero.setText("0");
        jButtonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZeroActionPerformed(evt);
            }
        });

        jButtonIgual.setText("=");
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });

        jButtonMais.setText("+");
        jButtonMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaisActionPerformed(evt);
            }
        });

        jButtonC.setText("CE");
        jButtonC.setBackground(new Color(251,232,120));
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jButton2.setText("00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(tela)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonQuatro, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jButtonSete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCinco, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(jButtonOito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonNove, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonUm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButtonPonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonDois, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(jButtonZero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonIgual, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)))
                            .addComponent(jButtonMais, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonMultiplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(jButtonDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonOito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonNove, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSeis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonTres, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonDois, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonUm, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonZero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPonto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonMais, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUmActionPerformed
        if((tela.getText().equals("0")) || (pressO == true)){
            tela.setText("1");
            pressO = false;
        }else{
            tela.setText(tela.getText()+"1");
        }
        pressN = true;
    }//GEN-LAST:event_jButtonUmActionPerformed

    private void jButtonDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoisActionPerformed
        if((tela.getText().equals("0")) || (pressO == true)){
            tela.setText("2");
            pressO = false;
        }else{
            tela.setText(tela.getText()+"2");
        }
        pressN = true;
    }//GEN-LAST:event_jButtonDoisActionPerformed

    private void jButtonTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTresActionPerformed
        if((tela.getText().equals("0")) || (pressO == true)){
            tela.setText("3");
            pressO = false;
        }else{
            tela.setText(tela.getText()+"3");
        }
        pressN = true;
    }//GEN-LAST:event_jButtonTresActionPerformed

    private void jButtonQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuatroActionPerformed
        if((tela.getText().equals("0")) || (pressO == true)){
            tela.setText("4");
            pressO = false;
        }else{
            tela.setText(tela.getText()+"4");
        }
        pressN = true;
    }//GEN-LAST:event_jButtonQuatroActionPerformed

    private void jButtonCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCincoActionPerformed
        if((tela.getText().equals("0")) || (pressO == true)){
            tela.setText("5");
            pressO = false;
        }else{
            tela.setText(tela.getText()+"5");
        }
        pressN = true;
    }//GEN-LAST:event_jButtonCincoActionPerformed

    private void jButtonSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeisActionPerformed
        if((tela.getText().equals("0")) || (pressO == true)){
            tela.setText("6");
            pressO = false;
        }else{
            tela.setText(tela.getText()+"6");
        }
        pressN = true;
    }//GEN-LAST:event_jButtonSeisActionPerformed

    private void jButtonSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeteActionPerformed
        if((tela.getText().equals("0")) || (pressO == true)){
            tela.setText("7");
            pressO = false;
        }else{
            tela.setText(tela.getText()+"7");
        }
        pressN = true;
    }//GEN-LAST:event_jButtonSeteActionPerformed

    private void jButtonOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOitoActionPerformed
        if((tela.getText().equals("0")) || (pressO == true)){
            tela.setText("8");
            pressO = false;
        }else{
            tela.setText(tela.getText()+"8");
        }
        pressN = true;
    }//GEN-LAST:event_jButtonOitoActionPerformed

    private void jButtonNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNoveActionPerformed
        if((tela.getText().equals("0")) || (pressO == true)){
            tela.setText("9");
            pressO = false;
        }else{
            tela.setText(tela.getText()+"9");
        }
        pressN = true;
    }//GEN-LAST:event_jButtonNoveActionPerformed

    private void jButtonZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZeroActionPerformed
        if((tela.getText().equals("0")) || (pressO == true)){
            tela.setText("0");
            pressO = false;
        }else{
            tela.setText(tela.getText()+"0");
        }
        pressN = true;
    }//GEN-LAST:event_jButtonZeroActionPerformed

    private void jButtonPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPontoActionPerformed
        if((tela.getText().equals("0")) || (pressO == true)){
            tela.setText("0.");
            pressO = false;
        }else{
            tela.setText(tela.getText()+".");
        }
        pressN = true;
        
    }//GEN-LAST:event_jButtonPontoActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        if((pressN == true) && (lista.size() < 2)){
            adicionaElemento();
            pressN = false;
        }
        
        if(lista.size() == 2){
            tela.setText(valueOf(fazCalculo(operador)));
            adicionaElemento();
            pressO = true; 
        }
        operador = "";
    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jButtonDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisaoActionPerformed
        if((pressN == true) && (lista.size() < 2)){
            adicionaElemento();
            pressN = false;
            tela.setText("0");
        }
        
        if(lista.size() == 2){
            tela.setText(valueOf(fazCalculo(operador)));
            adicionaElemento();
            pressO = true;
        }
        
        operador  = "/";
    }//GEN-LAST:event_jButtonDivisaoActionPerformed

    private void jButtonMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicacaoActionPerformed
        if((pressN == true) && (lista.size() < 2)){
            adicionaElemento();
            pressN = false;
            tela.setText("0");
        }
        
        if(lista.size() == 2){
            tela.setText(valueOf(fazCalculo(operador)));
            adicionaElemento();
            pressO = true;
        }
        
        operador  = "*";
    }//GEN-LAST:event_jButtonMultiplicacaoActionPerformed

    private void jButtonMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenosActionPerformed
        if((pressN == true) && (lista.size() < 2)){
            adicionaElemento();
            pressN = false;
            tela.setText("0");
        }
        
        if(lista.size() == 2){
            tela.setText(valueOf(fazCalculo(operador)));
            adicionaElemento();
            pressO = true;
        }
        
        operador  = "-";
    }//GEN-LAST:event_jButtonMenosActionPerformed

    private void jButtonMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaisActionPerformed
        if((pressN == true) && (lista.size() < 2)){
            adicionaElemento();
            pressN = false;
            tela.setText("0");
        }
        
        if(lista.size() == 2){
            tela.setText(valueOf(fazCalculo(operador)));
            adicionaElemento();
            pressO = true;
        }
        
        operador  = "+";
    }//GEN-LAST:event_jButtonMaisActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed

    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        tela.setText("0");
        lista.clear();
        pressN = false;
        pressO = false;
        operador = "";
    }//GEN-LAST:event_jButtonCActionPerformed

    private void telaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telaActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        if(pressO == false){
            String a = "";
            for(int i = 0; i < tela.getText().length() - 1; i++){
                a += tela.getText().charAt(i);
            }
            if(a.equals("")){ a = "0";}
            tela.setText(a);
        }
    }//GEN-LAST:event_jButtonBackActionPerformed

    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonCinco;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDivisao;
    private javax.swing.JButton jButtonDois;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonMais;
    private javax.swing.JButton jButtonMenos;
    private javax.swing.JButton jButtonMultiplicacao;
    private javax.swing.JButton jButtonNove;
    private javax.swing.JButton jButtonOito;
    private javax.swing.JButton jButtonPonto;
    private javax.swing.JButton jButtonQuatro;
    private javax.swing.JButton jButtonSeis;
    private javax.swing.JButton jButtonSete;
    private javax.swing.JButton jButtonTres;
    private javax.swing.JButton jButtonUm;
    private javax.swing.JButton jButtonZero;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JTextField tela;
    // End of variables declaration//GEN-END:variables
}
