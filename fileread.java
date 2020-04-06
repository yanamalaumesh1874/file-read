import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 
public class Readfile
{
  public static void main(String[] args)
	{
    try {
      File myObj = new File("D:// filename.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine())
		{
        String data = myReader.nextLine();
        System.out.println(data);
        }
      myReader.close();
    } 
	catch (FileNotFoundException e)
	{
      System.out.println("plz check the code to continue");
      e.printStackTrace();
    }
  }
}
