				package Classwork;
				
				public class get_set {
				
						int rollno;
						String name;
						
						get_set()
						{
							this(0, "No Name" );
						}
						get_set(int rollno, String name)
						{
							this.rollno = rollno;
							this.name = name;
						}
						public int getRollno()
						{
							return this.rollno;
						}
						public String getName()
						{
							return this.name;
						}
						public void setRollno(int rollno)
						{
								this.rollno = rollno;
						}
						public void setName(String name)
						{
							this.name = name;
						}
						
						@Override
						public String toString() {
								//This is toString method here we can override the method
						return "HERE Values are RollNo : "+this.rollno +" And Name : " + this.name;
						}
						
				}
