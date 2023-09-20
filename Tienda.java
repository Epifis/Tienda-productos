/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaproductos;

/**
 *
 * @author sg702-12
 */
public class Tienda {
    String nombre, direccion;
    int cantVendidaProducto1, cantVendidaProducto2, cantVendidaProducto3, cantVendidaProducto4, cantMasVendida;

    public Tienda() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCantVendidaProducto1() {
        return cantVendidaProducto1;
    }

    public int getCantVendidaProducto2() {
        return cantVendidaProducto2;
    }

    public int getCantVendidaProducto3() {
        return cantVendidaProducto3;
    }

    public int getCantVendidaProducto4() {
        return cantVendidaProducto4;
    }

    public int getCantMasVendida() {
        return cantMasVendida;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCantVendidaProducto1(int cantVendidaProducto1) {
        this.cantVendidaProducto1 = cantVendidaProducto1;
    }

    public void setCantVendidaProducto2(int cantVendidaProducto2) {
        this.cantVendidaProducto2 = cantVendidaProducto2;
    }

    public void setCantVendidaProducto3(int cantVendidaProducto3) {
        this.cantVendidaProducto3 = cantVendidaProducto3;
    }
    
    public void setCantVendidaProducto4(int cantVendidaProducto4) {
        this.cantVendidaProducto4 = cantVendidaProducto4;
    }
    
    public void setCantMasVendida(int cantMasVendida) {
        this.cantMasVendida = cantMasVendida;
    }
    
    public void crearProducto (){
    }
    
    public void CantidadMasVendida(){
        if(cantVendidaProducto4 > cantVendidaProducto1 && cantVendidaProducto4 > cantVendidaProducto2 && cantVendidaProducto4 > cantVendidaProducto3)
            this.cantMasVendida = cantVendidaProducto4;
        else if(cantVendidaProducto2 > cantVendidaProducto4 && cantVendidaProducto2 > cantVendidaProducto3 && cantVendidaProducto2 > cantVendidaProducto1)
            this.cantMasVendida = cantVendidaProducto2;
        else if(cantVendidaProducto1 > cantVendidaProducto4 && cantVendidaProducto1 > cantVendidaProducto3 && cantVendidaProducto1 > cantVendidaProducto2)
            this.cantMasVendida = cantVendidaProducto1;
        else
            this.cantMasVendida = cantVendidaProducto3;
    }
}
