
package task6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class Mapper {
    HashMap<String, String> countries;
    
    public Mapper(String[] countryCodes, String[] names) throws countryException{
        countries = new HashMap<String, String>();
        for(int i=0; i<names.length; i++){
            addCountry(countryCodes[i],names[i]);
        }
    }
    public String getCountryName( String countryCode ) throws countryException {
        String result = countries.get(countryCode);
        if( result == null )
            throw new countryException("Non-existant country: " + countryCode);
        return result;
    }
    public void addCountry( String code, String name ) throws countryException {
        if( countries.put(code, name) != null )
            throw new countryException("Code already exists: " + code + ":" + name );
        countries.put(code, name);
    }
    
    @SuppressWarnings("unchecked")
    public void loadCountries( String path ) {
        try {
            ObjectInputStream input = new ObjectInputStream( new FileInputStream(path) );
            countries = (HashMap<String, String>) input.readObject();
            input.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public void saveCountries( String path ) {
        try {
            ObjectOutputStream output = new ObjectOutputStream( new FileOutputStream(path) );
            output.writeObject(countries);
            output.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
