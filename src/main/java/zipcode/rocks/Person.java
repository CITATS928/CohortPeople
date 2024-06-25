package zipcode.rocks;

public class Person {
    private String firstname;
    private String lastname;
    private String Color;
    private String BirthMonth;
    private Boolean Pet;
    private String Beverage;



    //use for ver.1
    /*
    public Person(String fname, String lname,String Bev, String FC, String BM, String PT) {
        this.firstname = fname;
        this.lastname = lname;
        this.Beverage=Bev;
        this.Color=FC;
        this.BirthMonth=BM;
        this.Pet=Boolean.valueOf(PT);
    }

     */

    //use for version two
    public Person(String fname, String lname) {
        this.firstname = fname;
        this.lastname = lname;

    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getColor(){return Color;}

    public void setColor(String Color){this.Color=Color;}

    public String getBirthMonth(){return BirthMonth;}

    public void setBirthMonth(String BirthMonth){this.BirthMonth=BirthMonth;}

    public String getBeverage(){return Beverage;}

    public void setBeverage(String Beverage) {this.Beverage=Beverage;}

    public Boolean getPet(){
        return Pet;
    }

    public void setPet(Boolean Pet){this.Pet=Pet;}

    public String toString() {
        return this.lastname + ", " + this.firstname+". "+"favorite Beverage is "+this.Beverage+
                ". favorite color is "+this.Color+" . BM is "+this.BirthMonth+". like Pet? "+this.Pet;
    }
}
