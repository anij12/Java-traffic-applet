import java.applet.*;
import java.awt.*;

public class Traffic extends Applet
{
	String str;
	public void init ()
	{
	  str="Omi";
	}
	public void paint (Graphics g)
	{
		g.drawString(str,20,20);
		
		
		
		//big rectangle//
		g.setColor(Color.cyan);
		g.fillRect(30,40,1840,840);
		
		
		//roads//
		g.setColor(Color.darkGray);
		g.fillRect(30,500,1840,250);
		g.fillRect(1200,40,250,840);
		
		
		//Foothpath//
		g.setColor(Color.black);
		g.fillRect(30,480,1175,20);        //  FIRST HORIZONTAL    //
		g.fillRect(1450,480,420,20);      //         LINE         //
		
		g.fillRect(30,730,1175,20);        //  SECOND HORIZONTAL  //
		g.fillRect(1450,730,420,20);      //         LINE        //
		
		g.fillRect(1200,40,20,460);       //   FIRST VERTICAL     //
		g.fillRect(1200,730,20,150);     //          LINE        //
		
		g.fillRect(1450,40,20,460);       //   SECOND VERTICAL    //
		g.fillRect(1450,730,20,150);     //          LINE        //
		
		
		
		// Lane Divider //
		g.fillRect(30,608,70,10);
		g.fillRect(150,608,70,10);  
		g.fillRect(270,608,70,10); 
		g.fillRect(390,608,70,10); 
		g.fillRect(510,608,70,10); 
		g.fillRect(630,608,70,10);         //       FOR        //  
		g.fillRect(750,608,70,10);        //     HORIZONTAL   //
		g.fillRect(870,608,70,10); 
		g.fillRect(990,608,70,10); 
		g.fillRect(1110,608,70,10); 
	    g.fillRect(1450,608,70,10); 
		g.fillRect(1570,608,70,10); 
		g.fillRect(1690,608,70,10);
		g.fillRect(1800,608,70,10); 
		
		
		g.fillRect(1330,40,10,70);
		g.fillRect(1330,160,10,70);        //        FOR         //
		g.fillRect(1330,280,10,70);       //       VERTICAL     //
		g.fillRect(1330,400,10,70);
		g.fillRect(1330,730,10,70);
		g.fillRect(1330,850,10,30);
	
	
	
	     //Zebra Crossing//
	    g.setColor(Color.white);             
	    g.fillRect(1118,500,100,230);        
	    g.setColor(Color.black);
	    g.fillRect(1118,510,100,10);
	    g.fillRect(1118,530,100,10);
        g.fillRect(1118,550,100,10);
	    g.fillRect(1118,570,100,10);
	    g.fillRect(1118,590,100,10);                //1//
	    g.fillRect(1118,610,100,10);
	    g.fillRect(1118,630,100,10);
	    g.fillRect(1118,650,100,10);
	    g.fillRect(1118,670,100,10);
	    g.fillRect(1118,690,100,10);
	    g.fillRect(1118,710,100,10);
	
	
	
	    g.setColor(Color.white);
	    g.fillRect(1220,400,230,100);        
	    g.setColor(Color.black);
	    g.fillRect(1230,400,10,100);
	    g.fillRect(1250,400,10,100);
	    g.fillRect(1270,400,10,100);
	    g.fillRect(1290,400,10,100);
	    g.fillRect(1310,400,10,100);                //2//
	    g.fillRect(1330,400,10,100);
	    g.fillRect(1350,400,10,100);
        g.fillRect(1370,400,10,100);
	    g.fillRect(1390,400,10,100);
	    g.fillRect(1410,400,10,100);
	    g.fillRect(1430,400,10,100);
	    
	    
	    
	    g.setColor(Color.white);   
	    g.fillRect(1450,500,100,230);      
	    g.setColor(Color.black); 
	    g.fillRect(1450,510,100,10);
	    g.fillRect(1450,530,100,10);
	    g.fillRect(1450,550,100,10);
	    g.fillRect(1450,570,100,10);            
	    g.fillRect(1450,590,100,10);                //3//
	    g.fillRect(1450,610,100,10); 
	    g.fillRect(1450,630,100,10);
	    g.fillRect(1450,650,100,10);
	    g.fillRect(1450,670,100,10);
	    g.fillRect(1450,690,100,10);    
	    g.fillRect(1450,710,100,10);
	
	
	
	    g.setColor(Color.white);             
	    g.fillRect(1219,730,230,100); 
	    g.setColor(Color.black);      
	    g.fillRect(1229,730,10,100);   
	    g.fillRect(1249,730,10,100);   
	    g.fillRect(1269,730,10,100);   
	    g.fillRect(1289,730,10,100);               //4//
	    g.fillRect(1309,730,10,100);   
	    g.fillRect(1329,730,10,100);   
	    g.fillRect(1349,730,10,100);   
	    g.fillRect(1369,730,10,100);   
	    g.fillRect(1389,730,10,100);   
	    g.fillRect(1409,730,10,100);   
	    g.fillRect(1429,730,10,100);   
	
	
	
	     //Traffic Signal//
		g.setColor(Color.black);
		g.fillRect(970,50,129,423);
		g.setColor(Color.red);
		g.fillOval(970,60,129,129);
		g.setColor(Color.yellow);
		g.fillOval(970,199,129,129);
		g.setColor(Color.green);
		g.fillOval(970,338,129,129);
	
	
		
		
		
	}
}
/* <applet code="Traffic.class" width=1900 height=900>
   <param name="text" value="Omi">
   </applet>
    */
