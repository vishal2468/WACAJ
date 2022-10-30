package com.vishal.wacaj.model.message;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact {
    List<Addresses> addresses=new ArrayList<>();
    String birthday;
    List<Emails> emails=new ArrayList<>();
    Name name;
    Org org;
    List<Phones> phones=new ArrayList<>();
    List<Urls> urls=new ArrayList<>();
}
