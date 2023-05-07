/*Create a superclass called Person with two fields, name and age, and a method introduce()
that prints "Hi, my name is [name], and I am [age] years old." Create a subclass called Student
that adds a field major and overrides introduce() to print "Hi, my name is [name], I am [age]
years old, and I am majoring in [major]." Implement the appropriate constructors for both
classes */

class Person{
    String name;
    int age;

    public Person(String n,int a){
        name = n;
        age = a;
    }
    public void introduce(){
        System.out.println("Hi,my name is "+ name+" and I am "+age+" years old .");
    }
}

class Student extends Person{
    String major;
    public Student(String n,int a,String m){
        super(n, a);
        major = m;
    }
    public void introduce(){
        System.out.println("Hi, my name is " +name + ", I am " + age +" years old, and I am majoring in " + major + ".");
    }
}

public class p2q4 {
    public static void main(String[] args) {
        Person p = new Person("Ram", 55);
        Student s = new Student("Ayushmaan", 18, "cs");
        p.introduce();
        s.introduce();
    }
}
