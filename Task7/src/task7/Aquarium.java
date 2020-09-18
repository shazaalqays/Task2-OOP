
package task7;

public class Aquarium {
    private int fishNr;
    
    public Aquarium(int fishNr){
        this.fishNr = fishNr;
    }
    
    public void addFish(){
         fishNr++;
    }
    
    public void delFish(int num){
        if(num>fishNr)
            fishNr = 0;
        fishNr = fishNr - num;
    }

    public int getFishNr() {
        return fishNr;
    }
    
}
