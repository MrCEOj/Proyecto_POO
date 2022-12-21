package main.options;

import javax.swing.JLabel;

public class Dos extends javax.swing.JPanel {

    //Declaración de objetos swing
    private javax.swing.JLabel ArrayLabel;  //Label que imprime el array terminado
    private javax.swing.JButton But1;       //Botón que confirma el tamaño del array
    private javax.swing.JPanel Content;     //Panel principal
    private javax.swing.JButton Sig;        //Botón que permite guardar los datos de la posición x del array
    private javax.swing.JComboBox<Integer> cants;       //Lista de elementos para establecer el tamaño del array
    private javax.swing.JFormattedTextField formatted;  //Textfield para capturar elementos del array
    private javax.swing.JLabel jLabel3;     //Label de diseño
    private javax.swing.JLabel jLabel4;     // ""    ""
    private javax.swing.JLabel jLabel5;     // ""    ""
    private javax.swing.JLabel textoArray;  // ""    ""

    //contador del array
    private int i;

    Uno u = new Uno();
    public Dos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    
    //Inicializar componentes
    private void initComponents() {

        //inicializar objetos swing
        Content = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textoArray = new javax.swing.JLabel();
        ArrayLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cants = new javax.swing.JComboBox<>();
        But1 = new javax.swing.JButton();
        Sig = new javax.swing.JButton();
        formatted = new javax.swing.JFormattedTextField(new Integer(0));

        /*
         * Diseño
         */
        setPreferredSize(new java.awt.Dimension(640, 490));

        Content.setBackground(new java.awt.Color(255, 245, 245));
        Content.setForeground(new java.awt.Color(255, 245, 245));
        Content.setPreferredSize(new java.awt.Dimension(640, 520));

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("contendrá el arreglo: ");

        jLabel4.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ARREGLO DEFINIDO");

        textoArray.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        textoArray.setForeground(new java.awt.Color(0, 0, 0));
        textoArray.setText("Ingrese el número #0: ");

        ArrayLabel.setBackground(new java.awt.Color(0, 0, 0));
        ArrayLabel.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ArrayLabel.setForeground(new java.awt.Color(0, 0, 0));
        ArrayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        if(Uno.cant > 0)
        ArrayLabel.setText(Uno.getar());
        else
        ArrayLabel.setText("[ ]");
        ArrayLabel.setMinimumSize(new java.awt.Dimension(520, 22));
        ArrayLabel.setPreferredSize(new java.awt.Dimension(640, 22));

        jLabel5.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Seleccione la cantidad de elementos que ");

        cants.setBackground(new java.awt.Color(232, 161, 155));
        cants.setForeground(new java.awt.Color(232, 161, 155));
        cants.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[] { 1,2,3,4,5,6,7,8,9,10}));

        But1.setBackground(new java.awt.Color(171, 86, 80));
        But1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        But1.setForeground(new java.awt.Color(23, 18, 18));
        But1.setText("Generar Array");
        But1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But1ActionPerformed(evt);
            }
        });

        Sig.setBackground(new java.awt.Color(171, 86, 80));
        Sig.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        Sig.setForeground(new java.awt.Color(23, 18, 18));
        Sig.setText("Siguiente");
        Sig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigActionPerformed(evt);
            }
        });

        formatted.setMinimumSize(new java.awt.Dimension(47, 28));
        formatted.setPreferredSize(new java.awt.Dimension(47, 28));
        formatted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formattedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                .addGap(0, 113, Short.MAX_VALUE)
                .addComponent(textoArray)
                .addGap(18, 18, 18)
                .addComponent(formatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sig)
                .addGap(128, 128, 128))
            .addGroup(ContentLayout.createSequentialGroup()
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel4))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(But1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(cants, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                .addComponent(ArrayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                    .addContainerGap(112, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(92, 92, 92)))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(53, 53, 53)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(But1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoArray)
                    .addComponent(formatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sig))
                .addGap(37, 37, 37)
                .addComponent(ArrayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
            .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContentLayout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(jLabel5)
                    .addContainerGap(384, Short.MAX_VALUE)))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        /*
         * Diseño
         */
    }

    private void But1ActionPerformed(java.awt.event.ActionEvent evt) { //Método que inicializa el array
        Uno.cant = (Integer)cants.getSelectedItem();
        Uno.num = new int[Uno.cant];
        i = 0;
        textoArray.setText("Ingrese el número #"+(i+1)+": ");
        ArrayLabel.setHorizontalAlignment(JLabel.CENTER);
        ArrayLabel.setText(Uno.getar());
    }

    private void SigActionPerformed(java.awt.event.ActionEvent evt) { //Método que guarda elementos de array
        Uno.num[i] = Integer.parseInt(formatted.getText());
        formatted.setText("");
        textoArray.setText("Ingrese el número #"+(i+2)+": ");
        if(i==Uno.cant-2)
            Sig.setText("Finalizar");
        if(i==Uno.cant-1){
            textoArray.setText(" ");
            formatted.setVisible(false);
            Sig.setText(" ");
            Sig.setOpaque(false);
            Sig.setContentAreaFilled(false);
            Sig.setBorderPainted(false);
        }
        i++;
        ArrayLabel.setHorizontalAlignment(JLabel.CENTER);
        ArrayLabel.setText(Uno.getar());
    }

    private void formattedActionPerformed(java.awt.event.ActionEvent evt) {
    
    }
  
}
