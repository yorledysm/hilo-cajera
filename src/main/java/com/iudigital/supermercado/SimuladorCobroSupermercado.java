

package com.iudigital.supermercado;

import cliente.ClienteProducto;
import cliente.Producto;
import java.util.ArrayList;
import java.util.List;


public class SimuladorCobroSupermercado {

    public static void main(String[] args) {
       
        List<Producto> producto =new ArrayList<>();
        setProducto(producto);
        
              
        ClienteProducto cliente1= new ClienteProducto("	Pasta en conchitas Doria 250 g",producto );
        ClienteProducto cliente2= new ClienteProducto("Fríjol rojo 1K",producto );
        ClienteProducto cliente3= new ClienteProducto("Duraznos en almíbar 822 g",producto );
        ClienteProducto cliente4= new ClienteProducto("Margarina Rama 500 g",producto );
        ClienteProducto cliente5= new ClienteProducto("Huevos bandeja 30 unidades",producto );
        ClienteProducto cliente6= new ClienteProducto("Arroz FlorHuila",producto );
        ClienteProducto cliente7= new ClienteProducto("Crema Colgate x 3 unidades menta",producto );
        ClienteProducto cliente8= new ClienteProducto("Shampoo Savital 350 ml",producto );
        ClienteProducto cliente9= new ClienteProducto("Ambientador Glade 360 cm3 lavanda",producto );
        ClienteProducto cliente10= new ClienteProducto("Listerine Fresh Burst 500 ml",producto );
        
        
         long initialTime = System.currentTimeMillis();
        CajeraProducto cajera1= new CajeraProducto(" -----Cajera 1");
        CajeraProducto cajera2= new CajeraProducto(" -----Cajera 2");
        CajeraProducto cajera3= new CajeraProducto(" -----Cajera 3");
        CajeraProducto cajera4= new CajeraProducto(" -----Cajera 4");
        CajeraProducto cajera5= new CajeraProducto(" -----Cajera 5");
        CajeraProducto cajera6= new CajeraProducto(" -----Cajera 6");
        CajeraProducto cajera7= new CajeraProducto(" -----Cajera 7");
        CajeraProducto cajera8= new CajeraProducto(" -----Cajera 8");
        CajeraProducto cajera9= new CajeraProducto(" -----Cajera 9");
        CajeraProducto cajera10= new CajeraProducto(" -----Cajera 10");
    
    
        cajera1.procesarCompra(cliente1, initialTime);
        cajera2.procesarCompra(cliente2, initialTime);
        cajera3.procesarCompra(cliente3, initialTime);
        cajera4.procesarCompra(cliente4, initialTime);
        cajera5.procesarCompra(cliente5, initialTime);
        cajera6.procesarCompra(cliente6, initialTime);
        cajera7.procesarCompra(cliente7, initialTime);
        cajera8.procesarCompra(cliente8, initialTime);
        cajera9.procesarCompra(cliente9, initialTime);
        cajera10.procesarCompra(cliente10, initialTime);
        
        
    
   // cajera1.procesarCompra(cliente2, initialTime);
        
        
        
        
    }

    private static void setProducto(List<Producto> producto) {
        Producto producto1= new Producto("Sal Refisal 1K ---$", 700, 10);
        Producto producto2= new Producto("Leche Alquería larga vida 900 ml x 6------$", 900, 33);
        Producto producto3= new Producto("Detergente Fab 3 K------$", 1300, 120);
        Producto producto4= new Producto("Detergente Fab 3 K------$", 1300, 20);
        
        
        
        producto.add(producto1);
        producto.add(producto2);
        producto.add(producto3);
         producto.add(producto4);
    }
    
   
    
}
