package main;
import java.awt.BorderLayout;
import main.options.*;
import javax.swing.*;
public class MenuPrincipal extends javax.swing.JFrame {

    // Variables declaration - do not modify                     
    private javax.swing.JPanel Fondo;               //Panel principal
    private javax.swing.JPanel Title;               //Panel de cabecera, podemos arrastrarlo como si fuera jframe
    private javax.swing.JPanel Opciones;            //Panel que contiene la lista de opciones
    private javax.swing.JPanel Contenido;     //Panel que contiene texto de bienvenida
    private javax.swing.JLabel Titulo;              //Texto de titulo

    //Botones (en realidad son paneles, pero lucen mejor que los botones)
    private javax.swing.JPanel Op1;             //Panel de opcion 1
    private javax.swing.JPanel Op2;             //Panel de opcion 2
    private javax.swing.JPanel Op3;             //Panel de opcion 3
    private javax.swing.JPanel Op4;             //Panel de opcion 4
    private javax.swing.JPanel Op5;             //Panel de opcion 5
    private javax.swing.JPanel Op6;             //Panel de opcion 6
    private javax.swing.JPanel Op7;             //Panel de opcion 7
    private javax.swing.JPanel Op8;             //Panel de opcion 8
    private javax.swing.JPanel Op9;             //Panel de opcion 9
    private javax.swing.JPanel Op10;            //Panel de opcion 10

    //Texto de las opciones
    private javax.swing.JLabel jLabel1;         //Texto de opción 1
    private javax.swing.JLabel jLabel4;         //Texto de opción 2
    private javax.swing.JLabel jLabel5;         //Texto de opción 3
    private javax.swing.JLabel jLabel6;         //Texto de opción 4
    private javax.swing.JLabel jLabel7;         //Texto de opción 5
    private javax.swing.JLabel jLabel8;         //Texto de opción 6
    private javax.swing.JLabel jLabel9;         //Texto de opción 7
    private javax.swing.JLabel jLabel10;        //Texto de opción 8
    private javax.swing.JLabel jLabel11;        //Texto de opción 9
    private javax.swing.JLabel jLabel12;        //Texto de opción 10

    int xMouse, yMouse; //Variables que captan coordenadas del puntero
    
    public MenuPrincipal() {
        initComponents(); //El constructor inicializa las variables de swing y les aplica atributos
        Cero p = new Cero();
        show(p);
    }
    
    private void show(JPanel u){
        u.setSize(640,490);
        u.setLocation(0,0);
        
        Contenido.removeAll();
        Contenido.add(u,BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }

   
    private void initComponents() {
        //Declaracion de objetos swing
        Fondo    = new javax.swing.JPanel();
        Opciones = new javax.swing.JPanel();
        Op1      = new javax.swing.JPanel();
        jLabel1  = new javax.swing.JLabel();
        Op2      = new javax.swing.JPanel();
        jLabel4  = new javax.swing.JLabel();
        Op3      = new javax.swing.JPanel();
        jLabel5  = new javax.swing.JLabel();
        Op4      = new javax.swing.JPanel();
        jLabel6  = new javax.swing.JLabel();
        Op5      = new javax.swing.JPanel();
        jLabel7  = new javax.swing.JLabel();
        Op6      = new javax.swing.JPanel();
        jLabel8  = new javax.swing.JLabel();
        Op7      = new javax.swing.JPanel();
        jLabel9  = new javax.swing.JLabel();
        Op8      = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Op9      = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Op10     = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Contenido = new javax.swing.JPanel();
        Title    = new javax.swing.JPanel();
        Titulo   = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(204, 204, 204));
        Fondo.setMinimumSize(new java.awt.Dimension(0, 0));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Opciones.setBackground(new java.awt.Color(148, 25, 25));
        Opciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Op1.setBackground(new java.awt.Color(148, 25, 25));

        jLabel1.setForeground(new java.awt.Color(242, 233, 233));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Generar arreglo numerico aleatorio");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Op1Layout = new javax.swing.GroupLayout(Op1);
        Op1.setLayout(Op1Layout);
        Op1Layout.setHorizontalGroup(
            Op1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Op1Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Op1Layout.setVerticalGroup(
            Op1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        Op2.setBackground(new java.awt.Color(148, 25, 25));

        jLabel4.setForeground(new java.awt.Color(242, 233, 233));
        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Generar arreglo numerico con datos solicitados");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });


        javax.swing.GroupLayout Op2Layout = new javax.swing.GroupLayout(Op2);
        Op2.setLayout(Op2Layout);
        Op2Layout.setHorizontalGroup(
            Op2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Op2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Op2Layout.setVerticalGroup(
            Op2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        Op3.setBackground(new java.awt.Color(148, 25, 25));

        jLabel5.setForeground(new java.awt.Color(242, 233, 233));
        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Generar arreglo de cadenas con datos solicitados");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Op3Layout = new javax.swing.GroupLayout(Op3);
        Op3.setLayout(Op3Layout);
        Op3Layout.setHorizontalGroup(
            Op3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Op3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Op3Layout.setVerticalGroup(
            Op3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        Op4.setBackground(new java.awt.Color(148, 25, 25));

        jLabel6.setForeground(new java.awt.Color(242, 233, 233));
        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Generar arreglo de objetos con datos solicitados");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Op4Layout = new javax.swing.GroupLayout(Op4);
        Op4.setLayout(Op4Layout);
        Op4Layout.setHorizontalGroup(
            Op4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Op4Layout.setVerticalGroup(
            Op4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Op4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Op5.setBackground(new java.awt.Color(148, 25, 25));

        jLabel7.setForeground(new java.awt.Color(242, 233, 233));
        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Mostrar elementos del arreglo");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Op5Layout = new javax.swing.GroupLayout(Op5);
        Op5.setLayout(Op5Layout);
        Op5Layout.setHorizontalGroup(
            Op5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Op5Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Op5Layout.setVerticalGroup(
            Op5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        Op6.setBackground(new java.awt.Color(148, 25, 25));

        jLabel8.setForeground(new java.awt.Color(242, 233, 233));
        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ordenar arreglo");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Op6Layout = new javax.swing.GroupLayout(Op6);
        Op6.setLayout(Op6Layout);
        Op6Layout.setHorizontalGroup(
            Op6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Op6Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Op6Layout.setVerticalGroup(
            Op6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        Op7.setBackground(new java.awt.Color(148, 25, 25));

        jLabel9.setForeground(new java.awt.Color(242, 233, 233));
        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Buscar elemento en arreglo");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Op7Layout = new javax.swing.GroupLayout(Op7);
        Op7.setLayout(Op7Layout);
        Op7Layout.setHorizontalGroup(
            Op7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Op7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Op7Layout.setVerticalGroup(
            Op7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        Op8.setBackground(new java.awt.Color(148, 25, 25));

        jLabel10.setForeground(new java.awt.Color(242, 233, 233));
        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Escribir contenido de arreglo en archivo");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Op8Layout = new javax.swing.GroupLayout(Op8);
        Op8.setLayout(Op8Layout);
        Op8Layout.setHorizontalGroup(
            Op8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Op8Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Op8Layout.setVerticalGroup(
            Op8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        Op9.setBackground(new java.awt.Color(148, 25, 25));

        jLabel11.setForeground(new java.awt.Color(242, 233, 233));
        jLabel11.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Leer contenido del archivo");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Op9Layout = new javax.swing.GroupLayout(Op9);
        Op9.setLayout(Op9Layout);
        Op9Layout.setHorizontalGroup(
            Op9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Op9Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Op9Layout.setVerticalGroup(
            Op9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        Op10.setBackground(new java.awt.Color(148, 25, 25));

        jLabel12.setForeground(new java.awt.Color(242, 233, 233));
        jLabel12.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Salir");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Op10Layout = new javax.swing.GroupLayout(Op10);
        Op10.setLayout(Op10Layout);
        Op10Layout.setHorizontalGroup(
            Op10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Op10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Op10Layout.setVerticalGroup(
            Op10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout OpcionesLayout = new javax.swing.GroupLayout(Opciones);
        Opciones.setLayout(OpcionesLayout);
        OpcionesLayout.setHorizontalGroup(
            OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Op1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Op2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Op3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Op4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Op5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Op6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Op7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Op8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Op9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Op10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        OpcionesLayout.setVerticalGroup(
            OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesLayout.createSequentialGroup()
                .addComponent(Op1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(Op2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Op3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Op4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Op5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Op6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Op7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Op8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Op9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Op10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo.add(Opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 360, 490));

        Contenido.setBackground(new java.awt.Color(255, 255, 255));
        Contenido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));


        

        Fondo.add(Contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 640, 490));

        Title.setBackground(new java.awt.Color(102, 102, 102));
        Title.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Titulo.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Proyecto Programación Orientada a Objetos I");
        Titulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TituloMouseDragged(evt);
            }
        });
        Titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TituloMousePressed(evt);
            }
        });

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleLayout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        Fondo.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {                                      
        Uno p = new Uno();
        show(p);
    }

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {                                      
        Dos p = new Dos();
        show(p);
    }

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {                                      
        Tres p = new Tres();
        show(p);
    }

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {                                      
        Cuatro p = new Cuatro();
        show(p);
    }

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {                                      
        Cinco p = new Cinco();
        show(p);
    }

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {                                      
        Seis p = new Seis();
        show(p);
    }

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {                                      
        Siete p = new Siete();
        show(p);
    }

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {                                      
        Ocho p = new Ocho();
        show(p);
    }
    
    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {                                      
        Nueve p = new Nueve();
        show(p);
    }


    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void TituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TituloMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_TituloMousePressed

    private void TituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TituloMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_TituloMouseDragged

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    
}
