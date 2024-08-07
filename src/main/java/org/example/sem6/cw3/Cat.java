package org.example.sem6.cw3;

import java.util.Objects;

public class Cat {
    /**
     * Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
     * использовать не все придуманные поля и методы. Создайте несколько
     * экземпляров этого класса, выведите их в консоль.
     * 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
     * его кличка, цвет и возраст (или другие параметры на ваше усмотрение).
     *
     * 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
     * Поместите в него некоторое количество объектов.
     * 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
     * Убедитесь, что все они сохранились во множество.
     * 3. Создайте метод public boolean equals(Object o)
     * Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод
     * должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
     * 4. Создайте метод public int hashCode()
     * который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать
     * Objects.hash(...))
     * 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились
     */
    int id;
    String name;
    int age;
    String sex;
    String owner;
    String color;

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", owner='" + owner + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return id == cat.id && age == cat.age && Objects.equals(name, cat.name) && Objects.equals(sex, cat.sex) && Objects.equals(owner, cat.owner) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, sex, owner, color);
    }
}
