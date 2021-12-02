package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelIngrationwithdp {
	public String[][] sendData() throws IOException {
	XSSFWorkbook x=new XSSFWorkbook("./data/CreateLeadnew.xlsx");
	XSSFSheet sheet = x.getSheet("Sheet1");
	int rowcount1=sheet.getLastRowNum();
	System.out.println(rowcount1);
	//int physicalNumberOfRows1 = sheet.getPhysicalNumberOfRows();
	//System.out.println(physicalNumberOfRows1);
	//System.out.println(rowcount1);
	
	 int cellcount1 = sheet.getRow(0).getLastCellNum();
	 //System.out.println(cellcount1);
	 String[][] data=new String[rowcount1][cellcount1];
	for(int i=1;i<=rowcount1;i++)
	{
		for(int j=0;j<cellcount1;j++)
		{
		XSSFRow row = sheet.getRow(i);
		
		XSSFCell cell = row.getCell(j);
		String txt = cell.getStringCellValue();
		
		
		 //String txt=sheet.getRow(i).getCell(j).getStringCellValue();
		 
		System.out.println(txt);
		data[i-1][j]=txt;
	}
	}
	
	x.close();
	return data;
	}
}
