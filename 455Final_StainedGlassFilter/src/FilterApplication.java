/*
 * Written by Randy Panopio
 * Created November 11, 2017
 * Stained Glass Filter Application
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//


public class FilterApplication extends Frame {
	
	public FilterApplication() {

		//try catch block for reading files
		
		//create project panel
		this.setTitle("Stained Glass Filter Application");
		this.setVisible(true);
		

		
		
		this.addWindowListener(
				new WindowAdapter(){
					public void windowClosing(WindowEvent e){
						System.exit(0);
					}});
	}
	
	public void paint(Graphics g){
		int w = 250; 
		int h = 250;
			
		this.setSize(w*5 +100,h*4+50);
		 
	    
	    g.setColor(Color.BLACK);
	    Font f1 = new Font("Verdana", Font.PLAIN, 13);  
	    g.setFont(f1); 
	    
	    g.drawString("Sample Text 1", 25, 40); 
	    g.drawString("Sample Text 2", 125+w, 40); 
	    g.drawString("Sample text 3", 225+w*2, 40); 
	    g.drawString("Sample text 4", 325+w*3, 40);
	    
//	    g.drawString("5.Shadows added", 25, 50+h+40); 
//	    g.drawString("6.New color", 125+w, 50+h+40); 
//	    g.drawString("7.Mask - changed paint color", 225+w*2, 50+h+40); 
//	    g.drawString("8.Changed color - shadows ok", 325+w*3, 50+h+40); 
//	   	   
//	    g.drawString("9.Mask-changed color+reflections", 10, 50+2*h+90); 
//	    g.drawString("10.Changed color-shadows,reflections", 85+w, 50+2*h+90); 
//	    g.drawString("11.Reflections", 200+w*2, 50+2*h+90); 
//	    g.drawString("12.Another color-no reflections", 300+w*3, 50+2*h+90); 		    	    
	}
	
	
	//=======================================================//

  public static void main(String[] args){
	
	  FilterApplication img = new FilterApplication();
    img.repaint();
	
  }

}
