import java.util.Scanner;
class GmailLogin 
{
	public static void main(String[] args) 
	{
		// Bellow Data in database
		String mailid="manoj@123";
		String password="abc123";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the MailId");
		String id= sc.next();

		if (mailid.equals(id))
		{
			System.out.println("Enter The Password...");
				String pass= sc.next();
			if (password.equals(pass))
			{
				System.out.println("Login Succefull...");
			}
			else {
				System.out.println("Invalid Password");
			}
			else{
				System.out.println("invalid mailId...");
			}
		}

	}
}
