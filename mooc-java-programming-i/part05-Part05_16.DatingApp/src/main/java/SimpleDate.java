
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public int getDay() {
        return this.day;
    }
    
    public int getMonth() {
        return this.month;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public void advance() {
        this.day++;
        if(this.day > 30) {
            this.day = 1;
            this.month++;
            if(this.month > 12){
                this.month = 1;
                this.year++;
            }
        }
    }
    
    public void advance(int howManyDays) {
        for(int i = 0; i < howManyDays; i++) {
            this.advance();
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate cloneDate = this.clone();
        cloneDate.advance(days);
        
        int newDay = cloneDate.getDay();
        int newMonth = cloneDate.getMonth();
        int newYear = cloneDate.getYear();
        
       SimpleDate newSimpleDate = new SimpleDate(newDay, newMonth, newYear);
       
       return newSimpleDate;
    }
    
    public SimpleDate clone() {
        SimpleDate clone = new SimpleDate(this.day, this.month, this.year);
        return clone;
    }
    
    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
