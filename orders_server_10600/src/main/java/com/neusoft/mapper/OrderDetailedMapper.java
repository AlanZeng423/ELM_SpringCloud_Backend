package com.neusoft.mapper;

import com.neusoft.po.OrderDetailed;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author：ljz
 * @Date：2022/9/12 13:10
 * @Description:
 */
@Mapper
public interface OrderDetailedMapper {
    public void saveOrderDetailedBatch(List<OrderDetailed> list);

    public List<OrderDetailed> listOrderDetailedByOrderId(Integer orderOd);
}
