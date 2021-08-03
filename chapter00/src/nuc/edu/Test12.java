package nuc.edu;

import java.util.*;

/**
 * @author 薛东
 * @date 2021/5/17 11:21
 */
public class Test12 {
    public static void main(String[] args) {
        Student student = null;
        Scanner sc = new Scanner(System.in);
        int i = 1;
        List<Student> list = new ArrayList<>();
        while (i <= 5) {
            System.out.println("请输入第" + i + "组学生的信息");
            student.setName(sc.next());
            student.setChinese(sc.nextDouble());
            student.setMath(sc.nextDouble());
            student.setEnglish(sc.nextDouble());
            double sum = student.getSum();
            list.add(student);
        }

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student stu1, Student stu2) {
                return (int) (stu1.getSum() - stu2.getSum());
            }
        });

        System.out.println("排序后：");
        for (Student stu : list) {
            System.out.println(stu);
        }
    }
}
