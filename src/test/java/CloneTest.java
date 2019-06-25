import org.junit.Test;

import java.io.*;

public class CloneTest   {
    @Test
    public void testClone() throws CloneNotSupportedException {
        people people = new people();
        people.setAge(11);
        people.setName("ll");
        people people2 = new people();
        people2.setAge(22);
        people2.setName("xx");
        CloneClass cloneClass = new CloneClass("lxm",1);
        cloneClass.setPeople(people);
        CloneClass cloneClass2 = (CloneClass) cloneClass.clone();
//        cloneClass2.setPeople(people2);
        people.setName("xx");

        System.out.println(cloneClass.toString());

        System.out.println(cloneClass2.toString());


    }
    @Test
    public void SerializableTest() throws  IOException, ClassNotFoundException {
        people people = new people();
        people.setAge(11);
        people.setName("ll");
//        people people2 = new people();
//        people2.setAge(22);
//        people2.setName("xx");
        CloneClass cloneClass = new CloneClass("lxm",1);
        cloneClass.setPeople(people);
        CloneClass cloneClass2 = (CloneClass) cloneClass.deeClone();
//        cloneClass2.setPeople(people2);
        people.setName("mm");

        System.out.println(cloneClass.toString());

        System.out.println(cloneClass2.toString());
    }
}
class CloneClass implements Cloneable,Serializable{
    private String name;
    private int age;
    private people people;

    public people getPeople() {
        return people;
    }

    public void setPeople(people people) {
        this.people = people;
    }

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

    public CloneClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public CloneClass(){

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        CloneClass cloneClass  =(CloneClass) super.clone();
        people people2 = (people) people.clone();
        cloneClass.setPeople(people2);
        return cloneClass;
    }

    @Override
    public String toString() {
        return "CloneClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", people=" + people +
                '}';
    }
    protected Object deeClone() throws IOException, ClassNotFoundException {
        //将当前这个对象写到一个输出流当中，，因为这个对象的类实现了Serializable这个接口，所以在这个类中
        //有一个引用，这个引用如果实现了序列化，那么这个也会写到这个输出流当中
        ByteArrayOutputStream byteArrayInputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayInputStream);
        objectOutputStream.writeObject(this);


        //这个就是将流中的东西读出类，读到一个对象流当中，这样就可以返回这两个对象的东西，实现深克隆
        ByteArrayInputStream bis = new ByteArrayInputStream(byteArrayInputStream.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();

    }
}
class people  implements Cloneable,Serializable{
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

    @Override
    public String toString() {
        return "people{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}