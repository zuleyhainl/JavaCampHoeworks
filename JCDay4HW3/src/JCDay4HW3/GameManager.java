package JCDay4HW3;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+"--> oyunu sisteme eklendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+"--> oyunu sistemden silindi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+"--> oyunu sistemde g�ncellendi");
		
	}



}
