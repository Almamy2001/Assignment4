public class Property {

    //To hold the property name
    private String propertyName;
    private String city; //To hold the city where the house is located
    private double rentAmount; //To hold the price of the amount
    private String owner; //To hold the owner of the house name
    private Plot plot; //To hold the plot to be occupied by the property

    /**
     * No arg constructor to initialize the fields of the class
     */
    public Property() {
        propertyName = "";
        city = "";
        rentAmount = 0.0;
        owner = "";
        plot = new Plot(0,0,1,1);
    }

    /**
     * A copy constructor
     *
     * @param p
     */
    public Property(Property p) {
        propertyName = p.propertyName;
        city = p.city;
        rentAmount = p.rentAmount;
        owner = p.owner;
        plot = p.plot;
    }

    /**
     * A public constructor to set all the fields excepts plot
     *
     * @param propertyName
     * @param city
     * @param rentAmount
     * @param owner
     */
    public Property(String propertyName, String city, double rentAmount, String owner) {

        this.rentAmount = rentAmount;
        this.propertyName = propertyName;
        this.city = city;
        this.owner = owner;
        //Should I add the field plot here?
    }

    /**
     * to initialize all the fields of the class
     *
     * @param propertyName
     * @param city
     * @param rentAmount
     * @param owner
     * @param x
     * @param y
     * @param width
     * @param depth
     */
    public Property(String propertyName, String city, double rentAmount, String owner,
                    int x, int y, int width, int depth) {

        this.rentAmount = rentAmount;
        this.propertyName = propertyName;
        this.city = city;
        this.owner = owner;
        plot = new Plot(x, y, width, depth);
    }

    /**
     * to access the propertyName field
     *
     * @return
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * to set the propertyName field
     *
     * @param propertyName
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * To access the city field
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     * To set the city field
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * To access the rentAmount field
     *
     * @return
     */
    public double getRentAmount() {
        return rentAmount;
    }

    /**
     * To set the rentAmount field
     *
     * @param rentAmount
     */
    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    /**
     * To access the owner field
     *
     * @return
     */
    public String getOwner() {
        return owner;
    }

    /**
     * To set the owner field
     *
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

     public Plot getPlot(){
        return plot;
     }

     //is This right??
    public void setPlot(int x, int y, int width, int depth) {
        plot = new Plot(x, y, width, depth);
    }

    public String toString() {

        return "\nProperty Name: " + propertyName + "\n Located in " + city +
                "\n Belonging to: " + owner + "\n Rent Amount: " + rentAmount + " ";
    }
}
