import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Students{
    String name;
    String grade;
    Double score;

    public Students(String name, String grade, Double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", score=" + score +
                '}';
    }
}

public class Demo1 {
    public static List<Character> func(String str1,String str2){
        List<Character> ret = new ArrayList<>();
        for(int i = 0;i < str1.length();i++){
            char ch = str1.charAt(i);
            if(!str2.contains(ch+"")){
                ret.add(ch);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        List<Character> list = func("welcome to bit","come");
        //Object[] obj = list.toArray();
       // String ret = list
        System.out.println(list);
    }
    public static void main1(String[] args) {
        List<Students> list = new ArrayList<>();
        list.add(new Students("ww","06",88.0));
        list.add(new Students("yy","06",88.2));
        list.add(new Students("ll","06",87.9));
        System.out.println(list);
        for (Students students: list) {
            System.out.println(students);

        }
    }
}
