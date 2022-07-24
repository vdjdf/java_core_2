package homework2.Advanced4;

public class Worker {
    private String nameWorker;
    private Warehouse warehouse;
    private int journal = 0;

    public Worker(String nameWorker, Warehouse warehouse) {
        this.nameWorker = nameWorker;
        this.warehouse = warehouse;
    }

    public void takeVodka() {

        warehouse.setVodka(warehouse.getVodka() - 1);
        System.out.println("Ура , я сломал водку");
        journal++;
    }

    public int getJournal() {
        return journal;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
}
