package a.video;

public class Interaction {
	
	public String interaction;
	public String sprite1;
	public String sprite2;
	public int tick;
	
	public Interaction(int tick, String interaction, String sprite1, String sprite2)
	{
		this.interaction = interactionName(interaction);
		this.sprite1 = sprite1;
		this.sprite2 = sprite2;
		this.tick = tick;
	}
	
	public static String interactionName(String interaction)
	{
		String reverse = new StringBuilder(interaction).reverse().toString();
		int index = reverse.indexOf(".");
		String interactionNameReturn = reverse.substring(0, index);
		interactionNameReturn = new StringBuilder(interactionNameReturn).reverse().toString();
		
		return interactionNameReturn;
	}
	
	public Interaction()
	{
		
	}
	
	public static void main(String [] args)
	{
		System.out.println(interactionName("class.xyz.killSprite"));
	}

}
