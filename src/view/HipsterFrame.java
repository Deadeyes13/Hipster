package view;

/**
 * Framework for the Hipster Project.
 * @author CJ Oman
 * @version 1.2 added documentation
 * @date Nov 21, 2013 8:14:56 AM
 */

import javax.swing.JFrame;

import controller.HipsterController;

@SuppressWarnings("serial")
public class HipsterFrame extends JFrame
{
	/**
	 * sets hipster controller to base controller.
	 */
	private HipsterController baseController;

	/**
	 * sets Hispter panel to base panel.
	 */
	private HipsterPanel basePanel;

	/**
	 * defines the hipster frame from panel.
	 * 
	 * @param baseController
	 */
	public HipsterFrame(HipsterController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);

		setupFrame();
	}

	/**
	 * sets up the frame.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500, 500);
		this.setVisible(true);
	}

}
