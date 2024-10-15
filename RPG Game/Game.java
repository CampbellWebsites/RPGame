
import java.awt.*;
import java.awt.event.*; 
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.*; 


public class Game  extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener{

	
	private BufferedImage back; 
	private int key, x, y; 
	private ArrayList <Characters> charList;
	private String screen;
	private Characters player;
	private ImageIcon startBg;
	private ImageIcon chooseBg; 
	private String welcome;
	private double time;
	private int i;
	private boolean collision;

	
	public Game() {
		new Thread(this).start();	
		this.addKeyListener(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);	
		key =-1; 
		x=0;
		y=0;
		charList = setCharList();
		for(Characters c: charList){
			System.out.println(c);
		}
		screen="start";
		startBg=new ImageIcon("startbackground.png");
		chooseBg=new ImageIcon("classroom.png");
		welcome = "Welcome to Campbell's School Game";
		time=System.currentTimeMillis();
		collision=false;
	}

	public ArrayList <Characters> setCharList(){
        ArrayList <Characters> temp = new ArrayList <>();
		temp.add(new Caitlyn(100,100));
		temp.add(new Marinne(250,100));
		temp.add(new Campbell(400,100));
		temp.add(new Jules(550,100));
		temp.add(new Aliki(700,100));


		return temp;
    }
	
	public void run()
	   {
	   	try
	   	{
	   		while(true)
	   		{
	   		   Thread.currentThread().sleep(5);
	            repaint();
	         }
	      }
	   		catch(Exception e)
	      {
	      }
	  	}
	

	
	
	
	public void paint(Graphics g){
		
		Graphics2D twoDgraph = (Graphics2D) g; 
		if( back ==null)
			back=(BufferedImage)( (createImage(getWidth(), getHeight()))); 
		

		Graphics g2d = back.createGraphics();
	
		g2d.clearRect(0,0,getSize().width, getSize().height);
	
		g2d.setFont( new Font("Broadway", Font.BOLD, 35));
		
		g2d.drawString("Hello!" , x, y);

		drawScreens(g2d);

		welcome.substring(0,i);

		// s.substring(0,i);
		// i++;

		// if(i>=s.length){
		// 	i=s.length;
		// }

		// if(timer%400==0){
		// 	i++;
		// }
		
		twoDgraph.drawImage(back, null, 0, 0);

	}

public void drawStartScreen(Graphics g2d){
	g2d.drawImage(startBg.getImage(),0,0,getWidth(),getHeight(),this);
	g2d.drawString(welcome.substring(0,i),500 ,400);
	if (i<welcome.length()){
		if(System.currentTimeMillis()-time>100){
			time=System.currentTimeMillis();
			i++;
		}
	}
}

public void drawChooseScreen(Graphics g2d){
	g2d.drawImage(chooseBg.getImage(),0,0,getWidth(),getHeight(),this);
	for(Characters c: charList){
		System.out.println(c);
		c.drawChar(g2d);
	}
}

	
	private void drawScreens(Graphics g2d) {
		switch(screen) {
			case "start":
			drawStartScreen(g2d);
			break;
			case "choose":
			drawChooseScreen(g2d);
			break;
			case "selection":
				drawSelectScreen(g2d);
		}
	}

	public void drawSelectScreen(Graphics g2d) {
		player.drawChar(g2d);
		g2d.drawString("You picked "+player.toString(), 200, 500);

	}


	//DO NOT DELETE
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




//DO NOT DELETE
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		key= e.getKeyCode();
		System.out.println(key);
		if(key==32){
			screen="choose";
		}
		if(key==49){
			screen="selection";
			player=charList.get(0);
		}
		if(key==50){
			screen="selection";
			player=charList.get(1);
		}
		if(key==51){
			screen="selection";
			player=charList.get(2);
		}
		if(key==52){
			screen="selection";
			player=charList.get(3);
		}
		if(key==53){
			screen="selection";
			player=charList.get(4);
		}
		
// 	49 -- 1
// 50 -- 2
// 51 -- 3
// 52 -- 4
// 53 -- 5
	
	}


	//DO NOT DELETE
	@Override
	public void keyReleased(KeyEvent e) {
		
		
		
		
	}



	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		x=arg0.getX();
		y=arg0.getY();

	}



	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		//check to see if on start screen 
		//for loop to check through all mainChars
		//have something in calendar class to check for mouse collision
		//if mouse collision check in characters class return is true )mouce colliosn)
		//player = loop.get(i)
	}



	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("entered");
	}



	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("exited");
	}



	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("you clicked at"+ arg0.getY());
		x=arg0.getX();
		y=arg0.getY();
		
		if ((arg0.getX() >= Marinne.getX() && arg0.getX() <= Marinne.getX() + Marinne.getW()) && (arg0.getY() >= Marinne.getY() && arg0.getY() <= Marinne.getY() + Marinne.getH())){
		}
	}



	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	

	
}
