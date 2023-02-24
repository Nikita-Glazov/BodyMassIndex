public class BmiService {
    public double calculate(int weight, double height) {
        double index;
        index = weight / Math.pow(height, 2);
        return index;
    }
}
