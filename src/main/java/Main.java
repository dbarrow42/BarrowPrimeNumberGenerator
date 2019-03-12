public class Main {

    public static void main(String... args) {
        PrimeGenerator primeGen = new PrimeGenerator();
        if (InputValidator.validateInput(args)) {
            System.out.println(primeGen.getPrimesInRange(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
        }
    }
}
