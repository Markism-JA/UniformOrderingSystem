package admin;

import java.io.BufferedReader;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
import java.util.Base64;
import java.util.*;

public class Admin {
    public static void main(String[] args){
        boolean run = false;
        Scanner input = new Scanner(System.in);
        while(!run){
       
        System.out.print("Enter Admin Password: ");
        String inputPass = input.nextLine();

        if(adminLog(inputPass)){
            run = true;
        }else{
            System.out.println("Incorrect password.\n");
        }
        }
        
        while(run){
            System.out.println("\n1.Show Students List\n2.Add a Student to List\n3.Delete Student from List\n4.Check Ongoing Orders\n5.Complete an Order\n6.Log Out");
            int adminInput = input.nextInt();
            if(adminInput == 1) {
		printStudentList();
            }else if(adminInput == 2) {
		addToList();
		printStudentList();
            }else if(adminInput == 3) {
		deleteFromList();
            }else if(adminInput == 4) {
		printOngoingList();
            }else if(adminInput == 5) {
		printOngoingList();
		completeAnOrder();
            }else if(adminInput == 6) {
		run = false;
            }
            else {
                
            }
        }
        
        
       
        
        
        
    }
    
 
    public static boolean adminLog(String logInput){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("shh.txt"));
            String pass = reader.readLine();
            
            if(pass.equals(logInput)){
                return true;
            }else{
                return false;
            }
   
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    static void printStudentList() {
	try {
			
	BufferedReader reader = new BufferedReader(new FileReader("StudentsSheet1.csv"));
	String line = "";
	System.out.println("\nUpdated List: \n");
	while((line = reader.readLine()) != null) {
		String row [] = line.split(",");
               
		for(String index : row) {
                    
			System.out.printf("%-30s", index);
			System.out.print(" | ");
		}
		System.out.println();
				
	}
	reader.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
    
    	static void addToList() {
        Scanner input = new Scanner(System.in);
	String studentNo = "", name = "", courseCode = "", discount = "";
		
	System.out.print("Enter Student No        : ");
	studentNo = input.nextLine();
	System.out.print("Enter Student Name      : ");
	name = input.nextLine();
	System.out.print("Enter Course Code       : ");
	courseCode = input.nextLine();
	System.out.print("Enter Student Discount  : ");
	discount = input.nextLine();
		
		
	addToList student = new addToList(studentNo, name, courseCode,discount);
	student.add();
	}
        
        
        
        static void deleteFromList() {
            Scanner input = new Scanner(System.in);
		System.out.print("\nWhich line you want to delete: ");
		int deleteLine = input.nextInt()+1;
		
		String tempFile = "temp.csv";
		File oldFile = new File("StudentsSheet1.csv");
		File newFile = new File(tempFile);
		
		int line = 0;
		String currentLine;
		
		try {
			//writers
			BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile,true));
			PrintWriter writer = new PrintWriter(bw);
			//reader
			BufferedReader reader = new BufferedReader(new FileReader("StudentsSheet1.csv"));
			
			while((currentLine = reader.readLine()) != null) {
				line++;
				if(deleteLine != line) {
					writer.println(currentLine);
				}else {
					int deletedLine = line - 1;
					System.out.println("\nLine " + deletedLine + " has been sucessfully removed.");
				}
			}
			
			writer.flush();
			writer.close();
			bw.close();
			reader.close();
			
			//delete old file and rewrite it
			oldFile.delete();
			File dump = new File("StudentsSheet1.csv");
			newFile.renameTo(dump);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
        
        	static void printOngoingList() {
		String path ="orders\\Ongoing Orders.csv";
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line = "";
			//String title = fileName.substring(0, fileName.lastIndexOf('.'));
			//System.out.println("\n"+ title +": \n");
			System.out.println("Ongoing Orders List\n\n");
			while((line = reader.readLine()) != null) {
				String row [] = line.split(",");
				for(String index : row) {
					System.out.printf("%-30s", index);
					System.out.print(" | ");
				}
				System.out.println();
				
			}
			reader.close();
		} catch (IOException e) {
				e.printStackTrace();
		}
	}
                
        
	static void completeAnOrder() {
            Scanner input = new Scanner(System.in);
		System.out.print("\nWhich order you want to archive: ");
		int deleteLine = input.nextInt()+1;
		
		String tempFile = "temp.csv";
		File oldFile = new File("orders\\Ongoing Orders.csv");
		File newFile = new File(tempFile);
		
		int line = 0;
		String currentLine;
		
		try {
			//writers
			BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile,true));
			PrintWriter writer = new PrintWriter(bw);
			//reader
			BufferedReader reader = new BufferedReader(new FileReader("orders\\Ongoing Orders.csv"));
			
			while((currentLine = reader.readLine()) != null) {
				line++;
				if(deleteLine != line) {
					writer.println(currentLine);
				}else {
					int deletedLine = line - 1;
					System.out.println("\nLine " + deletedLine + " has been sucessfully archived.");
				}
			}
			
			writer.flush();
			writer.close();
			bw.close();
			reader.close();
			
			//delete old file and rewrite it
			oldFile.delete();
			File dump = new File("orders\\Ongoing Orders.csv");
			newFile.renameTo(dump);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    
}

 class addToList {
	
	String studentNo, name, courseCode, discount;
	
	String students = "StudentsSheet1.csv";

	
	//constructors
	addToList(String studentNo, String name, String courseCode, String discount){
		this.studentNo = studentNo;
		this.name = name;
		this.courseCode = courseCode;
		this.discount = discount;
	}
	
	//object method
	void add(){
		
		try {
			FileWriter writer = new FileWriter(students, true);
			writer.write("\n"+ studentNo + "," + name + "," + courseCode + "," + discount);
			System.out.println("New student added succesfully.\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	


}
