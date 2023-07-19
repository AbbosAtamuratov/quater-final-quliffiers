package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pet {

    protected int petId;
    protected String nickname;
    protected LocalDate birthday;

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public int getPetId() {
        return petId;
    }

    public void setName(String name) {
        this.nickname = name;
    }

    public String getName() {
        return nickname;
    }

    public void setBirthday(LocalDate date) {
        this.birthday = date;
    }

    public LocalDate getBirthdayDate(){
        return birthday;
    }

    public String getBirthday() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return formatter.format(birthday);
    }

    @Override
    public String toString() {
        return String.format("%d. %s: кличка: %s, дата рождения: %s ", getPetId(), getClass().getSimpleName(), nickname, getBirthday());
    }
}