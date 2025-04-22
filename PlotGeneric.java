class Plot<A,B>
{
	
		A length;
		B width;
		
		A getLength()
		{
			return length;		
		}
		void setLength(A length)
		{
			this.length=length;
		}
		B getWidth()
		{
			return width;
		}
		void setWidth(B width)
		{
			this.width=width;
		
		}
		public Plot(A length,B width)
		{
			this.length=length;
			this.width=width;
		}
		void display()
		{
			System.out.println("length = "+getLength());
			System.out.println("width = "+width);
			//System.out.println("area = "+area());
		}

	

}

public class PlotGeneric
{
 	 public static void main(String args[])
	{
		Plot p1=new Plot<Integer,Integer>(10,20);
		Plot p2=new Plot<Float,Integer>(10.0f,20);
		Plot p3=new Plot<Double,Float>(10.0,20.0f);
		System.out.println("\n Plot p1");
		p1.display();
		System.out.println("\n Plot p2");
		p2.display();
		System.out.println("\n Plot p3");
		p3.display();
		
	}

}
