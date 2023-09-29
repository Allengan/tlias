package com.itcast.service;

import com.itcast.pojo.Emp;
import com.itcast.pojo.PageBean;

import java.time.LocalDate;

/**
 * TODO 员工服务层接口
 *
 * @author Aaron.
 * @date 2023/9/23 22:08
 */
public interface IEmpService {


    /**
      * 原始方法分页查询员工信息
      * @param page
      * @param pageSize
      * @return
      */
     //PageBean selectAllEmp(Integer page,Integer pageSize);
    /**
     * 使用pagehelper分页查询员工信息
     * @param page
     * @param pageSize
     * @return
     */
    PageBean selectAllEmp(Integer page, Integer pageSize);

    /**
     * 模糊查询
     * @param name
     * @param gender
     * @param begin
     * @param end
     * @param page
     * @param pageSize
     * @return
     */
    PageBean fuzzyQuery(String name, Integer gender, LocalDate begin, LocalDate end, Integer page, Integer pageSize);

    /**
     * 根据id删除员工
     * @param ids
     */
    void deleteEmpByIds(Integer[] ids);

    /**
     * 添加员工
     * @param emp
     */
    void insertEmp(Emp emp);

    /**
     * 根据id查询员工
     * @param id
     * @return
     */
    Emp selectEmpById(Integer id);

    /**
     * 修改员工信息
     * @param emp
     */
    void updateEmp(Emp emp);

    /**
     * 用户登录
     * @param emp
     * @return
     */
    Emp login(Emp emp);
}
