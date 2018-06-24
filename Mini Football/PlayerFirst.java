public class PlayerFirst extends Player {
    private int dy;
    public PlayerFirst(int x, int y,String name) {
        super(x, y,name);
    }
    public void move(boolean w) {
    	if (w)
		{ dy=-20;
		
		}else {
			dy=20;
    	}
        y += dy;

        if (y < 1) {
            y = 1;
        }
        if(y> 900-200 ) {
        	y= 900-200;
        }
        dy=0;
    }
}