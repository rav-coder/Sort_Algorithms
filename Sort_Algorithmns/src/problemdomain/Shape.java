package problemdomain;

public class Shape implements Comparable<Shape>
{
	private double height;
	private double sideValue;
	
	/**
	 * Initializes the newly created Shape
	 */
	public Shape()
	{
		
	}

	/**
	 * Initializes the newly created Shape
	@param height height of the shape 
	@param sideValue
	 */
	public Shape(double height, double sideValue)
	{
		this.height = height;
		this.sideValue = sideValue;
	}
	
	/**
	 * Compares height
	 */
	@Override
	public int compareTo(Shape o)
	{
		if(this.height > o.height) {
			return -1;
		}
		else if(this.height < o.height) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	/**
	 * get height
	 * @return height of the shape
	 */
	public double getHeight()
	{
		return height;
	}

	/**
	 * set height of the shape
	 * @param height new height for shape
	 */
	public void setHeight(double height)
	{
		this.height = height;
	}

	/**
	 * get the sidevalue for the shape
	 * @return sidevalue
	 */
	public double getSideValue()
	{
		return sideValue;
	}

	/**
	 * set a new sidevalue for the shape
	 * @param sideValue new sidevalue for shape
	 */
	public void setSideValue(double sideValue)
	{
		this.sideValue = sideValue;
	}
	
	/**
	 * abstract method for calculate volume
	 * @return 0
	 */
	public double calcVolume() {
		return 0;
	}
	
	/**
	 * abstract method for calculate area
	 * @return 0
	 */
	public double calcArea() {
		return 0;
	}
}
