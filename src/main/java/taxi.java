class taxi extends Transport{
    String destination; // 목적지
    int desDistance; // 목적지까지 거리
    int basicDistance; // 기본거리
    int distanceCost; // 거리당요금
    String state; // 상태
    int money; // 누적 요금


    taxi(int number, int shiftGear, int passenger, String destination, int desDistance, int money) {
        super(number, 100, 0, shiftGear, passenger, 4, 3000);
        this.destination = destination;
        this.desDistance = desDistance;
        this.basicDistance = 1;
        this.distanceCost = 1000;
        this.state = "일반";
        this.money = money;
    }

    // 택시 번호 생성
    public taxi(int number) {
        super(number);
    }

    // 택시 승객 탑승
    void boardchack (int passenger, String destination, int desDistance) {
        if (this.passenger != 0) {
            System.out.println("탑승불가");
        } else {
            this.maxPassenger = 4;
            this.passenger = passenger;
            this.cost = 3000;
            this.distanceCost = 1000;
            this.destination = destination;
            this.desDistance = desDistance;
            basicDistance = 1;
            this.state = "운행중";
            if (desDistance <= 1) {
                this.money += this.cost;
            }else {
                this.money += this.cost + this.distanceCost * (desDistance - this.basicDistance);

            }
            System.out.println("택시 탑승 승객 수 = " + this.passenger);
            System.out.println("택시 잔여 좌석 수 = " + (this.maxPassenger - this.passenger));
            System.out.println("기본 요금 확인 = " + this.cost);
            System.out.println("목적지 = " + this.destination);
            System.out.println("목적지까지 거리 = " + this.desDistance + "km");
            System.out.println("지불할 요금 = " + (this.cost + this.distanceCost * (desDistance - 1)));
            System.out.println("택시 상태 = " + this.state);
            System.out.println("----------------------");
        }
    }

    // 요금결제
    void payment(int oil) {
        this.oil += (oil);
        if (this.oil == 0) {
            this.state = "운행불가";
            System.out.println("주유량 = " + this.oil);
            System.out.println("상태 = " + this.state);
            System.out.println("누적 요금 = " + this.money);
            System.out.println("----------------------");
            System.out.println("주유 필요");
        } else {
            System.out.println("주유량 = " + this.oil);
            System.out.println("누적 요금 = " + this.money);
            System.out.println("----------------------");
        }
    }

    // 승객 탑승
    void boarding(int passenger) {
        this.passenger = passenger;
        if (maxPassenger < passenger) {
            System.out.println("최대 승객 수 초과");
            this.passenger = 0;
            System.out.println("----------------------");
        }
    }
}
