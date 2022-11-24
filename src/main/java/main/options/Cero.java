package main.options;

public class Cero extends javax.swing.JPanel{
    
    public Cero() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    @SuppressWarnings("unchecked")
    private void initComponents() {
        
        Bienvenida = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();

        Content.setPreferredSize(new java.awt.Dimension(640, 520));
        Content.setBackground(new java.awt.Color(255, 245, 245));
        Bienvenida.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        Bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bienvenida.setText("Bienvenido al programa");

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(Bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(Bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JLabel Bienvenida;
    // End of variables declaration//GEN-END:variables
}
