package com.neusoft.service;

import com.neusoft.po.Credit;

import java.util.List;


public interface CreditService {
    //get total credit by userId
    public Integer getTotalCreditByUserId(String userId);
    public List<Credit> getAvailableCreditByUserId(String userId);

    //get credit by userId
    public List<Credit> getCreditByUserId(String userId);

    //get credit by userId and channelType
    public List<Credit> getCreditByUserIdAndChannelType(String userId, int channelType);

    public int insertCredit(Credit credit);
}

