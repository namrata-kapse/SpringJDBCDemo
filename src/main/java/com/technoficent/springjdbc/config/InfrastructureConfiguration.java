package com.technoficent.springjdbc.config;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public interface InfrastructureConfiguration {

	JdbcTemplate jdbcTemplate();

	DataSource datasource();

}
