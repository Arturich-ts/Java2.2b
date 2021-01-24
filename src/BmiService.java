public class BmiService {
    public double calculate(double weight, double height){
        double imt;
        imt = weight / (height * height);
        return imt;
    }
}
