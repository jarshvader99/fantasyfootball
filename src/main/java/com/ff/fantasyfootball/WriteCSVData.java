package com.ff.fantasyfootball;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

import io.jsonwebtoken.io.IOException;

public class WriteCSVData {

	public static void writeDataAtOnce(String filePath) throws java.io.IOException 
	{ 
	  
	    // first create file object for file placed at location 
	    // specified by filepath 
	    File file = new File(filePath); 
	  
	    try { 
	        // create FileWriter object with file as parameter 
	        FileWriter outputfile = new FileWriter(file); 
	  
	        // create CSVWriter object filewriter object as parameter 
	        CSVWriter writer = new CSVWriter(outputfile); 
	  
	        // create a List which contains String array 
	        List<String[]> data = new ArrayList<String[]>(); 
	        data.add(new String[] { "Name", "Class", "Marks" }); 
	        data.add(new String[] { "Aman", "10", "620" }); 
	        data.add(new String[] { "Suraj", "10", "630" }); 
	        writer.writeAll(data); 
	  
	        // closing writer connection 
	        writer.close(); 
	    } 
	    catch (IOException e) { 
	        // TODO Auto-generated catch block 
	        e.printStackTrace(); 
	    } 
	} 


}