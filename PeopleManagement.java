package OPP1;

import java.util.ArrayList;
public class PeopleManagement {
   private static ArrayList<People> peopleArrayList= new ArrayList<>();
    public void createPeople(String firstName, String lastName){
        People p= new People(firstName, lastName);
        peopleArrayList.add(p);
        System.out.println("First Name: " + firstName + "\n Last Name: " + lastName);
    }
    public void createPeople(String firstName, String lastName, String birthDay, People.Gender gender){
        People p= new People (firstName, lastName);
        peopleArrayList.add(p);
        System.out.println("First Name: " + firstName + "\n Last Name: " + lastName +"\n Birthday:" + birthDay + "\n Gender:" + gender);
    }
    public void createPeople(String firstName, String lastName, String birthDay, People.Gender gender, Address address){
        People p= new People (firstName, lastName, birthDay, gender, address);
        peopleArrayList.add(p);
        System.out.println("First Name: " + firstName + "\n Last Name: " + lastName +"\n Birthday:" + birthDay + "\n Gender:" + gender + "\n Address:" + (address.streetName+" "+address.houseNumber+" "+address.postCode+" "+ address.city));
        System.out.println(peopleArrayList.get(0));
    }
    public void deletePeople(int position){
        peopleArrayList.remove(position);
    }
    public People seekPeople(String firstName, String lastName) {
        for (People p : peopleArrayList) {
            if (p.firstName.equals(firstName) && p.lastName.equals(lastName)) {
                return p;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        PeopleManagement create = new PeopleManagement();
        PeopleManagement delete = new PeopleManagement();
        create.createPeople("tanja","mueller");
        create.createPeople("sailor", "moon", "30.06.1969", People.Gender.valueOf("f"));
        create.createPeople("tanja", "mueller","24.08.1978", People.Gender.valueOf("f"),new Address("Oberwindhaag", "21", "4263", "Windhaag bei Freistadt"));
        System.out.println();
        create.createPeople("sailor","moon", "30.06.1969", People.Gender.valueOf("f"), new Address("moonstreet","18", "4020", "linz"));
        System.out.println();
        System.out.println(peopleArrayList.get(0));
        delete.deletePeople(0);
    }

}
