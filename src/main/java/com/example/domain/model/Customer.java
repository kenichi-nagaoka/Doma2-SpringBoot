package com.example.domain.model;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

@Entity
@Table(name = "customers")
public class Customer {

	@Id
	public Integer id;

	public String name;
}
