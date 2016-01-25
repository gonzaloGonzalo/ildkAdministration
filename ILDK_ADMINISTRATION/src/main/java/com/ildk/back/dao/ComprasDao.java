/********************************************************
 * FileName - Compras.java
 *
 *
 * $Author: garag $
 * $Revision:  $
 * $Change:  $
 * $Date: $
 ********************************************************/

package com.ildk.back.dao;

import java.util.List;

import com.ildk.back.model.Compra;

/**
 * Created by garag on 02/25/15.
 */
public interface ComprasDao extends Dao {

    public List getCompras();
    public Compra getCompra(int compraId);
    public void saveCompra(Compra compra);
    public void removeCompra(int compraId);
}
