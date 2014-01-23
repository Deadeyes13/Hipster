package controller;

/**
 * controls the Hipster project.
 * @author CJ Oman
 * @version 1.3 added constructor information, added if and elses, added documentation.
 * @date Nov 21, 2013 8:30:57 AM
 */

import javax.swing.JOptionPane;

import model.Hipster;
import view.HipsterFrame;

public class HipsterController
{
	private Hipster selfHipster;

	private HipsterFrame appFrame;

	private Hipster[] classHipsters;

	private int hipsterCount;

	/**
	 * controls your hipsterness.
	 */
	public HipsterController()
	{
		selfHipster = new Hipster();
		classHipsters = new Hipster[50];
		hipsterCount = 0;
	}

	/*
	 * gets your classes Hipsters.
	 */
	public Hipster[] getClassHipsters()
	{
		return classHipsters;
	}

	/**
	 * gets your own hipster.
	 * 
	 * @return your hipster.
	 */
	public Hipster getSelfHipster()
	{
		return selfHipster;
	}

	/**
	 * sets your hipsterness.
	 * 
	 * @param selfHipster
	 */
	public void setSelfHipster(Hipster selfHipster)
	{
		this.selfHipster = selfHipster;
	}

	/**
	 * Used to get your own Hipsterness.
	 * 
	 * @return Your Hipster.
	 */
	public Hipster getMyHipster()
	{
		return selfHipster;
	}

	/**
	 * Used to start the application GUI for the Hipster program.
	 */
	void start()
	{
		appFrame = new HipsterFrame(this);
	}

	/**
	 * Used to get current Hipsters position.
	 * 
	 * @param position
	 * @return Current hipsters position
	 */
	public Hipster getSpecifiedHipster(int position)
	{
		Hipster currentHipster = null;

		if (position < classHipsters.length && position >= 0)
		{
			currentHipster = classHipsters[position];
		}

		return currentHipster;
	}

	/**
	 * Used to retreive a random Hipster object from the array of class
	 * Hipsters.
	 * 
	 * @return The randomly selected Hipster.
	 */
	public Hipster getRandomHipster()
	{
		Hipster randomHipster = null;

		int randomIndex = 0;
		double random = Math.random();
		randomIndex = (int) (random * classHipsters.length);
		randomHipster = classHipsters[randomIndex];

		return randomHipster;
	}

	/**
	 * Createes and adds a Hipster to the array of class Hipsters from the
	 * specified values.
	 * 
	 * @param books
	 *            The array of books for the current Hipster
	 * @param name
	 *            The name of current Hipster.
	 * @param type
	 *            The type of the current Hipster.
	 * @param phrase
	 *            The hipsters current phrase.
	 */
	public void addHipster(String[] books, String name, String type,
			String phrase)
	{
		if (hipsterCount < classHipsters.length)
		{
			Hipster tempHipster = new Hipster(name, type, phrase, books);
			classHipsters[hipsterCount] = tempHipster;
			hipsterCount++;
		} else
		{
			JOptionPane.showMessageDialog(appFrame,
					"The class is full you are to mainstream to be added");
		}
	}
}
