package excerise1;
public class Singers {
        private int id;
        private String name;
        private String address;
        private String birthday;
        private int albums;
   public Singers(int id, String name, String address, String birthday, int albums)
   {
       this.id = id;
       this.name = name;
       this.address=address;
       this.birthday=birthday;
       this.albums=albums;
   }
   public Singers()
   {
       id =0;
       name = " ";
       address =" ";
       birthday=" ";
       albums=0;
   }
   public void setId(int id){this.id=id;}
    public void setName(String name){this.name=name;}
    public void setAddress(String address){this.address=address;}
    public void setBirthday(String birthday){this.birthday=birthday;}
    public void setAlbums(int albums){this.albums=albums;}
    public void setAll(int id, String name, String address, String birthday, int albums )
    {
        this.id=id;
        this.name=name;
        this.address=address;
        this.birthday=birthday;
        this. albums= albums;
        //im a bit confused on why we need set all when its seems like its doing the same thing as the singers constructor
    }
    public int getId(){return id;}
    public String getName(){return name;}
    public String getBirthday(){return birthday;}
    public String getAddress(){return address;}
    public int getAlbums(){return albums;}
}

