interface User {
    String getAccess();
    String getInfo();
}

abstract class LibraryUser {
    protected int id;
    protected String name;
    protected String address;
    String getInfo() {
        return "id - " + this.id + ", name - " + this.name + ", address - " + this.address;
    }
}

class Customer extends LibraryUser implements User {
    private int numberOfTakenBooks;
    public Customer (int id, String name, String address, int numberOfTakenBooks) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.numberOfTakenBooks = numberOfTakenBooks;
    }
    public String getAccess() {
        return "No access";
    }
    public String getInfo() {
        return super.getInfo() + ", number of taken books - " + numberOfTakenBooks;
    }
}

class Librarian extends LibraryUser implements User {
    private int numberOfWorkedYears;
    public Librarian (int id, String name, String address, int numberOfWorkedYears) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.numberOfWorkedYears = numberOfWorkedYears;
    }
    public String getAccess() {
        return "full access";
    }
    public String getInfo() {
        return super.getInfo() + ", numberOfWorkedYears - " + numberOfWorkedYears;
    }
}

