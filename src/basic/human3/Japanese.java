package basic.human3;

//日本人クラス
class Japanese extends Human {

    public Japanese(String name) {
        super(name);//Human(nmae)と同じ
    }

    @Override
    public void sayHello() {
        System.out.println("こんにちは、私の名前は" + name + "です。");
    }
}
