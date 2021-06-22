package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
public static String[][] excelData(String filename) throws IOException {
	
//	Getting  workbook path
	
	XSSFWorkbook wb= new XSSFWorkbook("./data/"+filename+".xlsx");
//	Getting worksheet
	
	XSSFSheet ws=wb.getSheet("Sheet1");
	
//	 Getting count of row( "getLastNum " will exclude Header)
	 int rowNum = ws.getLastRowNum();
	 System.out.println(rowNum);
//	 Getting column count 
	 int cellNum=ws. getRow(0).getLastCellNum();
	 System.out.println(cellNum);
	 String[][] data= new String[rowNum][cellNum];
//	 iterating to print the value
	 for(int i=1;i<=rowNum;i++)
	 {
		 for(int j=0;j<cellNum;j++)
		 {
			String excel= ws.getRow(i).getCell(j).getStringCellValue();
			data[i-1][j] = excel;
		 }
	 }
	 
	 wb.close();
	 return data;
}
}
		

	
	 
	 
	



