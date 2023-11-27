
package cliente;


public class Producto {
     // clase que determina la compra de productos 
    
    private String nombre;
    private float precio;
    private int cantidad;

    
    // metodos de contructor 
    public Producto(String nombre, float precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
     // Constructor  get 
    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    
}
