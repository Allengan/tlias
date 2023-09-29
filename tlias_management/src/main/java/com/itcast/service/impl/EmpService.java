package com.itcast.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itcast.mapper.EmpMapper;
import com.itcast.pojo.Emp;
import com.itcast.pojo.PageBean;
import com.itcast.service.IDeptService;
import com.itcast.service.IEmpService;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * TODO 员工服务层
 *
 * @author Aaron.
 * @date 2023/9/23 22:08
 */
@Slf4j
@Service
public class EmpService implements IEmpService {
    @Resource
    private EmpMapper empMapper;


    /**
     * 原始方法分页查询员工信息
     * @param page
     * @param pageSize
     * @return
     */
/*    @Override
    public PageBean selectAllEmp(Integer page, Integer pageSize) {
        //获取总的记录数
        Long count = empMapper.selectcount();
        //获取分页查询结果
        int start = (page - 1) * pageSize;
       List<Emp> empList =  empMapper.selectList(start,pageSize);
       //封装PageBean对象
        PageBean pageBean = new PageBean(count, empList);
        return pageBean;
    }*/

    /**
     * 使用pagehelper分页查询员工信息
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public PageBean selectAllEmp(Integer page, Integer pageSize) {
        //设置分页参数
        PageHelper.startPage(page,pageSize);
        //执行分页查询
        List<Emp> empList = empMapper.selectAllEmp();
        //获取分页查询结果
        Page<Emp> p = (Page<Emp>) empList;
        //封装结果
        PageBean pageBean = new PageBean(p.getTotal(), p.getResult());

        return pageBean;
    }

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
    @Override
    public PageBean fuzzyQuery(String name, Integer gender, @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin
            ,@DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end, Integer page, Integer pageSize) {
        //设置分页参数
        PageHelper.startPage(page,pageSize);
        //执行分页查询
        List<Emp> emps = empMapper.fuzzyQuery(name,gender,begin,end);
        Page<Emp> p = (Page<Emp>) emps;
        //封装PageBean
        PageBean pageBean = new PageBean(p.getTotal(), p.getResult());

        return pageBean;
    }

    /**
     * 根据id删除员工
     * @param ids
     */
    @Override
    public void deleteEmpByIds(Integer[] ids) {
        log.info("根据id删除员工");
        empMapper.deleteEmpById(ids);

    }

    /**
     * 添加员工
     * @param emp
     */
    @Override
    public void insertEmp(Emp emp) {
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.insertEmp(emp);
    }

    /**
     * 根据id查询员工
     * @param id
     * @return
     */
    @Override
    public Emp selectEmpById(Integer id) {
       Emp emp = empMapper.selectEmpById(id);
        return emp;
    }

    /**
     * 修改员工信息
     * @param emp
     */
    @Override
    public void updateEmp(Emp emp) {
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.updateEmp(emp);
    }

    /**
     * 用户登录
     * @param emp
     * @return
     */
    @Override
    public Emp login(Emp emp) {
      Emp loginEmp =  empMapper.login(emp);
        return loginEmp;
    }

}
