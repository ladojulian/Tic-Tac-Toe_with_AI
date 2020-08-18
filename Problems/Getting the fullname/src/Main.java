class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName != null ? firstName : "";
    }

    public void setLastName(String lastName) {
        this.lastName = lastName != null ? lastName : "";
    }

    public String getFullName() {
        if (!this.firstName.isEmpty() && !this.lastName.isEmpty()) {
            return this.firstName + " " + this.lastName;
        }
        if (!this.firstName.isEmpty()) {
            return this.firstName;
        }
        if (!this.lastName.isEmpty()) {
            return this.lastName;
        }
        return "Unknown";
    }
}