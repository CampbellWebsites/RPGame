import javax.swing.ImageIcon;

public class Caitlyn extends Characters {
    public Caitlyn() {
        super();
    }

    public Caitlyn(int x, int y){
        super(x,y, 200, 250, 10,500,360,100, new ImageIcon("caitlyn.png"), new Lolly(), setList(),"Caitlyn","Caitlyn is a female movie star. She attends red carpet events every weekend. She is most famous for her rom com based on her high school love story, titled Caitlyn in Paradise" );
        super.getClothes().setX(super.getX()+super.getW());
        super.setClothes(setList());
    }

    public String toString(){
        return "Caitlyn";
    }


public ArrayList <Clothes> setList(){
    ArrayList <Clothes> temp = new ArrayList <Clothes> ();
    temp.add(new Lolly());
    temp.add(new Lolly());
    temp.add(new Lolly());
    return temp;
}
}
//new Lolly(x,y)