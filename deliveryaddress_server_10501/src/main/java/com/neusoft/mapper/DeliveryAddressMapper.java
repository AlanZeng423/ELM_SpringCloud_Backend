package com.neusoft.mapper;



import com.neusoft.po.DeliveryAddress;
import org.apache.ibatis.annotations.*;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface DeliveryAddressMapper {
    @Select("select * from deliveryaddress where userId=#{userId} and hasDeleted=0 order by daId")
    public List<DeliveryAddress> listDeliveryAddressByUserId(String userId) throws SQLException;

    @Select("select * from deliveryaddress where daId=#{daId}")
    public DeliveryAddress getDeliveryAddressById(Integer daId);

    @Insert("insert into deliveryaddress values(null,#{contactName},#{contactSex},#{contactTel},#{address},#{userId},0)")
    public int saveDeliveryAddress(DeliveryAddress deliveryAddress);

    @Update("update deliveryaddress set contactName=#{contactName},contactSex=#{contactSex},contactTel=#{contactTel},address=#{address} where daId=#{daId}")
    public int updateDeliveryAddress(DeliveryAddress deliveryAddress);

    @Update("update deliveryaddress set hasDeleted = 1 where daId=#{daid}")
    public int removeDeliveryAddress(Integer daId) throws SQLException;
}