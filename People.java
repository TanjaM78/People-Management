package OPP1;
import OPP1.Address;
class People {
   public String firstName;
    public String lastName;
    private String birthDay;
    private Gender gender;
    private Address address;

    public People(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }
    public People(String firstName, String lastName, String birthDay, Gender gender ){
        this.firstName= firstName;
        this.lastName= lastName;
        this.birthDay= birthDay;
        this.gender= gender;

    }
    public People( String firstName, String lastName, String birthDay, Gender gender, Address address){
        this.firstName= firstName;
        this.lastName= lastName;
        this.birthDay= birthDay;
        this.gender= gender;
        this.address= address;
    }
    public enum Gender{
        m, f;
    }
}


