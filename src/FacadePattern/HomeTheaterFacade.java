package FacadePattern;

public class HomeTheaterFacade {
	private TV tv;
	private SoundSystem sound;
	private DVDPlayer player;
	
	public HomeTheaterFacade(TV tv, SoundSystem ss, DVDPlayer dvd)
	{
		this.tv = tv;
		this.sound = ss;
		this.player = dvd;
	}
	
	public void playMovie(String name)
	{
		tv.TurnOn();
		sound.turnOn();
		player.turnOn();
		System.out.println("starting movie " + name);
	}
}
