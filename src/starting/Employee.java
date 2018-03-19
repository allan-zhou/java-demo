package starting;

import java.io.Serializable;

/**
 * 员工类
 * @author zhoujialiang
 * @version 1.0
 */
public class Employee implements Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;

    /**
    * 检查邮箱
    */
    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }

    /**
    * 获取年龄
    * @return int 
    */
    public int getAge(){
        return this.number;
    }
}