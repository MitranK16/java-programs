
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
 
public class File {
 
    public static void main(String[] args)
        throws IOException
    {
        // Assigning the content of the file
        String text
            = "Hello";

        Path fileName = Path.of(
            "/Users/mitrankumar/Desktop/javafile.docx");
 

        Files.writeString(fileName, text);
 

        String file_content = Files.readString(fileName);

        System.out.println(file_content);
    }
}