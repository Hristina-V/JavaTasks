import java.util.Scanner; //scanner class - to enable input of parameters

public class QuadraticЕquationCalculator{
    public static void main(String[] args) {
        double a = readInput("a");
        double b = readInput("b");
        double c = readInput("c");

        double discriminant = calculateDiscriminant(a,b,c);
        System.out.println("Discriminant = " + discriminant);

        if (discriminant > 0) {
            double root1 = calculateRoot(a, b, discriminant, true);
            double root2 = calculateRoot(a, b, discriminant, false);
            System.out.println("Root 1 = " + root1 + "\nRoot 2 = " + root2);
        } else if (discriminant == 0) {
            double root = calculateRoot(a, b, discriminant, true);
            System.out.println("Root 1 = " + root);
        } else if (discriminant < 0) {
            System.out.println("The equation has no real roots. :)");
        }
    }

    /**
     * Call once for neutral discriminant
     * Call twice with sign (true and false) for positive discriminant
     *
     * @param a
     * @param b
     * @param discriminant
     * @param sign - true or false for getting all the 2 roots of the equation
     * @return root for quadratic equation
     */
    public static double calculateRoot(double a, double b, double discriminant, boolean sign) {
        int factor = sign ? 1 : -1;
        double aggregatedDiscriminant = discriminant == 0 ? 0 : factor * Math.sqrt(discriminant);

        double root = (-b + aggregatedDiscriminant) / (2 * a);
        return root;
    }

    public static double readInput(String label) {
        Scanner inputParameter = new Scanner(System.in); //creates a scanner object
        System.out.println("Parameter " + label + " =");
        return inputParameter.nextDouble();
    }

    public static double calculateDiscriminant(double a, double b, double c){
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        return discriminant;
    }
}

