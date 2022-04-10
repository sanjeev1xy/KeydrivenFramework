package org.testing.Assertions;

public class Assertions 
{
public static void assert1(String Expected, String Actual,String[] message)
{
	if(Expected.equals(Actual))
	{
		System.out.println(message[0]);
	}
	else
	{
		System.out.println(message[1]);
	}
}
}
