package task6;

public class Task6 {

    public static void main(String[] args) {
        
        Person shaza = new Person(001,"Shaza AlQays");
        Person nada = new Person(002,"Nada AlQays");
        Person moni = new Person(003,"Moni AlQays");
        Person moh = new Person(004,"Moh AlQays");
        
        String codes [] = {"SY , TR, FR, GE"};
        String names [] = {"Syria, Turkey, France, Germany"};
        try{
            Mapper mapper = new Mapper(codes, names);
            Passport p1 = new Passport("SY",0001,shaza,mapper);
            Passport p2 = new Passport("GE",0002,nada,mapper);
            
//            System.out.println(p1.toString());
            System.out.println(shaza);
            System.out.println(p1);
            System.out.println(mapper.countries);
            

        }
        catch(countryException e){
            e.printStackTrace();
        } 
        
    }
    
}
