
    public class GradeReporter {
        private double score;

        public GradeReporter(double score) {
            this.score = score;
        }

        public GradeReporter() {
            this.score = 0.0;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        private boolean validateScore(double score) {
            return score >= 0 && score <= 100;
        }

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

        private void displayPerformanceMessage(char grade) {
            System.out.println("Your grade is : + grade");
            switch (grade) {
                case 'A':
                    System.out.println("Excellent Performance!");
                    break;
                case 'B':
                    System.out.println("Good Performance!");
                    break;
                case 'C':
                    System.out.println("Satisfactary Performance");
                    break;
                case 'D':
                    System.out.println("Needs improvement");
                case 'F':
                    System.out.println("Failing grade. Please see instructor.");
                    break;
                default:
                    System.out.println("Invalid Grade!");
                    break;
            }
        }

        public void executeGradeReport(double score) {
            if (!validateScore(score)) {
                System.out.println("Invalid Score");
                return;
            }
            char letterGrade = calculateLetterGrade(score);

            displayPerformanceMessage(letterGrade);
        }

        public static void main(String[] args) {
            GradeReporter reporter = new GradeReporter();

            System.out.println(" testing grade report");
            reporter.executeGradeReport(reporter.score);

            System.out.println();
            reporter.executeGradeReport(reporter.score);
        }
    }






