
package task8;

public abstract class Human {
    private String name, surname;
    private long id;
    
    public Human(String name, String surname, long id){
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getId() {
        return id;
    }
    
}
