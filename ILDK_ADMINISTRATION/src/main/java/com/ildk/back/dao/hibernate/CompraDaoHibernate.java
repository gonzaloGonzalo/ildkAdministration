/********************************************************
 * FileName - CompraDaoHibernate.java
 *
 *
 * $Author: garag $
 * $Revision:  $
 * $Change:  $
 * $Date: $
 ********************************************************/

package com.ildk.back.dao.hibernate;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ildk.back.dao.ComprasDao;
import com.ildk.back.model.Compra;


/**
 * This class interacts with Spring and Hibernate to save and
 * retrieve User objects.
 *
 * @author garag
 */
@Repository(value = "ComprasDao")
public class CompraDaoHibernate implements ComprasDao {
 
	HibernateTemplate hibernateTemplate;
    
    Log logger = LogFactory.getLog(CompraDaoHibernate.class);
    
	   @Autowired
    public CompraDaoHibernate(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }
    
	public List getCompras() {
		return hibernateTemplate.find("from Compra");
	}
	public Compra getCompra(int compraId) {
		Compra compra = (Compra) hibernateTemplate.get(Compra.class, compraId);
        if (compra == null) {
            throw new ObjectRetrievalFailureException(Compra.class, compraId);
        }
        return compra;
	}
	public void saveCompra(Compra compra) {
        hibernateTemplate.saveOrUpdate(compra);

        if (logger.isDebugEnabled()) {
            logger.debug("userId set to: " + compra.getId());
        }
	}
	
	public void removeCompra(int compraId) {
        hibernateTemplate.delete(getCompra(compraId));	
	}
}
