package loopoer;

import javax.swing.JOptionPane;

public class LoopedController
{
	public void start()
	{
		askUser();
	}
	
	private void loopy()
	{
		boolean isDone = false;
		int count = 0;
		
		while (!isDone)
		{
			JOptionPane.showMessageDialog(null, "Hey");
			count++;
			if(count >= 5)
			{
				isDone = true;
			}
			
			
		}
		
		for (int loop = 0; loop < 30; loop += 2 )
		{
			JOptionPane.showMessageDialog(null, "the loop value is: " + loop);
		}
		
		
	}
	
	private void askUser()
	{
		RunLoop userRun = new RunLoop();
		
		String response = JOptionPane.showInputDialog(null, "what is the distance");
		
		while (!validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "nooooo! type in a valid number for the distance");
		}
	//allows string to be turned into a int
		userRun.setDistance(Double.parseDouble(response));
	}
		public boolean validInt(String maybeInt)
		{
			boolean isValid = false;
					
			try
			{
						Integer.parseInt(maybeInt);
						isValid = true;
						
			}
			catch(NumberFormatException error)
			{
				JOptionPane.showMessageDialog(null, "You type interger value now ");
			}
			return isValid;
			
			
		}
		
		public boolean validDouble(String maybeDouble)
		{
			boolean isValid = false;
			try 
			{
				Double.parseDouble(maybeDouble);
				isValid = true;
			}
			catch(NumberFormatException error)
			{
				JOptionPane.showMessageDialog(null, "This requires a double value aka something with a . > )");
			}
			return isValid;
		}
	
	
	
	
}