package weka.api;

import java.util.*;
import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class testCSV2
{
    public static void Convert(String sourcepath,String destpath) throws Exception
    {
        // load CSV
        CSVLoader loader = new CSVLoader();
        loader.setSource(new File(sourcepath));
        Instances dataSet = loader.getDataSet();

        // save ARFF
        BufferedWriter writer = new BufferedWriter(new FileWriter(destpath));
        writer.write(dataSet.toString());
        writer.flush();
        writer.close(); 
    }

    public static void main(String args[]) throws Exception
    {
        Convert("C:\\Users\\GASMI MANAL\\eclipse-workspace\\ProjetWeka\\src\\data\\cars.csv", "test.arff");
    }
}