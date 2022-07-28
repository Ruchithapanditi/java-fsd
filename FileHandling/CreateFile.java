package com;
import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

public class CreateFile {
	private static void createFileUsingFileClass() throws IOException
    {
          File file = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\textfile.txt");
          if (file.createNewFile()){
            System.out.println("File is created!");
          }else{
            System.out.println("File already exists.");
          }
          FileWriter writer = new FileWriter(file);
          writer.write("Good Morning");
          writer.close();
    }
    private static void createFileUsingFileOutputStreamClass() throws IOException
    {
        String data = "Good Afternoon";
        FileOutputStream out = new FileOutputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\textfile2.txt");
        out.write(data.getBytes());
        out.close();
    }
 
    private static void createFileIn_NIO()  throws IOException
    {
        String data = "Good night";
        Files.write(Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\textfile3.txt"), data.getBytes());
        List<String> lines = Arrays.asList("1st line", "2nd line");
       Files.write(Paths.get("fileres.txt"),
                    lines,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
    }
   public static void main(String[] args) throws IOException {
	   createFileUsingFileClass();
       createFileUsingFileOutputStreamClass();
       createFileIn_NIO();

	}

}
