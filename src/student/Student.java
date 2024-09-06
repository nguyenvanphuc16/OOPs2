
package student;

public class Student {

    int id;
    String name;
    int age; 
    
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void displayInformation() {
        System.out.println(" " + id + " " + name +" "+ age);
    }

    
}
