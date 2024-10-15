public class Clothes {

    int x,y,w,h;

    int dam, durability, dps;
    
    public Clothes(){
        x=0;
        y=0;
        w=0;
        h=0;
    }
    public Clothes(int xV, int yV, int wV, int hV, int d, int dur, int dp){
        x=xV;
        y=yV;
        w=wV;
        h=hV;
        dam=d;
        durability=dur;
        dps=-dp;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getW() {
        return this.y;
    }
}
