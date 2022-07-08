package com.yi.service;

import com.yi.dao.SupplierMapper;
import com.yi.pojo.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierMapper supplierMapper;

    public void setSupplierMapper(SupplierMapper supplierMapper) {
        this.supplierMapper = supplierMapper;
    }

    public int insertSupplier(Supplier supplier) {
        return supplierMapper.insertSupplier(supplier);
    }

    public int deleteSupplierById(int id) {
        return supplierMapper.deleteSupplierById(id);
    }

    public int updateSupplier(Supplier supplier) {
        return supplierMapper.updateSupplier(supplier);
    }

    public List<Supplier> queryAllSupplier() {
        return supplierMapper.queryAllSupplier();
    }

    public Supplier querySupplierById(int id) {
        return supplierMapper.querySupplierById(id);
    }

    public List<Supplier> findByNameSupplierLike(String name) {
        return supplierMapper.findByNameSupplierLike(name);
    }

    public List<Supplier> findByNameAndByContactSupplierLike(String name, String contacts) {
        return supplierMapper.findByNameAndByContactSupplierLike(name,contacts);
    }
}
