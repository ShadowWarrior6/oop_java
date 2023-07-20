package homework;

public class task01{
 public static void main(String[] args){
        cat cat=new cat("Семён",5);
        System.out.println("Мяу! Меня зовут:" +  cat.getName()+ "  мне" +cat.getAge() + "  лет");
    }
}
class cat{
    private String name ;
    private int age ;
    public cat(String name,int age){
    this.name=name;
    this.age=age;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;

    }
    public void greet () {
    System.out.printf("Мяу! Меня зовут %s. Мне %s года(лет).", name, age);
  }
}
