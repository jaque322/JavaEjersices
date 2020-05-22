package Ejersices;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.min;

public class Ejersices {

    /**
     *
     * @param s1
     * @param s2
     * @return arraylist with common substrings
     */
    public  ArrayList<String> commonSubstring(String s1, String s2) {
        ArrayList<String> resultado = new ArrayList<>();
        int[][] matrix = new int[s1.length()][s2.length()];
        int max = 0;
        int endingIndex = 0;
        try {

            for (int i = 1; i < s1.length(); i++) {
                for (int j = 1; j < s2.length(); j++) {

                    if (s1.charAt(i) == s2.charAt(j)) {
                        matrix[i][j] = 1 + matrix[i - 1][j - 1];
                        //obtengo el valor maximo
                        if (max<matrix[i][j]) {
                            max = matrix[i][j];
                            endingIndex = i;
                        }

                    } else {
                        matrix[i][j] = 0;
                    }

                }
            }

        } catch (RuntimeException a) {
            System.out.println(a.getMessage());
        }

        return resultado;


    }








    public boolean isAmstrongNumber(int number) {
        String numero = Integer.toString(number);
        int resultado = 0;
        for (int i = 0; i < numero.length(); i++) {
            resultado += Math.pow(Integer.parseInt(String.valueOf(numero.charAt(i))), numero.length());


        }

        if (resultado == number) {
            return true;
        } else {
            return false;
        }
    }

    public double clockAngle(int hour, int minutes) {
        final double MINUTES_PER_HOUR = 60;
        final double DEGREES_PER_MINUTE = 360 / MINUTES_PER_HOUR;
        final double DEGREES_PER_HOUR = 360 / 12;

        double minuteAngle = minutes * DEGREES_PER_MINUTE;
        double hourAngle = hour * DEGREES_PER_HOUR +
                (minutes / MINUTES_PER_HOUR) * DEGREES_PER_HOUR;

        double diff = Math.abs(minuteAngle - hourAngle);
        if (diff > 180) return 360 - diff;
        return diff;

    }

    /**
     * @param A ARRAY
     * @param B ARRAY
     * @return
     */


    public int[] mergeArrays(int[] A, int[] B) {
        int[] mergedArray = new int[A.length + B.length];
        int counter = 0;
        int firstArrayCounter = 0;
        int secondArrayCounter = 0;

//        while (counter < mergedArray.length-1) {
//
//            if (A[firstArrayCounter] < B[secondArrayCounter]) {
//                mergedArray[counter]=A[firstArrayCounter];
//                firstArrayCounter++;
//                counter++;
//
//            }else
//            {
//                mergedArray[counter]=B[secondArrayCounter];
//                secondArrayCounter++;
//                counter++;
//            }
//
//        }
        while (firstArrayCounter < A.length && secondArrayCounter < B.length) {
            if (A[firstArrayCounter] < B[secondArrayCounter]) {
                mergedArray[counter++] = A[firstArrayCounter++];
            } else {
                mergedArray[counter++] = B[secondArrayCounter++];
            }
        }
        while (firstArrayCounter < A.length) {
            mergedArray[counter++] = A[firstArrayCounter++];
        }

        while (secondArrayCounter < B.length) {
            mergedArray[counter++] = B[secondArrayCounter++];
        }


        return mergedArray;


    }

    public int[] mergeArray2(int[] A, int[] B) {
        int counter = A.length - 1;
        int firstArrayCounter = -1;
        int secondArrayCounter = -1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                firstArrayCounter++;
            }
        }
        for (int j = 0; j < B.length; j++) {
            if (B[j] != 0) {
                secondArrayCounter++;
            }

        }
        while (secondArrayCounter >= 0) {
            if (B[secondArrayCounter] > A[firstArrayCounter]) {
                A[counter] = B[secondArrayCounter--];

            } else {
                A[counter] = A[firstArrayCounter--];
            }
            counter--;
        }
        return A;
    }


}



