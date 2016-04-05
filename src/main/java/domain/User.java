package domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

/**
 * Created by lily on 2016/4/3.
 */
public class User implements Serializable{
    private int uId;
    private String name;
    private String password;
    private String description;
    private String address;
    private String phone;
    private BigDecimal uReputation;
    private Set<Good> goods;

    public Set<Good> getGoods() {
        return goods;
    }

    public void setGoods(Set<Good> goods) {
        this.goods = goods;
    }

    public BigDecimal getuReputation() {
        return uReputation;
    }

    public void setuReputation(BigDecimal uReputation) {
        this.uReputation = uReputation;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getuId() {

        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



}
