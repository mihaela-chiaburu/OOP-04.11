public class Hexagon implements Figura{
    private Double latura;
    public Hexagon(Double latura) {
        this.latura = latura;
    }
    public Double getLatura() {
        return this.latura;
    }
    public void setLatura(Double latura) {
        this.latura = latura;
    }

    @Override
    public void desena() {
        System.out.println("Hexagon");
    }

    @Override
    public Double perimetru() {
        return 6*this.getLatura();
    }

    @Override
    public Double aria() {
        return (3*Math.sqrt(3)/2)*Math.pow(this.getLatura(), 2);
    }
}
