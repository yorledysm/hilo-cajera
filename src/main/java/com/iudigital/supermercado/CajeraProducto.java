
package com.iudigital.supermercado;

import cliente.ClienteProducto;
import cliente.Producto;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CajeraProducto {
    private String nombre; 

    public CajeraProducto(String nombre) {
        this.nombre = nombre;
    }
    
    // la cajera  va aprocesar la compra 

    /**
     *
     * @param cliente
     * @param timeStamp
     */
    public void procesarCompra(ClienteProducto cliente, long timeStamp){
        System.out.println("La cajera :" + " "+this.nombre+ 
                " la cajera cmienza a procesar la compra del cliente:"+ cliente.getNombre()+ " "+
                "en el tiempo:" +  (System.currentTimeMillis()-timeStamp)/1000+ " "+
                "segundos");
        
        int conCliente =1;
        for(Producto producto : cliente.getProducto()){
            this.experarXsegundos();
            System.out.println("Procesando el producto" + " "+
              "nombre producto"+ producto.getNombre() + " "+
              "Precio del produco"+ producto.getPrecio()+" "+
               "Cantidad de producto"+ producto.getCantidad()+ " "+
                "Costo total del producto" +producto.getCantidad()*producto.getPrecio()+
                 "----- tiempo:"+ " "+ +(System.currentTimeMillis()-timeStamp)/1000 +
                    "segundo"
                 
                    
            );
            conCliente++;
        }
        System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " + 
				cliente.getNombre() + " EN EL TIEMPO: " + 
				(System.currentTimeMillis() - timeStamp) / 1000 + "seg");
    }

    private void experarXsegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
            System.out.println("ex= " + ex);
        }
    }
}
