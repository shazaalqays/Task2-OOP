
package task7;


public class Human {
    private String name;
    private String id;
    private Cat cat;
    private Aquarium aquarium;
    
    public Human(String name, String id){
        this.name = name;
        this.id = id;
        
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    
    public String intro(){
        String intr = "My name is "+name;
        if(aquarium != null)
            intr = intr + "Fish number: " + aquarium.getFishNr();
        
        if(cat != null)
            intr = intr + " Cat name: " + cat.getName();
        
        return intr;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setAquarium(Aquarium aquarium) {
        this.aquarium = aquarium;
    }
    
    
}
