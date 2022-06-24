/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.EmpleadoControlador;
import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import Modelo.Departamento;
import javax.swing.JOptionPane;


public class EmpleadoVista extends javax.swing.JInternalFrame {

    
    private final EmpleadoControlador empleadoControlador;
    private TableModel modeloTablaEmpleados;
    
    public EmpleadoVista() {
        initComponents();
        this.empleadoControlador = new EmpleadoControlador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldCedula = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonAgregarEmpleado = new javax.swing.JButton();
        jButtonMostrarEmpleados = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jComboBoxNacionalidad = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jComboBoxDepartamentosEmpleado = new javax.swing.JComboBox<>();
        jTextFieldCargo = new javax.swing.JTextField();
        jTextFieldSalario = new javax.swing.JTextField();
        jComboBoxAnioNac = new javax.swing.JComboBox<>();
        jComboBoxMesNac = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpleados = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBoxDiaNac = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empleados");

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel19.setText("Nombre");

        jTextFieldCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCedulaKeyReleased(evt);
            }
        });

        jButtonAgregarEmpleado.setText("AGREGAR");
        jButtonAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarEmpleadoActionPerformed(evt);
            }
        });

        jButtonMostrarEmpleados.setText("MOSTRAR");
        jButtonMostrarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarEmpleadosActionPerformed(evt);
            }
        });

        jLabel7.setText("Cedula");

        jLabel11.setText("Fecha Nacimiento");

        jLabel12.setText("Nacionalidad");

        jLabel13.setText("direccion");

        jComboBoxNacionalidad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alemania", "Argentina", "Belgica", "Brasil", "Bolivia", "Canada", "Chile", "Colombia", "Corea", "Cuba", "Dinamarca", "Ecuador", "Egipto", "España", "Estados Unidos", "Francia", "Honduras", "Inglaterra", "Italia", "Japon", "Mexico", "Paraguay", "Peru", "Uruguay" }));

        jLabel20.setText("Cargo");

        jLabel21.setText("Salario");

        jLabel22.setText("Departamento");

        jComboBoxDepartamentosEmpleado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxDepartamentosEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Asignar" }));
        jComboBoxDepartamentosEmpleado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxDepartamentosEmpleadoFocusGained(evt);
            }
        });

        jTextFieldSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSalarioKeyReleased(evt);
            }
        });

        jComboBoxAnioNac.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxAnioNac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));

        jComboBoxMesNac.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxMesNac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel23.setText("año");

        jLabel24.setText("mes");

        jLabel25.setText("dia");

        jScrollPane1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Pais", "Direccion", "Fecha Nac", "Departamento", "Cargo", "Salario"
            }
        ));
        jScrollPane1.setViewportView(jTableEmpleados);

        jButton1.setText("ACTUALIZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ELIMINAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBoxDiaNac.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxDiaNac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jSeparator3)
                .addGap(208, 208, 208))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButtonAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jButtonMostrarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxAnioNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxMesNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxDiaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldSalario)
                            .addComponent(jTextFieldCargo)
                            .addComponent(jTextFieldCedula)
                            .addComponent(jComboBoxNacionalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxDepartamentosEmpleado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jButton1)
                        .addGap(84, 84, 84)
                        .addComponent(jButton2)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxDepartamentosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 98, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jComboBoxMesNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(jComboBoxAnioNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel11)
                            .addComponent(jComboBoxDiaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMostrarEmpleados)
                    .addComponent(jButtonAgregarEmpleado))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(115, 115, 115))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCedulaKeyReleased
        if (!empleadoControlador.validarSoloNumeros(evt.getKeyChar())) {
            if(jTextFieldCedula.getText().length() > 0){
                String temp =jTextFieldCedula.getText().substring(0,jTextFieldCedula.getText().length()-1);
                jTextFieldCedula.setText(temp);
            }
        }
    }//GEN-LAST:event_jTextFieldCedulaKeyReleased

    private void jButtonAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarEmpleadoActionPerformed
        agregar();
        clearEmpleado();
        mostrarTablaEmpleados();
         JOptionPane.showMessageDialog(this, "Empleado Agregado!");
    }//GEN-LAST:event_jButtonAgregarEmpleadoActionPerformed

    private void jButtonMostrarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarEmpleadosActionPerformed
        System.out.println("EMPLEADOS:\n");
        for (var emp : empleadoControlador.listarEmpleados()) {
            // se aniade el anio actual para calcular la edad del empleado

            System.out.println(emp.mostrarInformacion(LocalDate.now().getYear()));
            System.out.println("");
        }
        System.out.println("----------------------------------------------------------------------");

        mostrarTablaEmpleados();
    }//GEN-LAST:event_jButtonMostrarEmpleadosActionPerformed

    private void jTextFieldSalarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSalarioKeyReleased
        if (!empleadoControlador.validarSoloNumeros(evt.getKeyChar())) {
            if(jTextFieldSalario.getText().length() > 0){
                String temp =jTextFieldSalario.getText().substring(0,jTextFieldSalario.getText().length()-1);
                jTextFieldSalario.setText(temp);
            }
        }
    }//GEN-LAST:event_jTextFieldSalarioKeyReleased

    private void jComboBoxDepartamentosEmpleadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxDepartamentosEmpleadoFocusGained
        cargarDepartamentosCombo();
    }//GEN-LAST:event_jComboBoxDepartamentosEmpleadoFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         editar(empleadoControlador.listarEmpleados().get(jTableEmpleados.getSelectedRow()).getCedula());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cargarDepartamentosCombo(){
        jComboBoxDepartamentosEmpleado.removeAllItems();
        jComboBoxDepartamentosEmpleado.addItem("Sin Asignar");
        for (var dep : empleadoControlador.departamentoServicio.listarDepartamentos()) {
            jComboBoxDepartamentosEmpleado.addItem(dep.getNombre());
        }
    }
    private void agregar(){
        empleadoControlador.crearEmpleado(jTextFieldCedula.getText(), jTextFieldNombre.getText(),
                Integer.parseInt(jComboBoxAnioNac.getSelectedItem().toString()), 
                (jComboBoxMesNac.getSelectedIndex()+1), (jComboBoxDiaNac.getSelectedIndex()+1),
                jComboBoxNacionalidad.getSelectedItem().toString(), jTextFieldDireccion.getText(),
                jTextFieldCargo.getText(), Float.parseFloat(jTextFieldSalario.getText()),getDepartamentoFromComboBox() );
        System.out.println("Empleado agregado !");
        
    }
    
    private Departamento getDepartamentoFromComboBox(){
        if(!jComboBoxDepartamentosEmpleado.getSelectedItem().toString().equalsIgnoreCase("Sin Asignar")){
            // Primer item del combo es "Sin Asignar" 
            Departamento dep = empleadoControlador.departamentoServicio.listarDepartamentos().get(jComboBoxDepartamentosEmpleado.getSelectedIndex() -1);
            return dep;
        }
        return null;
    }
    
    
     private void clearEmpleado(){
        jTextFieldCedula.setText("");
        jTextFieldNombre.setText("");
        jTextFieldDireccion.setText("");
        jTextFieldCargo.setText("");
        jTextFieldSalario.setText("");
     
    }
     
     private void mostrarTablaEmpleados(){
        
        var header = new String[8];
        
        header[0] = "Cedula";
        header[1] = "Nombre";
        header[2] = "Pais";
        header[3] = "Departamento";
        header[4] = "FechaNacimiento";
        header[5] = "Cargo";
        header[6] = "Salario";
        header[7] = "Direccion";
        
        var data = new Object[this.empleadoControlador.listarEmpleados().size()][8];
        
        for (int i = 0; i < this.empleadoControlador.listarEmpleados().size(); i++) {
            
            data[i][0] = this.empleadoControlador.listarEmpleados().get(i).getCedula();
            data[i][1] = this.empleadoControlador.listarEmpleados().get(i).getNombre();
            data[i][2] = this.empleadoControlador.listarEmpleados().get(i).getNacionalidad();
            
            if ( this.empleadoControlador.listarEmpleados().get(i).getDepartamento() == null) {
                data[i][3] = "Sin Asignar";
            } else{
                data[i][3] = this.empleadoControlador.listarEmpleados().get(i).getDepartamento().getNombre();
            }
            
            data[i][4] = this.empleadoControlador.listarEmpleados().get(i).getFechaNacimiento();
            data[i][5] = this.empleadoControlador.listarEmpleados().get(i).getCargo();
            data[i][6] = this.empleadoControlador.listarEmpleados().get(i).getSalario();
            data[i][7] = this.empleadoControlador.listarEmpleados().get(i).getDireccion();
            
            
        }
        
        this.modeloTablaEmpleados = new DefaultTableModel(data, header);
        
        this.jTableEmpleados.setModel(modeloTablaEmpleados);
        
    }
     
     private void editar(String cedula){
         EmpleadoVistaEdicion empleadoVentanaEdicion = new EmpleadoVistaEdicion(empleadoControlador.getEmpleadoByCedula(cedula));
         empleadoVentanaEdicion.setLocationRelativeTo(this);
         empleadoVentanaEdicion.setVisible(true);
     }
     
     
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpleadoVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAgregarEmpleado;
    private javax.swing.JButton jButtonMostrarEmpleados;
    private javax.swing.JComboBox<String> jComboBoxAnioNac;
    private javax.swing.JComboBox<String> jComboBoxDepartamentosEmpleado;
    private javax.swing.JComboBox<String> jComboBoxDiaNac;
    private javax.swing.JComboBox<String> jComboBoxMesNac;
    private javax.swing.JComboBox<String> jComboBoxNacionalidad;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTableEmpleados;
    private javax.swing.JTextField jTextFieldCargo;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldSalario;
    // End of variables declaration//GEN-END:variables
}