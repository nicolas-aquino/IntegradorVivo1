package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repositorio {
    private Map<Cliente, List<Localizador>> localizadores;

    public Repositorio() {
        this.localizadores = new HashMap<>();
    }
    public Repositorio(Map<Cliente, List<Localizador>> localizadores) {
        this.localizadores = localizadores;
    }

    public Map<Cliente, List<Localizador>> getAllLocalizadores() {
        return localizadores;
    }

    public void setLocalizadores(Map<Cliente, List<Localizador>> localizadores) {
        this.localizadores = localizadores;
    }

    public void addLocalizador(Cliente cliente, Localizador localizador) {
        if (localizadores.containsKey(cliente)) {
            localizadores.get(cliente).add(localizador);
        } else {
            localizadores.put(cliente, new ArrayList<>());
            localizadores.get(cliente).add(localizador);
        }
    }


    public List<Localizador> getLocalizadoresByCliente(Cliente cliente){

        if (localizadores.containsKey(cliente)) {
            List<Localizador> list = new List<Localizador>();
            list.add( localizadores.get(cliente));
            return list;
        }

        return null;
    }

    @Override
    public String toString() {
        return "Repositorio{" +
                "localizadores=" + localizadores +
                '}';
    }
}
