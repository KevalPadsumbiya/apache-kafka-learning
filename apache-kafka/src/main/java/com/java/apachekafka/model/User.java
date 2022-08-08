package com.java.apachekafka.model;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Data
@NoArgsConstructor
@ToString
public class User {
    int id;
    String firstName;
    String lastName;
}
