package com.github.lazyf1sh.persistence.jpa.identity;

import com.github.lazyf1sh.sandbox.persistence.jpa.identity.IdentityExampleEntity;
import com.github.lazyf1sh.sandbox.persistence.util.JpaEntityManagerFactory;
import org.junit.Assert;
import org.junit.Test;

import javax.persistence.EntityManager;

public class GenerationTypeIdentity
{
    @Test
    public void generationTypeIdentity()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();
        entityManager.getTransaction().begin();

        IdentityExampleEntity identityExampleEntity = new IdentityExampleEntity();

        int id = identityExampleEntity.getId();
        Assert.assertEquals(0, id);
        entityManager.persist(identityExampleEntity);
        Assert.assertEquals(++id, identityExampleEntity.getId());

        entityManager.getTransaction().commit();
    }
}
