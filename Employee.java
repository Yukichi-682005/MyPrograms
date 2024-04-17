public class Employee {
    int sal;
    String name;
    static String comp ="Hello";

    public Employee(int s, String n){
        sal = s;
        name = n;
    }
    
    void display(){
        System.out.print(sal +" " +" " + comp +" " + name);
    }
    public static void main(String [] args){
        Employee obj1 = new Employee(10000, "AHAHAHAH");
        obj1.display();
    }
}
