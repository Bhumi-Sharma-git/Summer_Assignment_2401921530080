interface LibraryUser{
    void registerAccount();
    void requestBook();

}

class KidUsers implements LibraryUser{
    int age;
    String bookType;

    public void setAge(int age){
        this.age=age;

    }

    public void setBookType(String bookType){
        this.bookType=bookType;
    }

    public void registerAccount(){
        if(age<12){
            System.out.println("You have successfully registered under a kids account");
        }else{
            System.out.println("sorry, age must be less than 12 to register as a kid");
        }
    }

    public void requestBook(){
        if(bookType.equalsIgnoreCase("Kids")){
            System.out.println("Book Issued successfully, please return the book within 10 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only kids books");
        }
       }
   }


   class AdultUser implements LibraryUser{
    int age;
    String bookType;

    public void setAge(int age){
        this.age=age;
    }

    public void setBookType(String bookType){
        this.bookType=bookType;
    }

    public void registerAccount(){
        if(age>12){
            System.out.println("You have successfully registered under an Adult Account");
        }
        else{
            System.out.println("Sorry, age must be greater than 12 to register as an adult");
        }
    }

    public void requestBook(){
        if(bookType.equalsIgnoreCase("Friction")){
            System.out.println("Book Issued successfully, please return the book within 7 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only adult fiction books");
        }
    }
   }

public class LibraryInterfaceDemo{
   public static void main (String[] args){

    KidUsers kid= new KidUsers();
    kid.setAge(10);
    kid.registerAccount();

    kid.setBookType("Kids");
    kid.requestBook();

    System.out.println();

    kid.setAge(18);
    kid.registerAccount();

    kid.setBookType("Friction");
    kid.requestBook();

    System.out.println("------------------");

    AdultUser adult= new AdultUser();
    adult.setAge(5);
    adult.registerAccount();

    adult.setBookType("Kids");
    adult.requestBook();

    System.out.println();

    adult.setAge(23);
    adult.registerAccount();

    adult.setBookType("Friction");
    adult.requestBook();

   }
}