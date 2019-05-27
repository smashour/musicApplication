package com.stackroute.unservice.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel(description = "All details about the track. ")
public class Music {
    @Id //to make id as primary key
    @ApiModelProperty(value = "ID of each song")
    @Value("int value")
    int id;

    @ApiModelProperty(value = "Name of each track")
    @Value("string name")
    String name;

    @ApiModelProperty(value = "Comments of each track")
    @Value("string comments")
    String comments;



}
