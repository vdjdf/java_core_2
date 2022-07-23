package homework2;

public class HomeWorkEasy {
    public static void main(String[] args) {
        //Задание №1
        System.out.println("Задача №1:");
        for (int i = 0; i < 100; i++) {
            System.out.print(i + 1 + "a ");
        }

        //Задание №2
        System.out.println("\nЗадача №2:");
        int ageChildren = 10;
        if (ageChildren < 6) {
            System.out.println("Пошел в сад");
        } else if (ageChildren < 11) {
            System.out.println("Пошел в младшую школу");
        } else if (ageChildren < 17) {
            System.out.println("Пошел в среднюю школу");
        } else {
            System.out.println("Пошел в университет");
        }

        //Задание №3:
        System.out.println("Задача №3:");
        boolean chicken = true;
        boolean vegetables = false;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;

        if (chicken && sour && vegetables && toast) {
            System.out.println("Сделан цезарь ");
        } else if ((chicken||sausage) && vegetables &&eggs ){
            System.out.println("Сделан Оливье");
        } else if(vegetables){
            System.out.println("Сделан Овощной Салат");
        } else {
            System.out.println("Ингридиентов нет  ");
        }

        //Задание №4:
        System.out.println("Задача №4:");
        HomeWorkEasyANIMAL dog = new HomeWorkEasyANIMAL(15, "Собака");
        HomeWorkEasyANIMAL cat = new HomeWorkEasyANIMAL(7, "Кошка");


    }
}
