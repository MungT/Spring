public class Main {

    public static void main(String[] args) {

        // 버스 시나리오
        bus bus1 = new bus((int) (Math.random() * 1000));// 버스
        bus bus2 = new bus((int) (Math.random() * 1000));// 2대 생성

        if (bus1.number == bus2.number) {
            System.out.println("번호가 같습니다!"); // 번호 중복 확인
        } else {
            System.out.println("bus1 번호 : " + bus1.number);
            System.out.println("bus2 번호 : " + bus2.number);
            System.out.println("OK!!");
            System.out.println("----------------------");
            bus1.boarding(2); // 승객 +2
            bus1.changeState(-50); // 주유량 -50
            bus1.changeState(10); // 주유량 +10
            bus1.boarding(45); // 승객 +45
            bus1.boarding(5); // 승객 +5
            bus1.changeState(-55); // 주유량 -55
            System.out.println();
            System.out.println("----------------------");
        }
        //-------------------------------------------------------
        // 택시 시나리오
        taxi taxi1 = new taxi((int) (Math.random() * 1000));// 택시
        taxi taxi2 = new taxi((int) (Math.random() * 1000));// 2대 생성

        if (bus1.number == bus2.number) {
            System.out.println("번호가 같습니다!"); // 번호 중복 확인
        } else {
            System.out.println("taxi1 번호 : " + taxi1.number);
            System.out.println("taxi2 번호 : " + taxi2.number);
            System.out.println("OK!!");
            System.out.println("----------------------");
            // 승객 +2, 목적지 "서울역", 목적지까지 거리 2km
            taxi1.boardchack(2, "서울역", 2);
            taxi1.payment(-80); // 주유량 -80
            taxi1.boarding(5); // 승객 +5
            // 승객 +2, 목적지 "구로디지털단지역", 목적지까지 거리 12km
            taxi1.boardchack(3, "구로디지털단지역", 12);
            taxi1.payment(-20); // 주유량 -20
        }
    }
}
