package mypack;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class CpuBox implements Serializable {

    /** nullable persistent field */
    private String type;

    /** nullable persistent field */
    private mypack.Computer computer;

    /** persistent field */
    private mypack.Vendor vendor;

    /** persistent field */
    private mypack.GraphicsCard graphicsCard;

    /** full constructor */
    public CpuBox(String type, mypack.Computer computer, mypack.Vendor vendor, mypack.GraphicsCard graphicsCard) {
        this.type = type;
        this.computer = computer;
        this.vendor = vendor;
        this.graphicsCard = graphicsCard;
    }

    /** default constructor */
    public CpuBox() {
    }

    /** minimal constructor */
    public CpuBox(mypack.Vendor vendor, mypack.GraphicsCard graphicsCard) {
        this.vendor = vendor;
        this.graphicsCard = graphicsCard;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public mypack.Computer getComputer() {
        return this.computer;
    }

    public void setComputer(mypack.Computer computer) {
        this.computer = computer;
    }

    public mypack.Vendor getVendor() {
        return this.vendor;
    }

    public void setVendor(mypack.Vendor vendor) {
        this.vendor = vendor;
    }

    public mypack.GraphicsCard getGraphicsCard() {
        return this.graphicsCard;
    }

    public void setGraphicsCard(mypack.GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .toString();
    }

}
