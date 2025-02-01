class Course {
    private String courseName;
    private int duration; // In weeks
    private double fee;
    private static String instituteName = "Tech Academy"; // Default institute name

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}
