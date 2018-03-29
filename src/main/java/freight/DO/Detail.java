package freight.DO;

/**
 * <p>创建时间: 2018/3/28</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
public class Detail {
    private String invoiceNo;
    private String description;
    private String amount;

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
