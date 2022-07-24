package homework2.Advanced4;

public class Test {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(100);
        Worker vasia = new Worker("Вася",warehouse);
        Worker petia = new Worker("Петя",warehouse);
        Worker vova = new Worker("Вова",warehouse);
        vova.takeVodka();
        petia.takeVodka();
        vasia.takeVodka();
        vasia.takeVodka();
        System.out.println("Осталось водки на складе: "+warehouse.getVodka());
        System.out.println("Журнал: " + vasia.getJournal());


    }
}
