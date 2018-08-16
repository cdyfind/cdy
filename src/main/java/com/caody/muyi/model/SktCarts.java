package com.caody.muyi.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 购物车表
 * </p>
 *
 * @author caody
 * @since 2018-06-16
 */
@TableName("skt_carts")
public class SktCarts extends Model<SktCarts> {

    private static final long serialVersionUID = 1L;

    /**
     * 自增ID
     */
    @TableId(value = "cartId", type = IdType.AUTO)
    private Integer cartId;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 是否选中
     */
    private Integer isCheck;
    /**
     * 商品ID
     */
    private Integer goodsId;
    /**
     * 商品-规格ID
     */
    private String goodsSpecId;
    /**
     * 商品数量
     */
    private Integer cartNum;
    /**
     * 是否是直接购买 0否 1是
     */
    private Integer isDirect;


    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Integer isCheck) {
        this.isCheck = isCheck;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsSpecId() {
        return goodsSpecId;
    }

    public void setGoodsSpecId(String goodsSpecId) {
        this.goodsSpecId = goodsSpecId;
    }

    public Integer getCartNum() {
        return cartNum;
    }

    public void setCartNum(Integer cartNum) {
        this.cartNum = cartNum;
    }

    public Integer getIsDirect() {
        return isDirect;
    }

    public void setIsDirect(Integer isDirect) {
        this.isDirect = isDirect;
    }

    @Override
    protected Serializable pkVal() {
        return this.cartId;
    }

    @Override
    public String toString() {
        return "SktCarts{" +
        "cartId=" + cartId +
        ", userId=" + userId +
        ", isCheck=" + isCheck +
        ", goodsId=" + goodsId +
        ", goodsSpecId=" + goodsSpecId +
        ", cartNum=" + cartNum +
        ", isDirect=" + isDirect +
        "}";
    }
}
