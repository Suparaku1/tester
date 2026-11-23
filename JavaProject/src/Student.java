public class Student {

    String name;
    int age;
    String course;
    double averageGrade;

    public void setName(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public void printStudent() {
        System.out.println("============================");
        System.out.println("Find student info below:");
        System.out.println("\u001B[31m" + "Name: " + name);
        System.out.println("\u001B[31m" + "Age:  " + age);
        System.out.println("Course:  " + course);
        System.out.println("Degree:  " + averageGrade);
        System.out.println("============================");
    }
}
