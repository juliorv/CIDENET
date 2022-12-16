/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entrada_salida_empeados.EMPLEADOS;

/**
 *
 * @author DELL
 */
public class empleados {
    public String primerApellido;
    public String segundoApellido;
    public String primerNombre;
    public String otrosNombres;
    public String paisEmpleo;
    public String identificacion;
    public String tipoIdentificacion;
    public String correoElectronico;
    public String fechaIngreso;
    public String area;
    public boolean estado = true;
    public String fechaYHoraRegistro;
    
    public void setEmpleado(String primerApellido,
     String segundoApellido,
     String primerNombre,
     String otrosNombres,
     String paisEmpleo,
     String identificacion,
     String tipoIdentificacion,
     String correoElectronico,
     String fechaIngreso,
     String area,
     boolean estado,
     String fechaYHoraRegistro) {
        this. primerApellido = primerApellido;
     this.segundoApellido = segundoApellido;
     this.primerNombre = primerNombre;
     this.otrosNombres = primerNombre;
     this.paisEmpleo = paisEmpleo;
     this.identificacion = identificacion;
     this.tipoIdentificacion = tipoIdentificacion;
     this.correoElectronico = correoElectronico;
     this.fechaIngreso = fechaIngreso;
     this.area = area;
     this.estado = estado;
     this.fechaYHoraRegistro = fechaYHoraRegistro;

}
}
