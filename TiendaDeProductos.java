package tienda.de.productos;

import java.util.Scanner;

/**
 *
 * @author Alexandra Tinjaca
 */
public class TiendaDeProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreProductoMasVendido;
        int numeroProducto, Seguir = 1;
        Scanner sc= new Scanner(System.in);
        
        Tienda tienda1;
        tienda1= new Tienda();
        
        Producto libreta, leche, jabon, aspirina;
        
        libreta = new Producto();
        leche = new Producto();
        jabon = new Producto();
        aspirina = new Producto();
        
        // Asignaciones
        
        libreta.setCantActual(23);
        libreta.setCantMinima(15);
        libreta.setCantVendida(87);
        libreta.setPrecioBase(5500);
        
        leche.setCantActual(150);
        leche.setCantMinima(30);
        leche.setCantVendida(30);
        leche.setPrecioBase(2100);
        
        jabon.setCantActual(15);
        jabon.setCantMinima(50);
        jabon.setCantVendida(80);
        jabon.setPrecioBase(4200);
        
        aspirina.setCantActual(60);
        aspirina.setCantMinima(100);
        aspirina.setCantVendida(200);
        aspirina.setPrecioBase(2400);
        
        
        //Asignacion tipos y valores de iva
        libreta.setTipo(libreta.getPapeleria());
        leche.setTipo(leche.getSupermercado());
        jabon.setTipo(leche.getSupermercado());
        aspirina.setTipo(leche.getDrogueria());
        
        libreta.setIva(libreta.getIvaPapeleria());
        leche.setIva(leche.getIvaSupermercado());
        jabon.setIva(leche.getIvaSupermercado());
        aspirina.setIva(leche.getIvaDrogueria());
        
        System.out.println("Libreta: \n  Cantidad actual: " + libreta.cantActual + "\n  Tope mínimo: " + libreta.cantMinima + "\n  Cantidad vendida: " + libreta.cantVendida + "\n  Precio base: " + libreta.precioBase);
        System.out.println("  Precio final: " + (libreta.iva * libreta.precioBase + libreta.precioBase));
        System.out.println("Leche: \n  Cantidad actual: " + leche.cantActual + "\n  Tope mínimo: " + leche.cantMinima + "\n  Cantidad vendida: " + leche.cantVendida + "\n  Precio base: " + leche.precioBase);
        System.out.println("  Precio final: " + (leche.iva * leche.precioBase + leche.precioBase));
        System.out.println("Jabon: \n  Cantidad actual: " + jabon.cantActual + "\n  Tope mínimo: " + jabon.cantMinima + "\n  Cantidad vendida: " + jabon.cantVendida + "\n  Precio base: " + jabon.precioBase);
        System.out.println("  Precio final: " + (jabon.iva * jabon.precioBase + jabon.precioBase));
        System.out.println("Aspirina: \n  Cantidad actual: " + aspirina.cantActual + "\n  Tope mínimo: " + aspirina.cantMinima + "\n  Cantidad vendida: " + aspirina.cantVendida + "\n  Precio base: " + aspirina.precioBase);
        System.out.println("  Precio final: " + (aspirina.iva * aspirina.precioBase + aspirina.precioBase));
        
        
        tienda1.setCantVendidaProducto1(libreta.getCantVendida());
        tienda1.setCantVendidaProducto2(leche.getCantVendida());
        tienda1.setCantVendidaProducto3(jabon.getCantVendida());
        tienda1.setCantVendidaProducto4(aspirina.getCantVendida());
        tienda1.CantidadMasVendida();
        
        if(libreta.cantVendida == tienda1.cantMasVendida){
            nombreProductoMasVendido = "Libreta";}
        else if(leche.cantVendida == tienda1.cantMasVendida){
            nombreProductoMasVendido = "Leche";}
        else if(jabon.cantVendida == tienda1.cantMasVendida){
            nombreProductoMasVendido = "Jabon";}
        else{
            nombreProductoMasVendido = "Aspirina";        }

        System.out.println("El producto con más unidades vendidas fue de " + nombreProductoMasVendido + ", con: " + tienda1.getCantMasVendida());
        
        System.out.println("Para Libreta  es tipo: " + libreta.ImprimeTipo());
        System.out.println("Para Leche es tipo: " + leche.ImprimeTipo());
        System.out.println("Para Jabon es tipo: " + jabon.ImprimeTipo());
        System.out.println("Para Aspirina es tipo: " + aspirina.ImprimeTipo());

            System.out.println("Revisemos si hay que ajustar la cantidad en bodega");
            //Para hacer pedidos

            if(libreta.getCantActual() < libreta.getCantMinima()){
                tienda1.setCantidadMinima(libreta.getCantMinima());
                tienda1.setCantidadBodega(libreta.getCantActual());
                tienda1.HacerPedido();
                libreta.setCantActual(tienda1.getCantidadBodega());
                System.out.println("La cantidad en bodega de libretas ahora es: " + libreta.getCantActual());
            }
            if (leche.getCantActual() < leche.getCantMinima()){
                tienda1.setCantidadMinima(leche.getCantMinima());
                tienda1.setCantidadBodega(leche.getCantActual());
                tienda1.HacerPedido();
                leche.setCantActual(tienda1.getCantidadBodega());
                System.out.println("La cantidad en bodega de leche ahora es: " + leche.getCantActual());
            }
            if (jabon.getCantActual() < jabon.getCantMinima()){
                tienda1.setCantidadMinima(jabon.getCantMinima());
                tienda1.setCantidadBodega(jabon.getCantActual());
                tienda1.HacerPedido();
                jabon.setCantActual(tienda1.getCantidadBodega());
                System.out.println("La cantidad en bodega de jabon ahora es: " + jabon.getCantActual());
            }
            if (aspirina.getCantActual() < aspirina.getCantMinima()){
                tienda1.setCantidadMinima(aspirina.getCantMinima());
                tienda1.setCantidadBodega(aspirina.getCantActual());
                tienda1.HacerPedido();
                aspirina.setCantActual(tienda1.getCantidadBodega());
                System.out.println("La cantidad en bodega de aspirina ahora es: " + aspirina.getCantActual());
            }
            else
                System.out.println("Todo en bodega está por encima del mínimo :3");
            
        do{
            //Para compra y aumento de valor unitario por producto elegido
            System.out.println("Ingrese el número del producto a comprar: ");
            System.out.println("1. Libreta \n 2. Leche \n 3. Jabón \n 4. Aspirina");
            numeroProducto = sc.nextInt();

            switch (numeroProducto) {
                case 1 -> tienda1.setPrecioProducto(libreta.getPrecioBase());
                case 2 -> tienda1.setPrecioProducto(leche.getPrecioBase());
                case 3 -> tienda1.setPrecioProducto(jabon.getPrecioBase());
                case 4 -> tienda1.setPrecioProducto(aspirina.getPrecioBase());
                default -> System.out.println("Lo insertado no es válido.");
            }

            tienda1.AumentarValorUnitario();
            tienda1.RealizarVenta();
            System.out.println("El precio final es de: " + tienda1.getPrecioProducto());
            
            switch (numeroProducto) {
                case 1 -> libreta.setCantActual(tienda1.getCantidadBodega());
                case 2 -> leche.setCantActual(tienda1.getCantidadBodega());
                case 3 -> jabon.setCantActual(tienda1.getCantidadBodega());
                case 4 -> aspirina.setCantActual(tienda1.getCantidadBodega());
            }

            System.out.println("Ahora quedan " + tienda1.getCantidadBodega() + "en bodega.");
            
            do{
                //Para hacer pedidos
                if(libreta.getCantActual() < libreta.getCantMinima()){
                    tienda1.setCantidadMinima(libreta.getCantMinima());
                    tienda1.setCantidadBodega(libreta.getCantActual());
                    tienda1.HacerPedido();
                    libreta.setCantActual(tienda1.getCantidadBodega());
                    System.out.println("La cantidad en bodega de libretas ahora es: " + libreta.getCantActual());
                }
                if (leche.getCantActual() < leche.getCantMinima()){
                    tienda1.setCantidadMinima(leche.getCantMinima());
                    tienda1.setCantidadBodega(leche.getCantActual());
                    tienda1.HacerPedido();
                    leche.setCantActual(tienda1.getCantidadBodega());
                    System.out.println("La cantidad en bodega de leche ahora es: " + leche.getCantActual());
                }
                if (jabon.getCantActual() < jabon.getCantMinima()){
                    tienda1.setCantidadMinima(jabon.getCantMinima());
                    tienda1.setCantidadBodega(jabon.getCantActual());
                    tienda1.HacerPedido();
                    jabon.setCantActual(tienda1.getCantidadBodega());
                    System.out.println("La cantidad en bodega de jabon ahora es: " + jabon.getCantActual());
                }
                if (aspirina.getCantActual() < aspirina.getCantMinima()){
                    tienda1.setCantidadMinima(aspirina.getCantMinima());
                    tienda1.setCantidadBodega(aspirina.getCantActual());
                    tienda1.HacerPedido();
                    aspirina.setCantActual(tienda1.getCantidadBodega());
                    System.out.println("La cantidad en bodega de aspirina ahora es: " + aspirina.getCantActual());
                }
                else
                    System.out.println("Todo en bodega está por encima del mínimo :3");
            }while(libreta.getCantActual() < libreta.getCantMinima() || leche.getCantActual()< leche.getCantMinima() || jabon.getCantActual()< jabon.getCantMinima() || aspirina.getCantActual()< aspirina.getCantMinima());
            
            System.out.println("Quiere seguir comprando? Sí si escriba 1, sino escriba otro numero");
            Seguir = sc.nextInt();
        } while(Seguir==1);
    }
}
