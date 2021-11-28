package com.example.lgc.GestionMembres.Modules;

public class Membre {
        private int id;
        private String name ;
        private String lastname;
        private String telephone;
        private String email ;
        private String type ;

        public Membre(int id,String name, String lastname,String telephone,String email,String type)
        {
            this.id=id;
            this.name=name;
            this.lastname=lastname;
            this.telephone=telephone;
            this.email=email;
            this.type=type;
        }
        public Membre(String name, String lastname,String telephone,String email,String type)
        {
            this.name=name;
            this.lastname=lastname;
            this.telephone=telephone;
            this.email=email;
            this.type=type;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getLastname() {
            return lastname;
        }

        public String getTelephone() {
            return telephone;
        }

        public String getEmail() {
            return email;
        }

        public String getType() {
            return type;
        }
        @Override
        public String toString(){
            return "id :"+id+ "name :"+name+" lastname : "+lastname+" telephone :"+telephone+" email : "+email+ "type : "+type;
        }

    }
