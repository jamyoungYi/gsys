package com.yi.service;

import com.yi.dao.SupplierOrderMapper;
import com.yi.pojo.SupplierOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierOrderServiceImpl implements SupplierOrderService {
    @Autowired
    private SupplierOrderMapper supplierOrderMapper;

    public void setSupplierOrderMapper(SupplierOrderMapper supplierOrderMapper) {
        this.supplierOrderMapper = supplierOrderMapper;
    }
    public int addSupplierOrder(SupplierOrder supplierorder) {
        return supplierOrderMapper.addSupplierOrder(supplierorder);
    }
}
