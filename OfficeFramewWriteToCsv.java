package API;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

public class OfficeFramewWriteToCsv {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

				HashMap<String, ArrayList<Map<String,String>>> dataMap=new HashMap<String, ArrayList<Map<String,String>>>();
				//CSVWriter cs=new CSVWriter(new FileWriter("./newFile2.csv"));
				
				File file=new File("./test5.csv");
				BufferedReader br=new BufferedReader(new FileReader(file));
				
				
				
				
//				BufferedWriter bw=new BufferedWriter(new FileWriter("./test5.csv"));
//				PrintWriter pw=new PrintWriter(bw);
				String[] header=br.readLine().trim().split("\\s*,\\s*");
				String[] addData= {"Company"};
				String[] strArr=null;
				Object[] res=Stream.of(header, addData) 
		                .flatMap(Stream::of) 
		                .toArray();
				
			    strArr = Arrays.stream(res).map(Object::toString).toArray(String[]::new);
			    
			
				
				ArrayList<Map<String,String>> dataObject=new ArrayList<Map<String,String>>();
				String SAMPLE = "./test5.csv";
				BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE));
				
				Map<String,String> dataEntry=new LinkedHashMap<String, String>();
				//dataEntry.put("Company","Google");
				String line;
				
				while((line=br.readLine())!=null) {
					
					
					String[] dataRecord=line.trim().split("\\s*,\\s*");
					
					
					CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(strArr));
					 
					
					if(header.length==dataRecord.length) { 
						
						for(int i=0;i<dataRecord.length;i++) {
						
							
		                   
							
							dataEntry.put(header[i], dataRecord[i]);
							 
							
						}
						dataEntry.put("","Google");
						
						for(Map.Entry<String, String> entry : dataEntry.entrySet()) {
//							csvPrinter.printRecord(Arrays.asList(entry.getKey(), entry.getValue()));
							
							csvPrinter.print(entry.getValue());
							}
						csvPrinter.println();
					
						
						dataObject.add(dataEntry);
						
						 
						
						
						
						
						
						  for(int j=0;j<dataObject.size();j++) {
						  
						  System.out.println(dataObject.get(j));
						  
						  }
						  csvPrinter.flush(); 
						
					}else {
						
						throw new Exception("header count didn't matched with record count----");
					}
					
				}
				
				dataMap.put("test5", dataObject);


	}

}
