package com.driver;

public class Main {
    public static class Product {
        public int product (int x , int y){
            return 35;
        }
        public int product (int x , int y, int z){
            return 480;
        }
        public double product(double x, double y){
            return 40.32;
        }
    }


    public static void main(String[] args) {
          Product p = new Product();
          System.out.println(p.product(2,3));
        System.out.println(p.product(2,3 , 4));
        System.out.println( p.product(2.0,3.2));
    }
}