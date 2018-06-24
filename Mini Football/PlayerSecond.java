public class PlayerSecond extends Player{
    private int dy;   
    public PlayerSecond(int x, int y,String name) {
        super(x, y,name);
    }
	public void move(boolean up) {
		if (up)
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
