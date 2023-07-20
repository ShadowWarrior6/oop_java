package homework;

public class task01{
 public static void main(String[] args){
        cat cat=new cat("Семён",5);
        Owner owner=new Owner("Джон");
        
        System.out.println("Мяу! Меня зовут:" +  cat.getName()+ "  мне " +cat.getAge() + "  лет моего хозяиня зовут " + owner.getName());
    }
}
class cat {
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
    System.out.printf("Мяу! Меня зовут %s. Мне %s года(лет) мой мой хозяин %s.", name, age);
  }
  
}
// class Owner extends task01{
//     String name;
//    public void Owner (String name){
//     this.name=name;
//    }
//    public String getName(){
//     return name;
//    }

   

class Owner {
   public String name; // Приватное поле name
    

    public Owner(String name) {
        this.name = name;
        
    }
    public String getName(){
        return name;
    }
}

