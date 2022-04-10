package Datadriven;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testing.testscripts.TC10;
import org.testing.testscripts.TC9;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class datadrivenframework 
{
	@Test(dataProvider="dp2")
public void test1(String username, String password) throws InterruptedException
{
	if(username.equals("sanjeev8697@gmail.com")) {
TC9.login(username, password);
}else {
	TC10.login(username, password);
}
}
@DataProvider
public Object [][] dp1() // array of dp1
{
	Object[][] ob=new Object[2][3];
	ob[0][0]="user1";
	ob[0][1]="password1";
	ob[0][2]="url1";
	ob[1][0]="user2";
	ob[1][1]="password2";
	ob[1][2]="url2";
	
	return ob;
}
@DataProvider
public Object [][] dp2() throws BiffException, IOException
{
	File f=new File("C:\\Users\\Sanjeev\\Desktop\\Facebook.xls");
	Workbook wk=Workbook.getWorkbook(f);
	Sheet ws=wk.getSheet(0);
	int r=ws.getRows();
	int c=ws.getColumns();
	Object[][]ob=new Object[r][c];
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			Cell c1=ws.getCell(j, i);
			ob[i][j]=c1.getContents();
		}
	}
	return ob;
	
}
}