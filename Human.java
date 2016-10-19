/**
 * Created by Administrator on 2016/10/17 0017.
 */
public class Human {
    private String name,sex;
    private int age;
    Human(String name,String sex,int age){
        this.setName(name);
        this.setAge(age);
        this.sex = sex ;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void introduce(){
        System.out.println(name+"  "+age+"  "+sex);
    }

    public static void main(String[] args) {
        Human[] hongyan = new Human[6];
        hongyan[0] = new Human("吴随","no one know",18);
        hongyan[1] = new Human("饶东","女",18);
        hongyan[2] = new Human("春上冰月","男",18);
        hongyan[3] = new Human("曾名杨","男",18);
        hongyan[4] = new Human("徐书展","男",18);
        hongyan[5] = new Human("郑昱旋","男",18);
        for (int i = 0; i <hongyan.length ; i++) {
            hongyan[i].introduce();
        }

    }

}
