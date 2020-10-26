
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {

    Property p1,p2,p3;
    ManagementCompany managementCompany;

    @Before
    public void setUp() throws Exception {
        //student create a management company

        p1=new Property("Almamy", "Silver Spring", 500,"Aguibou", 2,5,7,7);


        managementCompany= new ManagementCompany();
      //  student add three properties, with plots, to mgmt co
        managementCompany.addProperty(p1);
    }

    @After
    public void tearDown() {

        p1=p2=p3=null;
        managementCompany=null;
    }

    @Test
    public void testGetMAX_PROPERTY() {
        assertEquals(managementCompany.getMAX_PROPERTY(), 5);
    }

    @Test
    public void testAddPropertyDefaultPlot() {

        p3= new Property("Gaoussou", "Burstonville", 7000, "Toure", 0,0,2,3 );
        p2= new Property("Hadja", "Hafia", 2000, "Aminata", 2,5,5,5);

        assertEquals(managementCompany.addProperty(p3),1,0);
        assertEquals(managementCompany.addProperty(p2), -4,0);
    }


    //To check if maxRentProp method return the index of the highest rent.
    @Test
    public void testMaxRentProp() {
        //student should test if maxRentProp contains the maximum rent of properties

        assertEquals(managementCompany.maxRentPropertyIndex(), 0, 0);

    }

    //To check the total rent returned is correct
    @Test
    public void testTotalRent() {
        //student should test if totalRent returns the total rent of properties

        assertEquals(managementCompany.totalRent(),500,0);
    }

}