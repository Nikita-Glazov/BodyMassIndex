public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 77;
        double height = 1.70;
        double index = service.calculate(weight, height);
        System.out.println("Индекс массы тела равен " + index);
    }
}