package ty;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
			FileInputStream fis = new FileInputStream("./data/TS.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			//int a= wb.getSheet("DemoShop").getLastRowNum();
			//int b=wb.getSheet("DemoShop").getRow(0).getLastCellNum();
			int a=wb.getSheet("DemoShop").getPhysicalNumberOfRows();
			int b=wb.getSheet("DemoShop").getRow(0).getPhysicalNumberOfCells();
			for(int i=0;i<=a;i++)
			{
				for(int j=0;j<b;j++)
				{
					String s = wb.getSheet("DemoShop").getRow(i).getCell(j).toString();
					System.out.print(s+"        ");
				}
				System.out.println();
			}
		}

	}

