class bus extends Transport {
    String state;

    bus(int number, int shiftGear, int passenger) {
        super(number, 100, 1, shiftGear, passenger,30, 1000);
        this.state = "운행";
    }

    //버스 번호 생성
    public bus(int number) {
        super(number);
    }

    // 버스 상태 변경
    void changeState(int oil) {
        // 주유량 하락시 차고지행
        this.oil += (oil);
        if (this.oil > this.oil + (oil) || this.oil == 0) {
            this.state = "버스 상태 = 차고지행";
            System.out.println(this.state);
        } else {
            this.state = "버스 상태 = 운행";
            System.out.println(this.state);
        }
        System.out.println("버스 주유량 = " + this.oil);
        // 주유량 10미만시 메세지 출력
        if (this.oil < 10) {
            System.out.println("주유가 필요하다.");
        }
        System.out.println("----------------------");
    }

    // 승객 탑승
    void boarding(int passenger) {
        // 최대 승객 수 초과 확인
        this.passenger = passenger;
        this.maxPassenger = 30;
        if (this.passenger > this.maxPassenger) {
            System.out.println("최대 승객 수 초과");
            this.passenger -= passenger;
        } else {
            this.maxPassenger -= passenger;
            System.out.println("버스 탑승 승객 수 : " + passenger);
            System.out.println("버스 잔여 좌석 수 : " + (this.maxPassenger));
            System.out.println("요금 확인 : " + this.cost * passenger);
        }
        System.out.println("----------------------");
    }
}

