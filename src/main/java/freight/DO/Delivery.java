package freight.DO;

/**
 * <p>创建时间: 2018/1/19</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
public class Delivery {
    private String date;
    private String hawb;
    private String pieces;
    private String weight;
    private String address;
    private String name;
    private String signed;
    private String dated;
    private String type;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHawb() {
        return hawb;
    }

    public void setHawb(String hawb) {
        this.hawb = hawb;
    }

    public String getPieces() {
        return pieces;
    }

    public void setPieces(String pieces) {
        this.pieces = pieces;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSigned() {
        return signed;
    }

    public void setSigned(String signed) {
        this.signed = signed;
    }

    public String getDated() {
        return dated;
    }

    public void setDated(String dated) {
        this.dated = dated;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
