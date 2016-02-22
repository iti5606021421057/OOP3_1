// 2. รับชื่อนามสกุล เป็นภาษาอังกฤษ แล้วมาเช็คว่า ชื่อนามสกุลมีสระกี่ตัว
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
//***************************************************************************	
public class aeiouFile 
{
	int A,E,I,O,U;
//***************************************************************************	
	public String getData()
	{
		String sara = JOptionPane.showInputDialog(null,"Enter 'AEIOU' : ","InputData",JOptionPane.QUESTION_MESSAGE);
		sara = sara.toUpperCase();
		return sara;
	}
//** *************************************************************************
public void Calc (String sara)
	{
	A=E=I=O=U= 0;
	for (int i = 0; i < sara.length(); i++) 
    {
		if(sara.charAt(i) == 'A') 
		{
			A=A+1;
		}else if(sara.charAt(i) == 'E')
      	{
			E=E+1;
      	}else if(sara.charAt(i) == 'I')
        {
      		I=I+1; 
        }else if(sara.charAt(i) == 'O') 
        {
        	O=O+1;
        }else if(sara.charAt(i) == 'U')
        {
        	U=U+1;
        }
    }	
}
	
//***************************************************************************
public void Print()
	{
	JOptionPane.showMessageDialog(null,"Number of  'AEIOU'\n" +"=======================================\n"+"A    >>   "+A+"\nE    >>   "+E+"\nI     >>   "+I+"\nO   >>   "+O+"\nU   >>   "+U+"\n==============End Program==============\n","Message",JOptionPane.PLAIN_MESSAGE);
	}
//***************************************************************************
public static void main(String[] args) 
	{
		String name;
		aeiouFile n = new aeiouFile();	
		name = n.getData();
		n.Calc(name);
		n.Print();
	}
}