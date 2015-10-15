
class HasMethodAndField 
{
	int data;
	
	void printData()
	{
		System.out.println( data );
	}
}
class HasMethodAndFieldRunner
{

	public static void main(String[] args) 
	{
		// TODO 自動生成されたメソッド・スタブ
		HasMethodAndField ref  = new HasMethodAndField();
		
		ref.data = 100;
		
		ref.printData();
	}

}
