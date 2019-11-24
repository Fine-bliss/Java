/*
* 1 implement Cloneable
* 2 重写Object Clone（）
* 3 如果当前类包含引用类型
*    person->Money
*    在Person的clone方法内，不仅要克隆自己本身 还需要克隆Money
* */

class Money implements Cloneable{
    double money = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    public String name;
    public  Money m;
    public Person(){
        this.m = new Money();
    }
//重写一个clone方法：object

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        Person per = (Person)super.clone();
        per.m =(Money)this.m.clone();
        return per;
    }
}
public class Test1 {
    public static void main(String[] args)throws CloneNotSupportedException {
        //深拷贝
        Person person = new Person();
        Person person2 = (Person)person.clone();
        System.out.println(person.m.money);
        System.out.println(person2.m.money);
        System.out.println("=============");
        person2.m.money = 99.9;
        System.out.println(person.m.money);
        System.out.println(person2.m.money);

    }
    //浅拷贝
    public static void main1(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        person.name = "cc";

        Person person1 = (Person) person.clone();
        System.out.println(person1.name);
    }
}
