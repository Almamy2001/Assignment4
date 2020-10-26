import java.awt.*;

public class Plot {

    /**
     * Field of the class
     *
     * @param x
     * @param y
     * @param width
     * @param depth
     */
    private  int x; //To hold the x coordinate of the plot
    private int y; //To hold the y coordinate of the plot
    private int width; //To hold the width of the plot
    private int depth; //To hold the depth of the plot

    /** No arg constructor to initialize the attributes of the class
     */
    public Plot(){
        x=0;
        y=0;
        width=1;
        depth=1;
    }

    /**Copy constructor
     *
     * @param plot1
     */

    //Are my copy constructors right?
    public Plot(Plot plot1){
        x=plot1.x;
        y=plot1.y;
        width=plot1.width;
        depth=plot1.depth;
    }

    /**
     * Constructor to let the user set the value of the fields
     * @param x
     * @param y
     * @param width
     * @param depth
     */
    public Plot(int x, int y, int width, int depth){
        this.x=x;
        this.y=y;
        this.width= width;
        this.depth= depth;
    }

        public boolean overlaps(Plot plot1){

            Rectangle rectangle= new Rectangle(x,y,width,depth);
            Rectangle rectangle1= new Rectangle(plot1.x,plot1.y, plot1.width, plot1.depth);

            return rectangle.intersects(rectangle1);
    }

    public boolean encompasses(Plot plot1){

        Rectangle rectangle= new Rectangle(x,y,width,depth);
        Rectangle rectangle1= new Rectangle(plot1.x,plot1.y, plot1.width, plot1.depth);

        return rectangle.contains(rectangle1);

    }


    /**
     * getX to get the value of X
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     * set X to set the value of X
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * getY to get the value of Y
     * @return
     */
    public int getY() {
        return y;
    }

    /**
     * setY to the get the value of Y
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * getWidth method to get the value of the width
     * @return
     */
    public int getWidth() {
        return width;
    }

    /**
     * setWidth to set the value of the width
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * getDepth to access to value of the depth
     * @return
     */
    public int getDepth(){
        return depth;
    }

    /**
     * setDepth to set the value of depth
     * @param depth
     */
    public void setDepth(int depth){
        this.depth=depth;
    }

    public String toString(){
        return "Upper left: ("+ x+","+y+ "); Width: "+ width+" Depth: "+ depth;
    }
}
