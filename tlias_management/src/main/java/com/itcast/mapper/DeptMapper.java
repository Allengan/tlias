package com.itcast.mapper;

import com.itcast.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * TODO 部门持久层
 *
 * @author Aaron.
 * @date 2023/9/23 20:00
 */
@Mapper
public interface DeptMapper {
    /**
     * 查询部门的所有信息
     * @return
     */
    List<Dept> selectAllDept();

    /**
     * 根据id删除部门
     * @param id
     */
    void deleteDeptById(@Param("id") Integer id);
    /**
     * 添加部门
     * @param dept
     */
    void insertDept(@Param("dept") Dept dept);

    /**
     * 根据id查询部门
     * @param id
     * @return
     */
    Dept selectById(@Param("id") Integer id);

    /**
     * 修改部门
     * @param dept
     */
    void updateDept(@Param("dept") Dept dept);
}
