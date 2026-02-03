package KTDG_SS08;
class Student{
    private String studentId;
    private String studentName;
    private double score;
    public Student(){
    }
    public Student(String studentId, String studentName, double score){
        this.studentId = studentId;
        this.studentName = studentName;
        this.score = score;
    }
    public String getId(){
        return studentId;
    }
    public void setId(String studentId){
        this.studentId = studentId;
    }
    public String getName(){
        return studentName;
    }
    public void setName(String studentName){
        this.studentName = studentName;
    }
    public double getScore(){
        return score;
    }
    public void setScore(double score){
        this.score = score;
    }
    public String getRank(){
        if (score >= 8.0) {
            return "Gioi";
        } else if(score >= 6.5 && score <= 8.0){
            return "Kha";
        } else{
            return "Trung Binh";
        }
    }
    public String toString(){
        return ("Ma SV: " + studentId + "Ten SV: " + studentName + "Diem: " + score + "Hoc luc: " + getRank());
    }
}