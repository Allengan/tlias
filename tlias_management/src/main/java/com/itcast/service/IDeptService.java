package com.itcast.service;

import com.itcast.pojo.Dept;

import java.util.List;

/**
 * TODO 部门服务层接口
 *
 * @author Aaron.
 * @date 2023/9/23 20:00
 */
public interface IDeptService {
    /**
     * 查询部门的所有信息
     * @return
     */
    List<Dept> selectAllDept();

    /**
     * 根据id删除部门
     * @param id
     */
    void deleteDeptById(Integer id);

    /**
     * 添加部门
     * @param dept
     */
    void insertDept(Dept dept);

    /**
     * 根据id查询部门
     * @param id
     * @return
     */
    Dept selectById(Integer id);

    /**
     * 修改部门
     * @param dept
     */
    void updateDept(Dept dept);
}
