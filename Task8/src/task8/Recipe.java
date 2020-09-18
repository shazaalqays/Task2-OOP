
package task8;

import java.util.Date;

class Recipe {
    private Date date;
    private String recipeno;
    private Meds med [];
    
    public Recipe(String recipeno){
        this.recipeno = recipeno;
    }

    public Date getDate() {
        return date;
    }

    public String getRecipeno() {
        return recipeno;
    }

    public Meds[] getMed() {
        return med;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setRecipeno(String recipeno) {
        this.recipeno = recipeno;
    }

    public void setMed(Meds[] med) {
        this.med = med;
    }
    
    
}
