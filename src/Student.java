public class Student {
    private int id;
    private String name;
    private int age;

    
    //Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void SetAge(int age){
        this.age = age;
    }

    //class constructor
    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "ID: " + id + "\nName: " + name + "\nAge: " + age + "\n";
    }
}