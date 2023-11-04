//polimorfism si abstractizare
import java.util.List;
public class Main {
    public static void main(String[] args) {
        //polimorfismul:
        //1) static(la nivel de compilare) overloading
        //2) dinamic(la nivel de runtime) override

        Calculator calculator = new Calculator();
        calculator.sum(2.0d, 4.5d, 5.0d);

        //un simplu polimorfism:
        /*Object a = new Object();
        Object b = new Integer(3);
        Object c = new Double(5d);*/

        Figura patrat = new Patrat(2.0);
        Figura dreptunghi = new Dreptunghi(3.0d, 5d);
        Figura triunghi = new Triunghi(3d, 4d, 5d);
        Figura patrat2 = new Patrat(5d);
        Figura patrat3 = new Patrat(4d);
        Figura patrat4 = new Patrat(1d);
        //Figura f = new Figura("Figura");
        Figura hexagon = new Hexagon(2d);

        List<Figura> list = List.of(patrat, dreptunghi, triunghi, patrat2, patrat3, patrat4, hexagon);

        /*list.forEach(figura -> {
            System.out.println(figura.aria());
            System.out.println(figura.perimetru());
            figura.desena();
            System.out.println("---------------------");
        });*/

        for(Figura figura: list){
            System.out.println(figura.aria());
            System.out.println(figura.perimetru());
            figura.desena();
            System.out.println("---------------------");
        }
    }
}