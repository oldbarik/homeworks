package lesson2homework;

public class lesson2homework {
    public static void main(String[] args) {
        System.out.println(within10and20(12, 2));
        isPositiveOrNegative(0);
        //System.out.println(isNegative(2));
        //printWordNTimes("text", 6);
    }


    //задание 1 Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        return (sum <= 20) && (sum >= 10);
    }

    //задание 2 Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static void isPositiveOrNegative(int a) {
        if (a > 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}
        //задание 3 Написать метод, которому в качестве параметра передается целое число.
        // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        /*public static boolean isNegative(int a){
            if (a > 0) {
                return true;
            } else (a < 0) {
                return false;
            }
       /* }
        //задание 4 Написать метод, которому в качестве аргументов передается строка и число,
        // метод должен отпечатать в консоль указанную строку, указанное количество раз;

        public static void printWordNTimes(String str, int a) {
            for (int i = 1, i < a, i++) {
                System.out.println(str);

         */
