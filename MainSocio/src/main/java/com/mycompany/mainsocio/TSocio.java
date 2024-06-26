package com.mycompany.mainsocio;

import javax.swing.JOptionPane;


public class TSocio {
    private String apellido, nombres, DNI, telefono;
    private byte edad;
    private Categoria categoria;
    
    public enum Categoria{
        Menor, Cadete, Mayor;
    }

    public TSocio() {
    }

    public TSocio(String apellido, String nombres, String DNI, String telefono, byte edad) {
        this.apellido = apellido;
        this.nombres = nombres;
        this.DNI = DNI;
        this.telefono = telefono;
        this.edad = edad;
        if(edad <= 12){
            this.categoria = Categoria.Menor;
        } else if (edad >= 13 && edad <=17){
            this.categoria = Categoria.Cadete;
        } else {
            this.categoria = Categoria.Mayor;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
        if (apellido.length() <= 20 && !apellido.matches(".*\\d.*") && !apellido.isEmpty()) {
            this.apellido = apellido;
        } else {
            JOptionPane.showMessageDialog(null, "Error: Apellido inválido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
         if (nombres.length() <= 20 && !nombres.matches(".*\\d.*") && !nombres.isEmpty()) {
            this.nombres = nombres;
        } else {
            JOptionPane.showMessageDialog(null, "Error: Nombre inválido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
        if (DNI.matches("[0-9]{11}")) {
            this.DNI = DNI;
        } else {
            JOptionPane.showMessageDialog(null, "Error: DNI inválido (debe contener exactamente 11 números)", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
        if (telefono.matches("[0-9 ()+-]*")) {
            this.telefono = telefono;
        } else {
            JOptionPane.showMessageDialog(null, "Error: Teléfono inválido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    
    
    
    
   
}
