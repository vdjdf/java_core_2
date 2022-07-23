package homework2;

class HomeWorkEasyANIMAL {
   private  int kg;
   private  String name;

    public  HomeWorkEasyANIMAL(int personKg, String personName) {

        this.kg = personKg;
        this.name = personName;
        System.out.println("Животное: "+name+"       Вес: "+kg);

    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
//
    public int getKg() {
    return this.kg;
}

    public void setKg(int newKg) {
        this.kg = newKg;

    }
}

