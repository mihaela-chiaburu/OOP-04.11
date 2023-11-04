public class Triunghi implements Figura{
    private Double latura1;
    private Double latura2;
    private Double latura3;

    public Triunghi(Double latura1, Double latura2, Double latura3) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
    }

    public Double getLatura1() {
        return latura1;
    }

    public Double getLatura2() {
        return latura2;
    }

    public Double getLatura3() {
        return latura3;
    }

    public void setLatura1(Double latura1) {
        this.latura1 = latura1;
    }

    public void setLatura2(Double latura2) {
        this.latura2 = latura2;
    }

    public void setLatura3(Double latura3) {
        this.latura3 = latura3;
    }

    @Override
    public void desena() {
        System.out.println("Triunghi");
    }

    @Override
    public Double perimetru() {
        return this.getLatura1() + this.getLatura2() + this.getLatura3();
    }

    @Override
    public Double aria() {
        Double p = perimetru()/2;
        return Math.sqrt(p * (p - this.getLatura1()) * (p - this.getLatura2()) * (p - this.getLatura3()));
    }
}
