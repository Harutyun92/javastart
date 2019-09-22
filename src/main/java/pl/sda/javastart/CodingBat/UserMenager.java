package pl.sda.javastart.CodingBat;

    class User {
        private String firstname;
        private String lastName;

        public User(String firstName,String lastName){
            this.firstname = firstName;
            this.lastName = lastName;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

