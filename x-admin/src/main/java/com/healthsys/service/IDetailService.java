package com.healthsys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.healthsys.entity.Detail;

import java.util.List;


public interface IDetailService extends IService<Detail> {
    List<Detail> getDetailInfo(String sportName);

    void updateDetail(Detail detail);

    Detail getDetailById(Integer id);

    void deletDetailById(Integer id);

    boolean addDetail(Detail detail);
}



