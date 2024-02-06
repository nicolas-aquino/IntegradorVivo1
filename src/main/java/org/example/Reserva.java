package org.example;

import java.util.LinkedList;

public class Reserva {
    private long id;
    private LinkedList<Producto> productos;

    public Reserva(long id, LinkedList<Producto> productos) {
        this.id = id;
        this.productos = productos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(LinkedList<Producto> productos) {
        this.productos = productos;
    }
}
