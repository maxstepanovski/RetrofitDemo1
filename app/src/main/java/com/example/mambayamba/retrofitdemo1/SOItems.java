package com.example.mambayamba.retrofitdemo1;

import com.example.mambayamba.retrofitdemo1.model.Item;

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
public class SOItems {
    List<Item> items;
}
