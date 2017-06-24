package rishabh.staggeredview;


public class ItemObjects {
    private String name;
    private int photo;
    private String desc;

    public ItemObjects(String name, int photo, String desc) {
        this.name = name;
        this.photo = photo;
        this.desc=desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
    public String getDesc(){
        return desc;
    }
    public void setDesc(String desc){
        this.desc=desc;
    }
}
