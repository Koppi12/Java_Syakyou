
class PublicOrPrivateField  
{
	public int dataPublic;
	
	private int dataPrivate;
	
	public void printData()
	{
		System.out.println( dataPublic );
		System.out.println( dataPrivate );
	}
}
		
class PublicOrPrivateFieldRunner
{
	public static void main(String[] args) 
	{
		// TODO 自動生成されたメソッド・スタブ
	PublicOrPrivateField ref = new PublicOrPrivateField();
	
	ref.dataPublic = 100;
	
	ref.printData();
	
	
	}

}
