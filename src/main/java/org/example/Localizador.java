package org.example;

import java.util.LinkedList;

public class Localizador {

    private long id;
    private Cliente client;
    private double total;
    private LinkedList<Reserva> reservas;

    public Localizador(long id, Cliente client, LinkedList<Reserva> reservas) {
        this.id = id;
        this.client = client;
        this.reservas = reservas;
    }




    public Localizador(long id, Cliente client) {
        this.id = id;
        this.client = client;
        this.reservas = new LinkedList<Reserva>();
    }

public double calcularTotal(){



    return reservas.stream()
            .flatMap(reserva -> reserva.getProductos().stream())
            .mapToDouble(Producto::getPrecio)
            .sum();

    if()

}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LinkedList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(LinkedList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void addReserva(Reserva reserva){
        this.reservas.add(reserva);
    }
}
