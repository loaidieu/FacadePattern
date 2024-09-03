package FacadePattern;

public class Driver {

	public static void main(String[] args) {
		HomeTheaterFacade theater = new HomeTheaterFacade(new TV(), new SoundSystem(), new DVDPlayer());
		theater.playMovie("Inception");
	}

}
