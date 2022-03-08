package com.spice.communication.spicecommunications.dao;

import com.spice.communication.spicecommunications.dao.model.UserCart;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCartDao extends CrudRepository<UserCart,Integer>{

    @Query("select uc from UserCart uc where uc.cartId=?1")
    UserCart fetchByCartId(Integer cartId);

    @Query("select uc from UserCart uc where uc.user.userId=?1")
    UserCart fetchByUserId(Integer userId);
}
