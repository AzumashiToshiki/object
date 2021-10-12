package basic.human4;

//抽象クラス
abstract class Human {
    //フィールド
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public abstract void sayHello();
}
