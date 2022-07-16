import java.util.Locale;

public class homework1 {

    public static void main(String[] args) {
        //Базовый уровень.
        
        //Задача №1
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        String newString = hi + world.toLowerCase() + newLine;
        newString = newString.trim();
        for (int i = 0; i < 3; i++) {
            System.out.println(newString);
        }


        //Задача №2
        int kg = 63;
        double growth = 1.7;
        double indexBody = kg * growth;
        System.out.println("\n" + indexBody);

        //Задача №3
        char[] array = new char[]{'a', 'b', 'c', 'd', 'e'};
        System.out.println(array);
        array[3] = 'h';
        System.out.println(array);

        //homeWorkAdvanced
        //Задача№1
        System.out.println("\n" + "Продвинутый уровень :");
        String text234 = "234";
        String some_text = "some_text";
        int newText234 = Integer.parseInt(text234);
        int sumAll = newText234 + some_text.length();
        System.out.println("Задача №1: " + sumAll);

        //Задача №2
        int a = 3;
        int b = 5;
        System.out.println("Задача №2: " + Math.pow((a + b), 2));

        //Задача №3
        int[] arrayOne = {1, 2, 5, 7, 10};
        int[] arrayTwo = {2, 3, 2, 17, 15};
        int[] arrayAll = new int[ arrayTwo.length + arrayOne.length + arrayOne.length];
        System.out.print("Задача №3: ");
        for (int i = 0; i < arrayOne.length; i++) {
            int x = i + arrayTwo.length;
            int y = i + arrayTwo.length * 2;
            arrayAll[i] = arrayOne[i];
            arrayAll[x] = arrayTwo[i];
            arrayAll[y] = arrayOne[i] * arrayTwo[i];
        }
        for (int i = 0; i < arrayAll.length; i++) {
            System.out.print(arrayAll[i] + " ,");
        }
        //Задача№4
        String string1= "Hello world";
        string1 = string1.replace('l', 'r');
        string1 = string1.toUpperCase(Locale.ROOT);

        System.out.println("\nЗадача №4: "+string1.substring(0,8));








    }

}
