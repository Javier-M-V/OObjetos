/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafic;

import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javier.oobjetos.Pasajeros;
import javier.oobjetos.Tripulacion;
import javier.oobjetos.Vuelo;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;
import org.neodatis.odb.ODBServer;

/**
 *
 * @author Javier M
 */
public class MainWindow extends javax.swing.JFrame implements WindowListener {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        
        initComponents();
        server = ODBFactory.openServer(8000);
        server.addBase("basedatos", "./vuelos.neo");
        server.startServer(true);
        odb = server.openClient("basedatos");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPanePrincipal = new javax.swing.JTabbedPane();
        jPanelTripulacion = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCodigoTripulacion = new javax.swing.JTextField();
        jTextFieldNombreTripulacion = new javax.swing.JTextField();
        jTextFieldcategoriaTripulacion = new javax.swing.JTextField();
        jButtonConsultarTripulacion = new javax.swing.JButton();
        jButtonModificarTripulacion = new javax.swing.JButton();
        jButtoninsertarTripulacion = new javax.swing.JButton();
        jButtonBorrarTripulacion = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButtonAceptarTripulacion = new javax.swing.JButton();
        jButtonCancelarTripulacion = new javax.swing.JButton();
        jPanelPasajeros = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCodigoPasajeros = new javax.swing.JTextField();
        jTextFieldNombrePasajeros = new javax.swing.JTextField();
        jTextFieldTelefonoPasajeros = new javax.swing.JTextField();
        jButtonConsultarPasajeros = new javax.swing.JButton();
        jButtonModificarPasajeros = new javax.swing.JButton();
        jButtoninsertarPasajeros = new javax.swing.JButton();
        jButtonBorrarPasajeros = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButtonAceptarPasajeros = new javax.swing.JButton();
        jButtonCancelarPasajeros = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldDireccionPasajeros = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldIdentificadorVuelos = new javax.swing.JTextField();
        jTextFieldOrigenVuelos = new javax.swing.JTextField();
        jTextFieldDestinoVuelos = new javax.swing.JTextField();
        jButtonConsultarVuelos = new javax.swing.JButton();
        jButtonModificarVuelos = new javax.swing.JButton();
        jButtoninsertarVuelos = new javax.swing.JButton();
        jButtonBorrarVuelos = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButtonAceptarVuelos = new javax.swing.JButton();
        jButtonCancelarVuelos = new javax.swing.JButton();
        jButtonGestionTripulantes = new javax.swing.JButton();
        jButtonGestionPasajeros = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTripulacion = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePasajeros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanelTripulacion.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelTripulacionComponentShown(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Datos de Tripulante");

        jLabel2.setText("Código:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Categoría:");

        jButtonConsultarTripulacion.setText("Consultar");
        jButtonConsultarTripulacion.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButtonConsultarTripulacionComponentShown(evt);
            }
        });
        jButtonConsultarTripulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarTripulacionActionPerformed(evt);
            }
        });

        jButtonModificarTripulacion.setText("Modificar");
        jButtonModificarTripulacion.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButtonModificarTripulacionComponentShown(evt);
            }
        });
        jButtonModificarTripulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarTripulacionActionPerformed(evt);
            }
        });

        jButtoninsertarTripulacion.setText("Insertar");
        jButtoninsertarTripulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoninsertarTripulacionActionPerformed(evt);
            }
        });

        jButtonBorrarTripulacion.setText("Borrar");
        jButtonBorrarTripulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarTripulacionActionPerformed(evt);
            }
        });

        jButtonAceptarTripulacion.setText("Aceptar");
        jButtonAceptarTripulacion.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButtonAceptarTripulacionComponentShown(evt);
            }
        });
        jButtonAceptarTripulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarTripulacionActionPerformed(evt);
            }
        });

        jButtonCancelarTripulacion.setText("Cancelar");
        jButtonCancelarTripulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarTripulacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButtonAceptarTripulacion)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelarTripulacion)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptarTripulacion)
                    .addComponent(jButtonCancelarTripulacion))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(16, 16, 16))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldcategoriaTripulacion)
                                    .addComponent(jTextFieldNombreTripulacion, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                    .addComponent(jTextFieldCodigoTripulacion))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonModificarTripulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonConsultarTripulacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtoninsertarTripulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBorrarTripulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCodigoTripulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombreTripulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldcategoriaTripulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonConsultarTripulacion)
                            .addComponent(jButtoninsertarTripulacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonModificarTripulacion)
                            .addComponent(jButtonBorrarTripulacion))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelTripulacionLayout = new javax.swing.GroupLayout(jPanelTripulacion);
        jPanelTripulacion.setLayout(jPanelTripulacionLayout);
        jPanelTripulacionLayout.setHorizontalGroup(
            jPanelTripulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTripulacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanelTripulacionLayout.setVerticalGroup(
            jPanelTripulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTripulacionLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(381, Short.MAX_VALUE))
        );

        jTabbedPanePrincipal.addTab("Tripulación", jPanelTripulacion);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Datos de Pasajero");

        jLabel6.setText("Código:");

        jLabel7.setText("Nombre:");

        jLabel8.setText("Teléfono:");

        jButtonConsultarPasajeros.setText("Consultar");
        jButtonConsultarPasajeros.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButtonConsultarPasajerosComponentShown(evt);
            }
        });
        jButtonConsultarPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarPasajerosActionPerformed(evt);
            }
        });

        jButtonModificarPasajeros.setText("Modificar");
        jButtonModificarPasajeros.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButtonModificarPasajerosComponentShown(evt);
            }
        });
        jButtonModificarPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarPasajerosActionPerformed(evt);
            }
        });

        jButtoninsertarPasajeros.setText("Insertar");
        jButtoninsertarPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoninsertarPasajerosActionPerformed(evt);
            }
        });

        jButtonBorrarPasajeros.setText("Borrar");
        jButtonBorrarPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarPasajerosActionPerformed(evt);
            }
        });

        jButtonAceptarPasajeros.setText("Aceptar");
        jButtonAceptarPasajeros.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButtonAceptarPasajerosComponentShown(evt);
            }
        });
        jButtonAceptarPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarPasajerosActionPerformed(evt);
            }
        });

        jButtonCancelarPasajeros.setText("Cancelar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButtonAceptarPasajeros)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelarPasajeros)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptarPasajeros)
                    .addComponent(jButtonCancelarPasajeros))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel9.setText("Dirección:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jTextFieldCodigoPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextFieldNombrePasajeros, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldTelefonoPasajeros)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDireccionPasajeros)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonModificarPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonConsultarPasajeros))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtoninsertarPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBorrarPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCodigoPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombrePasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTelefonoPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonConsultarPasajeros)
                            .addComponent(jButtoninsertarPasajeros))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonModificarPasajeros)
                            .addComponent(jButtonBorrarPasajeros))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDireccionPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPasajerosLayout = new javax.swing.GroupLayout(jPanelPasajeros);
        jPanelPasajeros.setLayout(jPanelPasajerosLayout);
        jPanelPasajerosLayout.setHorizontalGroup(
            jPanelPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPasajerosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanelPasajerosLayout.setVerticalGroup(
            jPanelPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPasajerosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
        );

        jTabbedPanePrincipal.addTab("Pasajeros", jPanelPasajeros);

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("Datos de Vuelo");

        jLabel11.setText("Identificador");

        jLabel12.setText("Origen:");

        jLabel13.setText("Destino:");

        jButtonConsultarVuelos.setText("Consultar");
        jButtonConsultarVuelos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButtonConsultarVuelosComponentShown(evt);
            }
        });
        jButtonConsultarVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarVuelosActionPerformed(evt);
            }
        });

        jButtonModificarVuelos.setText("Modificar");
        jButtonModificarVuelos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButtonModificarVuelosComponentShown(evt);
            }
        });
        jButtonModificarVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarVuelosActionPerformed(evt);
            }
        });

        jButtoninsertarVuelos.setText("Insertar");
        jButtoninsertarVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoninsertarVuelosActionPerformed(evt);
            }
        });

        jButtonBorrarVuelos.setText("Borrar");
        jButtonBorrarVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarVuelosActionPerformed(evt);
            }
        });

        jButtonAceptarVuelos.setText("Aceptar");
        jButtonAceptarVuelos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButtonAceptarVuelosComponentShown(evt);
            }
        });
        jButtonAceptarVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarVuelosActionPerformed(evt);
            }
        });

        jButtonCancelarVuelos.setText("Cancelar");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButtonAceptarVuelos)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelarVuelos)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptarVuelos)
                    .addComponent(jButtonCancelarVuelos))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jButtonGestionTripulantes.setText("Gestión de Tripulantes");
        jButtonGestionTripulantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionTripulantesActionPerformed(evt);
            }
        });

        jButtonGestionPasajeros.setText("Gestión de Pasajeros");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldIdentificadorVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(17, 17, 17)
                                .addComponent(jTextFieldOrigenVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDestinoVuelos)))
                        .addGap(18, 27, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonModificarVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonConsultarVuelos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtoninsertarVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonBorrarVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButtonGestionTripulantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGestionPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIdentificadorVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldOrigenVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDestinoVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonConsultarVuelos)
                            .addComponent(jButtoninsertarVuelos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonModificarVuelos)
                            .addComponent(jButtonBorrarVuelos))))
                .addGap(18, 18, 18)
                .addComponent(jButtonGestionTripulantes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGestionPasajeros))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Personal de tripulación : 0"));

        jTableTripulacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableTripulacion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero de Pasajeros: 0"));

        jTablePasajeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Teléfono", "Dirección"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePasajeros);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jTabbedPanePrincipal.addTab("Vuelos", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPanePrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtoninsertarTripulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoninsertarTripulacionActionPerformed
        limpiarCamposTripulacion();
        switchCamposTripulacion(true, true, true);
        switchBotonesTripulacion(false, true, false, false);
        jButtonAceptarTripulacion.setEnabled(true);
        control = 1;
    }//GEN-LAST:event_jButtoninsertarTripulacionActionPerformed

    private void jButtonModificarTripulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarTripulacionActionPerformed
        switchCamposTripulacion(false, true, true);
        control = 2;
    }//GEN-LAST:event_jButtonModificarTripulacionActionPerformed

    private void jButtonModificarTripulacionComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButtonModificarTripulacionComponentShown
        
    }//GEN-LAST:event_jButtonModificarTripulacionComponentShown

    private void jButtonConsultarTripulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarTripulacionActionPerformed
       if (!jTextFieldCodigoTripulacion.getText().isEmpty()){
            IQuery query = new CriteriaQuery(Tripulacion.class, Where.equal("codigo", Integer.parseInt(jTextFieldCodigoTripulacion.getText())));
            Objects<Tripulacion> resultado = odb.getObjects(query);
            if(resultado.size()==0){
                JOptionPane.showMessageDialog(this,"Objeto no encontrado");
                //jPanelTripulacionComponentShown(new ComponentEvent (this, 0));
            }
            else{
                Tripulacion tripulante = resultado.getFirst();
                tripulanteBuscado = tripulante;
                jTextFieldNombreTripulacion.setText(tripulante.getNombre());
                jTextFieldcategoriaTripulacion.setText(tripulante.getCategoria());
                //jPanelTripulacionComponentShown(new ComponentEvent (this, 0));
                switchBotonesTripulacion(true, true, true, true);
            }  
        }
       else{
            JOptionPane.showMessageDialog(this,"Introduces datos en el campo código");
        }
    }//GEN-LAST:event_jButtonConsultarTripulacionActionPerformed

    private void jButtonConsultarTripulacionComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButtonConsultarTripulacionComponentShown
        
    }//GEN-LAST:event_jButtonConsultarTripulacionComponentShown

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        server.close();
        odb.close();
    }//GEN-LAST:event_formWindowClosed

    private void jButtonAceptarTripulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarTripulacionActionPerformed
        switch(control){
        
            case 1:
                //insertar
                if(!(jTextFieldCodigoTripulacion.getText().isEmpty()||jTextFieldNombreTripulacion.getText().isEmpty()||jTextFieldcategoriaTripulacion.getText().isEmpty())){
                    IQuery query = new CriteriaQuery(Tripulacion.class, Where.equal("codigo", Integer.parseInt(jTextFieldCodigoTripulacion.getText())));
                    Objects<Tripulacion> resultado = odb.getObjects(query);
                    if(resultado.size()!=0){

                        JOptionPane.showMessageDialog(this, "Hay un objeto en la BBDD con ese código");
                    }
                    else {
                        Tripulacion tripulante = new Tripulacion (
                            Integer.parseInt(jTextFieldCodigoTripulacion.getText()), 
                            jTextFieldNombreTripulacion.getText()
                            ,jTextFieldcategoriaTripulacion.getText());
                        odb.store(tripulante);
                        odb.commit();
                        JOptionPane.showMessageDialog(this, "Pos guardao'");
                        jPanelTripulacionComponentShown(new ComponentEvent (this, 0));              
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Introduce datos en todos los campos");
                }
                break;
 
            case 2://modificar
                //buscar para comprobar si anda repetido
                IQuery query2 = new CriteriaQuery(Tripulacion.class, Where.equal("codigo", jTextFieldCodigoTripulacion.getText()));//tripulante buscado
                Objects <Tripulacion> resultados = odb.getObjects(query2);
                if(Integer.parseInt(jTextFieldCodigoTripulacion.getText()) == tripulanteBuscado.getCodigo()){
                    tripulanteBuscado.setNombre(jTextFieldNombreTripulacion.getText());
                    tripulanteBuscado.setCategoria(jTextFieldcategoriaTripulacion.getText());
                    odb.store(tripulanteBuscado);
                    odb.commit();
                    JOptionPane.showMessageDialog(this, "Guardadito");
                }
                else if(resultados.size()!=0) {
                   
                    JOptionPane.showMessageDialog(this, "El código introducido ya existe en la BBDD");
                }
                else{
                    tripulanteBuscado.setCodigo(Integer.parseInt(jTextFieldCodigoTripulacion.getText()));
                    tripulanteBuscado.setNombre(jTextFieldNombreTripulacion.getText());
                    tripulanteBuscado.setCategoria(jTextFieldcategoriaTripulacion.getText());
                    odb.store(tripulanteBuscado);
                    odb.commit();
                    JOptionPane.showMessageDialog(this, "Guardadito");
                    
                }
                jPanelTripulacionComponentShown(new ComponentEvent (this, 0));
                break;
                
            case 3: //delete
                
                int BotonSi = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog (null, "¿Seguro quieres borrar a este tripulante?","Aviso",BotonSi);
                if(dialogResult == JOptionPane.YES_OPTION){
                    odb.delete(tripulanteBuscado);
                    odb.commit();
                    limpiarCamposTripulacion();
                    JOptionPane.showMessageDialog(this, "Borradito");
                }
                switchBotonesTripulacion(true,true,false,false);
                break;
                               
            default:
                break;          
        }
    }//GEN-LAST:event_jButtonAceptarTripulacionActionPerformed

    private void jButtonAceptarTripulacionComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButtonAceptarTripulacionComponentShown
        
    }//GEN-LAST:event_jButtonAceptarTripulacionComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void jPanelTripulacionComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelTripulacionComponentShown
        switchCamposTripulacion(true, false, false);
        switchBotonesTripulacion(true, true, false, false);
    }//GEN-LAST:event_jPanelTripulacionComponentShown

    private void jButtonConsultarPasajerosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButtonConsultarPasajerosComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsultarPasajerosComponentShown

    private void jButtonConsultarPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarPasajerosActionPerformed
         if (!jTextFieldCodigoPasajeros.getText().isEmpty()){
            IQuery query = new CriteriaQuery(Pasajeros.class, Where.equal("codigo", Integer.parseInt(jTextFieldCodigoPasajeros.getText())));
            Objects<Pasajeros> resultado = odb.getObjects(query);
            if(resultado.size() == 0){
                JOptionPane.showMessageDialog(this,"Objeto no encontrado");
                //jPanelTripulacionComponentShown(new ComponentEvent (this, 0));
            }
            else{
                Pasajeros pasajero = resultado.getFirst();
                pasajerobuscado = pasajero;
                jTextFieldNombrePasajeros.setText(pasajero.getNombre());
                jTextFieldTelefonoPasajeros.setText(pasajero.getTel());
                jTextFieldDireccionPasajeros.setText(pasajero.getDireccion());
                //jPanelTripulacionComponentShown(new ComponentEvent (this, 0));
                switchBotonesPasajeros(true, true, true, true);
            }  
        }
       else{
            JOptionPane.showMessageDialog(this,"Introduzca datos en el campo código");
        }
    }//GEN-LAST:event_jButtonConsultarPasajerosActionPerformed

    private void jButtonModificarPasajerosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButtonModificarPasajerosComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonModificarPasajerosComponentShown

    private void jButtonModificarPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarPasajerosActionPerformed
        control = 2;
    }//GEN-LAST:event_jButtonModificarPasajerosActionPerformed

    private void jButtoninsertarPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoninsertarPasajerosActionPerformed
        control = 1;
    }//GEN-LAST:event_jButtoninsertarPasajerosActionPerformed

    private void jButtonAceptarPasajerosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButtonAceptarPasajerosComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAceptarPasajerosComponentShown

    private void jButtonAceptarPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarPasajerosActionPerformed
        switch(control){
        
            case 1://insertar
                if(!(jTextFieldCodigoPasajeros.getText().isEmpty()||
                        jTextFieldNombrePasajeros.getText().isEmpty()||
                        jTextFieldDireccionPasajeros.getText().isEmpty()||
                        jTextFieldTelefonoPasajeros.getText().isEmpty())){
                    IQuery query = new CriteriaQuery(Pasajeros.class, Where.equal("codigo", Integer.parseInt(jTextFieldCodigoPasajeros.getText())));
                    Objects<Pasajeros> resultado = odb.getObjects(query);
                    if(resultado.size()!=0){

                        JOptionPane.showMessageDialog(this, "Ya hay un objeto en la BBDD con ese código");
                    }
                    else {
                        Pasajeros pasajero = new Pasajeros(
                            Integer.parseInt(jTextFieldCodigoPasajeros.getText()), 
                            jTextFieldNombrePasajeros.getText(),
                            jTextFieldTelefonoPasajeros.getText(),
                            jTextFieldDireccionPasajeros.getText());
                        odb.store(pasajero);
                        odb.commit();
                        JOptionPane.showMessageDialog(this, "Pos guardao'");
                        jPanelTripulacionComponentShown(new ComponentEvent (this, 0));              
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Introduce datos en todos los campos");
                }
                break;
                
            case 2:
                //buscar para comprobar si anda repetido
                IQuery query2 = new CriteriaQuery(Pasajeros.class, Where.equal("codigo", jTextFieldCodigoPasajeros.getText()));//pasajero buscado
                Objects <Pasajeros> resultados = odb.getObjects(query2);
                if(Integer.parseInt(jTextFieldCodigoPasajeros.getText()) == pasajerobuscado.getCodigo()){
                    pasajerobuscado.setNombre(jTextFieldCodigoPasajeros.getText());
                    pasajerobuscado.setTel(jTextFieldTelefonoPasajeros.getText());
                    pasajerobuscado.setDireccion(jTextFieldDireccionPasajeros.getText());
                    pasajerobuscado.setNombre(jTextFieldNombrePasajeros.getText());
                    odb.store(pasajerobuscado);
                    odb.commit();
                    JOptionPane.showMessageDialog(this, "Guardadito");
                }
                else if(resultados.size()!=0) {
                   
                    JOptionPane.showMessageDialog(this, "El código introducido ya existe en la BBDD");
                }
                else{
                    pasajerobuscado.setCodigo(Integer.parseInt(jTextFieldCodigoTripulacion.getText()));
                    pasajerobuscado.setNombre(jTextFieldCodigoPasajeros.getText());
                    pasajerobuscado.setTel(jTextFieldTelefonoPasajeros.getText());
                    pasajerobuscado.setDireccion(jTextFieldDireccionPasajeros.getText());
                    pasajerobuscado.setNombre(jTextFieldNombrePasajeros.getText());
                    odb.store(pasajerobuscado);
                    odb.commit();
                    JOptionPane.showMessageDialog(this, "Guardadito");
                    
                }
                jPanelTripulacionComponentShown(new ComponentEvent (this, 0));
                break;
        
            case 3:
                int BotonSi = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog (null, "¿Seguro quieres borrar a este pasajero?","Aviso",BotonSi);
                if(dialogResult == JOptionPane.YES_OPTION){
                    odb.delete(pasajerobuscado);
                    odb.commit();
                    limpiarCamposPasajeros();
                    JOptionPane.showMessageDialog(this, "Borradito");
                }
                switchBotonesPasajeros(true,true,false,false);
                break;        
        }
    }//GEN-LAST:event_jButtonAceptarPasajerosActionPerformed

    private void jButtonConsultarVuelosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButtonConsultarVuelosComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsultarVuelosComponentShown

    private void jButtonConsultarVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarVuelosActionPerformed
        if (!jTextFieldIdentificadorVuelos.getText().isEmpty()){
            IQuery query = new CriteriaQuery(Vuelo.class, Where.equal("identificador", jTextFieldIdentificadorVuelos.getText()));
            Objects<Vuelo> resultado = odb.getObjects(query);
            if(resultado.size() == 0){
                JOptionPane.showMessageDialog(this,"Objeto no encontrado");
            }
            else{
                Vuelo vuelo = resultado.getFirst();
                vuelobuscado = vuelo;
                jTextFieldIdentificadorVuelos.setText(vuelo.getIdentificador());
                jTextFieldOrigenVuelos.setText(vuelo.getAeropuerto_origen());
                jTextFieldDestinoVuelos.setText(vuelo.getAeropuerto_destino());
                
                DefaultTableModel modeloTabla = (DefaultTableModel) jTableTripulacion.getModel();

                modeloTabla.setRowCount(vuelobuscado.getTripulacionSet().size());
                Set<Tripulacion> settripulacion = vuelobuscado.getTripulacionSet();
                int i = 0;
                if(settripulacion!=null){
                    Iterator iteratriupacion = settripulacion.iterator();
                    while (iteratriupacion.hasNext())
                    {
                        Tripulacion tripu = (Tripulacion) iteratriupacion.next();
                        modeloTabla.setValueAt(tripu.getCodigo(), i, 0);
                        modeloTabla.setValueAt(tripu.getNombre(), i, 1);
                        modeloTabla.setValueAt(tripu.getCategoria(), i, 2);
                        i++;
                    }
                    jTableTripulacion.setModel(modeloTabla);
                }
            }  
        }
            
       else{
            JOptionPane.showMessageDialog(this,"Introduzca datos en el campo código");
        }
    }//GEN-LAST:event_jButtonConsultarVuelosActionPerformed

    private void jButtonModificarVuelosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButtonModificarVuelosComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonModificarVuelosComponentShown

    private void jButtonModificarVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarVuelosActionPerformed
        controlvuelo = 2;
        switchCamposVuelos(false,true,true);
        switchBotonesVuelo(true, true, false, false);
    }//GEN-LAST:event_jButtonModificarVuelosActionPerformed

    private void jButtoninsertarVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoninsertarVuelosActionPerformed
        controlvuelo = 1;
    }//GEN-LAST:event_jButtoninsertarVuelosActionPerformed

    private void jButtonAceptarVuelosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButtonAceptarVuelosComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAceptarVuelosComponentShown

    private void jButtonAceptarVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarVuelosActionPerformed
        switch(controlvuelo){  
            case 1:
                if(!(jTextFieldIdentificadorVuelos.getText().isEmpty()||jTextFieldOrigenVuelos.getText().isEmpty()||jTextFieldDestinoVuelos.getText().isEmpty())){
                    IQuery query = new CriteriaQuery(Vuelo.class, Where.equal("identificador", jTextFieldIdentificadorVuelos.getText()));
                    Objects<Vuelo> resultado = odb.getObjects(query);
                    if(resultado.size()!=0){

                        JOptionPane.showMessageDialog(this, "Ya hay un objeto en la BBDD con ese código");
                    }
                    else {
                        Vuelo vuelo = new Vuelo(
                            jTextFieldIdentificadorVuelos.getText(), 
                            jTextFieldOrigenVuelos.getText(),
                            jTextFieldDestinoVuelos.getText());
                        odb.store(vuelo);
                        odb.commit();
                        JOptionPane.showMessageDialog(this, "Pos guardao'");
                        jPanelTripulacionComponentShown(new ComponentEvent (this, 0));              
                    }
                    }
                else{
                    JOptionPane.showMessageDialog(this, "Introduce datos en todos los campos");
                }           
                break;
                
                case 2://modificar
                    IQuery query2 = new CriteriaQuery(Vuelo.class, Where.equal("identificador", jTextFieldIdentificadorVuelos.getText()));//pasajero buscado
                    Objects <Pasajeros> resultados = odb.getObjects(query2);
                    vuelobuscado.setAeropuerto_destino(jTextFieldDestinoVuelos.getText());
                    vuelobuscado.setAeropuerto_origen(jTextFieldOrigenVuelos.getText());
                    odb.store(vuelobuscado);
                    odb.commit();
                    JOptionPane.showMessageDialog(this, "Guardadito");   
                    jPanelTripulacionComponentShown(new ComponentEvent (this, 0));
                    switchBotonesVuelo(true,true,true,true);
                    switchCamposVuelos(true,true,true);
                    break;

                case 3:// borrar
                    int BotonSi = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog (null, "¿Seguro quieres borrar este vuelo","Aviso",BotonSi);
                    if(dialogResult == JOptionPane.YES_OPTION){
                        odb.delete(vuelobuscado);
                        odb.commit();
                        limpiarCamposPasajeros();
                        JOptionPane.showMessageDialog(this, "Borradito");
                    }  
                    break;        
        }  
    }//GEN-LAST:event_jButtonAceptarVuelosActionPerformed

    private void jButtonGestionTripulantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionTripulantesActionPerformed
        ventanatripulacion = new TripulacionVuelo(this);
        ventanatripulacion.setVisible(true);
    }//GEN-LAST:event_jButtonGestionTripulantesActionPerformed

    private void jButtonBorrarTripulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarTripulacionActionPerformed
        control = 3;
        switchBotonesTripulacion(false,false,false,true);
    }//GEN-LAST:event_jButtonBorrarTripulacionActionPerformed
    /*consultar, insertar, modificar, borrar*/
    private void jButtonCancelarTripulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarTripulacionActionPerformed
        control = 0;
        switchBotonesTripulacion(true,true,false,false);
        limpiarCamposTripulacion();
        jButtonAceptarTripulacion.setEnabled(false);
        
        
    }//GEN-LAST:event_jButtonCancelarTripulacionActionPerformed

    private void jButtonBorrarPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarPasajerosActionPerformed
        control = 3;
        switchBotonesPasajeros(true, true, false, false);
        
    }//GEN-LAST:event_jButtonBorrarPasajerosActionPerformed

    private void jButtonBorrarVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarVuelosActionPerformed
        controlvuelo = 3;
        
    }//GEN-LAST:event_jButtonBorrarVuelosActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptarPasajeros;
    private javax.swing.JButton jButtonAceptarTripulacion;
    private javax.swing.JButton jButtonAceptarVuelos;
    private javax.swing.JButton jButtonBorrarPasajeros;
    private javax.swing.JButton jButtonBorrarTripulacion;
    private javax.swing.JButton jButtonBorrarVuelos;
    private javax.swing.JButton jButtonCancelarPasajeros;
    private javax.swing.JButton jButtonCancelarTripulacion;
    private javax.swing.JButton jButtonCancelarVuelos;
    private javax.swing.JButton jButtonConsultarPasajeros;
    private javax.swing.JButton jButtonConsultarTripulacion;
    private javax.swing.JButton jButtonConsultarVuelos;
    private javax.swing.JButton jButtonGestionPasajeros;
    private javax.swing.JButton jButtonGestionTripulantes;
    private javax.swing.JButton jButtonModificarPasajeros;
    private javax.swing.JButton jButtonModificarTripulacion;
    private javax.swing.JButton jButtonModificarVuelos;
    private javax.swing.JButton jButtoninsertarPasajeros;
    private javax.swing.JButton jButtoninsertarTripulacion;
    private javax.swing.JButton jButtoninsertarVuelos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelPasajeros;
    private javax.swing.JPanel jPanelTripulacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPanePrincipal;
    private javax.swing.JTable jTablePasajeros;
    private javax.swing.JTable jTableTripulacion;
    private javax.swing.JTextField jTextFieldCodigoPasajeros;
    private javax.swing.JTextField jTextFieldCodigoTripulacion;
    private javax.swing.JTextField jTextFieldDestinoVuelos;
    private javax.swing.JTextField jTextFieldDireccionPasajeros;
    private javax.swing.JTextField jTextFieldIdentificadorVuelos;
    private javax.swing.JTextField jTextFieldNombrePasajeros;
    private javax.swing.JTextField jTextFieldNombreTripulacion;
    private javax.swing.JTextField jTextFieldOrigenVuelos;
    private javax.swing.JTextField jTextFieldTelefonoPasajeros;
    private javax.swing.JTextField jTextFieldcategoriaTripulacion;
    // End of variables declaration//GEN-END:variables
    
    private static ODB odb = null;
    private static ODBServer server = null;
    private Tripulacion tripulanteBuscado = null;
    private Pasajeros pasajerobuscado = null;
    private int control = 0;
    private int controlvuelo = 0;
    public Vuelo vuelobuscado = null;
    TripulacionVuelo ventanatripulacion;
    
    public static ODB getOdb(){
        return odb;
    }
    public static void setOdb(){
        MainWindow.odb = odb;
    }
    
    private void switchCamposTripulacion(Boolean codigo, Boolean nombre, Boolean categoria){
    
        jTextFieldCodigoTripulacion.setEnabled(codigo);
        jTextFieldNombreTripulacion.setEnabled(nombre);
        jTextFieldcategoriaTripulacion.setEnabled(categoria);
    }
    
    private void limpiarCamposTripulacion(){
        jTextFieldCodigoTripulacion.setText("");
        jTextFieldNombreTripulacion.setText("");
        jTextFieldcategoriaTripulacion.setText("");
    
    }
    
     private void limpiarCamposPasajeros() {
        jTextFieldCodigoPasajeros.setText("");
        jTextFieldDireccionPasajeros.setText("");
        jTextFieldNombrePasajeros.setText("");
        jTextFieldTelefonoPasajeros.setText("");         
    }
    /*consultar, insertar, modificar, borrar*/
    private void switchBotonesTripulacion(Boolean consulta, Boolean insertar, Boolean modificar, Boolean borrar ){
    
        jButtonConsultarTripulacion.setEnabled(consulta);
        jButtoninsertarTripulacion.setEnabled(insertar);
        jButtonModificarTripulacion.setEnabled(modificar);
        jButtonBorrarTripulacion.setEnabled(borrar);
    
    }
    
    private void switchBotonesPasajeros(Boolean consulta, Boolean insertar, Boolean modificar, Boolean borrar ){
    
        jButtonConsultarPasajeros.setEnabled(consulta);
        jButtoninsertarPasajeros.setEnabled(insertar);
        jButtonModificarPasajeros.setEnabled(modificar);
        jButtonBorrarPasajeros.setEnabled(borrar);
    
    }
    
    private void switchBotonesVuelo(Boolean consulta, Boolean insertar, Boolean modificar, Boolean borrar ){
    
        jButtonConsultarVuelos.setEnabled(consulta);
        jButtoninsertarVuelos.setEnabled(insertar);
        jButtonModificarVuelos.setEnabled(modificar);
        jButtonBorrarVuelos.setEnabled(borrar);
    
    }
    
     private void switchCamposVuelos (Boolean codigo, Boolean origen, Boolean destino){
    
        jTextFieldIdentificadorVuelos.setEnabled(codigo);
        jTextFieldOrigenVuelos.setEnabled(origen);
        jTextFieldDestinoVuelos.setEnabled(destino);
    }

    @Override
    public void windowOpened(WindowEvent we) {
        
    }

    @Override
    public void windowClosing(WindowEvent we) {
        
    }

    @Override
    public void windowClosed(WindowEvent we) {
        System.out.println("Cerrada");
        jButtonConsultarVuelosActionPerformed(new ActionEvent(this,0,""));
    }

    @Override
    public void windowIconified(WindowEvent we) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
       
    }

    @Override
    public void windowActivated(WindowEvent we) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
 
    }

    private void jButtonAceptarTripulacion(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


