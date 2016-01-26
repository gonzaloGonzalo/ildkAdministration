package com.ildk.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.ildk.model.Compra;

public class CompraDaoImpl implements CompraDao{

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;
	
	public Compra compraPorId(int id) throws Exception{
		session = sessionFactory.openSession();
		Compra compra = (Compra) session.load(Compra.class,
				id);
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		
		if(compra.getIdcompras()==0){
			throw new Exception();
		}
		
		return compra;
	}

	public void guardarCompra(Compra compra) throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(compra);
		tx.commit();
		session.close();
		
	}

	public void eliminarCompra(int ssn) throws Exception {
		session = sessionFactory.openSession();
		Object o = session.load(Compra.class, ssn);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
	}

	public List<Compra> listarCompras() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Compra> compraList = session.createCriteria(Compra.class)
				.list();
		tx.commit();
		session.close();
		return compraList;
	}

	public Compra comprasPorSsn(int ssn) {
		session = sessionFactory.openSession();
		Compra compra = (Compra) session.load(Compra.class,
				new Long(ssn));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return compra;
	}

}
