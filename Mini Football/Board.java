import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
public class Board extends JPanel  {
    private boolean inGame = true;
    public static final Color myGreen = new Color(0,102,0);
    private final int B_WIDTH = 1200;
    public final int B_HEIGHT = 900;
    private PlayerFirst player1;
    private PlayerSecond player2;
    private Ball ball;
    private float ballRadius = 50;
    private float ballX =B_WIDTH/2 ;
    private float ballY =B_HEIGHT/2 ; 
    private int BSIZE=100;
    private float dx = 4;
    private float dy = 3;
    private static final int UPDATE_RATE = 80; // Number of refresh per second
    private boolean firsttime=true;
    public boolean w, s, up, down;//players' moves
    private String char1,char2;//avatar's names
    private int helper1=200;//avatar's width
    private int helper2=200;
    private int PHEIGHT=200;
    public Board(String char1,String char2) {
    	this.char1=char1;
    	this.char2=char2;
        initBoard();  
    }
    private void initBoard() {
        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(myGreen);
        setDoubleBuffered(true);
        inGame = true;
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        //initialize players
        if(char1.equals("Skalmar")) {//Skalmar has different withd :(
        	helper1=100;
        }
        player1=new PlayerFirst(0,B_HEIGHT/2-helper1,char1); 
        if(char2.equals("Skalmar")) {
        	helper2=100;
        }
        player2=new PlayerSecond( B_WIDTH-helper2,B_HEIGHT/2-helper2,char2+2);
        //ball code:initialize ball and make it bouncing 
        ball=new Ball(B_WIDTH/2-50, B_HEIGHT/2-50);
        repaint();
        Thread gameThread = new Thread() {
            public void run() {
               while (inGame) { 
                  ballX += dx;
                  ballY += dy;
                  if (ballX - ballRadius < 0) {
                     dx = -dx;
                     ballX = ballRadius;
                     player2.addPoint();
                  } else if (ballX + ballRadius > B_WIDTH) {
                     dx = -dx;
                     ballX = B_WIDTH - ballRadius;
                     player1.addPoint();
                  }
                  if (ballY - ballRadius < 0) {
                     dy = -dy;
                     ballY = ballRadius;
                  } else if (ballY + ballRadius > B_HEIGHT) {
                     dy = -dy;
                     ballY = B_HEIGHT - ballRadius;
                  }
                  checkCollisions();
                  repaint();
                  inGame();
               
                  try {
                     Thread.sleep(1000 / UPDATE_RATE);  // milliseconds
                  } catch (InterruptedException ex) { }
               }
            }
         };
         gameThread.start();
    }
       @Override
       public void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (inGame) {
            	if(!firsttime) {
            		ball.setX((int) (ballX - ballRadius));
            		ball.setY((int) (ballY - ballRadius));
            	}else {
            		firsttime=false;
            	}
            	g.drawImage(ball.getImage(),ball.getX(),ball.getY(),BSIZE,BSIZE,this);
				g.drawImage(player1.getImage(), player1.getX(), player1.getY(),helper1,PHEIGHT, this);
	            g.drawImage(player2.getImage(), player2.getX(), player2.getY(),helper2,PHEIGHT, this);
	            g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
	            g.setColor(Color.white);
	            g.drawString("Score  "+player1.returnPoints()+" - "+player2.returnPoints(),B_WIDTH/2-60,35);
            } else {
                drawGameOver(g);
            }
            Toolkit.getDefaultToolkit().sync();
        }
        private void drawGameOver(Graphics g) {
            String msg1 = "Game Over!";
            String msg2 = "Score: " +player1.returnPoints()+" - "+player2.returnPoints()+".";
            String msg3="Winner is:";
            if(player1.returnPoints()>player2.returnPoints()) {
            	msg3=msg3+Starter.getNameOfPlayer1()+" with  "+char1;
            }else {
            	msg3=msg3+Starter.getNameOfPlayer2()+"with  "+char2;
            }
            Font small = new Font("Helvetica", Font.BOLD, 30);
            FontMetrics fm = getFontMetrics(small);
            Font big = new Font("Helvetica", Font.BOLD, 60);
            FontMetrics fm2 = getFontMetrics(big);
            
            g.setColor(Color.white);
            g.setFont(big);
            g.drawString(msg1, (B_WIDTH - fm2.stringWidth(msg1)) / 2,
                    B_HEIGHT / 2);
            g.setFont(small);
            g.drawString(msg2, (B_WIDTH - fm.stringWidth(msg2)) / 2,
                    B_HEIGHT / 2+50);
            g.drawString(msg3, (B_WIDTH - fm.stringWidth(msg3)) / 2,
                    B_HEIGHT / 2+80);
        }
        private void inGame() {
            if (player1.returnPoints()>=Starter.getNumberOfGoals()  || player2.returnPoints()>=Starter.getNumberOfGoals() ) {
                inGame=false;
            }
        }
        private void update() { //move players in the right direction
        	if (w){//player1
        		player1.move(true);}
    		if (s){
    			player1.move(false);}
    		if (up){//player2
    			player2.move(true);
    		}if (down) {
    			player2.move(false);
    		}
    		repaint();
        } 
        public void checkCollisions() { //check collision with the bounds of the window and with the players
        	if((ballX<player1.getX()+helper1 && ballX+BSIZE>player1.getX() && ballY<player1.getY()+PHEIGHT && ballY+BSIZE>player1.getY())){
        		dx = -dx; 
                ballX = ballRadius+ helper1; 
        	}
        	if(ballX+BSIZE>player2.getX() && ballY<player2.getY()+PHEIGHT && ballY+BSIZE>player2.getY()) {
        		 dx = -dx;
                 ballX = B_WIDTH - helper2-BSIZE;   
        	}}
        private class TAdapter extends KeyAdapter { 
        	public void keyPressed(KeyEvent e) {
        		int id = e.getKeyCode();
        		if (id == KeyEvent.VK_W){
        			w = true;
        		}else if (id == KeyEvent.VK_S){
        			s = true;
        		}else if (id == KeyEvent.VK_UP){
        			up = true;
        		}else if (id == KeyEvent.VK_DOWN){
        			down = true;
                }	 
        		update();		
        	}
        	public void keyReleased(KeyEvent e){
        		int id = e.getKeyCode();
        		if (id == KeyEvent.VK_W){
        			w = false;
        		}else if (id == KeyEvent.VK_S){
        			s = false;
        		}else if (id == KeyEvent.VK_UP){
        			up = false;
        		}else if (id == KeyEvent.VK_DOWN){
        			down = false;
        		}
        		update();
        		}
        	}
}
