package com.thien.CassandraApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table
@AllArgsConstructor
public class Student {

    @PrimaryKey
    Integer id;
    String name;
    String address;
    Integer age;
}
