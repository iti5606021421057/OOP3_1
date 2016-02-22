//1. รับวินาที แปลงเป็น นาที ชั่วโมง วัน 
import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;
//========================================================
public class timeFile 
{
	int Sec,Min,Hour,Day;
//========================================================
	public void getData()
	{
		Sec = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Sec ...","Input",JOptionPane.QUESTION_MESSAGE));
	}
//========================================================
	public void Calc()
	{
		Min = Sec / 60;
		Sec = Sec % 60;
		
		Hour = Min / 60;
		Min = Min % 60;
		
		Day = Hour/24;
		Hour = Hour % 24;
	}
//========================================================
	public void Print()
	{
		
		JOptionPane.showMessageDialog(null,"> Show...Time \n Day : Hour : Min : Sec \n "+Day+" : "+Hour+" : "+Min+" : "+Sec, "Message",JOptionPane.INFORMATION_MESSAGE);
	}
//========================================================
public static void main(String[] args) 
	{
		timeFile tf1 = new timeFile();
		tf1.getData();
		tf1.Calc();
		tf1.Print();
	}

}