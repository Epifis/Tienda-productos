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

        //Evaluación de expresiones relacionales
        
        /*
        En el método main implemente la evaluación de las expresiones relacionales:
            tipo== DROGUERIA
            cantidadBodega > 0
            totalProductosVendidos > 0
            cantidadBodega <= cantidadMinima
        */
        
        System.out.println("Evaluación: ");
        System.out.println(" Tipo == drogueria");
        System.out.print("  Libreta ");
        if(libreta.getTipo()== 2)
            System.out.println("es de dorguería");
        else
            System.out.println("no es de tipo dorgería");
        System.out.print("  Leche ");
        if(leche.getTipo()== 2)
            System.out.println("es de dorguería");
        else
            System.out.println("no es de tipo dorgería");
        System.out.print("  Libreta ");
        if(leche.getTipo()== 2)
            System.out.println("es de dorguería");
        else
            System.out.println("no es de tipo dorgería");
        System.out.print("  Jabon ");
        if(jabon.getTipo()== 2)
            System.out.println("es de dorguería");
        else
            System.out.println("no es de tipo dorgería");
        System.out.print("  Aspirina ");
        if(aspirina.getTipo()== 2)
            System.out.println("es de dorguería");
        else
            System.out.println("no es de tipo dorgería");
        
        //Cantidad bodega
        System.out.println("CantidadBodega>0");
        System.out.print("  Libreta: ");
        if(libreta.getCantActual() > 0)
            System.out.println("Hay productos en bodega");
        else
            System.out.println("No hay productos en bodega");
        System.out.print("  Leche:  ");
        if(leche.getCantActual() > 0)
            System.out.println("Hay productos en bodega");
        else
            System.out.println("No hay productos en bodega");
        System.out.print("  Jabon: ");
        if(jabon.getCantActual() > 0)
            System.out.println("Hay productos en bodega");
        else
            System.out.println("No hay productos en bodega");
        System.out.print("  Aspirina: ");
        if(aspirina.getCantActual() > 0)
            System.out.println("Hay productos en bodega");
        else
            System.out.println("No hay productos en bodega");
        
        //Productos vendidos > 0
        System.out.println("totalProductosVendidos > 0");
        System.out.print("  Libreta: ");
        if(libreta.getCantVendida() > 0)
            System.out.println("Se vendieron productos");
        else
            System.out.println("No se vendieron productos");
        System.out.print("  Leche:  ");
        if(leche.getCantVendida() > 0)
            System.out.println("Se vendieron productos");
        else
            System.out.println("No se vendieron productos");
        System.out.print("  Jabon: ");
        if(jabon.getCantVendida() > 0)
            System.out.println("Se vendieron productos");
        else
            System.out.println("No se vendieron productos");
        System.out.print("  Aspirina: ");
        if(aspirina.getCantVendida() > 0)
            System.out.println("Se vendieron productos");
        else
            System.out.println("No se vendieron productos");
        
        //cantidadBodega <= cantidadMinima
        System.out.println("cantidadBodega <= cantidadMinima");
        System.out.print("  Libreta: ");
        if(libreta.getCantActual() <= libreta.getCantMinima())
            System.out.println("Hay que comprar productos");
        else
            System.out.println("No hay que comprar productos");
        System.out.print("  Leche:  ");
        if(leche.getCantActual() <= leche.getCantMinima())
            System.out.println("Hay que comprar productos");
        else
            System.out.println("No hay que comprar productos");
        System.out.print("  Jabon: ");
        if(jabon.getCantActual() <= jabon.getCantMinima())
            System.out.println("Hay que comprar productos");
        else
            System.out.println("No hay que comprar productos");
        System.out.print("  Aspirina: ");
        if(aspirina.getCantActual() <= aspirina.getCantMinima())
            System.out.println("Hay que comprar productos");
        else
            System.out.println("No hay que comprar productos");
    }
    
}
