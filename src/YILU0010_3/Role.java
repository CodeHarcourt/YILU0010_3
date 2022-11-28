package YILU0010_3;

public abstract class Role {
    private String name;
    protected int age;
    private String gender;//将成员变量进行隐藏

    public Role(int age) {
        this.age=age;/*this的代表对象本身的用法*/
    }

    public Role() {
    }

    public Role(String name, int age, String gender) {
        this(age);/*this的在自身构造方法内部引用其它构造方法的用法
        调用该类中只有一个参数age的构造方法，并将测试类中的age赋值给此类中成员变量的age*/
        this.setName(name);/*this的引用成员方法的用法
        调用setName方法,并将测试类中的name赋值给此类中成员变量的name*/
        this.gender = gender;/*this的引用成员变量的用法
        将并将测试类中的gender赋值给此类中成员变量的gender*/
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public abstract void play();//创建抽象的play方法

}
