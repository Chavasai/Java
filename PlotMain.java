class Plot
{
	
		float length;
		float width;
		
		void setData()
		{
			length=0.0f;
			width=0.0f;		
		}
		void setData(float l, float w)
		{
			length= l;
			width= w;
		}
		float area()
		{
			return length*width;
		}
		void display()
		{
			System.out.println("length = "+length);
			System.out.println("width = "+width);
			System.out.println("area = "+area());
		}

	

}

class PlotMain
{
 	 public static void main(String args[])
	{
		Plot p1=new Plot();
		p1.display();
		p1.setData(10.0f,20.0f);
		p1.display();
	}

}
