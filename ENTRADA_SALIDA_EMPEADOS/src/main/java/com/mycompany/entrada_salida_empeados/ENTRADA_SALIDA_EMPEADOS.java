/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.entrada_salida_empeados;

import com.mycompany.entrada_salida_empeados.INTERFACES.CONSULTA_EMPLEADOS;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ENTRADA_SALIDA_EMPEADOS {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,  new CONSULTA_EMPLEADOS());
        //new REGISTRO_EMPLEADOS().setVisible(true);
        System.out.println("Hello World!");
    }
}
