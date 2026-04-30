package uniflow.view;

import java.awt.Color;
import uniflow.view.Ventana_regitrar;
import uniflow.model.Usuario_dao;
import uniflow.model.Usuario;
import javax.swing.JOptionPane;
import uniflow.controller.LoginController;

public class Ventana_usuario extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Ventana_usuario.class.getName());

    /**
     * Creates new form Ventana_usuario
     */ String placeholderCorreo = "ejemplo@estudiante.com";
        String placeholderPass = "**********";
        
        
        
    public Ventana_usuario() {
        initComponents();
         setVisible(true);
        pack();
        setLocationRelativeTo(null);
        
        // --- LÓGICA PARA EL CAMPO CORREO ---
    txtcorreo.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            if (txtcorreo.getText().equals("ejemplo@estudiante.com")) {
                txtcorreo.setText("");
                txtcorreo.setForeground(Color.BLACK);
                
            }
        }
    });

    // --- LÓGICA PARA EL CAMPO CONTRASEÑA ---
    txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mousePressed(java.awt.event.MouseEvent evt) {
        // Obtenemos el texto actual de forma segura
        String pass = new String(txtPassword.getPassword());
        
        if (pass.equals("**********")) {
            txtPassword.setText("");
            txtPassword.setEchoChar('●'); // Cambia los asteriscos por puntos de password
            txtPassword.setForeground(Color.BLACK);
        }
    }
});
    
    // IMPORTANTE: Quitar el foco inicial para que funcione el placeholder
    this.requestFocusInWindow();
}
       
        
       
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtcorreo = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnresgitro = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(9, 31, 97));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 3, 3, new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imangs/diploma.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 270, 200));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Stencil", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Uniflow");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 260, 130));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel8.setText("<html><body style='text-align: center;'>UniFlow es un ecosistema<br>digital diseñado para centralizar<br>y optimizar la administración<br>de procesos educativos.<br><br>Nuestra meta es facilitar la<br>interacción entre la comunidad<br>universitaria mediante una<br>interfaz ágil e inteligente.</body></html>");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 240, 210));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\FAMILIA\\Documents\\NetBeansProjects\\Uniflow\\src\\Imangs\\whatsapp (1).png")); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imangs/instagram.png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imangs/internet.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 310, 670));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(783, 80, -1, -1));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 122, -1, -1));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 160, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcorreo.setBackground(new java.awt.Color(204, 204, 204));
        txtcorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtcorreo.setText("ejemplo@estudiante.com");
        txtcorreo.addActionListener(this::txtcorreoActionPerformed);
        jPanel3.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 350, -1));

        txtPassword.setBackground(new java.awt.Color(204, 204, 204));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setText("**********");
        jPanel3.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 350, -1));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Correo Institucional:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 170, 20));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Contraseña:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        btnLogin.setBackground(new java.awt.Color(102, 255, 0));
        btnLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("Iniciar secion");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(this::btnLoginActionPerformed);
        jPanel3.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 40)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Iniciar secion");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 300, 70));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Ingresa tu Informacion para poder aceder");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        btnresgitro.setBackground(new java.awt.Color(51, 204, 0));
        btnresgitro.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnresgitro.setForeground(new java.awt.Color(0, 0, 0));
        btnresgitro.setText("Registrase");
        btnresgitro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnresgitro.addActionListener(this::btnresgitroActionPerformed);
        jPanel3.add(btnresgitro, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 160, 40));

        btncerrar.setBackground(new java.awt.Color(255, 51, 51));
        btncerrar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btncerrar.setForeground(new java.awt.Color(0, 0, 0));
        btncerrar.setText("Salir");
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrar.addActionListener(this::btncerrarActionPerformed);
        jPanel3.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 90, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("¿Olvido su contraseña?");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imangs/bloqueado.png"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imangs/agregar-usuario.png"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 40, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imangs/correo.png"))); // NOI18N
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 530, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnresgitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresgitroActionPerformed

        // Crear la ventana de registro
        Ventana_regitrar registro = new Ventana_regitrar();

        // Mostrarla
        registro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnresgitroActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

    String correo = txtcorreo.getText().trim();
    String password = String.valueOf(txtPassword.getPassword()).trim();

    // 🚨 VALIDACIÓN CLAVE
    if (correo.equals("ejemplo@estudiante.com") || password.equals("**********")) {
        JOptionPane.showMessageDialog(this, "⚠️ Ingresa datos reales");
        return;
    }

    LoginController controller = new LoginController();
    Usuario u = controller.login(correo, password);

    if (u != null) {

        if (u.getRol().equalsIgnoreCase("Docente")) {
            new VentanaDocente(u.getId()).setVisible(true);
        } else if (u.getRol().equalsIgnoreCase("Estudiante")) {
            new Ventana_estudiante(u.getId()).setVisible(true);
        }

        this.dispose();

    } else {
        JOptionPane.showMessageDialog(this, "❌ Datos incorrectos");
    
}
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed

    

    

    }//GEN-LAST:event_txtcorreoActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncerrarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Ventana_usuario().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btnresgitro;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtcorreo;
    // End of variables declaration//GEN-END:variables
}
