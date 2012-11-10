package opengl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FXFile
{

    public static String read(String filename)
    {
        File file=new File(filename);
        String content="";
        try
        {
            String line;
            BufferedReader input=new BufferedReader(new FileReader(file));
            while ((line=input.readLine())!=null)
            {
                content+=line+"\n";
            }
            input.close();
        }
        catch (Exception e)
        {
            System.out.println("File could not be located!");
            e.printStackTrace();
        }
        return content;
    }
}
