package sachin;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.*;
public class FileIo {
    public static void createFile()
   {
			try
			{ File myfile=new File("sachin.txt");
			if(myfile.createNewFile())
			{
				System.out.println("File is created " +myfile.getName());
			}
			else
			{
				System.out.println("File already exists.");
			}
			}catch(IOException e)
			{
				System.out.println("An error occurred");
				e.printStackTrace();
			}	
    }
    public static void writeFile()
    {
    	try
    	{FileWriter writer=new FileWriter("sachin.txt");
    	writer.write("I am sachin hande and i am from Aurangbad Maharashtra.I have done my engineering in EnTC from Dr BAMU Aurangabad and after that i have worked with a firm who manifactures automobile components.  ");
    	writer.close();
    	System.out.println("File Writing is Successful");
    		
    	}catch(IOException e)
    	{
    		System.out.println("An error Occurred");
    		e.printStackTrace();
    	}
    }
    
  public static void readFile()
  {
	  try
	  {
		  FileReader reader=new FileReader("sachin.txt");
		  Scanner myreader=new Scanner(reader);
		  while(myreader.hasNextLine())
		  {
			  String file=myreader.nextLine();
			  System.out.println(file);
		  }
		  myreader.close();
		  
	  }catch(IOException e)
	  {
		  System.out.println("An Error Occurred");
		  e.printStackTrace();
	  }
  }
    
  
    
	public static void main(String[] args) {
		//createFile();
		//writeFile();
		readFile();
	}

}
