package com.itdupan.mapper;

import com.itdupan.pojo.Info;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;

public interface InfoMapper extends Mapper<Info> {

    @Insert("insert into hfr_info(info_username, info_visittime, info_ip, info_classandmethod, info_describe) values (#{infoUsername}, #{infoVisittime}, #{infoIp}, #{infoClassandmethod}, #{infoDescribe})")
    void addInfo(@Param("infoUsername") String infoUsername, @Param("infoVisittime") Date infoVisittime, @Param("infoIp") String infoIp, @Param("infoClassandmethod") String infoClassandmethod, @Param("infoDescribe") String infoDescribe);
}
