package Arreglos;

import java.sql.ClientInfoStatus;

public class Arreglos {
    static int[] list;
    //invierte un arreglo

    /**
     * @param arg
     * @return
     */
    public int[] invertirArreglo(int[] arg) {
        int longitud = arg.length;
        int[] temporal = new int[longitud];

        for (int i = 0; i < arg.length; i++) {
            temporal[--longitud] = arg[i];

        }
        return temporal;


    }

    /**
     * @param list
     * @return
     */
    public int[] insertionSorting(int[] list) {
        int temp, j;
        for (int i = 1; i < list.length; i++) {

            j = i - 1;

            while (j >= 0 && list[i] < list[j]) {
                temp = list[j];
                list[j] = list[j + 1];
                list[j + 1] = temp;
                j--;

            }


        }
        return list;

    }

    public void contarOcurrenciasArreglo() {
        int[] calificaciones = {2, 2, 2, 3, 3, 3, 3, 3};
        int[] contador = new int[6];

        for (int i = 0; i < calificaciones.length; i++) {
            contador[calificaciones[i]] += 1;

        }
        for (int j = 0; j < contador.length; j++) {
            System.out.println("calificacion" + j + ":" + contador[j] + "veces");
        }
    }

    public boolean noEstaEnArreglo(int num) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == num) {
                return false;


            }

        }
        return true;
    }

    /**
     * Cuenta la cantidad de veces que se repite un valor determinado dentro del array
     *
     * @param array
     * @return
     */
    public void contarOcurrenciasOficial(int[] array) {
        //System.out.println("Ultimas Ocurrencias contadas metodo*********************************************************************************--------------------");
        list = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    if (noEstaEnArreglo(array[i])) {
                        list[i] = array[i];
                    }

                }

            }
            if (list[i] != 0) {

                System.out.println("El valor " + array[i] + "se repite" + count);
            }
        }

    }

    public String compressString(String s) {
        String out = "";
        int sum = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                sum++;
            } else {
                out = out + s.charAt(i) + sum;
                sum = 1;
            }

        }
        out = out + s.charAt(s.length() - 1) + sum;
        return out.length() < s.length() ? out : s;


    }

    /**
     * Funcion en forma explicita
     *
     * @param exp1
     * @param exp2
     * @return true or false
     */
    public boolean determinarInterseccionFunciones(String exp1, String exp2) {
        boolean expresion1 = false;
        boolean expresion2 = false;

        for (int i = 0; i < exp1.length(); i++) {

            if (Character.isLetter(exp1.charAt(i))) {
                if (exp1.charAt(i - 1) > 0) {
                    expresion1 = true;
                } else {
                    expresion1 = false;

                }

            }

        }
        for (int i = 0; i < exp2.length(); i++) {

            if (Character.isLetter(exp2.charAt(i))) {
                if (exp2.charAt(i - 1) > 0) {
                    expresion2 = true;
                } else {
                    expresion2 = false;

                }

            }

        }
        if (expresion1 && expresion2) {
            return true;
        }
        return false;
    }

    public static  String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L","X","IX","V","IV","I"};
    static final int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    public String intigertoRoman(int value) {

        if (value > 3999 || value < 1) throw new IllegalArgumentException();
        StringBuilder numeral = new StringBuilder();
        int i = 0;
        while (value > 0) {
            if (value - values[i] >= 0) {
                numeral.append(numerals[i]);
                value -= values[i];

            } else {
                i++;
            }
        }


        return numerals.toString();
    }

}