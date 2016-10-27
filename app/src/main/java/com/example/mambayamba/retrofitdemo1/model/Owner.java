package com.example.mambayamba.retrofitdemo1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by mambayamba on 27.10.2016.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor(suppressConstructorProperties = true)
public class Owner {
    public Integer reputation;
    public Integer userId;
    public String userType;
    public Integer acceptRate;
    public String profileImage;
    public String displayName;
    public String link;
}
