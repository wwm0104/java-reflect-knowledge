package reflect.po;

import reflect.customize.annotation.BusinessNoAnnotation;

import java.math.BigDecimal;
import java.util.List;

public class Book {
    public Book(){

    }
    public Book(String name,String address){
        this.name = name;
        this.address = address;
    }
    public Book(String name,BigDecimal amount,String address){
        this.address = address;
        this.name = name;
        this.amount = amount;
    }
    @BusinessNoAnnotation(businessNo = "test")
    private String name;

    public  BigDecimal amount;

    String  address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Page> getPageList() {
        return pageList;
    }

    public void setPageList(List<Page> pageList) {
        this.pageList = pageList;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    List<Page> pageList;

    Page page;


}
