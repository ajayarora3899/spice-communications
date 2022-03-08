package com.spice.communication.spicecommunications.dao;

import com.spice.communication.spicecommunications.dao.model.CartDetails;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartDetailsDao extends CrudRepository<CartDetails,Integer> {

    @Query("select cd from CartDetails cd where  cd.cart.cartId=?1" )
    List<CartDetails> findAllDetailsByCartId(Integer cartId);
}
