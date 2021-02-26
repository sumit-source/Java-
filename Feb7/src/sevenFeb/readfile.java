package sevenFeb;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readfile
{
 public static void main(String[] args) throws IOException 
 {
	 File Sr=new File ("C:\\Users\\Sumit\\Desktop\\must1.txt.txt");
	// File Sr=new File ("C:\\Users\\Sumit\\Desktop\\txt.txt");
	FileWriter fw = new FileWriter(Sr, true);
	BufferedWriter b = new BufferedWriter(fw);
	for (int i=0; i<10; i++)
	{
	b.write("This is my changed line");
	b.newLine();
	}
	b.write("This is my second line");
	b.newLine();
	b.close();
	 
 }

 }