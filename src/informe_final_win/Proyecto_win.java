
package informe_final_win;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

    /*Proyecto de Metodologia de Programacción Grupo 6
      Autores del Proyecto:   
      - @Rodrigo
      - @Fabrizio
      - @Franko
      - @Sandro
      - @Andre
    */

public class Proyecto_win extends javax.swing.JFrame {
    ClienteFiel cf;
    ClienteNuevo cn;
    DecimalFormat df;
    
    public Proyecto_win() {
        initComponents();
        this.setTitle("Formulario de Planes de Fibra Óptica WIN");
        rsscalelabel.RSScaleLabel.setScaleLabel(jlblImagen, "src/Imagenes/win.png");
        jtxtAPlanes.setText(PlanesWIN()); 
        df = new DecimalFormat("##0.00");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtxtMontTotal = new javax.swing.JTextField();
        jtxtMontIns = new javax.swing.JTextField();
        jbtnConfirmar = new javax.swing.JButton();
        jbtnIngresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtABoleta = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtAPlanes = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jtxtNombres = new javax.swing.JTextField();
        jtxtApellidos = new javax.swing.JTextField();
        jtxtDistrito = new javax.swing.JComboBox<>();
        jtxtDNI = new javax.swing.JTextField();
        jcbxDireccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcbxTipoCliente = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbxPlan = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jtxtNumTarjetaVisa = new javax.swing.JTextField();
        jtxtFechaCaduVisa = new javax.swing.JTextField();
        jtxtCVVVisa = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jtxtCVVMaster = new javax.swing.JTextField();
        jtxtNumTarjetaMaster = new javax.swing.JTextField();
        jtxtFechaCasuMaster = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jbtnMostrar = new javax.swing.JButton();
        jbtnCerrar = new javax.swing.JButton();
        jlblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtMontTotal.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jtxtMontTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "MONTO TOTAL A PAGAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N
        jPanel1.add(jtxtMontTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 250, 60));

        jtxtMontIns.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jtxtMontIns.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "MONTO POR INSTALACIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N
        jPanel1.add(jtxtMontIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 250, 60));

        jbtnConfirmar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jbtnConfirmar.setText("CONFIRMAR CONTRATO");
        jbtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 220, 70));

        jbtnIngresar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jbtnIngresar.setText("INGRESAR NUEVOS DATOS");
        jbtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 580, 220, 70));

        jtxtABoleta.setColumns(20);
        jtxtABoleta.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jtxtABoleta.setForeground(new java.awt.Color(0, 0, 255));
        jtxtABoleta.setRows(5);
        jtxtABoleta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "BOLETA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N
        jScrollPane1.setViewportView(jtxtABoleta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 470, 250));

        jtxtAPlanes.setColumns(20);
        jtxtAPlanes.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jtxtAPlanes.setForeground(new java.awt.Color(0, 0, 255));
        jtxtAPlanes.setRows(5);
        jScrollPane2.setViewportView(jtxtAPlanes);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 270, 200));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtNombres.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jtxtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Nombres", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N
        jPanel2.add(jtxtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 210, 60));

        jtxtApellidos.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jtxtApellidos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Apellidos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N
        jPanel2.add(jtxtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 210, 60));

        jtxtDistrito.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jtxtDistrito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE SU DISTRITO--", "Pueblo Libre", "Surquillo", "San Miguel", "Magdalena del Mar", "Jesús María", "Lince", "Santiago de Surco", "La Molina", "Miraflores", "Chorrillos", "Cercado de Lima", "San Isidro", "Callao", "Breña", "La Molina", "Los Olivos", "San Martin de Porres", "Comas", "San Juan de Lurigancho" }));
        jtxtDistrito.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Distrito", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N
        jPanel2.add(jtxtDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 190, 60));

        jtxtDNI.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jtxtDNI.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N
        jtxtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDNIActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 150, 60));

        jcbxDireccion.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jcbxDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Dirección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N
        jPanel2.add(jcbxDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, 60));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("INGRESE SUS DATOS");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 450, 40));

        jcbxTipoCliente.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jcbxTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE EL TIPO DE CLIENTE--", "Fiel", "Nuevo" }));
        jcbxTipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Cliente"));
        jPanel2.add(jcbxTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 230, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 470, 270));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel1.setText("MÉTODO DE PAGO");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 260, 40));

        jcbxPlan.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jcbxPlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE EL PLAN--", "100 mbps", "200 mbps", "600 mbps", "600 mbps plus", "1000 mbps" }));
        jcbxPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxPlanActionPerformed(evt);
            }
        });
        jPanel3.add(jcbxPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 240, 60));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtNumTarjetaVisa.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jtxtNumTarjetaVisa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Número de la Tarjeta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N
        jtxtNumTarjetaVisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNumTarjetaVisaActionPerformed(evt);
            }
        });
        jPanel4.add(jtxtNumTarjetaVisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 60));

        jtxtFechaCaduVisa.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jtxtFechaCaduVisa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Fecha de Caducación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N
        jtxtFechaCaduVisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFechaCaduVisaActionPerformed(evt);
            }
        });
        jPanel4.add(jtxtFechaCaduVisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 220, 60));

        jtxtCVVVisa.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jtxtCVVVisa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "CVV", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N
        jtxtCVVVisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCVVVisaActionPerformed(evt);
            }
        });
        jPanel4.add(jtxtCVVVisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 220, 60));

        jTabbedPane1.addTab("VISA", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtCVVMaster.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jtxtCVVMaster.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "CVV", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N
        jtxtCVVMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCVVMasterActionPerformed(evt);
            }
        });
        jPanel5.add(jtxtCVVMaster, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 220, 60));

        jtxtNumTarjetaMaster.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jtxtNumTarjetaMaster.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Número de la Tarjeta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N
        jtxtNumTarjetaMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNumTarjetaMasterActionPerformed(evt);
            }
        });
        jPanel5.add(jtxtNumTarjetaMaster, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 60));

        jtxtFechaCasuMaster.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jtxtFechaCasuMaster.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Fecha de Caducación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N
        jtxtFechaCasuMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFechaCasuMasterActionPerformed(evt);
            }
        });
        jPanel5.add(jtxtFechaCasuMaster, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 220, 60));

        jTabbedPane1.addTab("Mastercard", jPanel5);

        jPanel3.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 240, 260));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("SELECCIÓN DE PLAN Y MÉTODO DE PAGO");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 280, 440));

        jbtnMostrar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jbtnMostrar.setText("MOSTRAR LOS DATOS DE PAGO");
        jbtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 480, 220, 70));

        jbtnCerrar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jbtnCerrar.setText("CERRAR FORMULARIO");
        jbtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 580, 220, 70));
        jPanel1.add(jlblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 200, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDNIActionPerformed

    }//GEN-LAST:event_jtxtDNIActionPerformed

    private void jtxtCVVMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCVVMasterActionPerformed

    }//GEN-LAST:event_jtxtCVVMasterActionPerformed

    private void jbtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMostrarActionPerformed
        String Nombres = jtxtNombres.getText();
        String Apellidos = jtxtApellidos.getText();
        String direccion = jcbxDireccion.getText();
        String dni = jtxtDNI.getText();
        String tipocliente = jcbxTipoCliente.getSelectedItem().toString();
        String distrito = jtxtDistrito.getSelectedItem().toString();
        String tipoPlan = jcbxPlan.getSelectedItem().toString();
        cf = new ClienteFiel(Nombres, Apellidos, dni, distrito, direccion, tipocliente, tipoPlan);
        cn = new ClienteNuevo(Nombres, Apellidos, dni, distrito, direccion, tipocliente, tipoPlan);
        if(Nombres.equals("") || Apellidos.equals("") || direccion.equals("") || dni.equals("") || tipocliente.equals("--SELECCIONE EL TIPO DE CLIENTE--") 
           || distrito.equals("--SELECCIONE SU DISTRITO--") || tipoPlan.equals("--SELECCIONE EL PLAN--")){
           JOptionPane.showMessageDialog(null, "Error, Ingrese los Datos Completos");
        }else{
           if(tipocliente.equals("Fiel")){
              jtxtABoleta.append("Boleta de Venta:\n------------------------------------------\nNombres: "+cf.Nombres+"\n");
              jtxtABoleta.append("Apellidos: "+cf.Apellidos+"\n");
              jtxtABoleta.append("DNI: "+cf.dni+"\n");
              jtxtABoleta.append("Distrito: "+cf.distrito+"\n");
              jtxtABoleta.append("Dirección: "+cf.direccion+"\n");
              jtxtABoleta.append("Tipo de Cliente: "+cf.tipocliente+"\n");
              jtxtABoleta.append("Plan: "+cf.tipoPlan+"\n------------------------------------------\n");
              jtxtABoleta.append("Monto por instalación: S/ "+df.format(cf.CalcularMontoInstalacion())+"\n");
              jtxtABoleta.append("Monto Total a Pagar: S/ "+df.format(cf.CalcularMontoTotal())+"\n");
              jtxtMontIns.setText("S/"+Double.toString(cf.CalcularMontoInstalacion()));
              jtxtMontTotal.setText("S/"+Double.toString(cf.CalcularMontoTotal()));
           }
           if(tipocliente.equals("Nuevo")){
              jtxtABoleta.append("Boleta de Venta:\n------------------------------------------\nNombres: "+cf.Nombres+"\n");
              jtxtABoleta.append("Apellidos: "+cn.Apellidos+"\n");
              jtxtABoleta.append("DNI: "+cn.dni+"\n");
              jtxtABoleta.append("Distrito: "+cn.distrito+"\n");
              jtxtABoleta.append("Dirección: "+cn.direccion+"\n");
              jtxtABoleta.append("Tipo de Cliente: "+cn.tipocliente+"\n");
              jtxtABoleta.append("Plan: "+cn.tipoPlan+"\n------------------------------------------\n");
              jtxtABoleta.append("Monto por instalación: S/ "+df.format(cn.CalcularMontoInstalacion())+"\n");
              jtxtABoleta.append("Monto Total a Pagar: S/ "+df.format(cn.CalcularMontoTotal())+"\n"); 
              jtxtMontIns.setText("S/"+Double.toString(cn.CalcularMontoInstalacion()));
              jtxtMontTotal.setText("S/"+Double.toString(cn.CalcularMontoTotal()));
           }
           if(tipocliente.equals("--SELECCIONE EL TIPO DE CLIENTE--")){
              JOptionPane.showMessageDialog(null, "Error, Seleccione el Tipo de Cliente");
           }
        }

    }//GEN-LAST:event_jbtnMostrarActionPerformed
    
    private void jcbxPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxPlanActionPerformed

    }//GEN-LAST:event_jcbxPlanActionPerformed

    private void jbtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConfirmarActionPerformed
        String numtarjetavisa = jtxtNumTarjetaVisa.getText();
        String fechadecaduvisa = jtxtFechaCaduVisa.getText();
        String cvvvisa = jtxtCVVVisa.getText();
        String numtarjetamaster = jtxtNumTarjetaMaster.getText();
        String fechadecadumaster = jtxtFechaCasuMaster.getText();
        String cvvmaster = jtxtCVVMaster.getText();
        if(numtarjetavisa.equals("") && fechadecaduvisa.equals("") && cvvvisa.equals("") 
          && numtarjetamaster.equals("") && fechadecadumaster.equals("") && cvvmaster.equals("") ){
            JOptionPane.showMessageDialog(null, "Error, Ingrese los datos de la tarjeta de crédito");
        }else{
            JOptionPane.showMessageDialog(null, "Se ha confirmado exitosamente el pago"); 
        }       
    }//GEN-LAST:event_jbtnConfirmarActionPerformed

    private void jbtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCerrarActionPerformed
        System.exit(0);      
    }//GEN-LAST:event_jbtnCerrarActionPerformed

    private void jtxtNumTarjetaVisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNumTarjetaVisaActionPerformed
       
    }//GEN-LAST:event_jtxtNumTarjetaVisaActionPerformed

    private void jtxtNumTarjetaMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNumTarjetaMasterActionPerformed

    }//GEN-LAST:event_jtxtNumTarjetaMasterActionPerformed

    private void jtxtFechaCasuMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFechaCasuMasterActionPerformed

    }//GEN-LAST:event_jtxtFechaCasuMasterActionPerformed

    private void jtxtFechaCaduVisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFechaCaduVisaActionPerformed
    
    }//GEN-LAST:event_jtxtFechaCaduVisaActionPerformed

    private void jtxtCVVVisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCVVVisaActionPerformed
 
    }//GEN-LAST:event_jtxtCVVVisaActionPerformed

    private void jbtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIngresarActionPerformed
        jcbxPlan.setSelectedIndex(0);
        jcbxTipoCliente.setSelectedIndex(0);
        jtxtDistrito.setSelectedIndex(0);
        jtxtABoleta.setText("");
        jtxtMontIns.setText("");
        jtxtMontTotal.setText("");
        jcbxDireccion.setText("");
        jtxtDNI.setText("");
        jtxtNombres.setText("");
        jtxtApellidos.setText("");
        jtxtNumTarjetaVisa.setText("");
        jtxtFechaCaduVisa.setText("");
        jtxtCVVVisa.setText("");
        jtxtNumTarjetaMaster.setText("");
        jtxtFechaCasuMaster.setText("");
        jtxtCVVMaster.setText("");  
        jtxtABoleta.setText("");   
        jtxtNombres.requestFocus();
    }//GEN-LAST:event_jbtnIngresarActionPerformed

    String PlanesWIN() {
        return "Planes de Fibra Óptica WIN : \n100 mbps - S/79 \n200 mbps - S/99 \n600 mbps - S/169 + Un Mesh"
                + "\n600 mbps Plus - S/259 + Doble Mesh y Antivirus Gratis \n1000 mbps - S/459";   
    }
    
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
            java.util.logging.Logger.getLogger(Proyecto_win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proyecto_win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proyecto_win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proyecto_win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyecto_win().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnCerrar;
    private javax.swing.JButton jbtnConfirmar;
    private javax.swing.JButton jbtnIngresar;
    private javax.swing.JButton jbtnMostrar;
    private javax.swing.JTextField jcbxDireccion;
    private javax.swing.JComboBox<String> jcbxPlan;
    private javax.swing.JComboBox<String> jcbxTipoCliente;
    private javax.swing.JLabel jlblImagen;
    private javax.swing.JTextArea jtxtABoleta;
    private javax.swing.JTextArea jtxtAPlanes;
    private javax.swing.JTextField jtxtApellidos;
    private javax.swing.JTextField jtxtCVVMaster;
    private javax.swing.JTextField jtxtCVVVisa;
    private javax.swing.JTextField jtxtDNI;
    private javax.swing.JComboBox<String> jtxtDistrito;
    private javax.swing.JTextField jtxtFechaCaduVisa;
    private javax.swing.JTextField jtxtFechaCasuMaster;
    private javax.swing.JTextField jtxtMontIns;
    private javax.swing.JTextField jtxtMontTotal;
    private javax.swing.JTextField jtxtNombres;
    private javax.swing.JTextField jtxtNumTarjetaMaster;
    private javax.swing.JTextField jtxtNumTarjetaVisa;
    // End of variables declaration//GEN-END:variables
}
