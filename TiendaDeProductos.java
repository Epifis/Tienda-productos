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
            Tipo == SUPERMERCADO && totalProductosVendidos == 0
            ValorUnitario >= 10000 && valorUnitario <= 20000 && tipo == DROGUERIA
            ValorUnitario >= 10000 || tipo==DROGUERIA && valorUnitario <= 20000 || tipo == SUPERMERCADO
            ! ( tipo == PAPELERIA )
            Tipo == SUPERMERCADO || tipo == DROGUERIA
        */
        
        System.out.println("Evaluación: ");
        
        System.out.println(" Tipo == SUPERMERCADO && totalProductosVendidos == 0");
        
        String a = " Es de supermercado y no se ha vendido nada";
        String b = "No se cumplen ambas condiciones";
        
        System.out.print("  Libreta: ");
        if(libreta.getTipo()== 3 && libreta.getCantVendida() == 0)
            System.out.println(a);
        else
            System.out.println(b);
        System.out.print("  Leche: ");
        if(leche.getTipo()== 3 && leche.getCantVendida() == 0)
            System.out.println(a);
        else
            System.out.println(b);
        System.out.print("  Jabon ");
        if(jabon.getTipo()== 3 && jabon.getCantVendida() == 0)
            System.out.println(a);
        else
            System.out.println(b);
        System.out.print("  Aspirina ");
        if(aspirina.getTipo()== 3 && aspirina.getCantVendida() == 0)
            System.out.println(a);
        else
            System.out.println(b);
        
        //ValorUnitario >= 10000 && valorUnitario <= 20000 && tipo == DROGUERIA
        
        System.out.println(" ValorUnitario >= 10000 && valorUnitario <= 20000 && tipo == DROGUERIA");
        
        a = " El valor por producto es mayor o igual que 10000 y menor o igual a 20000 y es de drogueria";
        b = "No se cumplen algunas o niguna de las condiciones";
        
        System.out.print("  Libreta: ");
        if(libreta.getPrecioBase()>= 10000 && libreta.getPrecioBase() <= 20000 && libreta.getTipo() == 0)
            System.out.println(a);
        else
            System.out.println(b);
        System.out.print("  Leche: ");
        if(leche.getPrecioBase()>= 10000 && leche.getPrecioBase() <= 20000 && leche.getTipo() == 0)
            System.out.println(a);
        else
            System.out.println(b);
        System.out.print("  Jabon ");
        if(jabon.getPrecioBase()>= 10000 && jabon.getPrecioBase() <= 20000 && jabon.getTipo() == 0)
            System.out.println(a);
        else
            System.out.println(b);
        System.out.print("  Aspirina ");
        if(aspirina.getPrecioBase()>= 10000 && libreta.getPrecioBase() <= 20000 && aspirina.getTipo() == 0)
            System.out.println(a);
        else
            System.out.println(b);
        
       //ValorUnitario >= 10000 || tipo==DROGUERIA && valorUnitario <= 20000 || tipo == SUPERMERCADO
       
        System.out.println(" ValorUnitario >= 10000 || tipo==DROGUERIA && valorUnitario <= 20000 || tipo == SUPERMERCADO");
        
        a = " Se cumple o que el precio base sea mayor o igual a 10000, o que sea de tipo drogueria y que el precio base sea menor o igual que 20000, o que es de tipo supermercado";
        b = "No se cumplen algunas o niguna de las condiciones";
        
        System.out.print("  Libreta: ");
        if(libreta.getPrecioBase()>= 10000 || libreta.getTipo() == 2 && libreta.getPrecioBase() <= 20000 || libreta.getTipo() == 3)
            System.out.println(a);
        else
            System.out.println(b);
        System.out.print("  Leche: ");
        if(leche.getPrecioBase()>= 10000 || leche.getTipo() == 2 && leche.getPrecioBase() <= 20000 || leche.getTipo() == 3)
            System.out.println(a);
        else
            System.out.println(b);
        System.out.print("  Jabon ");
        if(jabon.getPrecioBase()>= 10000 || jabon.getTipo() == 2 && jabon.getPrecioBase() <= 20000 || jabon.getTipo() == 3)
            System.out.println(a);
        else
            System.out.println(b);
        System.out.print("  Aspirina ");
        if(aspirina.getPrecioBase()>= 10000 || aspirina.getTipo() == 2 && aspirina.getPrecioBase() <= 20000 || aspirina.getTipo() == 3)
            System.out.println(a);
        else
            System.out.println(b);
        
        //! ( tipo == PAPELERIA )
                
        System.out.println("! ( tipo == PAPELERIA )");
        
        a = " El producto no es de papeleria";
        b = "El producto es de papeleria";
        
        System.out.print("  Libreta: ");
        if(libreta.getTipo() != 1)
            System.out.println(a);
        else
            System.out.println(b);
        System.out.print("  Leche: ");
        if(leche.getTipo() != 1)
            System.out.println(a);
        else
            System.out.println(b);
        System.out.print("  Jabon ");
        if(jabon.getTipo() != 1)
            System.out.println(a);
        else
            System.out.println(b);
        System.out.print("  Aspirina ");
        if(aspirina.getTipo() != 1)
            System.out.println(a);
        else
            System.out.println(b);
        
        // Tipo == SUPERMERCADO || tipo == DROGUERIA
        
        System.out.println("Tipo == SUPERMERCADO || tipo == DROGUERIA");
        
        a = " El producto es de Supermercado o de droguería";
        b = "El producto es de papeleria";
        
        System.out.print("  Libreta: ");
        if(libreta.getTipo() != 1)
            System.out.println(a);
        else
            System.out.println(b);
        System.out.print("  Leche: ");
        if(leche.getTipo() != 1)
            System.out.println(a);
        else
            System.out.println(b);
        System.out.print("  Jabon ");
        if(jabon.getTipo() != 1)
            System.out.println(a);
        else
            System.out.println(b);
        System.out.print("  Aspirina ");
        if(aspirina.getTipo() != 1)
            System.out.println(a);
        else
            System.out.println(b);
        
        
    }
    
}