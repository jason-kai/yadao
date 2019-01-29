package cn.yadao.springcloud.domain;

public class Employee {

    private Long id;

    private String username;

    private Boolean gender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Employee(Boolean gender, String username) {
        this.gender = gender;
        this.username = username;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                '}';
    }
}
