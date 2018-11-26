import java.io.*;

interface Figure
{
	public void input() throws IOException; 
	abstract double findArea();
	abstract double findPerimeter();
}

class Circle implements Figure
{
	double dim1;
	
	public void input() throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the diameter of a Circle: ");
		dim1=Double.parseDouble(br.readLine());
	}
	
	public double findArea()
	{
		double findArea=3.14d*(dim1/2)*(dim1/2);
		return findArea;
	}
	
	public double findPerimeter()
	{
		double findPerimeter=2*3.14d*(dim1/2);
		return findPerimeter;
	}
}

class Rectangle implements Figure
{
	int length;
	int breadth;
	public void input() throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("");
		System.out.println("Enter the length of Rectangle: ");
		length=Integer.parseInt(br.readLine());
		System.out.println("Enter the width of Rectangle: ");
		breadth=Integer.parseInt(br.readLine());
	}
	
	public double findArea()
	{
		double findArea=length*breadth;
		return findArea;
	}

	public double findPerimeter()
	{
		double findPerimeter=2*(length+breadth);
		return findPerimeter;
	}
}

class Triangle implements Figure
{
	int lside, rside, base,height;
	public void input() throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(""); 
	System.out.println("Enter the left width of a Triangle: ");	
	lside=Integer.parseInt(br.readLine());
	System.out.println("Enter the right width of a Triangle: ");	
	rside=Integer.parseInt(br.readLine());
	System.out.println("Enter the base width of a Triangle: ");	
	base=Integer.parseInt(br.readLine());
	System.out.println("Enter the height of a Triangle: ");	
	height=Integer.parseInt(br.readLine());
	}
	public double findArea()
	{
		double findArea=(base*height)/2;
		return findArea;
		
	}

	public double findPerimeter()
	{
		double findPerimeter=(lside+base+rside);
		return findPerimeter;
	}
}


class Session4Prg1
{
	
	public static void main(String args[])throws IOException
	{ 

	Figure ref;

	ref=new Circle();
	ref.input();
	System.out.println("The area of a Circle is " +ref.findArea());
	System.out.println("The perimeter of a Circle is " +ref.findPerimeter());

	ref=new Rectangle();
	ref.input();
	System.out.println("The area of a Rectangle is " +ref.findArea());
	System.out.println("The perimeter of a Rectangle is " +ref.findPerimeter());


	ref=new Triangle();
	ref.input();
	System.out.println("The area of a Triangle is " +ref.findArea());
	System.out.println("The perimeter of a Triangle is " +ref.findPerimeter());

	}
}