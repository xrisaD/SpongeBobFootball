public class Player extends Sprite {
	private int points=0;
    public Player(int x, int y,String name) {
        super(x, y);
        initPlayer(name);
    }
    private void initPlayer(String name) {
    	loadImage("img\\"+name+".png");
        getImageDimensions();
    }

    public int returnPoints(){
        return points;
    }
    public void addPoint() {
    	++points;
    }
    public void deletePoint() {
    	--points;
    }
}