package labno5;




public class syncmethod
{

	int totalseat=10;
	void busticket(int seats)
	{
		if(totalseat>=seats)
		{
			System.out.println(seats+"seats book successfully");
			totalseat=totalseat-seats;
			System.out.println("seats left"+totalseat);
		}
		else
		{
			System.out.println("Sorry seats cannot be booked");
			System.out.println("Seats left"+totalseat);
		}
	}
}