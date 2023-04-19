package OPP1;

public class Address {
   public String streetName;
   public String houseNumber;
   public  int postCode;
   public String city;


  public Address(String streetName, String houseNumber, String postCode, String city){
      this.streetName= streetName;
      this.houseNumber= houseNumber;
      this.postCode= Integer.parseInt(postCode);
      this.city= city;
  }

}
