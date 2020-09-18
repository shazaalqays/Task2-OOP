
package task8;

public class Patient extends Human implements Protocol{
    private int protocolNo;
    
    public Patient(String name, String surname, long id, int protocolNo){
        super(name,surname,id);
        this.protocolNo = protocolNo;
    }
    
    @Override
    public int getProtocolNo(){
        return protocolNo;
    }
}
