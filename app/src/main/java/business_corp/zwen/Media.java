package business_corp.zwen;

/**
 * Created by Höling on 16.10.2016.
 */

public class Media {

    private String name;
    private String type;
    private Integer id;
    private boolean idEingetragen=false;
    private String subtitle;

    public Media(String nameC,String subtitleC ,String typeC){
        name=nameC;
        subtitle=subtitleC;
        type=typeC;

    }
    //------------------------------------------
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public Integer getId(){
        return id;
    }
    public String getSubtitle(){
        return subtitle;
    }
    //------------------------------------------
    public void setName(String string){
        name=string;
    }
    public void setType(String string){
        type=string;
    }
    public void setId(Integer integer){
        if(!idEingetragen){
            id=integer;
            idEingetragen=true;
        }
    }
    public void setSubtitle(String string){
        subtitle=string;
    }

}
