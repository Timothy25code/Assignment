public class ClassAverage {
    private String className;
    public ClassAverage(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }

    public double calculateClassAverage(double score1, double score2) {
        double average = (score1 + score2) / 2;
        System.out.println("Calculating average of 2 scores:");
        System.out.println("Scores: " + score1 + ", " + score2);
        System.out.println("Average: " + average);
        return average;
    }

    public double calculateClassAverage(double score1, double score2, double score3) {
        double average = (score1 + score2 + score3) / 3;
        System.out.println("Calculating average of 3 scores:");
        System.out.println("Scores: " + score1 + ", " + score2 + ", " + score3);
        System.out.println("Average: " + average);
        return average;
    }

    public double calculateClassAverage(double[] scores) {
        if (scores == null || scores.length == 0) {
            System.out.println("Error: No scores provided!");
            return 0.0;
        }

        double sum = 0.0;
        System.out.println("Calculating average of " + scores.length + " scores:");
        System.out.print("Scores: ");

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            System.out.print(scores[i]);
            if (i < scores.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double average = sum / scores.length;
        System.out.println("Average: " + average);
        return average;
    }

    public static void main(String[] args) {
        System.out.println("=== Class Average Calculator ===");
        System.out.println("Demonstrating Method Overloading\n");

        ClassAverage calculator = new ClassAverage("CSCD 101");

        System.out.println("Class: " + calculator.getClassName());
        System.out.println("=" + "=".repeat(40) + "\n");

        // Test Version 1: Two parameters
        System.out.println("VERSION 1 TEST:");
        double avg1 = calculator.calculateClassAverage(85.5, 92.0);
        System.out.println("\n" + "=".repeat(40) + "\n");

        // Test Version 2: Three parameters
        System.out.println("VERSION 2 TEST:");
        double avg2 = calculator.calculateClassAverage(78.0, 85.5, 91.0);
        System.out.println("\n" + "=".repeat(40) + "\n");

        // Test Version 3: Array parameter - small array
        System.out.println("VERSION 3 TEST (5 scores):");
        double[] scores1 = {88.0, 92.5, 76.0, 85.5, 90.0};
        double avg3 = calculator.calculateClassAverage(scores1);
        System.out.println("\n" + "=".repeat(40) + "\n");

        // Test Version 3: Array parameter - larger array
        System.out.println("VERSION 3 TEST (10 scores):");
        double[] scores2 = {95.0, 88.5, 92.0, 78.5, 85.0,
                90.5, 87.0, 93.5, 82.0, 89.0};
        double avg4 = calculator.calculateClassAverage(scores2);
        System.out.println("\n" + "=".repeat(40) + "\n");

        // Demonstrate that all three versions work with the same method name
        System.out.println("SUMMARY:");
        System.out.println("The same method name 'calculateClassAverage' successfully");
        System.out.println("handled 2 scores, 3 scores, and arrays of scores!");
        System.out.println("\nThis demonstrates METHOD OVERLOADING - same name,");
        System.out.println("different parameter lists (different amounts of data).");
    }
}
