package com.example.gmail.model;

public class data {
    public int id;
    public String name;
    public String username;
    public String email;
    public class  address
    {
        public String street;

        public address(String street, String suite, String city, String zipcode) {
            this.street = street;
            this.suite = suite;
            this.city = city;
            this.zipcode = zipcode;
        }

        public String suite;
        public String city;
        public String zipcode;
        public class geo {
            public double lat;
            public double lng;

            public geo(double lat, double lng) {
                this.lat = lat;
                this.lng = lng;
            }
        }
    };
    public String phone;
    public String website;
    public class company{
        public company(String name, String catchPhrase, String bs) {
            this.name = name;
            this.catchPhrase = catchPhrase;
            this.bs = bs;
        }

        public String name;
        public String catchPhrase;
        public String bs;
    }

    public data(int id, String name, String username, String email, String phone, String website) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.website = website;
    }
}
