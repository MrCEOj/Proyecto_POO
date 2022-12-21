package main.options;
import java.awt.BorderLayout;
import javax.swing.*;

public class Siete extends javax.swing.JPanel {

    //Declraación de objetos swing
    private javax.swing.JPanel Content;     //Panel principal
    private javax.swing.JButton jButton1;   //Botones de funcion
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;     //Labels de diseño
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;

    public Siete() {
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
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        /*
         * Diseño
         */
        Content.setBackground(new java.awt.Color(255, 245, 245));
        Content.setPreferredSize(new java.awt.Dimension(640, 520));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BUSCAR ELEMENTO EN");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("EL ARREGLO");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Seleccione el arreglo donde se buscara");

        jButton1.setBackground(new java.awt.Color(171, 86, 80));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(23, 18, 18));
        jButton1.setText("Buscar en arreglo numérico");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(171, 86, 80));
        jButton2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(23, 18, 18));
        jButton2.setText("Buscar en arreglo de cadenas");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(218, 218, 218))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(108, 108, 108))))
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
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

    //Método para abrir subopción 1
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        SieteDos p = new SieteDos();
        if(Uno.cant > 0)
            show(p);
        else
            JOptionPane.showMessageDialog(null,"El arreglo de números está vacío","Error",0);
    }

    //Método para abrir subopción 2
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        SieteTres p = new SieteTres();
        if(Tres.cant > 0)
            show(p);
        else
            JOptionPane.showMessageDialog(null,"El arreglo de cadenas está vacío","Error",0);
    }

}
