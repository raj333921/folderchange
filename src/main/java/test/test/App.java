package test.test;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		//Need to replace folder name
		String path= "C:\\Users\\raj33\\Downloads\\todo\\old";
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		for (File file : listOfFiles) {
			System.out.println(file.getName());
			String folderName = file.getName();
			File[] listOfFiles1 = file.listFiles();
			int i = 0;
			for (File file1 : listOfFiles1) { 
				if(file1.isFile()) {
				//System.out.println(file1.getName());
				copyFileCommonIO(path+folderName+"\\"+file1.getName(), "C:\\Users\\raj33\\Downloads\\todo\\updated\\"+folderName+"\\","\\"+folderName+"_"+i+".jpg");
				}
				i++;
			}
		}

	}

	public static void copyFileCommonIO(String from, String to, String filename) throws IOException {
		System.out.println("fr-->"+from);
		System.out.println("to-->"+to+filename);
		System.out.println("to1-->"+to);
		File fromFile = new File(from);
		File toFile1 = new File(to + filename);
		File toFile = new File(to);
		if (toFile.mkdirs()) {
			System.out.println("Directory is created!");
		}else {
			System.out.println("Directory is not created!");
		}
		FileUtils.copyFile(fromFile, toFile1);
	}
}
