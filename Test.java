import com.way2sms.SMS;

public class Test {

	public Test()
	{
		SMS smsClient=new SMS();
		smsClient.send( "", "","+213791295962" , "BSR YA L3AWD","");
	}

	public static void main(String[] args) {
     new Test();
	}

}