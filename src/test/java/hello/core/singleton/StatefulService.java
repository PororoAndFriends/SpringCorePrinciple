package hello.core.singleton;

public class StatefulService {

//    private int price; // 상태유지

    public int order(String name, int price) {
        System.out.println("name = " + name + "price" + price);
//        this.price = price; // 여기서 문제 발생
        return price;
    }

//    public int getPrice() {
//        return price;
//    }


}
