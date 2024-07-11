package com.bit.springboard.coupling;

public class HyundaiCar implements Car {
    private CarAudio carAudio;
//    private SonyCarAudio sonyCarAudio;
//    private AppleCarAudio appleCarAudio;
//    private SamsungCarAudio samsungCarAudio;
    private String color;

    public HyundaiCar() {
        System.out.println("HyundaiCar 생성자1 호출");
    }

    public HyundaiCar(CarAudio carAudio) {
        System.out.println("HyundaiCar 생성자2 호출");
        this.carAudio = carAudio;
    }

    public HyundaiCar(CarAudio carAudio, String color) {
        System.out.println("HyundaiCar 생성자3 호출");
        this.carAudio = carAudio;
        this.color = color;
    }

//    public HyundaiCar(SonyCarAudio sonyCarAudio, AppleCarAudio appleCarAudio, String color) {
//        System.out.println("HyundaiCar 생성자3 호출");
//        this.sonyCarAudio = sonyCarAudio;
//        this.appleCarAudio = appleCarAudio;
//        this.color = color;
//    }

    public void engineOn() {
        System.out.println("HyundaiCar 시동을 건다.");
    }

    public void engineOff() {
        System.out.println("HyundaiCar 시동을 끈다.");
    }

    public void speedUp() {
        System.out.println("HyundaiCar 속도를 올린다.");
    }

    public void speedDown() {
        System.out.println("HyundaiCar 속도를 낮춘다.");
    }

    public void initMethod() {
        System.out.println("HyundaiCar 객체 생성");
    }

    public void destroyMethod() {
        System.out.println("HyundaiCar 객체 삭제");
    }

    public void volumeUp() {
//        carAudio = new CarAudio();
        carAudio.volumeUp();
    }

    public void volumeDown() {
//        carAudio = new CarAudio();
        carAudio.volumeDown();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        System.out.println("HyundaiCar setColor 호출");
        this.color = color;
    }

    public CarAudio getCarAudio() {
        return carAudio;
    }

    public void setCarAudio(CarAudio carAudio) {
        System.out.println("HyundaiCar setCarAudio 호출");
        this.carAudio = carAudio;
    }
}
