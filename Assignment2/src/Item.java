abstract class Item {
    String title;
    String displayInfo() {
        return "tittle - " + this.title;
    }
}

interface LibraryItem {
    String displayInfo();
}

class Book extends Item implements LibraryItem {
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String displayInfo() {
        return super.displayInfo() + " by " + author;
    }
}

class Magazine extends Item implements LibraryItem{
    private String publisher;
    public Magazine(String title, String publisher) {
        this.title = title;
        this.publisher = publisher;
    }

    public String displayInfo() {
        return super.displayInfo() + "publisher - " + this.publisher;
    }
}

class CD extends Item implements LibraryItem {
    private String artist;

    public CD(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String displayInfo() {
        return super.displayInfo() + " by " + artist;
    }
}

