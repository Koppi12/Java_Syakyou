
class UseThisField 
{ 
	int data;
	
	void printData()
	{
		System.out.println( this.data );
	}	
}

class UseThisFieldRunner
{
	public static void main(String[] args) 
	{
		// TODO 自動生成されたメソッド・スタブ
		UseThisField ref = new UseThisField();
		
		ref.data = 100;
		
		ref.printData();
	}
}
