public class Ball extends Sprite {
		 Ball(int x, int y) {
			 super(x, y);
			 initBall();	        
	    }
	    private void initBall() {
	    	loadImage("img\\soccer_ball.png");
	        getImageDimensions();
	    }   
}
