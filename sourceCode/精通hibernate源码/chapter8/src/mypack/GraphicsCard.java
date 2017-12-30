package mypack;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class GraphicsCard implements Serializable {

    /** nullable persistent field */
    private String type;

    /** nullable persistent field */
    private mypack.CpuBox cpuBox;

    /** full constructor */
    public GraphicsCard(String type, mypack.CpuBox cpuBox) {
        this.type = type;
        this.cpuBox = cpuBox;
    }

    /** default constructor */
    public GraphicsCard() {
    }


    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public mypack.CpuBox getCpuBox() {
        return this.cpuBox;
    }

    public void setCpuBox(mypack.CpuBox cpuBox) {
        this.cpuBox = cpuBox;
    }
    public String toString() {
        return new ToStringBuilder(this)
            .toString();
    }

}
