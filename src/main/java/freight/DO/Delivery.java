package freight.DO;

/**
 * <p>创建时间: 2018/1/19</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
public class Delivery {
    private String hawb;
    private String date;
    private String pieces;
    private String weight;
    private String deliveryAdd;

    public String getHawb() {
        return hawb;
    }

    public void setHawb(String hawb) {
        this.hawb = hawb;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public String getDeliveryAdd() {
        return deliveryAdd;
    }

    public void setDeliveryAdd(String deliveryAdd) {
        this.deliveryAdd = deliveryAdd;
    }
}
