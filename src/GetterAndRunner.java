
class GetterAndSetter
{
	private int data;
	
	public int getData()
	{
		return data;
	}
	
	public void setData( int param )
	{
		data = param;
	}
}
class GetterAndSetterRunner
{

	public static void main(String[] args) 
	{
		// TODO 自動生成されたメソッド・スタブ
		GetterAndSetter ref = new GetterAndSetter();
		
		ref.setData( 100 );
		
		int i=ref.getData();
		System.out.println( i );
	 	
	}

}
