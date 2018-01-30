import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChatDecoder extends JFrame
{
	private String output;
	private String input;
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JLabel label1 = new JLabel("What you want translated:");
	private JLabel label2 = new JLabel("Translation:");
	private JTextField textField = new JTextField(30);
	private JTextField textField2 = new JTextField(30);

	
	public ChatDecoder()
	{
		output = "";
		input = "";
		frame.setTitle("Chat Decoder");
		frame.setVisible(true);
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel.add(label1);
		panel.add(textField);
		
		textField.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				input = textField.getText();
				output = Decode(input);
				textField2.setText(output);
			}
		});
		panel.add(label2);
		panel.add(textField2);
		frame.add(panel);
	}
	
	public String Decode(String input)
	{
		String test = "";
		String output = input;
		for(int i = 0; i<input.length(); i++)
		{
			test = output.substring(i, i+1);
			if(test.equals("a"))
			{
				output = new String(output.substring(0, i)+"e"+output.substring(i+1, output.length()));
				continue;
			}
			if(test.equals("e"))
			{
				output = new String(output.substring(0, i)+"a"+output.substring(i+1, output.length()));
				continue;
			}
			if(test.equals("k"))
			{
				output = new String(output.substring(0, i)+"l"+output.substring(i+1, output.length()));
				continue;
			}
			if(test.equals("l"))
			{
				output = new String(output.substring(0, i)+"k"+output.substring(i+1, output.length()));
				continue;
			}
			if(test.equals("u"))
			{
				output = new String(output.substring(0, i)+"i"+output.substring(i+1, output.length()));
				continue;
			}
			if(test.equals("i"))
			{
				output = new String(output.substring(0, i)+"u"+output.substring(i+1, output.length()));
				continue;
			}
			if(test.equals("t"))
			{
				output = new String(output.substring(0, i)+"s"+output.substring(i+1, output.length()));
				continue;
			}
			if(test.equals("s"))
			{
				output = new String(output.substring(0, i)+"t"+output.substring(i+1, output.length()));
				continue;
			}
			if(test.equals("m"))
			{
				output = new String(output.substring(0, i)+"n"+output.substring(i+1, output.length()));
				continue;
			}
			if(test.equals("n"))
			{
				output = new String(output.substring(0, i)+"m"+output.substring(i+1, output.length()));
				continue;
			}
			if(test.equals("A"))
			{
				output = new String(output.substring(0, i)+"E"+output.substring(i+1, output.length()));
				continue;
			}
			if(test.equals("E"))
			{
				output = new String(output.substring(0, i)+"A"+output.substring(i+1, output.length()));
				continue;
			}
			if(test.equals("K"))
			{
				output = new String(output.substring(0, i)+"L"+output.substring(i+1, output.length()));
				continue;
			}
			if(test.equals("L"))
			{
				output = new String(output.substring(0, i)+"K"+output.substring(i+1, output.length()));
				continue;
			}
			if(test.equals("U"))
			{
				output = new String(output.substring(0, i)+"I"+output.substring(i+1, output.length()));
				continue;
			}
			if(test.equals("I"))
			{
				output = new String(output.substring(0, i)+"U"+output.substring(i+1, output.length()));
				continue;
			}
			if(test.equals("T"))
			{
				output = new String(output.substring(0, i)+"S"+output.substring(i+1, output.length()));
				continue;
			}
			if(test.equals("S"))
			{
				output = new String(output.substring(0, i)+"T"+output.substring(i+1, output.length()));
				continue;
			}
			if(test.equals("M"))
			{
				output = new String(output.substring(0, i)+"N"+output.substring(i+1, output.length()));
				continue;
			}
			if(test.equals("N"))
			{
				output = new String(output.substring(0, i)+"M"+output.substring(i+1, output.length()));
				continue;
			}
		}
		return output;				
	}
	
	public static void main(String[] args)
	{
		ChatDecoder decoder = new ChatDecoder();
	}
	
	
	
	
	
}