package nuc.edu;

/**
 * @author 薛东
 * @date 2021/5/17 11:40
 */
public class Student {
    private String name;
    private double chinese;
    private double math;
    private double english;
    private double sum;

    public Student(String name, double chinese, double math, double english,double sum) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        this.sum = this.chinese + this.math + this.english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                '}';
    }

    public double getSum(){
        return sum;
    }
}
