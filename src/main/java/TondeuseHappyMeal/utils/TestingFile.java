package TondeuseHappyMeal.utils;
import java.io.*;

public class TestingFile {
    public void testFile(){
        try{
            FileReader fileReader = new FileReader("/Users/boutothugoanthony/Documents/JAVA/Tondeuse_Java");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter("/Users/boutothugoanthony/Documents/JAVA/Tondeuse_Java");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line = bufferedReader.readLine();
            while (line!= null){
                bufferedWriter.write(line);
            }
            fileReader.close();
            fileWriter.close();
        }
        catch (FileNotFoundException e){
            System.out.println("The file does not exist");
        }
        catch (IOException e){
            System.out.println("Error while reading or writing the file");
        }
    }
}
