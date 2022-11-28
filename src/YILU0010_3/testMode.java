package YILU0010_3;

public class testMode {
    public static void main(String[] args) {
     Employee.ID="0002";
     Employee em=new Employee("张三",30,"男",10000);
     em.play();
     em.sing();
     Manager ma=new Manager("王五",32,"男",15000);
     Manager.ID="0001";
     ma.goWork();
     ma.play();
     ma.sing();
    }
}
