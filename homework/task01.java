package homework;

public class task01{
 public static void main(String[] args){
        cat cat=new cat("Семён",5);
        System.out.println("Мяу! Меня зовут:" +  cat.getName()+ "  мне " +cat.getAge() + "  лет");
        Owner owner=new Owner("Джон");
        
         System.out.println("Мяу! Меня зовут:" +  cat.getName()+ "  мне " +cat.getAge() + "  лет, моего хозяиня зовут " + owner.getName());
        
 
    }
    // public void greet(String name,int age){
    //     System.out.printf("Мяу! Меня зовут %s. Мне %s года(лет).", name, age);
    // } 
    //не пноял как создать обясните пожалуйста 
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
   private String name; 
    

    public Owner(String name) {
        this.name = name;
        
    }
    public String getName(){
        return name;
    }
}

