
package task6;

public class Person {
    private int id;
    private String name;
    private Passport passport;
    
    public Person (int id, String name) {
        this.id = id;
        this.name = name;
    }
  
    public String toString( ) {
        String result = "Name: " + name;
        try {
            if( passport != null )
                result += "Nationality: " + passport.getCountryName();
        }
        catch (countryException e) {
            e.printStackTrace();
        }
        return result;
    }
    
}
