package freight.service.bill;


import java.util.Map;

/**
 * <p>创建时间: 2018/1/22</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
public interface se_bill_service {
    Map se_ha(Map map);
    Map se_hahis_shipper();
    Map se_hahis_consignee();
    Map se_ma(Map map);
    Map se_mahis_shipper();
    Map se_mahis_consignee();
    Map se_ma_place(Map map);
}
