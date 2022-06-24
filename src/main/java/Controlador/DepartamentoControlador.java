/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.List;
import Modelo.Departamento;
import Modelo.Empleado;
import Modelo.Empresa;
import Servicio.DepartamentoServicio;
import Servicio.EmpleadoServicio;
import Servicio.EmpresaServicio;
/**
 *
 * @author NOTEBOOK
 */
public class DepartamentoControlador {
    
    private final DepartamentoServicio departamentoServicio = new DepartamentoServicio();
    public final EmpresaServicio empresaServicio = new EmpresaServicio();
    public final EmpleadoServicio empleadoServicio = new EmpleadoServicio();
            
    public Departamento crearDepartamento(int codigo, String nombre, Empresa empresa, String ubicacion){
        return departamentoServicio.crearDepartamento(new Departamento(codigo, nombre, empresa, ubicacion));
    }
    
    public List<Departamento> listarDepartamentos(){
        return departamentoServicio.listarDepartamentos();
    }
    
    public Departamento getDepartamentoByCode(int code){
        return departamentoServicio.getDepartamentoByCode(code);
    }
    
    public void asignarGerenteDepartamento(int codigo, Empleado empleado){
        departamentoServicio.asignarGerente(codigo, empleado);
        
    }
    
    public void actualizarDepartamento(int codigo, Departamento departamentoNew){
        departamentoServicio.actualizarDepartamenti(codigo, departamentoNew);
    }
    
    
    public Departamento eliminarDepartamento(int codigo){
        return departamentoServicio.eliminarDepartamento(codigo);
    }
    
    // Metodos privados validacion departamento:
    
    private boolean validarCodigo(int codigo){
        return codigo > 0;
    }
    
    private boolean validarNumMaximoCaracters(String texto){
        return texto.length() <= 200;
    }

   
     // Metodos validacion KeyEvent
    
    // valida que solo se ingresen numeros en el campo "codigo"
    public boolean validarSoloNumeros(char codigo){
        boolean flag = false;
        if(Character.isDigit(codigo)){
            flag = true;
        }
        return flag;
    }
    
    // valida que solo se ingrese texto en el campo ------
    public boolean validarSoloTexto(char texto){
        boolean flag = false;
        if(Character.isLetter(texto) || Character.isSpaceChar(texto) || Character.isUpperCase(texto)){
            flag = true;
        }
        return flag;
                
    }

    public void eliminar(String arg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
