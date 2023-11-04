public class Patrat implements Figura{
    private Double latura;
    public Patrat(Double latura){
        this.latura = latura;
    }
    //override
    public void desena(){
        System.out.println("Patrat");
    }
    public Double perimetru(){
        return 4 * this.latura;
    }
    public Double aria(){
        return Math.pow(this.getLatura(), 2);
    }
    public Double getLatura() {
        return this.latura;
    }
    public void setLatura(Double latura) {
        this.latura = latura;
    }
}
