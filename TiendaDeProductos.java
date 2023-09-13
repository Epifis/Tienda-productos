package tienda.de.productos;

/**
 *
 * @author Alexandra Tinjaca
 */
public class TiendaDeProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
        
    }
    
}
