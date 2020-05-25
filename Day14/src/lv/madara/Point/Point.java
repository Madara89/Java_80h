package lv.madara.Point;

public class Point {

    private float x;
    private float y;

    //create constructors:
    public Point (float x, float y){
        this.x = x;
        this.y = y;
    }

    public Point (){
        this.x = 0.0f;
        this.y = 0.0f;
    }

    //metodes: getters and setters

    public float getX() {
        return x;
    }
    public void setX(float x) { //setter pārraksta konstruktora default vērtību
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){ //izveido masīvam metodi
        float[] arrays = new float [2];  //obligāti jādefinē masīvs ar arrays(variable)
        arrays [0] = this.x;
        arrays [1] = this.y;
        return arrays;
        //float[] arrays = {this.x, this.y}; //šādu metodi arī var izmantot
    }

    //create toString metodi
    public String toString(){
        return "("+this.x + "," + this.y + ")";
    }

}
