package com.yi.dao;

import com.yi.pojo.Supplier;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupplierMapper {
    //增加供应商
    public int insertSupplier(Supplier supplier);
    //删除供应商
    public int deleteSupplierById(int id);
    //更新供应商
    public int updateSupplier(Supplier supplier);
    //获取所有供应商
    public List<Supplier> queryAllSupplier();
    //根据客户ID查询供应商信息
    public Supplier querySupplierById(int id);
    //根据供应商名模糊查询供应商
    public List<Supplier> findByNameSupplierLike(String name);
    //根据供应商名和联系人模糊查询
    public List<Supplier> findByNameAndByContactSupplierLike(@Param("s_name") String name, @Param("contacts") String contacts);
}
