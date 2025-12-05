package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
    }

    // -----------------------------
    // EJERCICIO 1
    // -----------------------------
    public static void ejercicio1() {
        System.out.println("\n--- EJERCICIO 1 ---");

        List<String> frutas = new ArrayList<>();

        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Pera");

        frutas.add(2, "Uva");

        System.out.println("Primera fruta: " + frutas.get(0));

        frutas.set(3, "Kiwi");

        System.out.println("Tamaño: " + frutas.size());

        System.out.println("Lista completa: " + frutas);
    }

    // -----------------------------
    // EJERCICIO 2
    // -----------------------------
    public static void ejercicio2() {
        System.out.println("\n--- EJERCICIO 2 ---");

        ArrayList<Integer> numeros = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50, 20)
        );

        numeros.remove(2);  // eliminar por índice

        numeros.remove(Integer.valueOf(20)); // primera aparición

        boolean contiene40 = numeros.contains(40);

        System.out.println("¿Contiene 40?: " + contiene40);
        System.out.println("Tamaño final: " + numeros.size());
        System.out.println("Lista: " + numeros);
    }

    // -----------------------------
    // EJERCICIO 3
    // -----------------------------
    public static void ejercicio3() {
        System.out.println("\n--- EJERCICIO 3 ---");

        ArrayList<String> nombres = new ArrayList<>(
                Arrays.asList("Ana", "Luis", "María", "Carlos", "Elena")
        );

        int contador = 0;

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Posición " + i + ": " + nombres.get(i));

            if (nombres.get(i).length() > 4) {
                contador++;
            }
        }

        System.out.println("Nombres con más de 4 caracteres: " + contador);
    }

    // -----------------------------
    // EJERCICIO 4
    // -----------------------------
    public static void ejercicio4() {
        System.out.println("\n--- EJERCICIO 4 ---");

        ArrayList<Double> valores = new ArrayList<>(
                Arrays.asList(15.5, 23.8, 9.2, 31.7, 12.4)
        );

        double suma = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (Double v : valores) {
            suma += v;
            if (v > max) max = v;
            if (v < min) min = v;
        }

        double promedio = suma / valores.size();

        System.out.println("Suma: " + suma);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Promedio: " + promedio);
    }

    // -----------------------------
    // EJERCICIO 5
    // -----------------------------
    public static void ejercicio5() {
        System.out.println("\n--- EJERCICIO 5 ---");

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        System.out.println("Antes: " + numeros);

        Iterator<Integer> it = numeros.iterator();
        int eliminados = 0;

        while (it.hasNext()) {
            int n = it.next();
            if (n % 2 == 0) {
                it.remove();
                eliminados++;
            }
        }

        System.out.println("Después: " + numeros);
        System.out.println("Eliminados: " + eliminados);
    }

    // -----------------------------
    // EJERCICIO 6
    // -----------------------------
    public static void ejercicio6() {
        System.out.println("\n--- EJERCICIO 6 ---");

        ArrayList<String> lenguajes = new ArrayList<>(
                Arrays.asList("Java", "Python", "C++", "JavaScript", "Python", "Go")
        );

        int primeraPython = lenguajes.indexOf("Python");
        int ultimaPython = lenguajes.lastIndexOf("Python");
        boolean contieneRuby = lenguajes.contains("Ruby");

        List<String> sublista = lenguajes.subList(1, 4);

        System.out.println("Primera Python: " + primeraPython);
        System.out.println("Última Python: " + ultimaPython);
        System.out.println("¿Contiene Ruby?: " + contieneRuby);
        System.out.println("Sublista (1-4): " + sublista);
    }

    // -----------------------------
    // EJERCICIO 7
    // -----------------------------
    public static void ejercicio7() {
        System.out.println("\n--- EJERCICIO 7 ---");

        ArrayList<Integer> numeros = new ArrayList<>(
                Arrays.asList(45, 12, 78, 23, 67, 34, 89, 56)
        );

        Collections.sort(numeros);
        System.out.println("Ascendente: " + numeros);

        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Descendente: " + numeros);

        ArrayList<String> nombres = new ArrayList<>(
                Arrays.asList("Ana", "Luis", "María", "Carlos", "Elena")
        );

        Collections.sort(nombres);
        System.out.println("Alfabético: " + nombres);

        nombres.sort((a, b) -> a.length() - b.length());
        System.out.println("Por longitud: " + nombres);
    }

    // -----------------------------
    // EJERCICIO 8
    // -----------------------------
    public static void ejercicio8() {
        System.out.println("\n--- EJERCICIO 8 ---");

        ArrayList<String> palabras = new ArrayList<>(
                Arrays.asList("casa", "auto", "bicicleta", "avión", "barco", "tren")
        );

        palabras.removeIf(p -> p.length() < 5);
        System.out.println("Palabras filtradas: " + palabras);

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= 20; i++) nums.add(i);

        nums.removeIf(n -> n % 3 == 0);
        System.out.println("Números filtrados: " + nums);
    }

    // -----------------------------
    // EJERCICIO 9
    // -----------------------------
    public static void ejercicio9() {
        System.out.println("\n--- EJERCICIO 9 ---");

        ArrayList<String> dias = new ArrayList<>(
                Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes")
        );

        Object[] arregloObj = dias.toArray();
        String[] arregloStr = dias.toArray(new String[0]);

        System.out.println("Longitud Object[]: " + arregloObj.length);
        System.out.println("Longitud String[]: " + arregloStr.length);

        System.out.println("Contenido Object[]:");
        for (Object o : arregloObj) {
            System.out.println(o);
        }

        System.out.println("Contenido String[]:");
        for (String s : arregloStr) {
            System.out.println(s);
        }

        List<String> listaDesdeArreglo = Arrays.asList("A", "B", "C");
        System.out.println("Lista desde arreglo: " + listaDesdeArreglo);
    }

    // -----------------------------
    // EJERCICIO 10
    // -----------------------------
    public static void ejercicio10() {
        System.out.println("\n--- EJERCICIO 10 ---");

        ArrayList<String> estudiantes = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();

        agregarEstudiante(estudiantes, notas, "Ana", 4.5);
        agregarEstudiante(estudiantes, notas, "Luis", 2.8);
        agregarEstudiante(estudiantes, notas, "María", 3.7);
        agregarEstudiante(estudiantes, notas, "Carlos", 4.2);
        agregarEstudiante(estudiantes, notas, "Elena", 2.5);

        listarEstudiantes(estudiantes, notas);

        System.out.println("Promedio general: " + calcularPromedio(notas));

        estudiantesAprobados(estudiantes, notas);

        eliminarEstudiante(estudiantes, notas, 1);

        int posMaria = buscarEstudiante(estudiantes, "María");
        System.out.println("María está en posición: " + posMaria);

        listarEstudiantes(estudiantes, notas);
    }

    // -----------------------------
    // MÉTODOS AUXILIARES
    // -----------------------------
    public static void agregarEstudiante(ArrayList<String> est, ArrayList<Double> not, String nombre, double nota) {
        est.add(nombre);
        not.add(nota);
    }

    public static void eliminarEstudiante(ArrayList<String> est, ArrayList<Double> not, int indice) {
        if (indice >= 0 && indice < est.size()) {
            est.remove(indice);
            not.remove(indice);
        }
    }

    public static int buscarEstudiante(ArrayList<String> est, String nombre) {
        return est.indexOf(nombre);
    }

    public static double calcularPromedio(ArrayList<Double> notas) {
        double suma = 0;
        for (double n : notas) suma += n;
        return suma / notas.size();
    }

    public static void listarEstudiantes(ArrayList<String> est, ArrayList<Double> not) {
        System.out.println("\nLista de estudiantes:");
        for (int i = 0; i < est.size(); i++) {
            System.out.println(est.get(i) + " - " + not.get(i));
        }
    }

    public static void estudiantesAprobados(ArrayList<String> est, ArrayList<Double> not) {
        System.out.println("\nEstudiantes aprobados:");
        for (int i = 0; i < est.size(); i++) {
            if (not.get(i) >= 3.0) {
                System.out.println(est.get(i) + " - " + not.get(i));
            }
        }
    }
}
