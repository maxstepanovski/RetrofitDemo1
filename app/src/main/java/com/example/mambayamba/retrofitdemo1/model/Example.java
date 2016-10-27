package com.example.mambayamba.retrofitdemo1.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by mambayamba on 27.10.2016.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor(suppressConstructorProperties = true)
public class Example {
    public List<Item> items = new ArrayList<Item>();
    public Boolean hasMore;
    public Integer quotaMax;
    public Integer quotaRemaining;
}
