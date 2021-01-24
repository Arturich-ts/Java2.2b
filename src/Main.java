public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double imt = service.calculate(70, 1.76);
        System.out.println(imt);
    }
}
