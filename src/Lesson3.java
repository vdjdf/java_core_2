public class Lesson3 {
    public static void main(String[] args) {
        /*int number1 = 11;
        int number2 = 11;
        boolean equals = number1 == number2;

        if (equals) {
            System.out.println("числа равны ");
        } else {
            System.out.println("Числа не равны");
        }
        if (number1 == number2) {
            System.out.println("Снова равны");
        }

        int number3 = 0;
        if (number3>0){
            System.out.println("Число положительное ");
        }else if(number3 == 0 ){
            System.out.println("Число ноль ");
                    } else {
            System.out.println("Число отрицательное");
        }*/

        int[] numbers11 = {1, 2, 3};
        int[] numbers22 = {1, 2, 3};

        String a = "ввв";
        String b = "ввв";

        if (numbers11.equals(numbers22)) {
            System.out.println("Массивы равны");
        } else {
            System.out.println("массивы не равны ");
        }

        int[] ints = {3, 2};
        int[] ints1 = {3, 2};
        boolean isEqual = true;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == ints1[i]) ;
            isEqual = false;
            break;
        }
        System.out.println(isEqual);


    }
}