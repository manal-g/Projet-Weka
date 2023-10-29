package weka.api;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import weka.core.Instances;
//import weka.core.converters.ArffSaver;
import weka.core.converters.CSVSaver;

public class visualisationdata {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Instances dataset=new Instances(new BufferedReader(new FileReader("C:\\Users\\GASMI MANAL\\eclipse-workspace\\ProjetWeka\\src\\data\\cars.csv")));
		System.out.println(dataset.toSummaryString());
		CSVSaver saver=new CSVSaver();
		saver.setInstances(dataset);
		saver.setFile(new File("C:\\Users\\GASMI MANAL\\eclipse-workspace\\ProjetWeka\\src\\data\\cars.csv"));
		saver.writeBatch();
		

	}

}
