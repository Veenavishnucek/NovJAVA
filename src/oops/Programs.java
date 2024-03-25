package oops;

interface Tvremote
{
	public void volumeupdown();
}

interface SmartTVremote extends Tvremote
{
	public void channelupdown();
}

class TV implements SmartTVremote
{

	//@Override
	public void volumeupdown() {
		System.out.println("+ for volume up and - for volume down");
		
	}

	@Override
	public void channelupdown() {
		
		System.out.println("+ for channel up and - for channel down");
	}
	
}

public class Programs {

	public static void main(String[] args) {
		
		SmartTVremote ob =new TV();
		ob.volumeupdown();
		ob.channelupdown();
		

	}

}
