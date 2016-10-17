package business_corp.zwen;

import java.io.Serializable;

/**
 * Created by Höling on 16.10.2016.
 */

public class Media implements Serializable{

    private String name;
    private Integer type;
    private Integer id;
    private boolean idEingetragen=false;
    private String subtitle;
    private String bescheibung;

    public Media(String nameC,String subtitleC ,Integer typeC){
        name=nameC;
        subtitle=subtitleC;
        type=typeC;

    }
    //-----------------------------------------------------------------------------------------
    public String getName(){
        return name;
    }
    public String getBescheibung(){return  bescheibung;}
    public Integer getType(){
        return type;
    }
    public Integer getId(){
        return id;
    }
    public String getSubtitle(){
        return subtitle;
    }
    //-----------------------------------------------------------------------------------------
    public void setName(String string){
        name=string;
    }
    public void setType(Integer string){
        type=string;
    }
    public void setId(Integer integer){
        if(!idEingetragen){
            id=integer;
            idEingetragen=true;
        }
    }
    public void setBescheibung(String string){
        bescheibung=string;
    }
    //------------------------------------------------------------------------------------------
    public void setSubtitle(String string){
        subtitle=string;
    }

}
