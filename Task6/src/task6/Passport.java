
package task6;

public class Passport {
    
    private String countryCode;
    private int serialNr;
    private Person holder;
    private Mapper mapper;
    
    public Passport (String countryCode, int serialNr, Person holder, Mapper mapper ){
        this.countryCode = countryCode;
        this.serialNr = serialNr;
        this.holder = holder;
        this.mapper = mapper;
    }
    
    public String getCountryName() throws countryException{ 
        return mapper.getCountryName(countryCode);
    }
    
    
    
}
