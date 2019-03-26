package reflect.po;

import reflect.customize.annotation.BusinessNoAnnotation;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 测试po
 */
@BusinessNoAnnotation(desc = "测试")
public class BuyerPayment {
    @BusinessNoAnnotation(businessNo = "11221121")
    private  String  businessNo;

    private  Long id;

    private BigDecimal amount;

    private int status;

    private Date createDt;

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }
}
