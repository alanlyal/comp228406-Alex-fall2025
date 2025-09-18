package excerise1;

public class Driver {
    public static void main(String[] args){
        Singers singer = new Singers();
        System.out.println("Defaults");
        System.out.println("id:" + singer.getId());
        System.out.println("name:" + singer.getName());
        System.out.println("address:" + singer.getAddress());
        System.out.println("birthday:" + singer.getBirthday());
        System.out.println("# of ablums released:" + singer.getAlbums());
        System.out.println("-----------------------------------------------");
        //BBNO$
        singer.setId(2);
        singer.setName("Bbno$");
        singer.setAddress("Vancouver, bc canada");
        singer.setBirthday("june 30, 1995");
        singer.setAlbums(17);
        System.out.println("first Singer");
        System.out.println("id:" + singer.getId());
        System.out.println("name:" + singer.getName());
        System.out.println("address:" + singer.getAddress());
        System.out.println("birthday:" + singer.getBirthday());
        System.out.println("# of ablums released:" + singer.getAlbums());
        //Daniel Avidan
        singer.setId(2);
        singer.setName("Leigh Daniel Avidan");
        singer.setAddress("Los Angeles, calafornia usa");
        singer.setBirthday("March 14, 1979");
        singer.setAlbums(6);
        System.out.println("second Singer");
        System.out.println("id:" + singer.getId());
        System.out.println("name:" + singer.getName());
        System.out.println("address:" + singer.getAddress());
        System.out.println("birthday:" + singer.getBirthday());
        System.out.println("# of ablums released:" + singer.getAlbums());
        System.out.println("-----------------------------------------------");
        //Riovaz
        singer.setId(3);
        singer.setName("Riovaz");
        singer.setAddress("New Jersy, usa");
        singer.setBirthday("March 2th, 2004");
        singer.setAlbums(6);
        System.out.println("third Singer");
        System.out.println("id:" + singer.getId());
        System.out.println("name:" + singer.getName());
        System.out.println("address:" + singer.getAddress());
        System.out.println("birthday:" + singer.getBirthday());
        System.out.println("# of ablums released:" + singer.getAlbums());
        System.out.println("-----------------------------------------------");
        //Ryan Peake
        singer.setId(3);
        singer.setName("Ryan Peake");
        singer.setAddress("Vancoucer BC Canada");
        singer.setBirthday("march 1, 1973");
        singer.setAlbums(14);
        System.out.println("fouth Singer");
        System.out.println("id:" + singer.getId());
        System.out.println("name:" + singer.getName());
        System.out.println("address:" + singer.getAddress());
        System.out.println("birthday:" + singer.getBirthday());
        System.out.println("# of ablums released:" + singer.getAlbums());
        System.out.println("-----------------------------------------------");
        //Bon Jovi
        singer.setId(4);
        singer.setName("Bon Jovi");
        singer.setAddress("Bon Jovi");
        singer.setBirthday("march 2, 1962");
        singer.setAlbums(16);
        System.out.println("fouth Singer");
        System.out.println("id:" + singer.getId());
        System.out.println("name:" + singer.getName());
        System.out.println("address:" + singer.getAddress());
        System.out.println("birthday:" + singer.getBirthday());
        System.out.println("# of ablums released:" + singer.getAlbums());
        System.out.println("-----------------------------------------------");
    }
}
