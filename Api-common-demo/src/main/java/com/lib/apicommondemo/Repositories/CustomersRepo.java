package com.lib.apicommondemo.Repositories;

import com.lib.apicommondemo.entities.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomersRepo extends JpaRepository<Customers, String> {
}