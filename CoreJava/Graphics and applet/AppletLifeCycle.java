import java.applet.*;
import java.awt.*;

public class AppletLifeCycle extends Applet
{
	String str="Manavi";
	int startcnt=0;
	int stopcnt=0;
	int initcnt=0;
	int descnt=0;

/*Initialization state is a state in applet life cycle which occurs only once in whole life cycle It uses init() method of Applet class The Applet is Born at this state */
/*1. We can Create the objects need by appplet at this state*/
/*2. Can set up initial values */
/*3. Load images or fonts*/
/*4. Set up Colors*/

	public void init() 
	{
		str=str+"<init>";
		initcnt++;
	}

/*Applet enters running state when it calls the start method of Applet class */
/*starting also occurs when the applet is stopped (idle) before and again entered in running state*/
/*It can occur multiple times in an applet life cycle*/
/*We can override the start() method to create thread to control Applet*/


	public void start()
	{
		str=str+"<start>";
		startcnt++;
	}

/*Applet becomes Idle when it is Stopped from Running */
/*Stopping occurs automatically and multiple times when we leave the page running an Applet*/
/*We can also explicitly stop applet using stop() method for eg. while using thread using applet*/
/*We can override stop method*/

	public void stop()
	{
		str=str+"<stop>";
		stopcnt++;
	}
/*Applet is dead when it is removed from memory */
/*Occurs automatically and only once when we quit browser */
/*To clean up the resources created by an applet we can override this method */

	public void destroy()
	{
		str=str+"<destroy>";
		descnt++;
	}

	public void paint(Graphics g)
	{
		str=str+"<paint>";
		
		g.drawString(str,30,50);
		g.drawString("init has been invoked "+initcnt+"times",30,70);
		g.drawString("start has been invoked "+startcnt+"times",30,90);	
		g.drawString("stop has been invoked "+stopcnt+"times",30,110);
		g.drawString("destroy has been invoked "+descnt+"times",30,130);
	}
	//<Applet code="AppletLifeCycle.class" Height=300 Width=300></applet>
}