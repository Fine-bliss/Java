import java.util.Arrays;

class Student implements Comparable<Student>{
    public String name;
    public int age;
    public double score;

    public Student(String name,int age,double score){
        this.name = name;
        this.age = age;
        this.score = score;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.name .compareTo(o.name);
       // return (int)(this.score-o.score);
        //return this.age -o.age ;
        //return 0;
    }
}




public class Test {
    public static void main(String[] args) {
            Student[] students = new Student[3];
            students[0] = new Student("zhangsan",15,66);
            students[1] = new Student("lisi",16,77);
            students[2] = new Student("wangwu",17,88);
            Arrays.sort(students);
        //Arrays.sort(students);
        System.out.println(Arrays.toString(students));

    }
}
