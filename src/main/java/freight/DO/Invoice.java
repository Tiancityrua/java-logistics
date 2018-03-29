package freight.DO;

/**
 * <p>创建时间: 2018/1/16</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
public class Invoice {
    private String invoiceNo;
    private String date;
    private String terms;
    private String invoiceTo;
    private String billLaden;
    private String origin;
    private String dstn;
    private String nature;
    private String total;

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getInvoiceTo() {
        return invoiceTo;
    }

    public void setInvoiceTo(String invoiceTo) {
        this.invoiceTo = invoiceTo;
    }

    public String getBillLaden() {
        return billLaden;
    }

    public void setBillLaden(String billLaden) {
        this.billLaden = billLaden;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDstn() {
        return dstn;
    }

    public void setDstn(String dstn) {
        this.dstn = dstn;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
