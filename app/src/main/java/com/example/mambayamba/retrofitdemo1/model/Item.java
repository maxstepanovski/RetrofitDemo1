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
public class Item {
    public List<String> tags = new ArrayList<String>();
    public Owner owner;
    public Boolean isAnswered;
    public Integer viewCount;
    public Integer answerCount;
    public Integer score;
    public Integer lastActivityDate;
    public Integer creationDate;
    public Integer questionId;
    public String link;
    public String title;
    public Integer lastEditDate;
    public Integer acceptedAnswerId;
    public Integer bountyAmount;
    public Integer bountyClosesDate;
    public Integer protectedDate;
    public Integer communityOwnedDate;
}
