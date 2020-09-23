package com.bupt.test;

import com.bupt.ast.CharStream;
import com.bupt.ast.Go;
import com.bupt.ast.SimpleNode;


import java.io.*;

public class Test {
	public static void main(String[] args) throws IOException {
		Go parser;
		String txtFilePath = "G:/Go.txt";//
		FileInputStream fis = new FileInputStream(new File(txtFilePath));
		InputStreamReader isr = new InputStreamReader(fis,"GBK");
		BufferedReader reader = new BufferedReader(isr);

		String otherTxtFilePath = "G:/DTSLanguage/Go.txt";
		FileOutputStream fos = new FileOutputStream(new File(otherTxtFilePath));
		OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
		BufferedWriter writer = new BufferedWriter(osw);
		writer.write("");
		String line = null;
		while((line = reader.readLine()) != null){
			writer.append(line.toLowerCase()).append("\r\n");
		}
		
		writer.flush();
		writer.close();
		reader.close();
		System.out.println("success");
		try
	    {
			parser = new Go(new FileInputStream("G:\\DTSLanguage\\Go.txt"));
	    	//new parser(new FileInputStream("G:\\DTSLanguage\\fortran.txt"));
	      //
	      SimpleNode n = parser.Program();
	      n.dump("");
	      System.out.println("Thank you.");
	    }
	    catch (Exception e)
	    {
	      System.out.println("Oops.");
	      System.out.println(e.getMessage());
	    }
		
		System.out.println("success1");
	}

}
