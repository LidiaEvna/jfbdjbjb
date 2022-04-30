package com.company;

public class Main {

    public static void main(String[] args) {
        Buyer1 d = new Buyer1("Cinnabon",45,1,"Anastasia ",734254);
        d.Buyer1();
        Buyer2 p = new Buyer2("Nikita ",5,10,"Dasha ",13012003);
        p.Buyer2();
        Buyer3 o=new Buyer3("Thigh ",450,2,"Lida ",224411);
        o.Buyer3();
    }
}
interface Product{
    void name();
    void price();
    void rating();
}
class Baking implements Product{
    String buns ;
    int price;
    int rating;
    Baking(String buns ,int price , int rating){
        this.buns =buns ;
        this.price=price;
        this.rating=rating;
    }
    public void name(){
        System.out.println(buns );
    }
    public void price(){
        System.out.println(price);
    }
    public void rating(){
        System.out.println(rating);
    }
}
class Slave implements Product {
    String people;
    int price;
    int rating;

    Slave(String people, int price, int rating) {
        this.people = people;
        this.price = price;
        this.rating = rating;
    }
    public void name() {
        System.out.println(people);
    }
    public void price() {
        System.out.println(price);
    }
    public void rating() {
        System.out.println(rating);
    }
}
class Meat  implements Product{
    String beef ;
    int price;
    int rating;

    Meat(String beef , int price, int rating) {
        this.beef = beef ;
        this.price = price;
        this.rating = rating;
    }
    public void name() {
        System.out.println(beef);
    }
    public void price() {
        System.out.println(price);
    }
    public void rating() {
        System.out.println(rating);
    }
}
interface User{
    void login();
    void password();
}
class Buyer1  implements User,Product {
    String buns ;
    int price;
    int rating;
    String login;
    int password;

    Buyer1(String buns , int price, int rating, String login, int password) {
        this.buns  = buns ;
        this.price = price;
        this.rating = rating;
        this.login = login;
        this.password = password;
    }
    public void name() {
        System.out.println(buns );
    }
    public void price() {
        System.out.println(price);
    }
    public void rating() {
        System.out.println(rating);
    }
    public void login() {
        System.out.println(login);
    }
    public void password() {
        System.out.println(password);
    }
    public void Buyer1(){
        System.out.println("User name: "+login + " buys " + buns );
    }
}
class Buyer2  implements User,Product {
    String people;
    int price;
    int rating;
    String login;
    int password;

    Buyer2(String people, int price, int rating, String login, int password) {
        this.people = people;
        this.price = price;
        this.rating = rating;
        this.login = login;
        this.password = password;
    }
    public void name() {
        System.out.println(people);
    }
    public void price() {
        System.out.println(price);
    }
    public void rating() {
        System.out.println(rating);
    }
    public void login() {
        System.out.println(login);
    }
    public void password() {
        System.out.println(password);
    }
    public void Buyer2(){
        System.out.println("User name: "+login + " buys " + people);
    }
}
class Buyer3  implements User,Product {
    String beef;
    int price;
    int rating;
    String login;
    int password;

    Buyer3(String beef, int price, int rating, String login, int password) {
        this.beef = beef;
        this.price = price;
        this.rating = rating;
        this.login = login;
        this.password = password;
    }
    public void name() {
        System.out.println(beef);
    }
    public void price() {
        System.out.println(price);
    }
    public void rating() {
        System.out.println(rating);
    }
    public void login() {
        System.out.println(login);
    }
    public void password() {
        System.out.println(password);
    }
    public void Buyer3(){
        System.out.println("User name: "+login + " buys " + beef);
    }
}