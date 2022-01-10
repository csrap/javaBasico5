package interfaces;

public class Main {
    static CocheCRUD cocheCRUD = new CocheCRUDImpl();


    public static void main(String[] args) {
        cocheCRUD.findAll();
        cocheCRUD.save(new Coche("yaris",2010,"toyota"));
        cocheCRUD.delete(new Coche("yaris",2010,"toyota"));



    }
}
