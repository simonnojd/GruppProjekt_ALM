package com.example.gruppprojekt_alm.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

    private String id;
    private String name;
    private String birthday;
    private String adress;
    private String mail;

}
