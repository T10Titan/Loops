package loopoer;

import javax.swing.JOptionPane;

public class Looped
{
	public void start()
	{
		loopy();
	}
	
	private void loopy()
	{
		boolean isDone = false;
		int count = 0;
		
		while (!isDone)
		{
			JOptionPane.showMessageDialog(null, "brother may i hav some loops?");
			count++;
			if(count >= 10)
			{
				isDone = true;
			}
		}
	}
}