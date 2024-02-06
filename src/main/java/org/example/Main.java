package org.example;

import org.example.Productos.Boleto;
import org.example.Productos.Comida;
import org.example.Productos.Hotel;
import org.example.Productos.Transporte;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Producto> productos= new LinkedList<>();
        productos.add(new Boleto(1,"boleto",100.0));
        productos.add(new Comida(2,"comida",100.0));
        productos.add(new Hotel(3,"hotel",100.0));
        productos.add(new Transporte(4,"transporte",100.0));
        Reserva reserva = new Reserva(1, productos);





                //
        Repositorio repo = new Repositorio();
        Cliente c1 = new Cliente("Juan", 1234);
        Localizador localizador = new Localizador(1,c1);
        localizador.addReserva(reserva);
        System.out.println(  localizador.calcularTotal());
        repo.addLocalizador(localizador.getClient(), localizador);
        repo.addLocalizador(localizador.getClient(), localizador);

        System.out.println(repo.getLocalizadores());



    }
}