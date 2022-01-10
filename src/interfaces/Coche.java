package interfaces;

public class Coche {

    // atributos
    String modelo;
    int year;
    String fabricante;


    //constructor

    public Coche() {

    }

    public Coche(String modelo, int year, String fabricante) {
        this.modelo = modelo;
        this.year = year;
        this.fabricante = fabricante;
    }


    //metodos

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", year=" + year +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
