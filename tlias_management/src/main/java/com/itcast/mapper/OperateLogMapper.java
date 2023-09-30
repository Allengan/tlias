package com.itcast.mapper;

import com.itcast.pojo.OperateLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * TODO 插入日志持久层
 *
 * @author Aaron.
 * @date 2023/9/30 17:02
 */
@Mapper
public interface OperateLogMapper {
    /**
     * 插入日志数据
     * @param log
     */
    void insert(OperateLog log);
}
