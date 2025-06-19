
package integrated.system.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class IntegratedSystemProject {

    static String STUDENTINFO = "database.txt";
   static String studentSurname;
    static String UserName;
    static String password;
    static String studentName;
    static String department;
    static String dateOfBirth;
    static String emailAddress;
    static String phoneNumber;
    static String address;
    static String studentAge;
    static String studentGrade;
    static String studentCourse;
    static String enrollmentDate;
    static String info = studentName + studentSurname +studentAge + studentGrade + studentCourse + department +dateOfBirth + emailAddress + phoneNumber+ address+ enrollmentDate;
    
    
    static void UserLogin(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter your credentials to Proceed");
        System.out.println("Enter Your UserName:");
        String enteredUser = s.nextLine();
        System.out.println("------------------------------------");
        System.out.println("Enter Your Password:");
        String enteredPassword = s.nextLine();
        System.out.println("------------------------------------");
        
        if(enteredUser.equalsIgnoreCase("Techsyn") && enteredPassword.equalsIgnoreCase("4231")){
            System.out.println("*****Login Successful*****");
            system();
        }
        else{
            System.out.println("Wrong details");
            UserLogin();
        }
        
        
    }
    
    static void writeStudentInfo(){
        Scanner inputs = new Scanner(System.in);

  System.out.println("---------------------------");
        System.out.println("ENTER NAME:");
        System.out.println("USE CAPITAL LETTERS");
        studentName = inputs.nextLine();
        System.out.println("---------------------------");
        System.out.println("ENTER SURNAME");
        System.out.println("USE CAPITAL LETTERS");
        studentSurname = inputs.nextLine();
        System.out.println("---------------------------");
        System.out.println("ENTER AGE:");
        studentAge = inputs.nextLine();
        System.out.println("---------------------------");
        System.out.println("ENTER LEVEL :");
        System.out.println("LEVEL 1: 0-29"+ '%' + " "+ '|'+"LEVEL 2: 30-39"+'%'+ " "+"|"+"LEVEL 3: 40-49"+'%'+" "+'|'+"LEVEL 4: 50-59"+'%'+" "+'|'+"LEVEL 5: 60-69"+'%'+" "+'|'+"LEVEL 6: 70-79"+'%'+" "+'|'+"LEVEL 7: 80-100"+'%');
        studentGrade = inputs.nextLine();
        System.out.println("---------------------------");
        System.out.println("ENTER COURSE OF STUDY:");
        System.out.println("MECHANICAL ENGINEERING: CREDITS 5"+"|"+"BEAUTY THERAPY: CREDITS 3"+"|"+"ELECTRICAL ENGINEERING: CREDITS 5"+"|"+"COMPUTER SCIENCE: CREDITS 4"+"|"+"JOURNALISM: CREDITS 3"+"|"+"HUMAN RESOURCES: CREDITS 4"+"|"+"COMPUTER STUDIES: CREDITS 4"+"|");
        studentCourse = inputs.nextLine();
        System.out.println("---------------------------"); 
        System.out.println("ENTER DEPARTMENT");
        System.out.println("ENGINEERING"+ "|"+"COMERCE"+ "|"+"MEDIA"+ "|"+"INFOMATION TECHNOLOGY"+ "|");
        department = inputs.nextLine();
        System.out.println("---------------------------");
        System.out.println("ENTER DATE OF BIRTH ");
        System.out.println("YYYY-MM-DD");
        dateOfBirth = inputs.nextLine();
        System.out.println("---------------------------");
        System.out.println("ENTER EMAIL ADDRESS");
        emailAddress = inputs.nextLine();
        System.out.println("---------------------------");
        System.out.println("ENTER PHONE NUMBER");
        phoneNumber = inputs.nextLine();
        System.out.println("---------------------------");
        System.out.println("ENTER ADDRESS");
        address = inputs.nextLine();
        System.out.println("---------------------------");
        System.out.println("ENTER ENROLLMENT DATE");
        System.out.println("YYYY-MM-DD");
        enrollmentDate = inputs.nextLine();
        System.out.println("---------------------------");

        try(FileWriter writer = new FileWriter(STUDENTINFO, true)){
            writer.write("Name: "+studentName +  " ||" + "Surname: "+studentSurname + " ||"+"Age: "+studentAge + " ||" +"Level:" + studentGrade +  "||" +"Course:" +studentCourse +  "||" +"Date of Birth:" +dateOfBirth +  "||" +"Email Adress:" +emailAddress +  "||" +"Phone Number:" +phoneNumber + "||"+"Adress:"+address+"||"+"Enrollment Date"+ enrollmentDate +"\n"); 
            System.out.println("***Information captured successfully into system***");
        } catch (IOException e){
            System.out.println("Error!!! Information capturing is unsuccessful: " + e.getMessage());
        }
    }
    
    static void readFromSystem(){
        try(BufferedReader reader = new BufferedReader(new FileReader(STUDENTINFO))){
            System.out.println("Student Infomation Caputed In System:");
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
                    }catch (IOException e){
                    System.out.println("Error Retrieving Student Infomation:" + e.getMessage());
        }
    }
    
     static void system() {
    Scanner k = new Scanner(System.in);
    while(true){
        System.out.println("=================================================");
        System.out.println("WELCOME TO STUDENT MANAGEMENT SYSTEM");
        System.out.println("=================================================");
        System.out.println("1. Enter To Update Details if Current Student ");
        System.out.println("2. Enter To Student Registration if New Student");
        System.out.println("3. Enter To Log Out Of System");
        System.out.println("==================================================");
        System.out.println("SYSTEM---ADMINISTRATOR--STATUS--LOGGED---IN");
        System.out.println("===================================================");
        int choice;
        choice = k.nextInt();
        
        switch(choice){
            case 1:
                
                Scanner H = new Scanner(System.in);
                while(true){
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("--Updating Student Details Into System--");
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("1. Enter to Details");
                    System.out.println("2. Enter to Retrieve Student Details Captured In System");
                    System.out.println("3. Enter to Return to Home Menu");
                    int task;
                    task = H.nextInt();
                    
                    switch(task){
                        case 1:
                            writeStudentInfo();
                        break;
                        case 2:
                            readFromSystem();
                        break;
                        case 3:
                            System.out.println("----------------------------------");
                            System.out.println("Returning to Home Menu");
                            System.out.println("----------------------------------");
                            system();
                        break;    
                        default:
                            System.out.println("Invalid Option... Please try again");
                        break;    
                    }
                }
            case 2:
                System.out.println("--Registering New Student Into System--");
                Scanner G = new Scanner(System.in); 
                while(true){
                    System.out.println("1. Enter to Register Student ");
                    System.out.println("2. Enter to Retieve Student List of Registered Students");
                    System.out.println("3. Enter to Return to Home Menu");
                    int option;
                    option = G.nextInt();
                    
                    switch(option){
                        case 1:
                          writeStudentInfo();
                        break;
                        case 2:
                           readFromSystem();
                           break;
                        case 3:
                            System.out.println("---------------------------------------------");
                            System.out.println("RETURNING TO HOME MENU");
                            System.out.println("----------------------------------------------");
                            system();
                            break;
                        default:
                            System.out.println("Invalid Option. Please try again.");
                        break;    
                            
                    }
                }
            case 3:
                System.out.println("Exting.....");
                System.out.println("-------------------------------------------------");
                System.out.println("SYSTEM---ADIMNISTAROR--STATUS--LOGGED---OUT");
                System.out.println("--------------------------------------------------");
                System.exit(0);
        }
    }
    
}   
    
    public static void main(String[] args) {
        System.out.println("================================================================");
        System.out.println("WELCOME TO STUDENT MANAGEMENT SYSTEM");
        System.out.println("================================================================");
        UserLogin();
    }
    
}
