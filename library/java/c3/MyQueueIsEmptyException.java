public class MyQueueIsEmptyException extends Exception
{
	public MyQueueIsEmptyException(String message)
	{
		super(message);
	}

	public static void main(String[] args){
		try {
			throw new MyQueueIsEmptyException("test");
		} catch (MyQueueIsEmptyException e) {
			System.out.println("Catch");
		}	
	}
}