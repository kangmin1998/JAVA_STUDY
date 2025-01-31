package chap07_inheritance.com.section02.superkeyword;

import java.util.Date;

public class Computer extends Product{
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    /* [ 기본생성자 ] */
    public Computer(){
        super();
        System.out.println("Computer 클래스의 기본 생성자 호출...");
    }

    /* [ Computer 클래스의 모든 필드를 초기화 하는 생성자 ] */
    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        super();    // 부모 클래스의 기본 생성자 호출
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 모든 필드를 초기화하는 생성자 호출...");
    }

    /* [ Product 클래스와 Computer 클래스의 모든 필드를 초기화 하는 생성자 ] */
    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        // 부모 클래스의 매개변수 생성자 호출
        super(code, brand, name, price, manufacturingDate);
        // 위에 작성 된 생성자를 this()로 호출한다는 것은 super()를 두번 호출하는 것과 같기 때문에 허용되지 않는다.
        // (부모 인스턴스를 두 개 생성할 수 없기 때문에 부모 생성자는 한번만 호출 가능 하다.)
        // this(cpu, hdd, ram, operationSystem);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Product 클래스와 Computer 클래스의 모든 필드를 초기화하는 생성자 호출...");
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String getInfomation(){
        // 부모 클래스의 private 멤버에는 직접 접근 불가능하여 getter메소드로 접근함.
        // 부모의 멤버는 super. 과 this. 모두 사용가능하나 코드의 의미를 명확히 하기 위해서는 super를 사용함
        //return "Computer["
        //        + "code = " + super.getCode()
        //        + ", brand  = " + super.getBrand()
        //        + ", name = " + super.getName()
        //        + ", price = " + super.getPrice()
        //        + ", manufacturingDate = " + super.getManufacturingDate()
        //        + ", cpu = " + this.cpu
        //        + ", hdd = " + this.hdd
        //        + ", ram = " + this.ram
        //        + ", operationSystem = " + this.operationSystem
        //        + "]";
        /*
            Product 클래스에 있는 getInfomation()에서 이미 작성해둔 필드를 문자열로 반환하는 내용이 있다.
            부모 클래스의 메소드를 호출해서 반환 받은 문자열에 현재 클래스의 필드 값을 추가로 덧붙여본다.
         */
        // super.getInfomation() : 정상적으로 부모의 메소드 호출
        // this.getInfomation() : 재귀호출이 일어나면 StackOverFlowError 발생
        // getInfomation() : this. 이 자동으로 추가되며 재귀 호출 발생
        // 오버라이딩 된 메소드가 아니라 부모 메소드를 호출하기 위해 반드시 super.을 작성해서 구분이 필요함.
        return super.getInfomation()
                + ", cpu = " + this.cpu
                + ", hdd = " + this.hdd
                + ", ram = " + this.ram
                + ", operationSystem = " + this.operationSystem
                + "]";
    }
}
