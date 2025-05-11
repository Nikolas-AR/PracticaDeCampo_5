/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaonline;

/**
 *
 * @author USUARIO
 */
public class Cliente {
    private String nombre;
    private String telefono;
    private String direccion;

    public Cliente(String nombre, String telefono, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void registrarCliente(String nombre) {
        System.out.println("Se está registrando al cliente " + nombre );
    }

    public void registrarCliente(String nombre, String telefono, String direccion) {
        System.out.println("------------------------------------------------");
        System.out.println("Cliente registrado correctamente");
        System.out.println("- Cliente: " + nombre);
        System.out.println("- Teléfono: "+ telefono);
        System.out.println("- Dirección : " + direccion);
        System.out.println("------------------------------------------------");
    }    
    
    
}
