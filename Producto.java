package tienda.de.productos;

/**
 *
 * @author Kotaro
 */
public class Producto {
    int cantActual, cantMinima, cantVendida, precioBase, tipo;
    double iva;
    private final int papeleria = 1, drogueria = 2, supermercado = 3;
    private final double ivaPapeleria = 0.16, ivaDrogueria = 0.12, ivaSupermercado = 0.04;
    
    
    public Producto() {
    }

    public Producto(int cantActual, int cantMinima, int cantVendida, int precioBase) {
        this.cantActual = cantActual;
        this.cantMinima = cantMinima;
        this.precioBase = precioBase;
        this.cantVendida = cantVendida;
    }
    
    // Getter y setter

    public int getCantActual() {
        return cantActual;
    }

    public int getCantMinima() {
        return cantMinima;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public int getTipo() {
        return tipo;
    }

    public int getPapeleria() {
        return papeleria;
    }

    public int getDrogueria() {
        return drogueria;
    }

    public int getSupermercado() {
        return supermercado;
    }
    
    public int getCantVendida() {
        return cantVendida;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }

    public void setCantMinima(int cantMinima) {
        this.cantMinima = cantMinima;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public void setCantVendida(int cantVendida) {
        this.cantVendida = cantVendida;
    }
    
    public void setTipo(int tipo){
        this.tipo = tipo;
    }
    
    //Para el IVA

    public double getIva() {
        return iva;
    }

    public double getIvaPapeleria() {
        return ivaPapeleria;
    }

    public double getIvaDrogueria() {
        return ivaDrogueria;
    }

    public double getIvaSupermercado() {
        return ivaSupermercado;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
    
}
