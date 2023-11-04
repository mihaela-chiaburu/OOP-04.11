public class Calculator {
    //overloading
    public Double sum(Double a, Double b){
        return a + b;
    }
    public Double sum(Double a, Double b, Double c){
        return a + b + c;
    }
    public Double sum(Integer a, Integer b){
        return (double)(a+b);
    }
    public Double minus(Double a, Double b){
        return a-b;
    }
}
