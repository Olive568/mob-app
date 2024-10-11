import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Prelim {
   public static void main(String []args) 
   {
    List<String> myList = new ArrayList<String>();
      File fileob = new File("Labapis.txt");
      Scanner scanreader = new Scanner(fileob);
      while(scanreader.hasNextLine())
      {
        String data = scanreader.nextLine();
        String[] datar = data.split(' ', 5);
        for(int i = 0; i < 2; i++)
        {
            myList.Add(datar[i]);
        }
      }
   }
}