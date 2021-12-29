public class GradebookTester
{
    public static void main (String[] args) {
        Gradebook grbk = new Gradebook("Nemo");
        grbk.addScore(12, 13);
        grbk.addScore(35, 40);
        grbk.addScore(20, 20);
        grbk.addScore(19, 22);
       
        System.out.println(grbk.getName());
        System.out.println("Course numeric grade = " +
                            grbk.getCourseNumGrade());
        System.out.println("Course letter grade = " +
                           grbk.getCourseLetterGrade());
    }
}