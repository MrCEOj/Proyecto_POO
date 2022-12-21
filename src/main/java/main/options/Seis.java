package main.options;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.*;

public class Seis extends javax.swing.JPanel {

    //Declaración de objetos swing
    private javax.swing.JLabel ArrayLabel;      //Label que contiene array de números
    private javax.swing.JLabel ArrayLabel2;     //Label que contiene array de cadena
    private javax.swing.JPanel Content;         //Panel principal
    private javax.swing.JButton jButton1;       //Botones de funcion
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;         //Labels de diseño
    private javax.swing.JLabel jLabel2;

    Uno b = new Uno();      //Objeto del panel de la primera opción
    Tres d = new Tres();    //Objeto del panel de la segunda opción

    public Seis() {
        initComponents();
    }

    //Método para mostrar subopciones
    private void show(JPanel u){
        u.setSize(640,520);
        u.setLocation(0,0);
        
        Content.removeAll();
        Content.add(u,BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }
   
    @SuppressWarnings("unchecked")
    
    //Inicializar componentes
    private void initComponents() {

        //Inicializar objetos swing
        Content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ArrayLabel = new javax.swing.JLabel();
        ArrayLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        /*
         * Diseño
         */
        Content.setBackground(new java.awt.Color(255, 245, 245));
        Content.setPreferredSize(new java.awt.Dimension(640, 520));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ORDENAR ARREGLO");
        jLabel1.setPreferredSize(new java.awt.Dimension(640, 43));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seleccione el arreglo que desea ordenar");
        jLabel2.setPreferredSize(new java.awt.Dimension(640, 29));

        ArrayLabel.setBackground(new java.awt.Color(0, 0, 0));
        ArrayLabel.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ArrayLabel.setForeground(new java.awt.Color(0, 0, 0));
        ArrayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        if(Uno.cant > 0)
        ArrayLabel.setText(Uno.getar());
        else
        ArrayLabel.setText("[ Números ]");
        ArrayLabel.setPreferredSize(new java.awt.Dimension(640, 22));

        ArrayLabel2.setBackground(new java.awt.Color(0, 0, 0));
        ArrayLabel2.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ArrayLabel2.setForeground(new java.awt.Color(0, 0, 0));
        ArrayLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        if(Tres.cant > 0)
        ArrayLabel2.setText(Tres.getstar());
        else
        ArrayLabel2.setText("[ String ]");
        ArrayLabel2.setPreferredSize(new java.awt.Dimension(640, 22));

        jButton1.setBackground(new java.awt.Color(171, 86, 80));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(23, 18, 18));
        jButton1.setText("Ordenar arreglo numérico");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(171, 86, 80));
        jButton2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(23, 18, 18));
        jButton2.setText("Ordenar arreglo de cadenas");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(171, 86, 80));
        jButton3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(23, 18, 18));
        jButton3.setText("Ordenar arreglo de objetos");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ArrayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContentLayout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(ContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ArrayLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(ArrayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ArrayLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        /*
         * Diseño
         */
    }

    //Método que ordena array de numeros
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(Uno.cant > 0){
            int aux;
            for(int x=1; x<Uno.cant; x++){
                for(int y=0; y<Uno.cant-1; y++){
                    if(Uno.num[y] > Uno.num[y+1]){
                        aux=Uno.num[y];
                        Uno.num[y]=Uno.num[y+1];
                        Uno.num[y+1]=aux;
                    }
                }
            }
            ArrayLabel.setText(Uno.getar());
            JOptionPane.showMessageDialog(null, "Arreglo ordenado correctamente");
        }else
             JOptionPane.showMessageDialog(null, "El arreglo está vacío.","Error",0);
    }

    //Método que ordena array de cadena
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        if(Tres.cant > 0){
            String aux;
            for(int x=1; x<Tres.cant; x++){
                for(int y=0; y<Tres.cant-1; y++){
                    if(Tres.str[y].compareTo(Tres.str[y+1]) > 0){
                        aux=Tres.str[y];
                        Tres.str[y]=Tres.str[y+1];
                        Tres.str[y+1]=aux;
                    }
                }
            }
            
            ArrayLabel2.setText(Tres.getstar());
            JOptionPane.showMessageDialog(null, "Arreglo ordenado correctamente");
        }else
            JOptionPane.showMessageDialog(null, "El arreglo está vacío.","Error",0);
    }

    //Método que muestra la subopción de objetos
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        if(Cuatro.cant > 0){
            SeisDos p = new SeisDos();
            show(p);
        }else
            JOptionPane.showMessageDialog(null, "El arreglo está vacío.","Error",0);
    }


    
}
