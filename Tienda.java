package tienda.de.productos;

import java.util.Scanner;

/**
 *
 * @author Alexandra Tinjacá
 */
public class Tienda {
    String nombre, direccion;
    int cantVendidaProducto1, cantVendidaProducto2, cantVendidaProducto3, cantVendidaProducto4, cantMasVendida;
    double precioProducto;
    int cantidadBodega, cantidadMinima, cantidadComprar;
    private final Scanner sc= new Scanner(System.in);

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

    public double getPrecioProducto() {
        return precioProducto;
    }

    public int getCantidadComprar() {
        return cantidadComprar;
    }

    public int getCantidadBodega() {
        return cantidadBodega;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
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

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public void setCantidadComprar(int cantidadComprar) {
        this.cantidadComprar = cantidadComprar;
    }

    public void setCantidadBodega(int cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
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
    public void HacerPedido(){
        this.cantidadBodega = cantidadMinima;
    }
        public void AumentarValorUnitario(){
        System.out.println("El precio base era de: " + precioProducto);
        if(precioProducto < 1000)
            this.precioProducto = (precioProducto * 0.01) + precioProducto;
        else if (precioProducto >= 1000 && precioProducto <= 5000)
            this.precioProducto = (precioProducto * 0.02) + precioProducto;
        else if (cantidadComprar < 5000)
            this.precioProducto = (precioProducto * 0.03) + precioProducto;
        else
            System.out.println("No se hizo ningun aumento");
        System.out.println("El precio aumentado quedo en: " + precioProducto);
    }
    public void RealizarVenta(){
        System.out.println("Ingrese la cantidad de unidades a comprar: ");
        this.cantidadComprar = sc.nextInt();
        if(cantidadComprar > 10 && cantidadComprar < 50)
            this.precioProducto = cantidadComprar * precioProducto - (precioProducto * 0.10);
        else if (cantidadComprar >= 51 && cantidadComprar < 100)
            this.precioProducto = cantidadComprar * precioProducto - (precioProducto * 0.20);
        else if (cantidadComprar >= 100)
            this.precioProducto = (precioProducto * 0.10) + cantidadComprar * precioProducto;
        this.cantidadBodega = cantidadBodega - cantidadComprar;
    }
    
}
