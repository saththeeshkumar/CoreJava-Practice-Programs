package collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		FileInputStream fi = new FileInputStream("/home/sathishkumar/eclipse-workspace/LearningJAVA/src/collections/application.properties"); ;
	    p.load(fi);
	    System.out.println(p.getProperty("username"));
	    System.out.println(p.getProperty("password"));
	    p.setProperty("db", "oracle");
		FileOutputStream fo = new FileOutputStream("/home/sathishkumar/eclipse-workspace/LearningJAVA/src/collections/application.properties"); ;
        p.store(fo, "Added few things");

	}

}
