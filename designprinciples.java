package myfirst;
import java.util.*;
public class DesignP {
	static int a;
	static int b;
	static Scanner scan=new Scanner(System.in);
	public static void read()
	{
		System.out.println("Enter first operand");
		a=scan.nextInt();
		System.out.println("Enter second operand");
		b=scan.nextInt();
	}
	public static void show(int value)
	{
		System.out.println(value);
	}
	public static int add1(int value1,int value2)
	{
		int value3=Integer.MIN_VALUE;
		value3=value1+value2;
		return value3;
	}
	public static int subtract1(int value1,int value2)
	{
		int value3=Integer.MIN_VALUE;
		value3=value1-value2;
		return value3;
	}
	public static int multi1(int value1,int value2)
	{
		int value3=Integer.MIN_VALUE;
		value3=value1*value2;
		return value3;
	}
	public static int divide1(int value1,int value2)
	{
		int value3=Integer.MIN_VALUE;
		if(value2==0)
			return value3;
		else
			value3=value1/value2;
		return value3;
	}
	public static void check(char ch)
	{
		int x=0;
		int flag=1;
		switch(ch)
		{
			case '+':
				System.out.println("It is Addition Operation");
				x=add1(a,b);
				break;
			case '-':
				System.out.println("It is Subtraction Operation");
				x=subtract1(a,b);
				break;
			case '*':
				System.out.println("It is Multiplication Operation");
				x=multi1(a,b);
				break;
			case '/':
				System.out.println("It is Division Operation");
				if(b!=0)
				{
					x=divide1(a,b);
				}
				else
				{
					System.out.println("Division is not possible with divisor equal to Zero ");
					flag=0;
				}
				break;
			default:
				flag=0;
				System.out.println("It is not a Arithmetic operator");
		}
		if(flag==1)
		{
			show(x);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		read();
		System.out.println("Enter the Arithmetic operator");
		char operator=(scan.next()).charAt(0);
		check(operator);
		
	}
}