/**
 * GradeReporter class - Validates scores and generates grade reports
 * Demonstrates encapsulation and method decomposition
 */
public class GradeReporter {
    // Instance variable
    private double score;

    /**
     * Constructor
     * @param score The student's score
     */
    public GradeReporter(double score) {
    this.score = score;
}

/**
 * Default constructor
 */
public GradeReporter() {
    this.score = 0.0;
}

// Getter
public double getScore() {
    return score;
}

// Setter
public void setScore(double score) {
    this.score = score;
}

/**
 * Validates if the score is within acceptable range (0-100)
 * @param score The score to validate
 * @return true if valid, false otherwise
 */
private boolean validateScore(double score) {
    return score >= 0 && score <= 100;
}

/**
 * Calculates letter grade based on score
 * @param score The numeric score
 * @return The letter grade (A, B, C, D, or F)
 */
private char calculateLetterGrade(double score) {
    if (score >= 90) {
        return 'A';
    } else if (score >= 80) {
        return 'B';
    } else if (score >= 70) {
        return 'C';
    } else if (score >= 60) {
        return 'D';
    } else {
        return 'F';
    }
}

/**
 * Displays performance message based on grade
 * @param grade The letter grade
 */
private void displayPerformanceMessage(char grade) {
    System.out.println("Your grade is: " + grade);

    switch (grade) {
        case 'A':
            System.out.println("Excellent performance!");
            break;
        case 'B':
            System.out.println("Good job!");
            break;
        case 'C':
            System.out.println("Satisfactory performance.");
            break;
        case 'D':
            System.out.println("Needs improvement.");
            break;
        case 'F':
            System.out.println("Failing grade. Please see instructor.");
            break;
        default:
            System.out.println("Invalid grade.");
            break;
    }
}

/**
 * Main method that coordinates the grading process
 * This method manages lower-level helper methods
 * @param score The score to process
 */
public void executeGradeReport(double score) {
    // Step 1: Validate score
    if (!validateScore(score)) {
        System.out.println("Invalid Score");
        return;
    }

    // Step 2: Calculate letter grade
    char letterGrade = calculateLetterGrade(score);

    // Step 3: Display performance message
    displayPerformanceMessage(letterGrade);
}
}