public class Main {

    public static void main(String[] args) {

        CalculatorService calculatorService = new CalculatorServiceImpl();

        System.out.println("2 + 2 = " + calculatorService.sum(2, 2) );
        System.out.println("2 * 2 = " + calculatorService.prod(2, 2) );

    }

}