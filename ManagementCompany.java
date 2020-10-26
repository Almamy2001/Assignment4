]]k/**
 * @author Almamy Aguibou Bah
 */
public class ManagementCompany {

    private final int MAX_PROPERTY = 5;
    private double mgmFeePer;
    private String name;
    private Property[] properties = new Property[MAX_PROPERTY];
    private String taxID;
    private final int MGMT_WIDTH = 10;
    private final int MGMT_DEPTH = 10;
    private Plot plot = new Plot();

    public ManagementCompany(){
        name = "";
        taxID = "";
        mgmFeePer = 0;
        plot.setX(0);
        plot.setY(0);
        plot.setWidth(MGMT_WIDTH);
        plot.setDepth(MGMT_DEPTH);

        for(int i=0; i<MAX_PROPERTY;i++){
        properties[i] = new Property();}
    }

    public ManagementCompany(String name, String taxID, double mgmFee){
        this.name = name;
        this.taxID = taxID;
        this.mgmFeePer = mgmFee;
        plot.setX(0);
        plot.setY(0);
        plot.setWidth(MGMT_WIDTH);
        plot.setDepth(MGMT_DEPTH);

        for(int i=0; i<MAX_PROPERTY;i++){
            properties[i] = new Property();}

    }

    public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth){
        this.name = name;
        this.taxID = taxID;
        this.mgmFeePer = mgmFee;
        plot.setX(x);
        plot.setY(y);
        plot.setWidth(width);
        plot.setDepth(depth);
        for(int i=0; i<MAX_PROPERTY;i++){
            properties[i] = new Property();}
    }

    public ManagementCompany(ManagementCompany otherCompany){
        name = otherCompany.name;
        taxID = otherCompany.taxID;
        mgmFeePer = otherCompany.mgmFeePer;
        plot.setX(otherCompany.plot.getX());
        plot.setY(otherCompany.plot.getY());
        plot.setWidth(otherCompany.plot.getWidth());
        plot.setDepth(otherCompany.plot.getDepth());
        for(int i=0; i<MAX_PROPERTY;i++){
            properties[i] = new Property();}

    }

    public int addProperty(String name, String city, double rent, String owner){
        Property property = new Property(name, city, rent, owner, 0, 0, 1, 1);
        return addProperty(property);
    }

    public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth){
        Property property = new Property(name, city, rent, owner, x , y, width, depth);
        return addProperty(property);

    }

    public int addProperty(Property property){
        for (int x = 0; x < MAX_PROPERTY; x++) {
            if (properties[x].getPropertyName().equals("")) {
                if (property.getPropertyName().equals("")) {
                    return -1;
                } else if (property.equals(new Property())) {
                    return -2;
                }
                for (int j = 0; j < MAX_PROPERTY; j++) {
                        if (properties[j].getPlot().overlaps(property.getPlot())) {
                            return -4;
                        }
                }
                properties[x] = property;
                return x;
            }
        }
         if (!plot.encompasses(property.getPlot())) {
            return -3;
        }
        return -1;
    }





    //Accessor of MAX_PROPERTY
    public int getMAX_PROPERTY() {
        return MAX_PROPERTY;
    }

    //To return the total cost of the rent
    public double totalRent(){
        double total=0;

        for (int i=0; i<MAX_PROPERTY; i++){
            total+=properties[i].getRentAmount();
        }
        return total;
    }

    //To display information of a specific property array
    public String displayPropertyAtIndex(int i){
        return properties[i].toString();
    }


    //To find the highest rent
    public double maxRentProp(){
        double maxRent=properties[0].getRentAmount();

        for (int i=1; i<properties.length; i++){
            if(maxRent<properties[i].getRentAmount()){
                maxRent=properties[i].getRentAmount();
            }
        }
        return maxRent;
    }

    //To return the index of the highest rentAmount property
    public int maxRentPropertyIndex(){
        double maxRent=properties[0].getRentAmount();

        int maxRentIndex=0;

        for (int i=0; i<properties.length; i++){
            if(properties[i].getRentAmount()>maxRent){
                maxRentIndex=i;
            }
        }
        return maxRentIndex;
    }

    public void setMgmFeePer(double mgmFeePer) {
        this.mgmFeePer = mgmFeePer;
    }
    public double getMgmFeePer() {
        return mgmFeePer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public String getTaxID() {
        return taxID;
    }

    public void setPlot(Plot plot) {
        this.plot = plot;
    }

    public Plot getPlot() {
        return plot;
    }

    public String toString(){

        String result="List of the properties for Alliance, taxID: " + taxID +
        "\n____________________________________________\n";
        for(int i = 0; i < MAX_PROPERTY; i++) {
            result += properties[i].toString();
        }
        result += "\n____________________________________________\n" +
                "\n total management Fee: " + (mgmFeePer* totalRent())/100.0;
        return result;
    }

}
