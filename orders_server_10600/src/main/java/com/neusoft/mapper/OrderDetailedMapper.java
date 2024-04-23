package com.neusoft.mapper;

import com.neusoft.po.OrderDetailed;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface OrderDetailedMapper {
    public void saveOrderDetailedBatch(List<OrderDetailed> list);

    public List<OrderDetailed> listOrderDetailedByOrderId(Integer orderOd);
}
