package com.team_lightyear.WellCoffeeInventoryAPI.data;

import com.team_lightyear.WellCoffeeInventoryAPI.models.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository extends CrudRepository<Account, Integer> {
}
