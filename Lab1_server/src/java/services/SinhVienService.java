/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package services;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import models.SinhVien;

/**
 *
 * @author Mirai
 */
@WebService(serviceName = "SinhVienService")
public class SinhVienService {

    /**
     * This is a sample web service operation
     */
    private EntityManager em;
    
    public SinhVienService()
    {
        em = Persistence.createEntityManagerFactory("Lab1_serverPU").createEntityManager();
    }
    
    @WebMethod(operationName = "findAll")
    public List<SinhVien> findAll() {
        return em.createQuery("select sv from SinhVien sv").getResultList();
    }
    
    @WebMethod(operationName = "addNew")
    public void addNew(SinhVien sv) {
        em.getTransaction().begin();
        em.persist(sv);
        em.getTransaction().commit();
    }
    
    @WebMethod(operationName = "delete")
    public void delete(String roll) {
        SinhVien sv = em.find(SinhVien.class, roll);
        em.getTransaction().begin();
        em.remove(sv);
        em.getTransaction().commit();
    }
    
    @WebMethod(operationName = "update")
    public void update(SinhVien sv) {
        em.getTransaction().begin();
        em.merge(sv);
        em.getTransaction().commit();
    }
    
    @WebMethod(operationName = "findByRollNo")
    public SinhVien findByRollNo(String roll) {
        return em.find(SinhVien.class, roll);
    }
}
