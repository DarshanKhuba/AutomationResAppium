package Practise;

public class ThisKeyword {

	
		int x,y;
		/*ThisKeyword(int x, int y)
		{
			this.x=x;
			this.y=y;
		}*/
		void setData(int a,int b)
		{
			this.x=a;
			this.y=b;
		}
		void display()
		{
			System.out.println(x);
			System.out.println(y);
		}
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//ThisKeyword th = new ThisKeyword(100,200);
			ThisKeyword th = new ThisKeyword();
			th.setData(100, 200);
			th.display();

	}

}
