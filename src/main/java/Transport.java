class Transport {
    int number; // 번호
    int oil = 100; // 연료량
    int speed = 0; // 현재속도
    int shiftGear; // 변경속도
    int passenger; // 현재승객수
    int maxPassenger; // 최대승객수
    int cost; // 요금

    Transport(int number, int oil, int speed, int shiftGear, int passenger, int maxPassenger, int cost) {
        this.number = number;
        this.oil = oil;
        this.speed = speed;
        this.shiftGear = shiftGear;
        this.passenger = passenger;
        this.maxPassenger = maxPassenger;
        this.cost = cost;
        }

    public Transport(int number) {
        this.number = number;
    }


    // 속도변경
    void changeSpeed(int shiftGear) {
        if (this.oil < 10) {
            System.out.println("주유량을 확인해 주세요.");
        } else {
            this.speed += shiftGear;
        }
    }

    // 현재 탑승 승객
    void boarding(int passenger) {
        this.passenger = passenger;
    }
}
