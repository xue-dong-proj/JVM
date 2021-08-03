package nuc.edu;

/**
 * @author 薛东
 * @date 2021/5/17 10:46
 */
public class Test04 {
    public class Student{
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    /**
     * 懒汉式
     * 需要用的时候才会创建对象
     */
    private Student stu = null;
    public Student sluggard(){
        if (stu == null){
            stu = new Student();
        }
        return stu;
    }

    /**
     * 饿汉式
     * 加载类的时候就创建了对象
     */
    public Student hoodlum(){
        Student stu = new Student();
        stu.setAge(11);
        return stu;
    }
}
