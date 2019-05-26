package OverrideHashCode;

import java.util.Objects;

public class CokeExample {


    public static void main(String[] args) {

        CokeSixPack cokeSixPackOne=new CokeSixPack(1.98);
        CokeSixPack cokeSixPackTwo=new CokeSixPack(0.99);
        CokeSixPack cokeSixPackThree=cokeSixPackOne;

        System.out.println("cokeSixPackOne hashcode "+cokeSixPackOne.hashCode());
        System.out.println("cokeSixPackTwo hashcode "+cokeSixPackTwo.hashCode());
        System.out.println("cokeSixPackThree hashcode "+cokeSixPackThree.hashCode());


        CokeTwelvePack cokeTwelvePackOne=new CokeTwelvePack(3.48);
        CokeTwelvePack cokeTwelvePackTwo=new CokeTwelvePack(1.49);

        System.out.println("cokeTwelvePackOne hashcode "+cokeTwelvePackOne.hashCode());
        System.out.println("cokeTwelvePacktwo hashcode "+cokeTwelvePackTwo.hashCode());

    }
}

class CokeSixPack
{
    double price;

    public CokeSixPack(double price) {
        this.price = price;
    }



    @Override
    public int hashCode() {
        return 568269686;
    }
}


class CokeTwelvePack
{

    double price;

    public CokeTwelvePack(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        return 568269686;
    }
}
