package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author viter
 */
public class MessageBean implements Serializable {
     
    private String msg;
        
    public MessageBean() {
    }
    
    public String getMsg() {
        return msg;
    }
    
    public void setMsg(String value) {
        switch (value){
            case "":
            case "pt":
                msg = "Alô";
                break;
            case "en":
                msg = "Hello";
                break;
            case "de":
                msg = "Hallo";
                break;
            case "fr":
                msg = "Bonjour";
                break;
            case "Lingua do P":
                msg = "POI, PBOM PDIA!!";
            case "Binário":
                msg = "01001111 01101100 11100001 00100000 01110000 01110010 01101111 01100110 01100101 01110011 01110011 01101111 01110010 00100000 01100100 01100101 01110101 00100000 01110100 01110010 01100001 01100010 01100001 01101100 01101000 01101111 00100000 01110000 01100001 01110010 01100001 00100000 01110000 01100101 01110011 01110001 01110101 01101001 01110011 01100001 01110010 00100000 01101001 01110011 01110011 01101111 00100000 01100001 01101010 01110101 01100100 01100001 00100000 01100101 01110101 "
        }
    }
}
