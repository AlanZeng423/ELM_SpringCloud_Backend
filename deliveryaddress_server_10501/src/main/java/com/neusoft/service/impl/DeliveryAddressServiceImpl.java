package com.neusoft.service.impl;

import com.neusoft.mapper.DeliveryAddressMapper;
import com.neusoft.po.DeliveryAddress;
import com.neusoft.service.DeliveryAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author：ljz
 * @Date：2022/9/12 11:04
 * @Description:
 */
@Service
public class DeliveryAddressServiceImpl implements DeliveryAddressService {//注意这里要有service的标签才能自动装盘
    @Autowired
    private DeliveryAddressMapper deliveryAddressMapper;

    @Override
    public List<DeliveryAddress> listDeliveryAddressByUserId(String userId) {
        try {
            return deliveryAddressMapper.listDeliveryAddressByUserId(userId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DeliveryAddress getDeliveryAddressById(Integer daId) {
        return deliveryAddressMapper.getDeliveryAddressById(daId);
    }

    @Override
    public int saveDeliveryAddress(DeliveryAddress deliveryAddress) {
        return deliveryAddressMapper.saveDeliveryAddress(deliveryAddress);
    }

    @Override
    public int updateDeliveryAddress(DeliveryAddress deliveryAddress) {
        return deliveryAddressMapper.updateDeliveryAddress(deliveryAddress);
    }

    @Override
    public int removeDeliveryAddress(Integer daId) {
        try {
            return deliveryAddressMapper.removeDeliveryAddress(daId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
