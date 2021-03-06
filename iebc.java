//import Scanner class here
import java.util.Scanner;
//Create login that deals with logging in to the system
class Login{
  //declare and instantiate variables that will show the number of login attempts
  int trial=1, remaining;
  int looper2= Register.looper;
  //this is a constructor
  Login(){
    //Outputs the name of the system
    System.out.println("\t\tIEBC Registration System");
    System.out.println("============================================================");
    //calls the method login_sys() so that it can run the code
    login_sys();
  }
  //this is the method itself
  void login_sys(){
    //declare variables to store user input
    String username,password;
    //this is to check if the number of login attempts has not been exceeded to prevent unauthorised Registering voters
    if(trial<4){
    //prompt the user for username
    System.out.println("Please enter username:");
    //create a new scanner object
    Scanner user= new Scanner(System.in);
    //get user input for username here
    username = user.nextLine();
    //prompt the user for password
    System.out.println("Please enter password:");
    //create a new scanner object
    Scanner pass=new Scanner(System.in);
    //get user input for password
    password= pass.nextLine();
    //compare user input with the password and username that the system has stored
    if(username.equals("IEBC") && password.equals("IEBC")){
      System.out.println("\nSuccess! You are being logged in");
      //introduce the next part of the program: Registering voters
      while(looper2==1){
        Register myRegister = new Register();
      }

    }
    else{
      System.out.println("\nError! The username or password is incorrect");
      //subtract to get the remaining number of login attempts
      remaining=3-trial;
      //output to the user the number of remaining login attempts
      System.out.println("Number of login attempts remaining: "+remaining+"\n");
      //increment the number of login attempts
      ++trial;
      //call the method again since the login attempt was not successful
      login_sys();
    }
  }
  else{
    //the system closes
    System.out.println("You have exceeded the number of trial to Login. System will now exit!");
  }
}
}
public class iebc{
  public static void main(String args[]){
    //call the Login constructor
    Login myLogin= new Login();
  }
}
class Register{
  String fname,sname,lname,dist,div,loc,subloc,ward,consti,count,gen,change;
  int id,option;
  String state;
  public int looper=1;
  Register(){
    Scanner input= new Scanner(System.in);
    Scanner input2= new Scanner(System.in);
    System.out.println("\nVOTER REGISTRATION\n==================================\nPlease Fill in the form below to register the voter:\nFirst Name:");
    fname = input.nextLine();
    System.out.println("Second Name:");
    sname = input.nextLine();
    System.out.println("Last Name:");
    lname = input.nextLine();
    System.out.println("ID Number:");
    id= input2.nextInt();
    System.out.println("District:");
    dist = input.nextLine();
    System.out.println("Division:");
    div = input.nextLine();
    System.out.println("Location:");
    loc = input.nextLine();
    System.out.println("Sub-location:");
    subloc = input.nextLine();
    System.out.println("Ward:");
    ward = input.nextLine();
    System.out.println("Constituency");
    consti = input.nextLine();
    System.out.println("County");
    count = input.nextLine();
    System.out.println("Gender:");
    gen = input.nextLine();
    showdetails();
  }
   void changeinfo(){
    System.out.println("Choose the detail to edit:");
    System.out.println("1. First name 2. Second Name 3. Last Name 4. ID number 5. District\n6. Division 7. Location 8. Sub-location 9. Ward 10. Constituency\n11. County 12. Gender");
    Scanner input2 = new Scanner(System.in);
    option = input2.nextInt();
    Scanner newinputs = new Scanner(System.in);
    switch(option){
      case 1:fname=newinputs.nextLine();break;
      case 2:sname=newinputs.nextLine();break;
      case 3:lname=newinputs.nextLine();break;
      case 4:id=input2.nextInt();break;
      case 5:dist=newinputs.nextLine();break;
      case 6:div=newinputs.nextLine();break;
      case 7:subloc=newinputs.nextLine();break;
      case 8:fname=newinputs.nextLine();break;
      case 9:ward=newinputs.nextLine();break;
      case 10:consti=newinputs.nextLine();break;
      case 11:count=newinputs.nextLine();break;
      case 12:gen=newinputs.nextLine();break;
      default:System.out.println("Sorry your choice is invalid.");
    }
   showdetails();
    }
    void showdetails(){
      System.out.println("\nPlease confirm the following details:\n\n==============================================");
      System.out.println("Name of the voter: "+fname+" "+sname+" "+lname);
      System.out.println("ID number: "+id);
      System.out.println("District: "+dist);
      System.out.println("Division: "+div);
      System.out.println("Location: "+subloc);
      System.out.println("Ward: "+ward);
      System.out.println("Constituency: "+consti);
      System.out.println("County: "+count);
      System.out.println("Gender: "+gen);
      System.out.println("==============================================");
      System.out.println("\nIs this information correct?(y/n)");
      Scanner input = new Scanner(System.in);
      change=input.nextLine();
      if(change.equals("n")){
      changeinfo();
      }
      else if(change.equals("y")){
      System.out.println("SUCCESS! information is being uploaded!");
      System.out.println("Exit or continue(E/C)");
      state = input.nextLine();
      if(state.equals("C")){
        looper=1;
      }
      else if(state.equals("E")){
        looper=0;
      }
      }
  }
}
