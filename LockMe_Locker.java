package Project1_LockMe.com;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LockMe_Locker {
    public static void listingFile() {
    	File fileDir = new File("C:\\locker");
        //Creating the directory
        		fileDir.mkdir();
       
        
       if(fileDir.isDirectory()){
            List <String>listFile = Arrays.asList(fileDir.list());
            Collections.sort(listFile);
            System.out.println("---------------------------------------");
            System.out.println("Sorting by filename in ascending order");
            for(String s:listFile){
                System.out.println(s);
                
            }
            }
  
        else{
           System.out.println(fileDir.getAbsolutePath() + " is not a directory");
        }
       LockMe_Locker.mainMenu();

  }
    public static void createFile() {
        File file = new File("C:\\locker");
        //Creating the directory
        file.mkdir();
        
     
    Scanner sc = new Scanner(System. in ); //object of Scanner class
    System.out.println("Enter the file name : ");
    String name = sc.nextLine(); //variable name to store the file name
        File file1 = new File("C:\\locker\\"+name);

        try {
            if (file1.createNewFile()) {
                System.out.println("File Created! :)");
                LockMe_Locker.fileMenuOperations();
            } else {
                System.out.println("File already exists :(");
                LockMe_Locker.fileMenuOperations();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }



    
    public static void deleteMethod() {
        String filename;
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter the Name of File to Delete: ");
        filename = sc1.nextLine();

        File file= new File("C:\\locker\\"+filename);

        if (file.delete()) {
            System.out.println("File deleted successfully");
            LockMe_Locker.fileMenuOperations();
        }
        else {
            System.out.println("Oops !! File not found.Please try again ");
            LockMe_Locker.fileMenuOperations();
        }

    }
    public static void searchMethod() {
        System.out.println("Enter the name of the file to Search");
        Scanner sc2 = new Scanner(System.in);
        String folderName = sc2.next();
        File file = new File("C:\\locker\\"+folderName);

        if (file.exists()) {
            System.out.println("Yep! File found!! :)"+"\n"+"This is the file location");
            System.out.println(file.getAbsolutePath());
            LockMe_Locker.fileMenuOperations();
        } else {
            System.out.println("Sorry, File Not Found :(");
            LockMe_Locker.fileMenuOperations();
        }


    }
    public static void mainMenu() {
    	System.out.println("Please select one the following");
        System.out.println("1 for current file names in ascending order ");
        System.out.println("2 for your Business Level Operation");
        System.out.println("3 for exit application");
    	
    }
    
    public static void fileMenuOperations() {
    	
    	System.out.println("Please choose one of the following options :");
        System.out.println("1. Create a file");
        System.out.println("2. Delete a File");
        System.out.println("3. Search for a File");
        System.out.println("4. for main menu");
        Scanner sc3=new Scanner(System.in);
    	try {
    		
            int choice=sc3.nextInt();
             switch(choice) {
             case 1:
                 System.out.println("You have selected to create file");
                 createFile();

                 break;
             case 2:
                 System.out.println("You have selected to Delete file");
                 deleteMethod();
                 break;
             case 3:
                 System.out.println("You have Selected to search file");
                 searchMethod();
                 break;
             case 4:
                 System.out.println("Going back to MainMenu");
                 LockMe_Locker.mainMenu();
                  break;
         }

        }catch(Exception e) {
           System.out.println("Oops!! Please Enter valid number");
          LockMe_Locker.fileMenuOperations();
        }
        
		
 
    	
    }
    public static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("Welcome to LockMe :) ");
        System.out.println(" LockMe.com");
        System.out.println("Develop by PAYAL SOMANI");
        System.out.println("**********************");
        
 Scanner sc=new Scanner(System.in);
        LockMe_Locker.mainMenu();
        while(true) {
            
            
                try {
        	
              int option=sc.nextInt();
              switch(option) {
                case 1 :
                    System.out.println("These are the files in ascending");
                    listingFile();
                    break;
                case 2 :
                	LockMe_Locker.fileMenuOperations();
                	break;
                    
                case 3 :
            	   System.out.println("Have a nice day!! Thanks for using LockMe_locker ");
                   System.out.println("Application closed");

                   System.exit(option);
                    break;
                default:
                    System.out.println("Oops!! please enter the valid number");
                    break;

            }
        }catch(Exception e){
          System.out.println("Oops!! Please Enter valid number");
         LockMe_Locker.main(args);
     }
}
}
}



