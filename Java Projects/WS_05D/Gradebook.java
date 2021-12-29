public class Gradebook {
    // FIELDS
    private String studentName;
    private int ptsEarned = 0;
    private int ptsPossible = 0;
        
        

    // CONSTRUCTOR
    public Gradebook(String name)
    {
        studentName = name;
    }

    // METHODS
   
     /** Accessor to return the student’s name
     * @return student’s name
     */
    public String getName()
    {
        return studentName;
    }

   /** Accumulate (sum up) the student's score and the max score for HW
     * or assessment
     * @param score the score earned by the student
     * @param maxScore the max score or “out of” score
     */
    public void addScore(int score, int mostPoints)
    {
        ptsEarned = ptsEarned + score;
        ptsPossible = ptsPossible + mostPoints;
    }
   
    /** Calculate and return the course numeric grade, out of 100, e.g., 95
     * @return the course numeric grade
     */
    public int getCourseNumGrade()
    {
        int grade = (ptsEarned / ptsPossible) * 100;
        int roundedGrade = Math.round(grade);
        return roundedGrade;
    }
    /** Decide and return the course letter grade:
     *     numeric grade >= 90, and numeric grade <= 100: A
     *     numeric grade >= 80, and numeric grade < 90: B
     *     numeric grade >= 70, and numeric grade < 80: PASS
     *     numeric grade >= 0, and numeric grade < 70: NO PASS
     * @return the course letter grade, e.g., A
     */
    public String getCourseLetterGrade()
    {
        int grade = (ptsEarned / ptsPossible) * 100;
        int roundedGrade = Math.round(grade);
        if (roundedGrade >= 90 && roundedGrade <= 100){
            return "A";
        }
        else if (roundedGrade >= 80 && roundedGrade < 90)
        {
            return "B";
        }
        else if (roundedGrade >= 70 && roundedGrade < 80)
        {
            return "PASS";
        }else if (roundedGrade >= 0 && roundedGrade < 70){
            return "NO PASS";
        }
        return "Error";
    }
}