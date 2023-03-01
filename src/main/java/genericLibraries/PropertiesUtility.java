package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * This class contains reusable methods to preform actions on properties file
 * @author KAVYASRI
 *
 */

public class PropertiesUtility {

	  private Properties property;
	  /**
	   * This method is usedto intitialize properties file
	   * @param filePath
	   */
	
	public void propertiesInitialization(String filePath)//exception will propogate to next class so avoid throws
	{                                                 //till testscripts
		  
		  FileInputStream fis = null;
		  try
		  {
			  fis=new FileInputStream(filePath);
		  }
		  catch(FileNotFoundException e) {
			  e.printStackTrace();
		  }
		  
		  property = new Properties();
		  try {
		  property.load(fis);
		  }
		  catch(IOException e)
		  {
			  e.printStackTrace();
		  }
	}
		  /**
		   * This method is used to read the data from properties file
		   */
		  public String fetchProperty(String key)
		  {
			  return property.getProperty(key);
		
		}
		
		  
	}


