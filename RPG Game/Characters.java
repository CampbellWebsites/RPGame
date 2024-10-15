import java.awt.Graphics;
import javax.swing.ImageIcon;
//add get weapon

public class Characters {

    private int x,y,w,h, speed, health, damage, stam, dx, dy;
    private ImageIcon pic;
    private Clothes weap;
    private ArrayList<Clothes> ClothesList;
    private String name;
    private String description;
    //add arraylist

    public Characters() {
        x=0;
        y=0;
        w=0;
        h=0;
        speed=0;
        health=0;
        damage=0;
        stam=0;
        dx=0;
        dy=0;
        pic = new ImageIcon();
        name = "";
        description = "";
    }

    public Characters(int xV, int yV, int width, int height, int sp, int hea, int dam, int st, ImageIcon p, Clothes we, ArrayList <Clothes> list, String name, String description){
        x=xV;
        y=yV;
        w=width;
        h=height;
        speed=sp;
        health=hea;
        damage=dam;
        stam=st;
        dx=0;
        dy=0;
        pic = p;
        weap=we;
        ClothesList =list;
        this.name=name;
        this.description=description;
    }

    public Characters(int xV, int yV, int width, int height, int sp, int hea, int dam, int st, ImageIcon p, String name, String description){
        x=xV;
        y=yV;
        w=width;
        h=height;
        speed=sp;
        health=hea;
        damage=dam;
        stam=st;
        dx=0;
        dy=0;
        pic = p;
        this.name=name;
        this.description=description;
    }

    public void drawChar(Graphics g2d) {
        g2d.drawImage(pic.getImage(),x,y, w,h,null);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getW() {
        return this.w;
    }

    public int getH() {
        return this.h;
    }

    public int getSP() {
        return this.speed;
    }

    public int getHEA() {
        return this.health;
    }

    public int getDAM() {
        return this.damage;
    }
        
    public int getSTAM() {
        return this.stam;
    }

    public int getDX() {
        return this.dx;
    }

    public int getDY() {
        return this.dy;
    }

    public ImageIcon getPic() {
        return this.pic;
    }

    public Clothes getWeapon(){
        return this.weap;
    }

    public void setClothes(ArrayList <Clothes> list){
        ClothesList=list;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setSP(int speed) {
        this.speed = speed;
    }

    public void setHEA(int health) {
        this.health = health;
    }

    public void setDAM(int damage) {
        this.damage = damage;
    }

    public void setSTAM(int stam) {
        this.stam = stam;
    }

    public void setDX(int dx) {
        this.dx = dx;
    }

    public void setDY(int dy) {
        this.dy = dy;
    }

    public void setPIC(ImageIcon pic) {
        this.pic = pic;
    }


    
    public Characters dam(int dam){
        setDAM(dam);
        return this;
    }

    public Characters stam(int stam){
        setSTAM(stam);
        return this;
    }

    public Characters pic(ImageIcon pic) {
        setPIC(pic);
        return this;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public boolean Collisions(int x,int y) {
		return getX()+getW()>=b.getX()&&getX()<=b.getX()+b.getW()&&
				getY()+getH()>=b.getY()&&getY()<=b.getY()+b.getH();
	}

    //add collison
    //if collision is true is mouseMoved have a boolean that flipped to true
    
}