package com.corporosoft.jugadaganadora.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Utilitarios {

    public static List<String> listaOrdenada(List<String> inputList) {

        List<String> lista = new ArrayList<String>();

        List<String> sortedList = new ArrayList<>(inputList); // Crear una copia de la lista original

        Collections.sort(sortedList, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return Integer.compare(Integer.parseInt(a), Integer.parseInt(b));
            }
        });

        return sortedList; // Devolver la lista ordenada
    }
}
