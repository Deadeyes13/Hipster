package controller;

/**
 * Runs the hipster program.
 * 
 * @author CJ Oman
 * @version 1.2 added documentation.
 * @date Nov 21, 2013 8:02:32 AM
 */

public class HipsterRunner
{
	/**
	 * Runs your hipster program.
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		HipsterController myHipsterController = new HipsterController();
		myHipsterController.start();
	}

}
