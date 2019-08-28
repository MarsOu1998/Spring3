package Student;

public class student {
    public student(){
    System.out.println("构造函数调用");
    }
    public student(String name,String sex,String age){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    public void init(){
        System.out.println("初始化函数调用");
    }

    public void destroy(){
        System.out.println("析构函数");
    }
    private String name,sex,age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void Print(){
        System.out.println(this.getName());
        System.out.println(this.getSex());
        System.out.println(this.getAge());
    }

}
