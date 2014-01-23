package model;

/**
 * The Hipster Project.
 * 
 * @author CJ Oman
 * @version 1.4 added getters and setters, overloaded constructors for
 *          additional hipsters, added documentation
 * @date Nov 21, 2013 8:14:40 AM
 */

public class Hipster
{
	private String name;
	private String hipsterType;
	private String hipsterPhrase;
	private String[] hipsterBooks;

	/**
	 * Defines your hipster.
	 */
	public Hipster()
	{
		hipsterBooks = new String[5];
		name = "CJ";
		hipsterType = "Student Hipster";
		hipsterPhrase = "chessy";

		fillTheBooks();
	}

	/**
	 * defines the parameters.
	 * 
	 * @param name
	 * @param hipsterType
	 * @param hipsterPhrase
	 * @param hipsterBooks
	 */
	public Hipster(String name, String hipsterType, String hipsterPhrase,
			String[] hipsterBooks)
	{
		this.name = name;
		this.hipsterBooks = hipsterBooks;
		this.hipsterPhrase = hipsterPhrase;
		this.hipsterType = hipsterType;

	}

	/**
	 * gets name.
	 * 
	 * @return name.
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * gets hipster type.
	 * 
	 * @return hipster type.
	 */
	public String getHipsterType()
	{
		return hipsterType;
	}

	/**
	 * gets hipster phrase.
	 * 
	 * @return hipster phrase.
	 */
	public String getHipsterPhrase()
	{
		return hipsterPhrase;
	}

	/**
	 * gets hipster books.
	 * 
	 * @return hipster books.
	 */
	public String[] getHipsterBooks()
	{
		return hipsterBooks;
	}

	/**
	 * sets name.
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * sets hipster type.
	 * 
	 * @param hipsterType
	 */
	public void setHipsterType(String hipsterType)
	{
		this.hipsterType = hipsterType;
	}

	/**
	 * sets hipster phrase.
	 * 
	 * @param hipsterPhrase
	 */
	public void setHipsterPhrase(String hipsterPhrase)
	{
		this.hipsterPhrase = hipsterPhrase;
	}

	/**
	 * sets hipster books.
	 * 
	 * @param hipsterBooks
	 */
	public void setHipsterBooks(String[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}

	/**
	 * fills the book list.
	 */
	private void fillTheBooks()
	{
		hipsterBooks[0] = "Oxford Dictinoary";
		hipsterBooks[1] = "Snow Crash";
		hipsterBooks[2] = "1984";
		hipsterBooks[3] = "American Gods";
		hipsterBooks[4] = "V for Vendetta";

	}

}
