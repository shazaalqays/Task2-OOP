
package task7;

public class Task7 {

    public static void main(String[] args) {
        
        Human shaza = new Human("Shaza AlQays ","01234567890");
        Aquarium ak = new Aquarium(5);
        ak.delFish(2);
        shaza.setAquarium(ak);
        ak.addFish();
        Cat torpil = new Cat("Torpil");
        shaza.setCat(torpil);
        System.out.println(shaza.intro());
        
    }
    
}
