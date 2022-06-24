/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import java.util.List;
import Modelo.Departamento;

/**
 *
 * @author NOTEBOOK
 */
interface IDepartamentoServicio {
    
 public Departamento crearDepartamento(Departamento departamento);
    public List<Departamento> listarDepartamentos();
    public Departamento getDepartamentoByCode(int codigo);
    public void actualizarDepartamenti(int codigo, Departamento departamento);
    public Departamento eliminarDepartamento(int codigo);
    public int getPositionDepartaento(Departamento departamento);
}

