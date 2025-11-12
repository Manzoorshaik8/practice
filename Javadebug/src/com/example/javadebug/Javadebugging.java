package com.example.javadebug;

public class Javadebugging {

public static void main(String[]args)
{
	int a=10;
	int b=20;
	int c=10;
	int d=5;
	int sum=addnumbers(a,b,c,d);
	System.out.println("sum ="+sum);
}
static int addnumbers(int x,int y,int z,int o)
{
	int result =x+y+z+o;
	return result;
}
}

