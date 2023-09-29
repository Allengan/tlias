package com.itcast.mapper;

import com.itcast.pojo.Emp;
import com.itcast.pojo.PageBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;

/**
 * TODO 员工持久层
 *
 * @author Aaron.
 * @date 2023/9/23 22:08
 */
@Mapper
public interface EmpMapper {

    /**
     * 查询总的记录数
     * @return
     */
    //Long selectcount();

    /**
     * 查询每页的员工信息
     * @param start
     * @param pageSize
     * @return
     */
    //List<Emp> selectList(int start, Integer pageSize);

    /**
     *  使用pagehelper分页查询员工信息
     * @return
     */
    List<Emp> selectAllEmp();

    /**
     * 模糊查询
     *
     * @param name
     * @param gender
     * @param begin
     * @param end
     * @return
     */
    List<Emp> fuzzyQuery(@Param("name") String name, @Param("gender") Integer gender, @Param("begin") LocalDate begin, @Param("end") LocalDate end);

    /**
     * 根据id删除员工
     * @param ids
     */
    void deleteEmpById(@Param("ids")Integer[] ids);

    /**
     * 添加员工
     * @param emp
     */
    void insertEmp(@Param("emp") Emp emp);

    /**
     * 根据id查询员工
     * @param id
     * @return
     */
    Emp selectEmpById(@Param("id") Integer id);

    /**
     * 修改员工信息
     * @param emp
     */
    void updateEmp(@Param("emp") Emp emp);

    /**
     * 登录用户
     * @param emp
     * @return
     */
    Emp login(@Param("emp") Emp emp);

    /**
     * 根据deptId删除员工
     * @param deptId
     */
    void deleteEmpByDeptId(@Param("deptId") Integer deptId);
}
