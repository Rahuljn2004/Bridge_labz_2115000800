class Pens_Distribution {
    public static void main(String[] args) {
        int pens = 14, students = 3;
        int pens_Per_Student = pens / students;
        int remaining_Pens = pens % students;
        System.out.println("The Pen Per Student is " + pens_Per_Student + " and the remaining pen not distributed is " + remaining_Pens);
    }
}