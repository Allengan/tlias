package com.itcast.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * TODO 分页查询实体参数
 *
 * @author Aaron.
 * @date 2023/9/23 22:17
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageBean {
    private long total; //总的记录数
    private List<?> rows; //当前页数据列表
}
