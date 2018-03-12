package com.github.wxiaoqi.learning.auth.mapper;

import com.github.wxiaoqi.learning.auth.entity.Client;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ClientMapper extends Mapper<Client> {

    List<String> selectAllowedClient(String serviceId);
}