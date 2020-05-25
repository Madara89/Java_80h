package lv.madara.Graph;

public class Point {

    private int x; //vērtības te vēl nepiešķir
    private int y; //vērtības piešķir default konstruktorā

    //veido 2 konstruktorus: viens default, otrs ar mainīgām (x,y) vērtībām:
    public Point() { //pirmais ir tukšs konstruktors (default)
        this.x = 0; //defaultā vērtība
        this.y = 0;
    }
    public Point(int x, int y) { //otrais, kur int x un y vērtības būs mainīgas, nevis default (testējot)
        this.x = x;
        this.y = y;
    }

    //veido Getters and Setters (automātiski ar generate):
    public int getX() {
        return x;
    }
    public void setX(int x) { //void neatgriež vērtību, void transportē/pārnes vērtību
        this.x = x; //nav return metode, bet transportē x vērtību, kas ir definēta klasē
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    //izveido toString (bez Override, to vnk izdzēš):
    public String toString() {
        return "("+this.x+","+this.y+")"; //uzraksta tekstu, ko prasa
    }

    //izveido getXY ar masīva tipu int[]:
    public int[] getXY(){
        int [] array = new int[2]; //definē masīvu
        array [0] = x; //katram indexam piešķir vērtību
        array [1] = y;
        return array;
    }

    //izveido setXY metodi, kurā x un y būs citas vērtības nekā default:
    public void setXY(int x, int y){ //arguments nosaka, ka x un y vērtības testējot varēs mainīt
        this.x = x;
        this.y = y;
    }

    //distance metodes:
    public double distance(int xB, int yB){
        //ņem dokumentāciju palīgā, meklē distances formulu un nodefinē:
        return Math.sqrt(Math.pow((this.x - xB),2) + Math.pow((this.y - yB),2));
        //Math.pow ir ^2 pakāpe, kurā rezinam. Math.sqrt ir kvadrātsakne
    }

    public double distance (Point another){
        return Math.sqrt(Math.pow((this.x - another.getX()),2) + Math.pow((this.y - another.getY()),2));
        //xB un yB vērtību izmaina ar another.get metodi
    }

    public double distance (){
        return Math.sqrt(Math.pow((0 - this.x),2) + Math.pow((0 - this.y),2));
    }

}
