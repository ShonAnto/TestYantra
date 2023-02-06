package ty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		excel("DemoShop");

	}

	private static void excel(String sheetname) throws EncryptedDocumentException, IOException {
	
			FileInputStream fis = new FileInputStream("./data/TS.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			int a=wb.getSheet(sheetname).getPhysicalNumberOfRows();
			int b=wb.getSheet(sheetname).getRow(0).getPhysicalNumberOfCells();
			String s[][]=new String[a-1][b];
			for(int i=1;i<a;i++)
			{
				for(int j=0;j<b;j++)
				{
					s[i-1][j]= wb.getSheet(sheetname).getRow(i).getCell(j).toString();
				}
			}
			for(int i=0;i<s.length;i++)
			{
				for(int j=0;j<s[i].length;j++)
				{
					System.out.print(s[i][j]+"      ");
				}
				System.out.println();
				
			}
			
		}
		
	}


