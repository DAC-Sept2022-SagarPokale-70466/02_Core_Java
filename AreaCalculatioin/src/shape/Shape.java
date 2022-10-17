package shape;

public abstract class Shape {
		
		protected double area;			// Protected because we need to access at subclass from different package
		
		public Shape()
		{
			this.area = 0.0;
		}
		public abstract void area();
		
		public abstract void getDetails();
		public void getArea()
		{
			System.out.println("Area is : "+this.area);
		}

}
