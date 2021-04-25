package com.tyust.pojo;

/**
 * @author ysj
 * @create 2021-01-25 {TIME}
 */
public class Book {

    private String name;
    private String author;
    private Address address;

    public Book() {
    }

    public Book(String name, String author, Address address) {
        this.name = name;
        this.author = author;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", address=" + address +
                '}';
    }
}
