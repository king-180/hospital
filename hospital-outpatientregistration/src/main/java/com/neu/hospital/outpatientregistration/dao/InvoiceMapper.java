package com.neu.hospital.outpatientregistration.dao;

import com.neu.hospital.outpatientregistration.entity.Invoice;
import java.util.List;

/**
 * 
 * 
 * @author wang
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 20:42:16
 */
public interface InvoiceMapper  {
    List<Invoice> selectAll(Invoice invoice);
}
