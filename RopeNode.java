/**
 * Java Implementation of Rope
 * @author Elias Haroun
 *
 */
public class RopeNode
{
	public RopeNode left;
	public RopeNode right;
	public String data;
	public int weight;
	
	
	/**
	 * Default Constructor
	 */
	public RopeNode()
	{
		this.left = null;
		this.right = null;
		this.data = null;
		this.weight = 0;
	}
	
	
	/**
	 * Overloaded Constructor
	 * @param data The string to create the Rope with
	 */
	public RopeNode(String data)
	{
		this.left = null;
		this.right = null;
		this.data = data;
		this.weight = data.length();
	}
}
