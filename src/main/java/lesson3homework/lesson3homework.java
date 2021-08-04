package lesson3homework;
import java.util.Arrays;

public class lesson3homework {
    public static void main(String[] args) {
        //задание 1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] cellArr = new int[]{1, 1, 1, 1, 0, 0, 0, 0};
        for (int i = 0; i < cellArr.length; i++) {
            switch (cellArr[i]){
                case 0:{
                    break;
                }
                case 1:{
                    cellArr[i]=0;
                    break;
                }
            }
            System.out.println(Arrays.toString(cellArr));

        }
        //Задание 2 Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

        int[] oneHundred = new int[100];
        for (int i = 0; i < oneHundred.length; i++) {
            oneHundred[i] = i + 1;
        }
        System.out.print(Arrays.toString(oneHundred));
        System.out.println();
        //задание 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] cellDell = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < cellDell.length; i++) {
            if (cellDell[i] < 6) {
                cellDell[i] *= 2;
            }
            System.out.print(Arrays.toString(cellDell));
            System.out.println();
        }  //не понял в чем ошибка, но он выводит не то что нужно

        //задание 4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        // (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему
        // принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        int square [][] = new int[8][8];

        for (int a = 0; a < 8; a++) {
            for (int b = 0, c = 7; b < 8; b++, c--) {
                if (square[a] == square[b]) {
                    square[a][b] = 1;
                    square[a][c] = 1;
                }
            }
            System.out.printf(Arrays.toString(square[a]));
            System.out.println();

            //задание 5 Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
            // типа int длиной len, каждая ячейка которого равна initialValue;

/*public static int[]readmethod(int len,int initiaValue){
    int[]readMethod1 = new int[len];
    for (int = 0; i<len; i++){
        readMethod1[i] = initiaValue;         подчеркивается красным, хоть и все вроде верно
                }*/
        }
    }

}
