package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FIxDiscountPolicy implements DiscountPolicy {

    private int discountFIxAmount = 1000; // 1000원 고정할인

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) return discountFIxAmount;
        else return 0;
    }
}