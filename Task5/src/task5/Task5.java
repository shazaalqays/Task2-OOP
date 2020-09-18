package task5;

public class Task5 {

    public static void main(String[] args) {
        // TODO code application logic here
        Person p = new Person("Shaza");
        Cat c = new Cat("Mila");
        Cat a = new Cat("Yellow");
        Cat t = new Cat("White");
        try{
            System.out.println("Person name is: "+p.getName());
            p.addPet(c);
            p.addPet(a);
            p.addPet(t);    
//            p.addPet(c);
            System.out.println("The pets she/he has: ");
            p.list();
        }
        catch(DuplicateInformation e){
            e.printStackTrace();
        }
      
    }
    
}
