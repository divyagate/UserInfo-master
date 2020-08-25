package project.logic;

import project.logic.model.Address;
import project.logic.model.User;

public class UserMain {

    public static void main(String[] args){
        User user1=new User();
        user1.setfName("Rahul");
        user1.setlName("Singh");
        user1.setbdate("02/10/1993"); //  set birthday here
        user1.setSalary(3500.00);
        Address address=new Address();
        address.setCity("Montreal");
        address.setCountry("CA");
        address.setProvince("QC");
        address.setStreetName("Saint Mark");
        user1.setAddress(address);



        User user2=new User();
        user2.setfName("Nikita");
        user2.setlName("John");
        user2.setbdate("02/10/1994");  //  set birthday here
        user2.setSalary(2500.00);
        Address address2=new Address();
        address2.setCity("Ottawa");
        address2.setCountry("CA");
        address2.setProvince("ON");
        address2.setStreetName("Saint Matheiu");
        user2.setAddress(address2); // Errors : For few Users address is not appearing correctly.  Solution : create address object for Nikita and assign it.


        User user3=new User();
        user3.setfName("George");
        user3.setlName("Thomas");
        Address address3=new Address();
        address3.setCountry("CA");
        user3.setSalary(1800.00);
        user3.setAddress(address3);

        System.out.println(user1.toString());
        //TODO : WEB-4
        System.out.println(user2.toString());


        Double salaryAccumulatedUser1= UserDetails.SalaryAccumulated(user1);
        System.out.println(salaryAccumulatedUser1);
        Double salaryAccumulatedUser2= UserDetails.SalaryAccumulated(user2);
        System.out.println(salaryAccumulatedUser2); // Error : terminal shows same salary . Solution : change salaryAccumulatedUser1 to salaryAccumulatedUser2.

        //TODO : WEB-5
        try{
            Boolean isCanadian= UserDetails.VerifyCountry(user3); // Error: Exception in thread "main" java.lang.NullPointerException . Solution : create new address3 object and assign it to use3.
            System.out.println(isCanadian);
            System.out.println(UserDetails.FullName(user3)+" is "+isCanadian);
        }
        catch (NullPointerException e){ // Error: Exception in thread "main" java.lang.NullPointerException . Solution : catching exception using try and catch block.
            System.out.println("passing null values to address object");
        }

    }
}
