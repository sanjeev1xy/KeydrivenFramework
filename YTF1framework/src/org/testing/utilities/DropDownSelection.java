package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection
{
public static void dropDownUsingIndex(int indexNumber, WebElement ele)
{
	Select s1=new Select(ele);
	s1.selectByIndex(indexNumber);
}
public static void dropDwonUsingValue(String value, WebElement ele)
{
	Select s2=new Select(ele);
	s2.selectByValue(value);
}
public static void dropDownUsingVisibleText(String visible, WebElement ele)
{
	Select s3=new Select(ele);
	s3.deselectByVisibleText(visible);
}
}
