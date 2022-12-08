public class Car {
    private Long id;
    private String carNumber;

    public Car(Long id, String carNumber) {
        this.id = id;
        this.carNumber = carNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return " \n   Car : \n" +
                " id : " + id +
                "\n carNumber : " + carNumber;
    }
}
