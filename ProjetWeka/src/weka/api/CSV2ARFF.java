package weka.api;

import java.io.File;
import java.util.*;
import java.io.IOException;

import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;


public class CSV2ARFF {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//LOad CSV
				CSVLoader loader = new CSVLoader();
				loader.setSource(new File("C:\\Users\\GASMI MANAL\\eclipse-workspace\\ProjetWeka\\src\\data\\cars.csv"));
				Instances data=loader.getDataSet();
				
				//Save ARFF
				ArffSaver saver=new ArffSaver();
				saver.setInstances(data); //set the dataset we want to convert
				
				// and save as ARFF
				saver.setFile(new File("C:\\Users\\GASMI MANAL\\eclipse-workspace\\ProjetWeka\\src\\data\\cars.csv"));
				saver.writeBatch();

	}

}
