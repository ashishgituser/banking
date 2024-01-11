package com.microservices.accounts.service;

import com.microservices.accounts.dto.CustomerDto;

public interface IAccountService {

    /**
     * 
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);
    public CustomerDto fetchAccount(String mobileNumber);
    public boolean updateAccount(CustomerDto customerDto);
    public boolean deleteAccount(String mobileNumber);
}
