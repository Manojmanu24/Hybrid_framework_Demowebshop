package com.Genraic.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test_DataByPropertyFile implements Frame_Hidden
{
	public static FileInputStream file;
public  static String getdata(String key)
{
	try 
	{
		 file=new FileInputStream(PROPERTY_PATH);
	}
	catch (FileNotFoundException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
Properties pro=new Properties();

try 
{
	pro.load(file);
} catch (IOException e) 
{
	// TODO Auto-generated catch block
	e.printStackTrace();
}
String value = pro.getProperty(key);
return value;

}



}
