public class Dreptunghi implements Figura{
    private Double lungime;
    private Double latime;

    public Dreptunghi(Double lungime, Double latime) {
        this.lungime = lungime;
        this.latime = latime;
    }
    public void desena(){
        System.out.println("Dreptunghi");

    }
    public Double perimetru(){
        return 2*(this.getLungime() + this.getLatime());
    }
    public Double aria(){
        return this.getLungime() * this.getLatime();
    }
    public Double getLatime() {
        return this.latime;
    }
    public Double getLungime() {
        return this.lungime;
    }

    public void setLatime(Double latime) {
        this.latime = latime;
    }

    public void setLungime(Double lungime) {
        this.lungime = lungime;
    }
}
