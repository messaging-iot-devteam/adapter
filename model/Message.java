package com.madcrow.adapter.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class Message implements IMessage {
    private Long id;
    private String message;
    private Date sendDate;
    private String from;
    private List<String> to; //list of recipient of the message
    private String confirmation; //to have a structured confirmation message
    private List<DestinationService> destinationServices = new ArrayList<>(); //fb, slak, etc. //send to multiple destinations.


    //confirmation of the message sould includde detail,
    //menus should implement Imessage - something like
    //

}
