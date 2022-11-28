package YILU0010_3;

public class Employee extends Role {
    private int salary;
    static String ID;/*通过static关键字，使得此变量属于类不属于某个对象，所有对象共享
    先于对象的创建而存在，随着类的加载而存在*/

    public Employee(int age, int salary) {
        super.age = age;/*super的代表对象本身的用法*/
        this.salary = salary;
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, String gender, int salary) {
        super(name, age, gender);/*super的引用父类构造方法的用法
        调用父类的构造方法，实现对成员变量name，age，gender的赋值*/
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static String getID() {
        return ID;
    }

    public static void setID(String ID) {
        Employee.ID = ID;
    }/*提供各成员变量的getxxx和setxxx
    从而实现对成员变量的初始化*/

    @Override

    public void play() {
        System.out.println(ID + "号");
        System.out.println(super.getName() + super.getAge() + "岁" + "性别" + super.getGender());/*super的调用父类成员方法的用法
        实现调用并输出name、age、gender*/
        System.out.println("工资:" + salary);
        System.out.println(super.getName() + "在玩电脑");
    }//对play方法进行重写

    public final void sing() {
        System.out.println(super.getName() + "在唱歌");
    }/*final关键字，将此方法设为最终方法，该方法不可被重写*/
//由final关键字修饰的sing方法无法被重写
}
