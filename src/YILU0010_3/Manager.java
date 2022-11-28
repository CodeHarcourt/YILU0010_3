package YILU0010_3;

public class Manager extends Employee{
    final String vehicle="宝马";/*final关键字修饰后该变量成为常量，只能被赋值这一次*/

    public Manager(int age, int salary) {
        super(age, salary);
    }

    public Manager(String name, int age, String gender, int salary) {
        super(name, age, gender, salary);
    }
    public void goWork(){
        System.out.println(super.getName()+"开着自己的"+vehicle+"去上班");
    }
}
